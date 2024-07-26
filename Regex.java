import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[]args){
        Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
        //Pattern is a class
        //pattern is a variable of the type Pattern
        //comple() is a method of the Pattern class
        //The regular expression "w3schools"
        //The flag Pattern.CASE_INSENSITIVE to specify case-insensitive matching
        //The result of Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE) is a Pattern object.
        //This object is assigned to the pattern variable.
        Matcher matcher = pattern.matcher("Visit w3schools");
        //matcher() is a method of the Pattern class.
        //It creates a Matcher object that matches the given input against the pattern.
        //String "Visit W3Schools!":This is the input string that you want to match against the compiled pattern
        boolean matchFound = matcher.find();
        if(matchFound){
            System.out.println("Match found");
        }
        else{
            System.out.println("Match not found");
        }
    }
    
}
