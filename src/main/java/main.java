import java.util.Scanner;
import java.util.StringTokenizer;

public class main {
        public static void main(String[] args) {
                int numOfThes = 0;
                System.out.print("Enter a sentence: ");
                var scanner = new Scanner(System.in);
                var inString = scanner.nextLine();
                var string = new StringTokenizer(inString);
                while (string.hasMoreTokens()) {
                        if (string.nextToken().equalsIgnoreCase("the")) {
                                numOfThes++;
                        }
                }
                System.out.println("Number of Thes: " + numOfThes);
        }}



