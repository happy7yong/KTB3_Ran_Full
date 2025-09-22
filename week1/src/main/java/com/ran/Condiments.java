package com.ran;

//조미료
public class Condiments extends Ingredient{
    Condiments(String ingredientName,String cookSound, int cookTime){
        super(ingredientName,cookSound,cookTime);
    }

    //기본적으로 조미료는 쿠킹타임 500을 가지고 잇음.
    Condiments(String ingredientName,String cookSound){
        super(ingredientName,cookSound,500);
    }
}

//소금
class Salt extends Condiments{
    Salt(String ingredientName,String cookSound, int cookTime){
        super(ingredientName,cookSound,cookTime);
    }

    Salt(String ingredientName,String cookSound){
        super(ingredientName,cookSound);
    }

}

//설탕
class Sugar extends Condiments{
    Sugar(String ingredientName,String cookSound, int cookTime){
        super(ingredientName,cookSound,cookTime);
    }

    Sugar(String ingredientName,String cookSound){
        super(ingredientName,cookSound);
    }
}

//간장
class SoySauce extends Condiments{
    SoySauce(String ingredientName,String cookSound, int cookTime){
        super(ingredientName,cookSound,cookTime);
    }

    SoySauce(String ingredientName,String cookSound){
        super(ingredientName,cookSound);
    }
}


//밀가루:Flour powder
class FlourPowder extends Condiments{
    FlourPowder(String ingredientName,String cookSound, int cookTime){
        super(ingredientName,cookSound,cookTime);
    }

    FlourPowder(String ingredientName,String cookSound){
        super(ingredientName,cookSound);
    }
}



