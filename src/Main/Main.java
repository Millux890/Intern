package Main;

import BubbleSort.BubbleSort;

public class Main{

    public static void main(String[] args) throws Exception {

         Comparable<Integer>[] numbers = new Comparable[]{1, 4, 5, 6, 8, 3, 8};

         BubbleSort sorting = new BubbleSort();

         String s = String.valueOf(sorting.sort(numbers));

         System.out.println(s);

    }

}
