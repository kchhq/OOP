package ch6.sec10.exam03;

public class Car {

    int speed;

    void run() {
        System.out.println(speed+"으로 달립니다.");
    }
    // Car라고 하는 놈의 정적 메소드인데, 정적 메소드 블록 안에서 인스턴스 필드와 인스턴스 메소드를 접근하려고 해서 객체를 생성해서 접근하는 모습
    static void simulate() {
        Car myCar = new Car();

        myCar.speed=200;
        myCar.run();
    }

    public static void main(String[] args) {
        simulate();

        Car myCar = new Car();

        myCar.speed=60;
        myCar.run();
    }
}
