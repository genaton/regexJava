package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TesteRegex {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("(\\d\\d)(\\w)");
        Matcher matcher = pattern.matcher("11a22b33c");
        
        // alternativa 1 - encontra apenas a primeira parte da regex 11a (match), 11 (grupo 1) e a (grupo 2)
        // boolean encontrou = matcher.find();

        // if(encontrou) {
        //     String match = matcher.group();
        //     String group1 = matcher.group(1);
        //     String group2 = matcher.group(2);
        //     int start = matcher.start();
        //     int end = matcher.end();

        // alternativa 2 - percorre todo input com o laço, trazendo todos os matches e grupos.

        while(matcher.find()) {
            String match = matcher.group();
            String group1 = matcher.group(1);
            String group2 = matcher.group(2);
            int start = matcher.start();
            int end = matcher.end();
       
            System.out.printf("%s | %s | %s  [%d,%d] %n", match, group1, group2, start, end);

            // System.out.println(match +"|"+ group1 +"|"+ group2);
        }
        
    }
    
}
