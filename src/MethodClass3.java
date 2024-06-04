public class MethodClass3 {
    public static void main(String[] args) {
       // addSum(9,3);
        addSum(7,6,9);
        addSum(7, 7.5);
    }
    public static void addSum(int num1, int num2){
        System.out.println("Sum is "+(num1+num2));
    }

    public static void addSum(int num1, int num2, int num3){
        addSum(5,6);
        System.out.println("Sum is "+(num1+num2+num3));
    }

    public static void addSum(int num1, double num2){
        System.out.println("Sum is "+(num1+num2));
    }
}
