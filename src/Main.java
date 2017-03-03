import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of first list: ");
        int count1 = scanner.nextInt();
        int[] array1 = new int[count1];


        System.out.println("Enter elements of first list: ");
        AddElements(array1, count1);

        System.out.println("Enter size of second list: ");
        int count2 = scanner.nextInt();
        int[] array2 = new int[count1];
        System.out.println("Enter elements of second list: ");
        AddElements(array2, count2);

        //Sorting Arrays
        Arrays.sort(array1);
        Arrays.sort(array2);

        List<Integer> list1 = new ArrayList<Integer>();
        list1 = ListSort(array1);

        List<Integer> list2 = new ArrayList<Integer>();
        list2 = ListSort(array2);

        list1.addAll(list2);
        System.out.println("Sorted list: "+list1);
    }

    //Pushing array to list
    private static List<Integer> ListSort(int[] arr){

        List<Integer> listToSort = new ArrayList<Integer>();
        for (int i=0;i<arr.length;i++){
            listToSort.add(arr[i]);
        }
        return listToSort;
    }

    //Yaking user inputs
    private static int[] AddElements(int[] arr, int size){
        Scanner numScanner = new Scanner(System.in);
        int i=0;
        while (i<size)
        {
            arr[i] = numScanner.nextInt();
            ++i;
        }
        return arr;
    }
}
