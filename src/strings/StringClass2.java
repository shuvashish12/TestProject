package strings;

public class StringClass2 {
    public static void main(String[] args) {

        int num1 = 9;
//        int num2 =10;
//
//        int num3 = (num1>num2) ? num1 : num2;
//        System.out.println(num3);
//
//        if(num1>num2){
//            num3=num1;
//        } else {
//            num3=num2;
//        }
//        System.out.println(num3);

        String color1 = "White";
        String color2 = "Black";
        //WhiteBlack

        System.out.println(color1+color2);
        System.out.println(9+num1);

        String num3 = "1122";
        System.out.println(num3+num1);

        String[] colors = {"White", "Blue", "Black", "Red", "Orange"};

        for(int i =0; i<5; i++){
            //System.out.println(colors[i].toUpperCase());
            //System.out.println(i);
        }

        printStringLength("sdflkhsjfhkjfha");
        findTotalChars("Americaaaaaaaaaa", 'a');

        String name ="Iftekhardfgsdfg";
        //System.out.println(name.substring(name.length()-2));
        System.out.println(name.substring(name.length()-2));
    }

    public static void printStringLength(String str){
        System.out.println("Length is "+str.length());
    }

    //create a method which takes 2 parms(String and char) "New York" 'e'
    //print total number of char present in the String

    public static void findTotalChars(String str, char ch){
        int totalCharPresent = 0;

        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) == ch){
                totalCharPresent++;
            }
        }
        System.out.println("Total number of char "+totalCharPresent);
    }


}
