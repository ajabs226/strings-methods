import java.util.Scanner;

public class StringsAndMethods {

	public static void main(String[] args) {

          Scanner scnr = new Scanner(System.in);

          //Capitalizes first letter & lowercases the rest
          System.out.println("Enter a word to be capitalized.");
          String userWord = scnr.nextLine();
          String capitalWord = capitalize(userWord);
          System.out.println(capitalWord);
          System.out.println();

          //Returns index of first occurrence of Waldo
          System.out.println("Write a phrase and include the word Waldo.");
          String userWaldo = scnr.nextLine();
          int findWaldo = wheresWaldo(userWaldo);
          System.out.println(findWaldo);
          System.out.println();

          //alphabetize words
          System.out.println("Now, let's alphabetize two words. Enter one now");
          String word1 = scnr.nextLine();
          System.out.println("Enter the second word");
          String word2 = scnr.nextLine();
          String alphaWord = firstThingsFirst(word1, word2);
          System.out.println(alphaWord);
          System.out.println();

          //reverse
          System.out.println("How about reversing a word? Type one below.");
          String userReverse = scnr.nextLine();
          StringBuffer reverseWord = reverse(userReverse);
          System.out.println(reverseWord);
          System.out.println();

          //prints longer word
          System.out.println("Let's compare two words and print the longer of the two. Enter one now");
          String userWord1 = scnr.nextLine();
          System.out.println("Enter a second one.");
          String userWord2 = scnr.nextLine();
          String longer = soLong(userWord1, userWord2);
          System.out.println(longer + " is longer.");
          System.out.println();

          //print rest of phrase after math
          System.out.println("Enter a phrase that contains the word math.");
          String userMath = scnr.nextLine();
          String mathPhrase = afterMath(userMath);
          System.out.println(mathPhrase);
          System.out.println();

          //prints one letter per line
          System.out.println("Enter a word to print one letter per line.");
          String userLetter = scnr.nextLine();
          String letterPerLine = letterize(userLetter);
          System.out.println();
     }
     //Capitalizes first letter & lowercases the rest
     public static String capitalize(String word) {
    	 word = word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();
         return word;
     }

     //Returns index of first occurrence of Waldo
     public static int wheresWaldo(String phrase) {
          return phrase.indexOf("Waldo");
     }

     //alphabetize words
     public static String firstThingsFirst(String stc1, String stc2) {
    	 int alphabetize = stc1.compareToIgnoreCase(stc2);

    	 if (alphabetize < 0) {
    		 return stc1 + " comes before " + stc2;
    	 } else if (alphabetize > 0) {
              return stc2 + " comes before " + stc1;
              
          } else {
        	  return (stc1 + " and " + stc2 + " are the same");
          }
     }   
     //reverse
     public static StringBuffer reverse(String s) {
    	 StringBuffer sbr = new StringBuffer(s);
    	 sbr.reverse();
         return sbr;
     }

     //prints longer word
     public static String soLong(String a, String b) {

    	 if(a.length() > b.length()) {
    		 return a;
    	
    	 } else if(b.length() > a.length()) {
    		 return b;
    	 } else {
    		 return a + " " + b;
    	 }

     }

     //print rest of phrase after math
     public static String afterMath(String phrase) {
    	 int mathIndex = 0;
         String mathSubstring = phrase.substring(mathIndex);

         if(mathIndex == phrase.indexOf("math")) {
             return mathSubstring;
         }else {
             return "dud";
         }

     }

     //prints one letter per line
     public static String letterize(String word) {
    	 for (int i = 0; i < word.length(); i++) {
             System.out.println(word.charAt(i));
         }
         return word;

     }

    

    

    

    

}