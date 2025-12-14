package Day_1;

import java.util.Scanner;

public class LinearSearchAlgorithm {
     static int linearSearch(int[] arr,int key)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
               return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size of the Array : ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter the elements of the array : ");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the Element Which do You Want to Search : ");
        int key=sc.nextInt();
       int res= linearSearch(arr,key);
       if(res==-1)
       {
           System.out.println("Element Not Found");
       }
       else {
           System.out.println(key+" Found at index "+res);
       }
    }
}
