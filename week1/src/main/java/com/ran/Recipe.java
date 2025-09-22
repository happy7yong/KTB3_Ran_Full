package com.ran;

import java.util.HashSet;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Recipe {
    private final String name; //만들어진 음식
    private final Set<Ingredient> requireIngredients;

    public Recipe(String name, Set<Ingredient> requireIngredients) {
        this.name = name;
        this.requireIngredients = requireIngredients;
    }

    public boolean containsIngredient(Queue<Ingredient> ingredients) {
        HashSet<Ingredient> ingredientSet = new HashSet<>(ingredients);
        return ingredientSet.equals(requireIngredients);//레시피에 있는 요소들이 모두 포함되어있는지 확인
    }

    public Set<Ingredient> getRequireIngredients() {
        return requireIngredients;
    }

    public void cook(){
        System.out.println(this.name + "가 완성되었습니다!"+"레시피를 발견했습니다!");
    }
}
