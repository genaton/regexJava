package regex;

public class AlteraSeparador {

    public static void main(String[] args) {
        
        String string = "c/a/e/l/u/m";
        String string2 = string.replaceAll("/", "\\\\");
        System.out.println(string + '\n' + string2);


    }
    
}
