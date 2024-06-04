public class Variables {
    public static void main(String[] args) {
        int num1 =9;
       // System.out.println("The value is: "+num1);

        num1 = 10;
        num1 = num1 + num1;
        System.out.println(num1);

        double num2 = num1+3.5;
        System.out.println(num2);

        num2 = 2+6*5/2;
        System.out.println(num2);

        boolean bool = true;
        bool = false;
        System.out.println(bool);

        num1 = 8;
        num2 = 8;



        if(num1>num2){
            System.out.println("Today is May 1st");
            System.out.println("this is: "+num2);
        }
        else {
            System.out.println("Today is not May 1st");
        }
        int a = 30;
        int b = 50;
        int c = 32;

        if(a>b && a>c){
            System.out.println(a);
        } else if (b>a && b>c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }

        if(a>b){
            System.out.println("hello");
        }



        //if the value of grade is within 90-100 it will print Grade is A
        // 80-89 print B
        // 70-79 print C
        //60-69 print D
        //else print F
        int grade = 102;
        if(grade>=90 && grade<=100){
            System.out.println("Grade is A");
        } else if (grade>=80 && grade<=89) {
            System.out.println("Grade is B");
        } else if (grade>=70 && grade<=79) {
            System.out.println("Grade is C");
        } else if (grade>=60 && grade<=69) {
            System.out.println("Grade is D");
        }else {
            System.out.println("Grade is F");
        }

        System.out.println(9>8 && 8>7 && 8<5);

       int num5  = 3;
       int num6 =40;
       if(num5 >=30 || num6>=30){
           System.out.println("got it");
       } else {
           System.out.println("did not get it");
       }

       int sal = 50000;
       //if salary is more than 10000 print higher salary else print lower salary
        //salary can not be more than 50000 and less than 3000

        if(sal>3000 && sal<50000){
            if(sal>10000){
                System.out.println("Higher salary");
            } else {
                System.out.println("Lower salary");
            }
        } else {
            System.out.println("Invalid salary range");
        }

    }
}
