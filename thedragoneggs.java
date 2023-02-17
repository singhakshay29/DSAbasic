package ContestQuestions;
//Daemon has 2 dragon eggs, one is made of A grams of Gold and the other is made of B grams of Silver.
//We know that Gold costs G coins per gram and Silver costs S coins per gram.
// You need to determine which of the two dragon eggs are more valuable.
//The input contains 4 space-separated integers G, S, A, B.
//Print "Gold" (without quotes) if the Gold egg costs equal to or more than the silver egg.
// Otherwise, print "Silver" (without quotes).Note that the output is case-sensitive.

import java.util.Scanner;
public class thedragoneggs {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int goldcoinpercostG=sc.nextInt();
        int silvercoinpercostS=sc.nextInt();
        int gramofgoldA=sc.nextInt();
        int gramofSilverB=sc.nextInt();
        int goldcost=goldcoinpercostG*gramofgoldA;
        int silvercost=silvercoinpercostS*gramofSilverB;
        if(goldcost>=silvercost)
        {
            System.out.println("Gold");
        }else {
            System.out.println("Silver");
        }
    }
}
