import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myArray = getIntegers(8);
        printArray(myArray);
        int[] sorted = sortIntegers(myArray);
        printArray(sorted);
    }

    public static int[] getIntegers(int number) {
        int[] array = new int[number];
        for (int i=0;i<array.length;i++) {
            array[i] = scan.nextInt();
        }
        return array;
    }
    public static void printArray(int[] array) {
        for (int i=0;i<array.length;i++) {
            System.out.println("Position: "+i+" value: "+array[i]);
        }
    }
    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = new int[array.length];
        for (int i=0;i<sortedArray.length;i++) {
            sortedArray[i] = array[i];
        }
        boolean flag = true;
        int temp;
        while(flag) {
            flag = false;
            for(int i=0;i<sortedArray.length-1;i++) {
                if (sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
