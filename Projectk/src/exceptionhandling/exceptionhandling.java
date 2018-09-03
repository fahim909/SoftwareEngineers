package exceptionhandling;

public class ExceptionHandling {
    public static void main(String[] args) {
        int num = 10;
        try {
            int result = num / 0;
            System.out.println(result);
        }catch(Exception ex){
            System.out.println("I need to learn to code");
        }
        System.out.println("I learned to this point");
    }

}
