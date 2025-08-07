public class StringLab {
    public static void main(String[] args) {
        System.out.println("=== Java String Methods Lab ===\n");
        
        // Exercise 1: length() - Finding the String's Size
        System.out.println("Exercise 1: length() Method");
        String greeting = "Hello, Cadets!";
        int length = greeting.length();
        System.out.println("The length of the string is: " + length);
        System.out.println();
        
        // Exercise 2: charAt() - Accessing a Character
        System.out.println("Exercise 2: charAt() Method");
        String message = "Keep learning!";
        char character = message.charAt(5);
        System.out.println("The character at index 5 is: " + character);
        System.out.println();
        
        // Exercise 3: substring() - Extracting a Part of a String
        System.out.println("Exercise 3: substring() Method");
        String statement = "Java is powerful.";
        String part = statement.substring(5, 7);
        System.out.println("The extracted substring is: " + part);
        System.out.println();
        
        // Exercise 4: toUpperCase() and toLowerCase() - Changing Case
        System.out.println("Exercise 4: toUpperCase() and toLowerCase() Methods");
        String mixedCase = "This Is A Test";
        String upper = mixedCase.toUpperCase();
        String lower = mixedCase.toLowerCase();
        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);
        System.out.println();
        
        // Exercise 5: indexOf() - Finding a Character or Substring
        System.out.println("Exercise 5: indexOf() Method");
        String sentence = "The quick brown fox jumps over the lazy dog";
        int indexOfFox = sentence.indexOf("fox");
        int indexOfZ = sentence.indexOf('z');
        int indexOfCat = sentence.indexOf("cat");
        System.out.println("Index of 'fox': " + indexOfFox);
        System.out.println("Index of 'z': " + indexOfZ);
        System.out.println("Index of 'cat': " + indexOfCat);
        System.out.println();
        
        // Exercise 6: equals() vs. equalsIgnoreCase() - Comparing Strings
        System.out.println("Exercise 6: equals() vs. equalsIgnoreCase() Methods");
        String str1 = "Java";
        String str2 = "java";
        String str3 = "Java";
        boolean isEqual1 = str1.equals(str2);
        boolean isEqual2 = str1.equals(str3);
        boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2);
        System.out.println("\"Java\".equals(\"java\"): " + isEqual1);
        System.out.println("\"Java\".equals(\"Java\"): " + isEqual2);
        System.out.println("\"Java\".equalsIgnoreCase(\"java\"): " + isEqualIgnoreCase);
        System.out.println();
        
        // Exercise 7: replace() - Replacing Characters
        System.out.println("Exercise 7: replace() Method");
        String original = "I like cats. Cats are cute.";
        String replaced = original.replace("cats", "dogs");
        System.out.println("Original: " + original);
        System.out.println("Replaced: " + replaced);
        System.out.println();
        
        // Exercise 8: trim() - Removing Whitespace
        System.out.println("Exercise 8: trim() Method");
        String padded = "   Lots of spaces   ";
        String trimmed = padded.trim();
        System.out.println("Padded string length: " + padded.length());
        System.out.println("Trimmed string: '" + trimmed + "'");
        System.out.println("Trimmed string length: " + trimmed.length());
        System.out.println();
        
        System.out.println("=== Lab Complete ===");
    }
}