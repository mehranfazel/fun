import java.util.List;

public class Encryption {
    public static void main(String[] args) {
        System.out.println(stringCoder("Hello"));
    }

    /*
shows the poision of letter in alphabet
     */
    private static int positionOfChar(Character ch) {
        return (int) ch;
    }

    /*
 pushes each letter for 13 letters
       */
    private static String stringCoder(String input) {
        String output = "";
        char tempLetter = ' ';
        for (int i = 0; i < input.length(); i++) {
            if (positionOfChar(input.charAt(i)) <= 109) {
                tempLetter = (char) ((char) positionOfChar(input.charAt(i)) + 13);
                output += tempLetter;
            } else if (positionOfChar(input.charAt(i)) > 109) {
                tempLetter = (char) ((char) 96 + positionOfChar(input.charAt(i)) - 109);
                output += tempLetter;
            }
        }

        return output;
    }
}
