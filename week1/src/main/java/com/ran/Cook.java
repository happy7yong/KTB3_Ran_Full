package com.ran;

import java.util.HashSet;
import java.util.Set;

import static com.ran.Components.currentCookIngreShow;

//셰프1 쓰레드
class YongChef{

    //요리 중
    public synchronized void YongChefAdd(String Ingredient){
        synchronized(this){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println(Ingredient+"을 성공적으로 넣었다!");
        }
    }

    //요리 효과음
}
//셰프를 거쳐야 소리를 낼 수 있음.
