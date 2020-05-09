package test;

class A {
    public void foo() {
        System.out.println("A.foo()");
    }
    public void bar() {
        foo();
    }


}

public class B extends A {

    @Override
    public void foo() {
        System.out.println("B.bar()");

    }

    public static void main(String[] args) {
        A b = new B();
        b.bar();
    }

}