package com.ran;

import java.util.*;

import static com.ran.Components.*;
import static com.ran.IngredientComponents.*;
import static com.ran.Main.IngredientMenu.*;

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
            default:
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
    public static void pageRouter(Stack<String> pageStack, Queue<Ingredient> currentIngredient){
        if(getCurrentPath(pageStack).equals("actionPage")){
            numberShow(Action);
            currentCookIngreShow(currentIngredient);
        }

        if(getCurrentPath(pageStack).equals("refrigeratorPage")){
            numberlessShow(refreigeratorList);
            backShow(pageStack);
            currentCookIngreShow(currentIngredient);
        }

        if(getCurrentPath(pageStack).equals("condimentsPage")){
            numberlessShow(condimentsList);
            backShow(pageStack);
            currentCookIngreShow(currentIngredient);
        }

        if(getCurrentPath(pageStack).equals("cookware")){
            numberlessShow(cookwaresList);
            backShow(pageStack);
            currentCookIngreShow(currentIngredient);
        }

    }
}
