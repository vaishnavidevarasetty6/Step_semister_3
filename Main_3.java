<<<<<<< HEAD
import java.util.Scanner;

public class Main_3{

    static void parseInventoryRecord(String csvLine) {
        String[] fields = csvLine.split(",");

        if (fields.length != 3) {
            System.out.println("Invalid Record");
        } else {
            System.out.println("Product: " + fields[0]
                    + " | SKU: " + fields[1]
                    + " | Qty: " + fields[2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String csvLine = sc.nextLine();

        parseInventoryRecord(csvLine);
=======
class Main_3 {
    static void findLongestStreak(String signalLog) {
        int current = 1;
        int longest = 1;
        char color = signalLog.charAt(0);

        for (int i = 1; i < signalLog.length(); i++) {
            if (signalLog.charAt(i) == signalLog.charAt(i - 1)) {
                current++;
            } else {
                current = 1;
            }

            if (current > longest) {
                longest = current;
                color = signalLog.charAt(i);
            }
        }

        System.out.println("Longest Streak: '" + color +
                "' repeated " + longest + " times");
    }

    public static void main(String[] args) {
        findLongestStreak("RRGGGYRR");
>>>>>>> 661311d2691674cde9eca06f9c05378742dda76e
    }
}