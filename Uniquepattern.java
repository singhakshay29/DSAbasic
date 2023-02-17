package ContestQuestions;
//0 4 8 12 16 20
//6 10 14 18 22 26
//12 16 20 24 28 32
//18 22 26 30 34 38
//24 28 32 36 40 44
//30 34 38 42 46 50 given height n=6

import java.util.Scanner;
public class Uniquepattern {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int a=i*4;
            for(int j=0;j<n;j++)
            {
                int b=j*6;
                System.out.print(a+b+" ");
            }System.out.println();
        }
    }
}
