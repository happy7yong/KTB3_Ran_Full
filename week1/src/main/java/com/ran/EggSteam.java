package com.ran;

import java.util.Set;

public class EggSteam extends EggRecipe {
    EggSteam() {
        super("계란찜", Set.of(IngredientComponents.EGG, IngredientComponents.WELSH_ONION, IngredientComponents.SALT, IngredientComponents.POT));
    }

    public void cook(){
        super.cook();
    }
}
