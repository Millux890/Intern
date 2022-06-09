package BubbleSort;

public class BubbleSort {


     public Comparable<Integer>[] sort(Comparable<Integer>[] input) throws Exception {

        if(input == null){
            throw new RuntimeException("Your input is empty!");
        }

        Comparable temp;
        Comparable temp2;
        for (int i = 0; i < input.length; i++) {
            if(input[i] == null){
                i++;
            }
            temp2 = input[i];
            for (int j = i+1; j < input.length; j++) {
                if(temp2.compareTo(input[j]) > 0) {
                    temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
            }
        }
        return input;
    }
}
