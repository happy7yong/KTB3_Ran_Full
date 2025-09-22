package com.ran;

//재료들은 모두 손질할 때 소리가 있고 재료 손질 시간이 필요하다
public class Ingredient {
    private String ingredientName;
    private String cookSound;
    private int cookTime;

    public Ingredient(String ingredientName,String cookSound, int cookTime){
        this.ingredientName = ingredientName;
        this.cookSound = cookSound;
        this.cookTime = cookTime;
    }

    public String getCookSound() {
        return cookSound;
    };

    public int getCookTime() {
      return cookTime;
    };

    public String getIngredientName() {
        return ingredientName;
    }

    public String toString(){
        return ingredientName;
    }

}



