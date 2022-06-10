package WordsCounter;

public class BalancedWordsCounter {




    public static int count(String input) throws RuntimeException{
        int result = 0;

       if(input == null){
           throw new RuntimeException("Your input is null!");
       }

        char[] ch = new char[input.length()];

        for (int i = 0; i < input.length(); i++) {
            ch[i] = input.charAt(i);

            if(!Character.isLetter(ch[i])){
                throw new RuntimeException("Not every char is a letter!");
            }
        }



        for (int i = 0; i < input.length(); i++) {

            int amount = 1;

            for(int j = i + 1; j < input.length(); j++){
                if(ch[j] == ch[i]){
                    amount++;
                }
            }

            if(amount > result){
                result = amount;
            }
        }

        return result * (input.length() - result);
    }
}
