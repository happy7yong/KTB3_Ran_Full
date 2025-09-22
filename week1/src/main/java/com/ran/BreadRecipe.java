package com.ran;

import java.util.Set;

// 빵/밀가루 요리 카테고리
public class BreadRecipe extends Recipe {
    BreadRecipe(String name, Set<Ingredient> requireIngredients) {
        super(name, requireIngredients);
    }

}


class PizzaBread extends BreadRecipe {
    PizzaBread() {
        super("피자빵", Set.of(IngredientComponents.CHEESE,IngredientComponents.OVEN,IngredientComponents.FLOURPOWDER));
    }

    public void cook(){
        super.cook();
    }
}

class Souffle extends BreadRecipe {
    Souffle() {
        super("수플레", Set.of(IngredientComponents.MILK, IngredientComponents.OVEN,IngredientComponents.EGG));
    }

    public void cook(){
        super.cook();
    }
}

class Cake extends BreadRecipe {
    Cake() {
        super("케이크", Set.of(IngredientComponents.MILK, IngredientComponents.OVEN, IngredientComponents.FLOURPOWDER, IngredientComponents.EGG));
    }

    public void cook(){
        super.cook();
    }
}
