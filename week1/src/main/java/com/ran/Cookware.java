package com.ran;

//요리도구
public class Cookware extends Ingredient{
    Cookware(String ingredientName,String cookSound, int cookTime){
        super(ingredientName,cookSound,cookTime);
    }
}

//후라이팬
class CookwarePan extends Cookware{
    CookwarePan(String ingredientName,String cookSound, int cookTime){
        super(ingredientName,cookSound,cookTime);
    }

    CookwarePan(String ingredientName,String cookSound){
        super(ingredientName,cookSound,300);
    }
}

//후라이팬
class FryingPan extends Cookware{
    FryingPan(String ingredientName,String cookSound, int cookTime){
        super(ingredientName,cookSound,cookTime);
    }

    FryingPan(String ingredientName,String cookSound){
        super(ingredientName,cookSound,300);
    }
}

//냄비
class Pot extends Cookware{
    Pot(String ingredientName,String cookSound, int cookTime){
        super(ingredientName,cookSound,cookTime);
    }

    Pot(String ingredientName,String cookSound){
        super(ingredientName,cookSound,300);
    }
}

//전자레인지
class Microwave extends Cookware{
    Microwave(String ingredientName,String cookSound, int cookTime){
        super(ingredientName,cookSound,cookTime);
    }

    Microwave(String ingredientName,String cookSound){
        super(ingredientName,cookSound,300);
    }
}

//후라이팬
class Oven extends Cookware{
    Oven(String ingredientName,String cookSound, int cookTime){
        super(ingredientName,cookSound,cookTime);
    }

    Oven(String ingredientName,String cookSound){
        super(ingredientName,cookSound,300);
    }
}