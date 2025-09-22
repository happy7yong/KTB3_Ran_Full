package com.ran;
import java.util.Set;

public class EggFry extends EggRecipe {
    public EggFry() { super("계란후라이", Set.of(IngredientComponents.EGG, IngredientComponents.FRYINGPAN)); }
    @Override public void cook() { super.cook(); }
}
