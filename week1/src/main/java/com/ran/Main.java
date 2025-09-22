package com.ran;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static com.ran.IngredientComponents.*;
import static com.ran.PathPage.*;

public class Main {

    public static class IngredientMenu{

        static String[] Action = {"냉장고 열기", "선반 열기", "요리도구 사용하기", "제출하기"};

        //객체 찾기
        public static Ingredient findIngredientByName(String name) {
            for (Ingredient ing : refreigeratorList)
                if (ing.getIngredientName().equals(name)) return ing;

            for (Ingredient ing : condimentsList)
                if (ing.getIngredientName().equals(name)) return ing;

            for (Ingredient ing : cookwaresList)
                if (ing.getIngredientName().equals(name)) return ing;

            return null;
        }


        //유효성 검사
        public boolean isValidation(String item) {
            for (Ingredient ing : refreigeratorList) {
                if (ing.getIngredientName().equals(item)) return true;
            }
            for (Ingredient ing : condimentsList) {
                if (ing.getIngredientName().equals(item)) return true;
            }

            for (Ingredient ing : cookwaresList) {
                if (ing.getIngredientName().equals(item)) return true;
            }
            return false;
        }


    }

    public static void cook(Ingredient currentCook, Queue<Ingredient> cookSequence, Recipe recipe){
        //
        Ingredient currentCookObject = currentCook;
        System.out.println("[" + Thread.currentThread().getName() + "] 요리중: " + currentCookObject.getIngredientName());
        synchronized (currentCook) {
            try {
                Thread.sleep(currentCookObject.getCookTime());
                cookSequence.add(currentCookObject);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(currentCookObject.getCookSound() + " ( " + currentCookObject.getCookTime()+ "초 ) ");
        System.out.println("현재 요리 순서 :" + cookSequence);

        //요리 완.
        if(recipe.containsIngredient(cookSequence)) {
            System.out.println("요리가 준비되었습니다!");
            recipe.cook();
        }
    }



    public static void main(String[] args) {
        Stack<String> pathStack = new Stack<>();
        Queue<Ingredient> currentIngredient = new LinkedList<>();//현재 저장된 재료
        Queue<Ingredient> cookSequence = new LinkedList<>();//요리 순서

        //재료 메뉴
        IngredientMenu ingredient = new IngredientMenu();

        ExecutorService chef = Executors.newFixedThreadPool(2);//셰프 두명

        Scanner sc = new Scanner(System.in); //입력 변수 생성

        System.out.println("냉장고를 부탁해 !");
        pathStack.push("actionPage");//Actionpage위치저장

        int selectNumber = 0;
        while(selectNumber != 4){
            System.out.println("======================");
            //actionPage
            System.out.println("어떤 행동을 할까?");
            pageRouter(pathStack,currentIngredient);

            selectNumber = sc.nextInt(); //input으로 number 받음
            sc.nextLine();

            caseNumber(selectNumber,pathStack);

            //재료 선택 화면
            while (!getCurrentPath(pathStack).equals("actionPage") && !getCurrentPath(pathStack).equals("foodSubmitPage")) {
                pageRouter(pathStack,currentIngredient);
                String selectIngre = sc.nextLine(); //개행 추가

                //뒤로가기 유효성 검사
                pathEnter(pathStack, selectIngre);
                if(getCurrentPath(pathStack).equals("actionPage")){
                    break;
                }

                //유효성 검사
                if(ingredient.isValidation(selectIngre)){
                    Ingredient selectIngreObject=IngredientMenu.findIngredientByName(selectIngre);
                    currentIngredient.add(selectIngreObject);//현재 스택에 입력한 재료 넣기
                }else{
                    System.out.println("!! 재료가 존재하지 않습니다. 다시 작성해주세요.");
                }
            }

        }


        List<Recipe> recipes = List.of(
                new EggFry(),
                new EggSteam(),
                new EggSausageRoll(),
                new PizzaBread(),
                new Souffle(),
                new Cake()
        );

        // 검사
        for(Recipe recipe : recipes){
            if (recipe.containsIngredient(currentIngredient)) {//레시피가 존재하는지 확인하기

                //현재 선택한 재료 하나씩 요리하기
                for(Ingredient ingre : currentIngredient){
                    chef.execute(()->cook(ingre,cookSequence,recipe));
                }

                chef.shutdown();

                break;
            } else if(currentIngredient.isEmpty()){
                System.out.println("재료가 비어있습니다.");
                break;
            } else {

                //현재 선택한 재료 하나씩 요리하기
//                for(Ingredient ingre : currentIngredient){
//                    chef.execute(()->cook(ingre,cookSequence,recipe));
//                }
//
//                chef.shutdown();
                System.out.println("음식 취향이 독특시군요! 형체를 알아볼 수 없는 음식은 처음이에요!");
                break;
            }
        }

    }
}