package Day_16;

import java.util.Scanner;

public class DecimalToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int og = num;
        int []rem = new int[32];
        int i =0;
        while(num>0){
            rem[i]=num%8;
            num=num/8;
            i++;
        }
        System.out.print("Octal Equivalence of "+og+" is ");
        for(int j=i-1;j>=0;j--)
        {
            System.out.print(rem[j]);
        }
        sc.close();
    }
}
