package ch2.sec11;

public class VariableScopeExample {
    public static void main(String[] args) {
        int v1 = 15;
        int v2 = v1 - 10; // v2를 전역변수로 선언하면 에러가 나지 않음
        if(v1 > 10) {
        }
        int v3 = v1 + v2 + 5; //v2가 지역변수일 때는 에러가 남
    }
}
