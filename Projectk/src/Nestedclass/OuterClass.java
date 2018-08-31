package Nestedclass;

public class OuterClass {
    //OUTER CLASS OPEN BODY
    InnerClassA innerA = new InnerClassA();

    public void outerAMethodA() {
        System.out.println("OuterClassA MethodA");
        innerA.innerAMethodA();
    }

    public void outerAMethodB() {
        System.out.println("OuterClassA MethodB");


    }

    public class InnerClassA {

        public void innerAMethodA() {
            System.out.println("InnerA MethodA");
        }

        private void innerAMethodB() {
            System.out.println("InnerA MethodB");
        }

    }

    public class InnerClassB {

        public void innerBMethodA() {
            System.out.println("InnerB MethodA");
        }

        public void innerBMethodB() {
            System.out.println("Innerb MethodB")


        }
    }
} // OUTER CLASS CLOSE BODY
