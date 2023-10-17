import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman Number: ");
        String roman = scanner.nextLine().toUpperCase();

        int decimalNumber = change(roman);
        System.out.println("Decimal Number: " + decimalNumber);
    }
    
    public static int change(String s) {
        Map<Character, Integer> l = new HashMap<>();
        l.put('I', 1);
        l.put('V', 5);
        l.put('X', 10);
        l.put('L', 50);
        l.put('C', 100);
        l.put('D', 500);
        l.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currValue = l.get(s.charAt(i));
            if (currValue < prevValue) {
                result -= currValue;
            } else {
                result += currValue;
            }
            prevValue = currValue;
        }
        return result;
    }
}
