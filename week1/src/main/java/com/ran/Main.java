package com.ran;

import java.util.*;

import static com.ran.Main.ingredient.isValidation;
import static com.ran.PathPage.*;

public class Main {

    public static class ingredient{
        static String[] Action = {"냉장고 열기", "선반 열기", "요리도구 사용하기", "제출하기"};
        static String[] refrigerator = {"계란", "파", "우유", "소시지", "치즈"};
        static String[] condiments = {"소금", "설탕", "간장", "고춧가루", "밀가루"};
        static String[] cookware = {"후라이팬", "냄비", "전자레인지", "오븐"};

        static String[][] component = {Action, refrigerator, condiments, cookware};

        //유효성 검사
        public static boolean isValidation(String item){
            for(int row=0;row<component.length;row++){
                for(int col=0;col<component[row].length;col++){
                    if(component[row][col].equals(item)){
                        return true;
                    }
                }
            }

            return false;
        }

        //레시피
    }



    public static void main(String[] args) {
        Stack<String> pathStack = new Stack<>();
        Set<String> currentIngredient = new HashSet<>();//현재 저장된 재료

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
                if(isValidation(selectIngre)){
                    currentIngredient.add(selectIngre);
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
                new KimchiFriedRice(),
                new Cake()
        );

        // 검사
        boolean Cook = false;
        for(Recipe recipe : recipes){
            if (recipe.containsIngredient(currentIngredient)) {
                recipe.cook();
                Cook = true;
                break;
            } else if(currentIngredient.isEmpty()){
                System.out.println("재료가 비어있습니다.");
                break;
            }
            else {
                System.out.println("음식 취향이 독특시군요! 형체를 알아볼 수 없는 음식은 처음이에요!");
                break;
            }
        }

    }
}