import java.util.*;

public class StringSorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        char[] charArray = inputString.toCharArray();
        Arrays.sort(charArray);

        String sortedString = new String(charArray);
        System.out.println("Sorted string: " + sortedString);
    }
}


