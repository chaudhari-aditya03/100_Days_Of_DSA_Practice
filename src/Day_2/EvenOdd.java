package Day_2;

import java.util.Scanner;

//Count the even and Odd Numbers Between specific range
public class EvenOdd {
    public static void main(String[] args)
    {
        System.out.println("Enter the n th Value");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int even =0;
        int odd = 0;
        for(int i=1;i<=n;i++)
            {
                if(i%2==0)
                {
                    even++;
                }
                else {
                    odd++;
                }
            }
        System.out.println("Eben Numbers Present Between 1 and "+n+" is "+even);
        System.out.println("Odd Numbers Present Between 1 and "+n+" is "+odd);

    }
}
