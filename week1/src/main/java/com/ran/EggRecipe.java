package com.ran;

import java.util.Set;

//카테고리 별 효과음
// 달걀 요리 레시피 : 카테고리
// 자식이 매개변수로 전달 : 자식 -> 부모 -> 조상
public class EggRecipe extends Recipe {
    EggRecipe(String name, Set<String> requireIngredients) {
        super(name, requireIngredients);
    }

    void crackEgg() {
        //달걀 요리면 이곳에서 출력되어야하는데?
        //runnable로 변경?
        System.out.println("계란을 톡! 깨뜨립니다.");
    }

}


//구체화 레시피
//레시피 작성
class EggFry extends EggRecipe {
    //생성자
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
