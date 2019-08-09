package PrimeOrNot;

import java.util.Scanner;

public class Prime {
    public void prime() {
        int m = 0;
        int flag = 0;
        int num;
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        m = num / 2;
        if (num == 0 || num == 1) {
            System.out.println("The number is not prime");
        } else {
            for (int i = 2; i <= m; i++) {
                if (num % i == 0) {
                    System.out.println(num + " is not prine");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(num + " is a prime number");
            }
        }
    }
}