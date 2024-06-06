import java.util.Random;

public class TwoDimArray {
    public static void main(String[] args) {
        int[] nums = new int[5];
        int[][] nums2 = new int[3][4];

        Random random = new Random();

        for (int i =0; i<3; i++){
            for (int j=0; j<4; j++){
               // System.out.print(i+","+j+"  ");
                nums2[i][j] = random.nextInt(50);
            }
        }
        for (int i =0; i<3; i++){
            for (int j=0; j<4; j++){
                System.out.print(nums2[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
