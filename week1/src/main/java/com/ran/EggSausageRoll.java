package com.ran;

import java.util.Set;

public class EggSausageRoll extends EggRecipe {
    EggSausageRoll() {
        super("소시지 달걀말이", Set.of(IngredientComponents.EGG, IngredientComponents.SAUSAGE, IngredientComponents.FRYINGPAN));
    }

    public void cook(){
        super.cook();
    }
}
