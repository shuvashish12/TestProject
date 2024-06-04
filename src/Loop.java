import java.util.Scanner;

public class Loop {

    public static void main(String[] args) {

//        for(int i =1; i<=5; i=i+2){
//            System.out.println(i);
//        }

//        for(int i= 1; i<=5; i++ ){
//            System.out.println("Hello "+i);
//            if(i==3){
//                continue;
//            }
//            System.out.println("End "+i);
//            System.out.println("End2 "+i);
//        }
        //get the ending point of a for loop
        //from the output then print all the numbers

//        System.out.println("Enter your number:");
//        int endNumber = scanner.nextInt();
//
//        for (int i=1; i<=endNumber; i++){
//            System.out.println(i);
//        }

        //find all the number divisible by 3
        //starting and ending point will be given on the output screen

//        System.out.println("Enter your starting number:");
//        int startingPoint= scanner.nextInt();
//        System.out.println("Enter your ending number:");
//        int endNumber= scanner.nextInt();
//        for (int i = startingPoint; i<=endNumber; i++){
//            if(i%3==0){
//                System.out.println(i);
//            }
//        }

        //create a calculator, the inputs(2) will be taken from the console
        //then it will ask which operation I want to perform (1->+, 2->-
        //3-> *, 4->/ 5->exit
        //

        int operation = 0;
        //do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter first number : ");
            int num1 = scanner.nextInt();
            System.out.println("Enter second number: ");
            int num2 = scanner.nextInt();

            System.out.println(" Press 1 -> ADD, 2-> SUB, 3->MULTI, 4-> DIV, 5->EXIT");
            operation = scanner.nextInt();

            switch (operation) {
                case 1:
                    System.out.println("ADD " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("SUB " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("MULTI " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("DIV " + (num1 / num2));
                    break;
                case 5:
                    System.out.println("Good Bye");
                    break;
                default:
                    System.out.println("Invalid number....");
            }
       // }while (operation!=5);


    }
}
