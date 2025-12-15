package Day_2;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        System.out.println("Enter the elements in the array");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max=0;
        int secondMax =0;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]>arr[j])
                {
                    secondMax=max;
                    max=arr[j];
                }
                else {
                    max=arr[j];
                }
            }
        }
        System.out.print("Maximum Element is : "+max);
        System.out.println("Second Largest Element is : "+secondMax);
    }
}
