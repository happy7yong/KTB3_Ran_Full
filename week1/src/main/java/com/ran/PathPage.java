package com.ran;

import java.util.ArrayList;
import java.util.Stack;

import static com.ran.Components.*;
import static com.ran.Main.ingredient.*;

public class PathPage {

    public static void caseNumber(int selectNumber, Stack<String> pathStack){
        switch(selectNumber){
            case 1:
                pathStack.push("refrigeratorPage");
                break;
            case 2:
                pathStack.push("condimentsPage");
                break;
            case 3:
                pathStack.push("cookware");
                break;
            default://제출하기
                pathStack.push("foodSubmitPage");
                break;
        }
    }
    //뒤로가기 선택 시 해당 페이지 스택에서 삭제
    public static void pathEnter(Stack<String> items, String item){
        if(item.equals("-> 뒤로가기")){
            items.pop();
        }
    }

    //현재 페이지 위치 조회 가장 최신 요소
    public static String getCurrentPath(Stack<String> items){
        return items.getLast();
    }

    //페이지 라우터
    public static void pageRouter(Stack<String> pageStack, ArrayList<String> currentIngredient){
        if(getCurrentPath(pageStack).equals("actionPage")){
            numberShow(Action);
            currentCookIngreShow(currentIngredient);
        }

        if(getCurrentPath(pageStack).equals("refrigeratorPage")){
            numberlessShow(refrigerator);
            backShow(refrigerator);
            currentCookIngreShow(currentIngredient);
        }

        if(getCurrentPath(pageStack).equals("condimentsPage")){
            numberlessShow(condiments);
            backShow(condiments);
            currentCookIngreShow(currentIngredient);
        }

        if(getCurrentPath(pageStack).equals("cookware")){
            numberlessShow(cookware);
            backShow(cookware);
            currentCookIngreShow(currentIngredient);
        }

        if(getCurrentPath(pageStack).equals("foodSubmitPage")){
            Recipe.cook();
        }
    }
}
