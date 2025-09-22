package com.ran;

import java.util.Set;

//카테고리 별 효과음
// 달걀 요리 레시피 : 카테고리
// 자식이 매개변수로 전달 : 자식 -> 부모 -> 조상
public class EggRecipe extends Recipe {
    EggRecipe(String name, Set<Ingredient> requireIngredients) {
        super(name, requireIngredients);
    }


}


