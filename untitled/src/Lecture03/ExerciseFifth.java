package Lecture03;

import java.util.ArrayList;
import java.util.List;

public class ExerciseFifth {


    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(12);
        list1.add(15);
        list1.add(32);
        list1.add(42);
        list1.add(55);
        list1.add(75);
        list1.add(122);
        list1.add(132);
        list1.add(150);
        list1.add(180);
        list1.add(200);

        for (int num : list1) {
            if (num > 150) {
                break;  // Stop the loop if the number is greater than 150
            } else if (num % 5 == 0) {
                System.out.println(num);
            }
        }
    }
}



