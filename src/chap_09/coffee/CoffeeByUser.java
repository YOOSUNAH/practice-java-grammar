package chap_09.coffee;

import chap_09.user.User;

public class CoffeeByUser <T extends User> { // T는 User라는 claa를 상속하는 T를 써야 함.
    public T user;

    public CoffeeByUser(T user) {
        this.user = user;
    }
    public void ready(){
        System.out.println("커피 분비 완료 : " + user.name);
        user.addPoint();
    }
}
