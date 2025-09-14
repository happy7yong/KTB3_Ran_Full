package com.ran;

import java.util.HashSet;
import java.util.Set;

public class Recipe {
    String name; //만들어진 음식
    Set<String> requireIngredients;

    Recipe(String name, Set<String> requireIngredients) {
        this.name = name;
        this.requireIngredients = requireIngredients;
    }

    public Boolean containsIngredient(Set<String> ingredients) {
        return ingredients.containsAll(requireIngredients);//레시피에 있는 요소들이 모두 포함되어있는지확인
    }

    public void cook(){
        System.out.println(this.name + "완성!");
    }
}

//레시피 작성
class EggFry extends Recipe {
    EggFry() {
        super("계란후라이", Set.of("계란", "후라이팬"));
    }
}

class EggSteam extends Recipe {
    EggSteam() {
        super("계란찜", Set.of("계란", "파", "소금", "냄비"));
    }
}

class EggSausageRoll extends Recipe {
    EggSausageRoll() {
        super("소시지 달걀말이", Set.of("계란", "소시지", "후라이팬"));
    }
}

class PizzaBread extends Recipe {
    PizzaBread() {
        super("피자빵", Set.of("치즈", "밀가루", "오븐"));
    }
}

class Souffle extends Recipe {
    Souffle() {
        super("수플레", Set.of("우유", "설탕", "오븐"));
    }
}

class KimchiFriedRice extends Recipe {
    KimchiFriedRice() {
        super("김치볶음밥", Set.of("김치", "밥", "후라이팬"));
    }
}

class Cake extends Recipe {
    Cake() {
        super("케이크", Set.of("계란", "밀가루", "우유", "오븐"));
    }
}
