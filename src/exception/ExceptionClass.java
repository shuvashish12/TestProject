package exception;

public class ExceptionClass {
    public static void main(String[] args) {
        //System.out.println("hello world");

//        int num1= 3;
//        int num2 =0;
//
//        System.out.println(num1/num2);
//        System.out.println("hello world");
//        int[] nums = {2,6,9};
        //System.out.println(nums[3]);
//        try {
//            System.out.println(nums[3]);
//        } catch (Exception e){
//            System.out.println("hello");
//        }finally {
//
//        }
//        System.out.println("finished");
        try {
            addException();
        } catch (Exception e){
            System.out.println("Hello");
        }
    }

    public static void addException() throws Exception{
        int[] nums = {2,5,8};
        System.out.println(nums[3]);
    }
}

