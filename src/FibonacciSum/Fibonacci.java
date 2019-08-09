package FibonacciSum;


import java.util.Scanner;

public class Fibonacci {

    public void fibonaci(){
        int num1;
        int num2=0;
        int num3=1;
        System.out.println("Enter nth term for fibobnacci");
        Scanner sc= new Scanner(System.in);
        num1=sc.nextInt();
        int sum;
        for(int i=1;i<=num1;i++){
            if(i<=1){
                sum=i;
            }else{
                sum = num2+num3;
                num2 = num3;
                num3 = sum;
            }
            System.out.println(sum);
        }
    }
}
