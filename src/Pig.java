public class Pig {

    /*
    * Create a method "pigLatin" that takes a string consisting of one or more 
    * all-lowercase words separated by spaces. It should return a new string 
    * converted to "pig Latin," where each word has its first letter moved to 
    * the back and the letters "ay" are added to the end of the word. However, 
    * words starting with a vowel (a, e, i, o, or u) should not be altered.
    *
    * Examples:
    *
    * pigLatin("something")  should return "omethingsay"
    * pigLatin("awesome")    should return "awesome" (words starting with a vowel should not be altered)
    * pigLatin("latin is a hard language")  should return "atinlay is a ardhay anguagelay"
    * pigLatin("y")  should return "yay"
    * pigLatin("e")   should return "e"
    */
    public static void main(String[] args) {
        // Test cases
        assertEqual(1, pigLatin("something"), "omethingsay");
        assertEqual(2, pigLatin("awesome"), "awesome");
        assertEqual(3, pigLatin("latin is a hard language"), "atinlay is a ardhay anguagelay");
        assertEqual(4, pigLatin("y"), "yay");
        assertEqual(5, pigLatin("e"), "e");
    }

    // Implement your solution here!
    public static String pigLatin(String sentence) {
        //create a variable to hold the new string
        String newString = "";

        // create a variable to hole "ay"
        String pigify = "ay";

        // split the sentence by spaces in an array
        String[] splitSentence = sentence.split(" ");
        // loop over each word
        for (int i = 0; i < splitSentence.length; i++) {
            String firstWord = splitSentence[i];

            // get first letter
            char c = firstWord.toLowerCase().charAt(0);

            // compare 
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c =='u') {
                newString += firstWord;
            } else {
                newString += firstWord.substring(1) + c + pigify;
            }

            if (i < splitSentence.length - 1) {
                newString += " ";
            }
        }
        return newString;
    }









    // Method to help with testing, you do not need to read this.
    public static void assertEqual(int testNumber, String actual, String expected) {
        if (!expected.equals(actual)) {
        System.out.println("Test " + testNumber + " failed! Expected: '" + expected + "', but got: '" + actual + "'");
        } else {
        System.out.println("Test " + testNumber + " passed!");
        }
    }
    }
  
  