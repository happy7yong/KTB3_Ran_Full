package com.ran;

import java.util.HashSet;
import java.util.Set;

public class Recipe {
    private final String name; //만들어진 음식
    private final Set<String> requireIngredients;

    public Recipe(String name, Set<String> requireIngredients) {
        this.name = name;
        this.requireIngredients = requireIngredients;
    }

    public boolean containsIngredient(Set<String> ingredients) {
        return ingredients.equals(requireIngredients);//레시피에 있는 요소들이 모두 포함되어있는지 확인
    }

    public void cook(){
        System.out.println("레시피를 발견했습니다!" + this.name + "가 완성되었습니다!");
    }
}

//카테고리 별 효과음
// 달걀 요리 레시피 : 카테고리
class EggRecipe extends Recipe {
    EggRecipe(String name, Set<String> requireIngredients) {
        super(name, requireIngredients);
    }

    // 달걀 요리에만 해당되는 공통 기능
    void crackEgg() {
        System.out.println("계란을 톡! 깨뜨립니다.");
    }
}

// 빵/밀가루 요리 카테고리
class BreadRecipe extends Recipe {
    BreadRecipe(String name, Set<String> requireIngredients) {
        super(name, requireIngredients);
    }

    void preheatOven() {
        System.out.println("오븐을 예열합니다.");
    }
}

class FriedRiceRecipe extends Recipe {
    FriedRiceRecipe(String name, Set<String> requireIngredients) {
        super(name, requireIngredients);
    }

    void stirFry() {
        System.out.println("프라이팬에서 재료를 볶습니다...");
    }
}


//구체화 레시피
//레시피 작성
class EggFry extends EggRecipe {
    EggFry() {
        super("계란후라이", Set.of("계란", "후라이팬"));
    }

    public void cook(){
        crackEgg();
        super.cook();
    }
}

class EggSteam extends EggRecipe {
    EggSteam() {
        super("계란찜", Set.of("계란", "파", "소금", "냄비"));
    }

    public void cook(){
        crackEgg();
        super.cook();
    }
}

class EggSausageRoll extends EggRecipe {
    EggSausageRoll() {
        super("소시지 달걀말이", Set.of("계란", "소시지", "후라이팬"));
    }

    public void cook(){
        crackEgg();
        super.cook();
    }
}

class PizzaBread extends BreadRecipe {
    PizzaBread() {
        super("피자빵", Set.of("치즈", "밀가루", "오븐"));
    }

    public void cook(){
        preheatOven();
        super.cook();
    }
}

class Souffle extends BreadRecipe {
    Souffle() {
        super("수플레", Set.of("우유", "설탕", "오븐"));
    }

    public void cook(){
        preheatOven();
        super.cook();
    }
}

class KimchiFriedRice extends FriedRiceRecipe {
    KimchiFriedRice() {
        super("김치볶음밥", Set.of("김치", "밥", "후라이팬"));
    }

    public void cook(){
        stirFry();
        super.cook();
    }
}

class Cake extends BreadRecipe {
    Cake() {
        super("케이크", Set.of("계란", "밀가루", "우유", "오븐"));
    }

    public void cook(){
        preheatOven();
        super.cook();
    }
}
