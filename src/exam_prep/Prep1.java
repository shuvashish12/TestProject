package exam_prep;

public class Prep1 {

    public static void main(String[] args) {
//        int num1= 999;
//        int num2 = 555;
//        int num3 = 666;
//
//        double numD = 99.99;
//        char char1 = '#';
//        System.out.println("Sum is "+char1+num1);
//
//        boolean bool = true;
//
//        System.out.println(5>4);
//
//        if(num1 < num2 && num1 < num3){
//            System.out.println(num1 + " is the smallest");
//        } else if (num2 < num1 && num2<num3) {
//            System.out.println(num2 + " is the smallest");
//        } else {
//            System.out.println(num3 + " is the smallest");
//        }
//
//        int month =3;
//        switch (month) {
//            case 1:
//                System.out.println("January");
//                break;
//            case 2:
//                System.out.println("February");
//                break;
//            default:
//                System.out.println("No match");
//        }
        int sum = 0;

        //show the sum of all the even numbers from 1 to 100
        for(int i =1; i<=100; i++){
            if(i%2==0){
                sum = sum+i;
            }
        }
        System.out.println(sum);

        //show number of leap years between 1911 and 2024
//        int count = 0;
//        int year = 1;
//        for(int i =1911; i<=2024; i++){
//            if(i%4==0){
//                System.out.println("year: "+i);
//                count++;
//            }
//        }
//        System.out.println(count);

        int i =15;

        do{
            //System.out.println(i);
            i= i+3;
        }while (i<22);

        i=15;
//        while (i<=20){
//            if(i==18){
//                break;
//            }
//            System.out.println("inside while loop "+i);
//
//            i++;
//        }

        for(i=15; i<22; i++){
            if(i==18){
                continue;
            }
            System.out.println("inside for loop "+i);
        }
        System.out.println(i);

    }
}
