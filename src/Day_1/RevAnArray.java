package Day_1;

import java.util.Arrays;
import java.util.Scanner;

public class RevAnArray {
    static void revArray(int[] arr){
        for(int i=0;i<arr.length/2;i++)
        {
            int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args)
        {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of the array");
            int n=sc.nextInt();
            System.out.println("Enter the elements in the array");
            int[] arr = new int[n];
            for(int i=0;i<n;i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("Original Array");
            System.out.println(Arrays.toString(arr));
            System.out.println("Reversed Array");
            revArray(arr);
        }


}
