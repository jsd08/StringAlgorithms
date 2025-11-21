public class StringAlgorithms {

    /**
     * Challenge 1:
     * Write a method that takes a String 'word' and returns
     * a String where each character is placed on its own line.
     */
    public static String printCharacters(String word) {
        // TODO: Implement this method
        String p = "";
        for(int i = 0; i < word.length(); i++)
        {
          p = p + word.charAt(i) + "\n";
        }
        return p;
      }
      


/**
     * Challenge 2:
     * this mehtod takes a word and flips it bakwards
     */
public static String reverseWord(String word) 
{
    String r = ""; 

    for(int i = word.length()-1 ; i >= 0 ; i-- )
    {
        r = r + word.charAt(i); 
    }

    return r;
}


    /**
     * Challenge 3:
     * Write a method that takes a String 'sentence' and returns
     * the sentence with the first letter of each word capitalized.
     */
   public static String capitalizeString(String sentence) {
        // TODO: Implement this method
        return "";
    }


    /**
     * Challenge 4:
     * Write a method that takes a String 'word' and returns true
     * if the word is a palindrome (ignoring case), false otherwise.
     */
    public static boolean detectPalindrome(String word) {
        // TODO: Implement this method
        return false;
    }


    /**
     * Challenge 5:
     * Write a method that takes a String 'word' and returns the
     * first character that appears exactly once. If no such
     * character exists, return a space ' '.
     */
    public static char firstUniqueChar(String word) {
        //TODO: Implement this method
        return ' ';
    }


    /**
     * Main method:
     * Test each method at least once.
     */
    public static void main(String[] args) {

        // TODO: Add test calls for each challenge method
        
        // Example
        System.out.println(printCharacters("hello"));

        // Example:
        
        System.out.println(reverseWord("hello"));

        System.out.println("\nTesting capitalizeString:");
        // Example:
        // System.out.println(capitalizeString("the quick brown fox"));

        System.out.println("\nTesting detectPalindrome:");
        // Example:
        // System.out.println(detectPalindrome("racecar"));

        System.out.println("\nTesting firstUniqueChar:");
        // Example:
        // System.out.println(firstUniqueChar("swiss"));
    }
}
