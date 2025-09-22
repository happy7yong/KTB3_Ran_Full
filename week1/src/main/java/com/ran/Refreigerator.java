package com.ran;

//냉장 식품
public class Refreigerator extends Ingredient{
    Refreigerator(String ingredientName,String cookSound, int cookTime){
        super(ingredientName,cookSound,cookTime);
    }
}

//파
class WelshOnion extends Refreigerator{
    WelshOnion(String ingredientName,String cookSound, int cookTime){
        super(ingredientName,cookSound,cookTime);
    }
}

//계란
class Egg extends Refreigerator{
    Egg(String ingredientName,String cookSound, int cookTime){
        super(ingredientName,cookSound,cookTime);
    }
}

//우유
class Milk extends Refreigerator{
    Milk(String ingredientName,String cookSound, int cookTime){
        super(ingredientName,cookSound,cookTime);
    }
}

//소시지
class Sausage extends Refreigerator{
    Sausage(String ingredientName,String cookSound, int cookTime){
        super(ingredientName,cookSound,cookTime);
    }
}

//치즈
class Cheese extends Refreigerator{
    Cheese(String ingredientName,String cookSound, int cookTime){
        super(ingredientName,cookSound,cookTime);
    }
}


