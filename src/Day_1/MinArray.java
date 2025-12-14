package Day_1;

import java.util.Scanner;

public class MinArray {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int n=sc.nextInt();
        System.out.println("Enter the elements in the array");
    int[] arr = new int[n];
        for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    int min=0;
        for(int i=0;i<n;i++){
        for(int j=i+1;j<n-1;j++)
        {if(arr[i]<arr[j])
        {
            min=arr[i];
        } else
        {
            min = arr[j];
        }
        }
    }
        System.out.println("Minimum Element is : "+min+"");
        sc.close();
}
}
