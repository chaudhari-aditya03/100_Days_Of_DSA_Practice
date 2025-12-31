package Day_16;
import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args)
    {
        Stack<Integer> st=new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        int originalNumber = num;
        while(num > 0)
        {
            st.push(num%2);
            num = num/2;
        }
        System.out.print("Binary Equivalance of "+originalNumber+" is :");
        while(!st.isEmpty())
        {
            System.out.print(st.pop());
        }
    }
}
