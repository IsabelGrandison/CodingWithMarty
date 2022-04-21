import java.util.Scanner;
import java.util.StringTokenizer;

public class main {
        public static void main(String[] args) {
                System.out.println("Enter a sentence ");
                int numWords = 4;
                var scanner = new Scanner(System.in);
                var inString  = scanner.nextLine();
                var st = new StringTokenizer(inString);
                System.out.println("Number of Words: " + st.countTokens());

        }}




