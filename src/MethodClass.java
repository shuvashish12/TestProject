

public class MethodClass {
    public static void main(String[] args) {
        int num1= 5;
        int num2 = 6;
        int sum = num1 +num2;
        System.out.println(sum);

        System.out.println("Hello");
        System.out.println("world");

        int number1 = 6;
        int number2 = 7;

        addSum();
        addSum2(9,8);
        addSum2(number1,number2);
        printSquare(32);
        printLargerNumber(211, 58);
        int lNum = returnLargerNumber(90, 91);
        System.out.println(lNum+ " main method");
        int num3 = 200;
        System.out.println("Sub is "+(num3 - lNum));
    }
    public static void addSum(){
        int num1= 9;
        int num2 = 7;
        int sum = num1+num2;
        System.out.println(sum);
    }
    public static void addSum2(int num1, int num2) {
        int sum = num1+num2;
        System.out.println("Sum is "+sum);
    }

    //write a method which takes 1 param and print the square of the value
    public static void printSquare(int num){
        int square = num * num;
        System.out.println(square);
    }

    // write a method which takes 2 int params and print the larger value
    public static void printLargerNumber(int num1, int num2){
        if(num1>num2){
            System.out.println(num1+" is larger number");
        } else {
            System.out.println(num2+" is larger number");
        }
    }

    public static int returnLargerNumber(int num1, int num2){
        if(num1>num2){
            return num1;
        } else {
            return num2;
        }
    }


}
