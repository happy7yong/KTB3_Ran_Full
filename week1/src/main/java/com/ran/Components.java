package com.ran;

import java.util.ArrayList;
import java.util.Set;

public class Components {
    public static void numberShow(String[] items) {
            for(int Number=0;Number<items.length;Number++){
                System.out.println(Number+1 +". "+ items[Number]);
            }
        }

    public static void numberlessShow(String[] items){
            for (String item : items) {
                System.out.println(item);
            }
        }

        public static void backShow(String[] items){
            if(items != Main.ingredient.Action){
                System.out.println("-> 뒤로가기");
            }
        }

        public static void currentCookIngreShow(Set<String> items){
            System.out.print("현재 선택한 재료 :");
            if(!items.isEmpty()){
                for(String item : items){
                    System.out.print(item+" ");
                }
            }else{
                System.out.println("없음");
            }
        }

}

