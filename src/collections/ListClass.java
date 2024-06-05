package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListClass {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(6);
        numbers.add(9);
        numbers.add(10);

//        System.out.println(numbers.get(1));
//        numbers.add(15);
//        System.out.println(numbers.get(3));
        numbers.add(3,7);
//        System.out.println(numbers.get(4));
//        System.out.println(numbers.size());
//
//        System.out.println(numbers.contains(11));

//        for(int i =0; i<numbers.size(); i++){
//            System.out.println(numbers.get(i));
//        }

        for ( int number : numbers  ) {
            System.out.println(number);
        }

        LinkedList<Integer> integers = new LinkedList<>();
        integers.add(9);
        integers.add(19);
        integers.add(91);

        addSumList(numbers);
        addSumList(integers);

    }

    public static void addSumList(List<Integer> arrayList){
        int sum =0;
        for (int num :arrayList) {
            sum = sum+num;
        }
        System.out.println("Sum is "+sum);
    }


}
