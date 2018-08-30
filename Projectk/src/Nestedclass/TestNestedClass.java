package Nestedclass;

public class TestNestedClass {
    public TestNestedClass() {
    }

    public static void main(String[] args) {
        OuterClass outerclass = new OuterClass();
        outerclass.outerAMethodA();
        outerclass.innerA.innerAMethodA();
    }
}
