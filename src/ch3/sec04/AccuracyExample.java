package ch3.sec04;

public class AccuracyExample {
    public static void main(String[] args) {
        int apple = 1;
        double pieceunit = 0.1;
        int number = 7;

        double result = apple - number*pieceunit;
        System.out.println("사과 한 개에서 남은 양: " + result);

    }
}
