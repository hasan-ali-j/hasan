package Assignment;

import java.util.*;
public class Q7 {
	public static void main(String[] args) {
        Integer array[] = { 1, 2, 3, 4, 5 };
        // Sorting the array in descending order using Arrays.sort() ||[import java.util.*;]
        Arrays.sort(array, Collections.reverseOrder());
        // Converting int to string because int is not supported
        System.out.println(Arrays.toString(array));
	}
}