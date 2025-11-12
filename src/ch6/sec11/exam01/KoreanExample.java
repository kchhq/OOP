package ch6.sec11.exam01;

// 실행하면 final 필드의 값을 변경할 수 없어서 에러가 남

public class KoreanExample {

    public static void main(String[] args) {

        Korean k1 = new Korean("123456-1234567", "김자바");

        System.out.println(k1.nation);
        System.out.println(k1.ssn);
        System.out.println(k1.name);

        k1.nation = "USA";
        k1.ssn = "123-12-1234";

        //final 필드가 아니라면 값 변경 가능
        k1.name = "김자바";
    }




}
