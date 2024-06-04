package exam_prep;

public class Prep2 {
    public static void main(String[] args) {

        int[] nums = new int[10];
        int[] numbers = {2,9,8,6,25,7,5,3,9};
        System.out.println(numbers.length);
        //int num ;
        //System.out.println(numbers[5]);
        //int num = numbers[0];
        for(int i =2; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }

        //get the sum of the values of the array
        // stop the loop when sum > 50
        // print the value/index when it is stopping
        int sum =0;
        for(int i =0; i<numbers.length; i++){
           sum = sum +numbers[i];
           if(sum>50){
               System.out.println("index: "+i);
               System.out.println("sum: "+sum);
               break;
           }
        }
    }
}
