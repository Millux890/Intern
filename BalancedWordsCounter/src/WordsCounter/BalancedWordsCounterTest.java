package WordsCounter;

public class BalancedWordsCounterTest {



    public static void testing() throws RuntimeException{
        //test1
        String input1 = "aabbabcccba" ;
        int result1 = BalancedWordsCounter.count(input1);
        System.out.println("result = " + result1);

        //test2
        String input2 = "";
        int result2 = BalancedWordsCounter.count(input2);
        System.out.println("result = " + result2);

        //test3
        String input3 = "abababa1";
        int result3 = BalancedWordsCounter.count(input3);
        System.out.println("result = " + result3);

        //test4
         String input4 = null;
        int result4 = BalancedWordsCounter.count(input4);
        System.out.println("result = " + result4);

    }
}
