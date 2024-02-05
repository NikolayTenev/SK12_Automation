package Lecture03;

import java.util.ArrayList;
import java.util.List;

public class ExerciseSixth {


    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);

        System.out.println("Original List: " + list1);

        // Reverse the list using a for loop
        int size = list1.size();
        for (int i = 0; i < size / 2; i++) {
            int temp = list1.get(i);
            list1.set(i, list1.get(size - 1 - i));
            list1.set(size - 1 - i, temp);
        }

        System.out.println("Reversed List: " + list1);
    }
}



