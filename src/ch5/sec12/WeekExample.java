package ch5.sec12;

import java.util.Calendar;

public class WeekExample {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // Week 열거 타입 변수 선언

        enumWeek today = null; //참조형이 아닌 "열거형" 데이터 타입임. 다른거임.

        //캘린더 열기
        Calendar cal = Calendar.getInstance();

        //오늘의 요일 얻기
        int enumWeek = cal.get(Calendar.DAY_OF_WEEK);

        //숫자를 열거 상수로 변환해서 변수에 대입
        int enumWeek = cal.get(Calendar.DAY_OF_WEEK);

        switch(enumWeek) {
            case 1: today = enumWeek.SUNDAY; break;
            case 2: today = enumWeek.MONDAY; break;
            case 3: today = enumWeek.TUESDAY; break;
            case 4: today = enumWeek.WEDNESDAY; break;
            case 5: today = enumWeek.THURSDAY; break;
            case 6: today = enumWeek.FRIDAY; break;
            case 7: today = enumWeek.SATURDAY; break;
        }

        //열거 타입 변수를 사용
        if(today == enumWeek.SUNDAY) {
            System.out.println(today);
            System.out.println("일요일에는 축구를 합니다.");
        }
        else {
            System.out.println(today);
            System.out.println("열심히 자바 공부합니다.");
        }


    }
}
