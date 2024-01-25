package utils;

public class StringUtility {

    public static String reverse(String str){
        String reverse = ""; // to contain all the characters of the given string in revers order
        for (int i = str.length()-1; i >= 0 ; i--) { // i: index number of the given string starting from last index to index 0

            //  System.out.println(str.charAt(i));
            reverse += str.charAt(i); // to get each character of the string starting from last index to index 0
        }
        return reverse;
    }

    // return frequency of the given word from the given sentence
    public static int frequency(String sentence, String word){

        int count = 0;

        while (sentence.contains(word)){
            sentence = sentence.replaceFirst(word,"");
            count++;
        }
        return count;
    }

    public static int frequency(String str, char ch){

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch){
                count++;
            }
        }
        return count;
    }
}
