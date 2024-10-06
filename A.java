class B {
    public static void display() {
    System.out.println("B's display method");
    }
    }
    class C extends B {
    public void display() {
    System.out.println("A's display method");
    }
    }
    public class A {
    public static void main(String[] args) {
    C c = new C();
    B b = new B();
    c.display();
    b.display();
    }
    }