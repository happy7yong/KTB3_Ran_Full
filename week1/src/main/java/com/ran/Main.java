package com.ran;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    interface showSelection{
        void numberShow(String[] items);
        void numberlessShow(String[] items);
        void caseNumber(int selectNumber);
    }


    //선택시 생성 템플릿 컴포넌트 클래스
    public static class Selection implements showSelection{
        @Override
        public void numberShow(String[] items) {
            for(int Number=0;Number<items.length;Number++){
                System.out.println(Number+1 +". "+ items[Number]);
            }
            backShow(items); //뒤로가기
        }

        @Override
        public void numberlessShow(String[] items){
            for (String item : items) {
                System.out.println(item);
            }
            backShow(items); //뒤로가기
        }

        public void backShow(String[] items){
            if(items != ingredient.Action){
                System.out.println("-> 뒤로가기");
            }
        }

        public void currentCookIngreShow(String[] items){
            System.out.println("현재 선택한 재료 :");
            for(String item : items){
                System.out.println(item);
            }
        }

        @Override
        public void caseNumber(int selectNumber){
            Selection print = new Selection();
            switch(selectNumber){
                case 1:
                    print.numberlessShow(ingredient.refrigerator);
                    break;
                case 2:
                    print.numberlessShow(ingredient.condiments);
                    break;
                case 3:
                    print.numberlessShow(ingredient.cookware);
                    break;
                default://제출하기
                    break;
            }
        }
    }

    public static class ingredient{
        static String[] Action = {"냉장고 열기", "선반 열기", "요리도구 사용하기", "제출하기"};
        static String[] refrigerator = {"계란", "파", "우유", "소시지", "치즈"};
        static String[] condiments = {"소금", "설탕", "간장", "고춧가루", "밀가루"};
        static String[] cookware = {"후라이팬", "냄비", "전자레인지", "오븐"};

        //뒤로가기 존재

        //각 재료 선택시 스택 저장
        public void selectIngredient(int selectNumber){

        }
        //레시피d

    }



    public static void main(String[] args) {
        Stack<String> pathStack = new Stack<>();
        Stack<String> currentCookIngre = new Stack<>();

        showSelection print = new Selection(); //print의 객체 생성
        Scanner sc = new Scanner(System.in); //입력 변수 생성
        ingredient ingredient = new ingredient();

        System.out.println("냉장고를 부탁해 !");

        System.out.println("어떤 행동을 할까?");
        print.numberShow(ingredient.Action);
        pathStack.push("Action");

        int selectNumber = sc.nextInt(); //선택한 넘버 저장

        boolean isCase = true;
        while (isCase){
            print.caseNumber(selectNumber);
            String selectIngre = sc.nextLine(); //어떻게 저장되어야하지?
            currentCookIngre.push(selectIngre);
        }
        currentCookIngre.push("ingredient");

        selectNumber = sc.nextInt(); //선택한 넘버 저장
        ingredient.selectIngredient(selectNumber);


    }
}