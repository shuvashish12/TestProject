public class MethodClass2 {
    public static void main(String[] args) {
        int[] numbers = {4,6,7,5,3,9,12};
        int[] numbers2 = {3,6,9};
        int sum=getSum(numbers);
        System.out.println(sum);
        printLargerArray(numbers, numbers2);

    }

    public static int getSum(int[] nums){
        int sum =0;
        for(int i=0; i< nums.length; i++){
            sum = sum+nums[i];
        }
        return sum;
    }

    //create a method which will take 2 int[] params
    //and print which array contains more numbers
    public static void printLargerArray(int[] nums1, int[] nums2){
        if(nums1.length > nums2.length){
            System.out.println("First array is larger");
        } else if(nums2.length > nums1.length) {
            System.out.println("Second array is larger");
        } else {
            System.out.println("Equal");
        }
    }


}
