package ch6.sec13.exam02.package2;

import ch6.sec13.exam02.package1.*;

public class C {
    A a1 = new A(true); // public이라 됨
    A a2 = new A(1); // default인데 같은 패키지가 아니라 안됨
    A a3 = new A("문자열"); // private라서 안 됨
}
