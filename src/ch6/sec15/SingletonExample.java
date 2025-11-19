package ch6.sec15;

import java.sql.SQLOutput;

public class SingletonExample {

    public static void main(String[] args) {
        /*
        Singleton obj1 = new Singleton(); // new로 새 인스턴스 생성 불가
        Singleton obj2 = new Singleton(); // new로 새 인스턴스 생성 불가
         */


        Singleton obj1 = Singleton.getInstance(); // 메소드 호출로 객체 생성해야함
        Singleton obj2 = Singleton.getInstance();

        if (obj1 = obj2) {
            System.out.println("같은 Singleton 객체 입니다.");
        } else {
            System.out.println("다른 Singleton 객체 입니다.");
        }
    }
}
