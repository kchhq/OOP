package ch3.sec03;

public class OverflowUnderflowExample {
    public static void main(String[] args) {
        byte var1 = 125;
        for(int i=0; i<5; i++) { // 125 -> 126 -> 127-> -128 -> -127. int로 바꾸면 정상적으로 올라감
            var1++;
            System.out.println("var1: " + var1);
        }

        System.out.println("-------------------");

        byte var2 = -125;
        for(int i=0; i<5; i++) {
            var2--;
            System.out.println("var2: " + var2);
        }

    }
}
