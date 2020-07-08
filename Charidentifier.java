import java.util.Scanner;
/**
 * Write a description of class Charidentifier here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Charidentifier
{
    private Scanner input = new Scanner(System.in);
    
   public void run(){
    System.out.print("Enter a character from a-z or A-Z");
    String userInput = input.next();
    
    if(isEntryValid(userInput)){
    System.out.printf("\nCharacter %s is in Uppercase %s", userInput, getUpperLower (userInput.charAt(0)));
    System.out.printf("\nCharacter %s is a %s", userInput, getVowelConsonant(userInput.charAt(0)));
    
    }else{
        System.out.printf("\nInvalid entry: %s", userInput);
    }
}
    public boolean isEntryValid(String chars){
    if (chars.length() > 1)
    return false;
    
    if (!(chars.toLowerCase().charAt(0) >= 'a' && chars.charAt(0) <= 'z'))
    return false;
    
    return true;
    
    }
    
    
    public String getVowelConsonant(char c) {
        if (c == 'a' || c == 'A' ||
            c == 'e' || c == 'E' ||
            c == 'i' || c == 'I' ||
            c == 'o' || c == 'O' ||
            c == 'u' || c == 'U')
            return "Vowel";
            else
            return "Consonant";
    
    }
    public String getUpperLower(char c){
    if ( Character.isUpperCase(c))
    return "Upper Case";
    else
    return "Lower Case";
    }
}

