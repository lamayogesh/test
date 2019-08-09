package Numbers;

import java.util.Scanner;

public class LargestSmallest {
    public void largestsmallest() {
        float num1;
        float num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        num1=sc.nextFloat();
        num2=sc.nextFloat();
        if(num1>num2){
            System.out.println("The largest number is num1 :"+num1);
        }
        else{
            System.out.println("The largest number is num2:"+num2);
        }
    }
}