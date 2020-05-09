package test;

public class B extends A {
    public void a1() {
        System.out.println("a1 in B");
    }

    public static void main(String[] args) {
        A b = new B();

        b.a2();
    }

}
