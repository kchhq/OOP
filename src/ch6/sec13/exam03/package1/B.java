package ch6.sec13.exam03.package1;

public class B {
    // 객체 생성 a라는 객체는 A의 필드를 상속받음
    public void method() {
        A a = new A();

        //필드값 변경
        a.field1 = 1; // O
        a.field2 = 1; // X (default)
        a.field3 = 1; // X (private)
        // 메소드 호출
        a.method1(); // O
        a.method2(); // X
        a.method3(); // X
    }
}