package com.ran;

import java.util.*;

import static com.ran.PathPage.getCurrentPath;

public class Components {
    public static void numberShow(String[] items) {
            for(int Number=0;Number<items.length;Number++){
                System.out.println(Number+1 +". "+ items[Number]);
            }
        }

    public static void numberlessShow(List<? extends Ingredient> items) {
        for (Ingredient item : items) {
            System.out.println(item.getIngredientName());
        }
    }

        public static void backShow(Stack<String> pageStack){
            if(!"Action".equals(getCurrentPath(pageStack))){
                System.out.println("-> 뒤로가기");
            }
        }

        public static void currentCookIngreShow(Queue<Ingredient> items){
            System.out.print("현재 선택한 재료 :");
            if(!items.isEmpty()){
                for(Ingredient item : items){
                    System.out.print(item.getIngredientName()+" ");
                }
            }else{
                System.out.println("없음");
            }
        }

}

