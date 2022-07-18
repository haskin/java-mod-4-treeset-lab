import java.util.ArrayList;
import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

import javax.management.ValueExp;

/**
 * Problems:
 * x Write the method getNums that takes in an array of integers and return an
 * ArrayList containing the numbers that are greater than 25.
 */

public class Main {
    public static void main(String[] args) {
        int[] numbers = { 1, 4, 5, 2, 34, 36, 5, 4, 23, 45, 6, 8, 56, 34, 37 };
        ArrayList<Integer> res = getNums(numbers);
        System.out.println(res); // [34, 36, 37, 45, 56]
    }

    public static ArrayList<Integer> getNums(int[] nums) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        Arrays.stream(nums).forEach(treeSet::add);
        SortedSet<Integer> valuesAbove25 = treeSet.tailSet(Integer.valueOf(25));
        return new ArrayList<>(valuesAbove25);
    }
}