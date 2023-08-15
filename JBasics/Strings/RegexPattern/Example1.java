package Strings.RegexPattern;

import java.util.regex.Pattern;

public class Example1 {
	public static int wordCounter(String inputString, String wordToCount) {

        int count = 0;
        Pattern pattern = Pattern.compile(wordToCount, Pattern.CASE_INSENSITIVE);
        java.util.regex.Matcher match = pattern.matcher(inputString.toUpperCase());
        while (match.find()) {
            count++;
        }
        return count;
	}
    public static void main(String[] args){
        System.out.println(wordCounter("This is a big string containing big words. Can you count all of the big words? You BIG champ you! Big ups!", "big"));
    }
}
