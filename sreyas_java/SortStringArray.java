import java.util.Scanner;
public class SortStringArray {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the size of the array: ");
int size = scanner.nextInt();
System.out.println("Enter the string array elements:");
String[] array = new String[size];
        for (int i=0;i<size;i++){
            array[i] = scanner.next();
        }
        bubbleSort(array);
        System.out.println("Sorted array:");
        for (String k : array) {
            System.out.print(k + " ");
        }
    }
    
    public static void bubbleSort(String[] array) {
        int n = array.length;
        for (int i=0;i<n-1;i++) {
            for (intj=0;j<n-i-1;j++) {
                if (array[j].compareTo(array[j+1])>0) {
                    String temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
}}}
}
}

