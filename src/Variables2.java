import java.util.Scanner;

public class Variables2 {
    public static void main(String[] args) {

        int i = -6;

        //System.out.println(i++);
        System.out.println(i);
//        System.out.println(i++);
//        System.out.println(i);
        System.out.println(17%3);      //mod

        if(i%2==1){
            System.out.println(i+ " is an odd number");
        }else {
            System.out.println(i+ " is an even number");
        }

        if(i>=0){
            System.out.println(i+ " is a positive number");
        } else {
            System.out.println(i+ " is a negative number");
        }

        int weekday = 5;

        if(weekday==1){
            System.out.println("Today is Monday");
        } else if (weekday==2) {
            System.out.println("Today is Tuesday");
        }
        else if(weekday==3){
            System.out.println("Today is Wednesday");
        } else if (weekday==4) {
            System.out.println("Today is Thursday");
        }

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number ");
//        int num1 = scanner.nextInt();
//        System.out.println("Enter another number ");
//        int num2 =scanner.nextInt();
//        if(num2>num1){
//            System.out.println(num2 + " is higher number");
//        } else {
//            System.out.println(num1 + " is higher number");
//        }

        System.out.println("Enter month's number");
        int month = scanner.nextInt();
        switch (month){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            default:
                System.out.println("Nothing matched");
        }

    }
}
