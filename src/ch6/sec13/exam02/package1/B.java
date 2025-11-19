package ch6.sec13.exam02.package1;



public class B {
    A a1 = new A(true); // O
    A a2 = new A(1); // O
    A a3 = new A("문자열"); // X
}

A a1 = new A(true); // O
A a2 = new A(1); // O
