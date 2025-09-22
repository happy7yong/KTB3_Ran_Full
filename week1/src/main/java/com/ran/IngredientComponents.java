package com.ran;

import java.util.List;

public class IngredientComponents {
    public static final Egg EGG = new Egg("계란","계란을 깨고 풀고 있습니다!", 5000);
    public static final WelshOnion WELSH_ONION = new WelshOnion("파","파를 썰고 있습니다!", 6000);
    public static final Milk MILK = new Milk("우유","우유를 붓고 있습니다!", 2000);
    public static final Sausage SAUSAGE = new Sausage("소시지","소시지를 자르고 있습니다!", 3000);
    public static final Cheese CHEESE = new Cheese("치즈","치즈를 자르고 있습니다!", 2000);

    public static final Salt SALT = new Salt("소금","소금을 뿌리고 있습니다!");
    public static final Sugar SUGAR = new Sugar("설탕","설탕을 뿌리고 있습니다!");
    public static final SoySauce SOYSAUCE = new SoySauce("간장","간장을 뿌리고 있습니다!");
    public static final FlourPowder FLOURPOWDER = new FlourPowder("밀가루","밀가루를 붓고 있습니다!");

    //같은Cookware로 만들면 어떻게 되는지 시도
    public static final Cookware FRYINGPAN = new CookwarePan("후라이팬","후라이팬을 꺼냈습니다!");
    public static final Cookware OVEN = new CookwarePan("오븐","오븐에 넣었습니다!");
    public static final Cookware MICROWAVE = new CookwarePan("전자레인지","전자레인지에 넣었습니다!");
    public static final Cookware POT = new CookwarePan("냄비","냄비에 넣었습니다!");




    static List<Cookware> cookwaresList = List.of(FRYINGPAN,OVEN,MICROWAVE,POT);

    static List<Refreigerator> refreigeratorList = List.of(EGG, WELSH_ONION, MILK, SAUSAGE, CHEESE);

    static List<Condiments> condimentsList = List.of(SALT,SUGAR,SOYSAUCE,FLOURPOWDER);

}
