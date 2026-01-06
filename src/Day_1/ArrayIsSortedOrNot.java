package Day_1;

import java.util.Scanner;

public class ArrayIsSortedOrNot {
    static String isSorted(int[] arr){
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j]) return "Array is Not Sorted";
            }
        }
        return "Array is Sorted";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        System.out.println("Enter the elements in the array");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
               System.out.println(isSorted(arr));
    }
}
