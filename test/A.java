package test;

class A {

    public void a1() {
        System.out.println("a1 in A");
    }

    public void a2() {
        this.a1();
    }

}

