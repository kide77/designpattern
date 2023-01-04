package ch01.strategy.asis;

public class RubberDuck extends Duck {

    @Override
    public void quack() {
        System.out.println("러버덕은 소리안낸다.");
    }

    @Override
    public void display() {
        System.out.println("RubberDuck");
    }

    /**
     * 날 수 없는 고무오리가 추상클래스로 부터
     * 나는 기능을 추가 받아서 오류가 발생했다.
     * 오! 그렇다면 이녀석을 오버라이드해서 아무기능이 없는 것으로 하자.
     */
    @Override
    public void fly() {

    }
}