package com.ran;

import java.util.Set;

// 빵/밀가루 요리 카테고리
public class BreadRecipe extends Recipe {
    BreadRecipe(String name, Set<String> requireIngredients) {
        super(name, requireIngredients);
    }

    void preheatOven() {
        System.out.println("오븐을 예열합니다.");
    }
}


class PizzaBread extends BreadRecipe {
    PizzaBread() {
        super("피자빵", Set.of("치즈", "밀가루", "오븐"));
    }

    public void cook(){
        preheatOven();
        super.cook();
    }
}

class Souffle extends BreadRecipe {
    Souffle() {
        super("수플레", Set.of("우유", "설탕", "오븐"));
    }

    public void cook(){
        preheatOven();
        super.cook();
    }
}

class Cake extends BreadRecipe {
    Cake() {
        super("케이크", Set.of("계란", "밀가루", "우유", "오븐"));
    }

    public void cook(){
        preheatOven();
        super.cook();
    }
}
