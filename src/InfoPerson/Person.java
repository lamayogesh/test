package InfoPerson;

import java.util.Scanner;

public class Person {
    public void person(){
        Scanner sc=new Scanner(System.in);
        String name;
        int age;
        String address;
        String hobby;
        String goals;
        System.out.println("Enter you name");
        name=sc.nextLine();
        System.out.println("Enter your age");
        age=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter you address");
        address=sc.nextLine();
        System.out.println("What is your hobby?");
        hobby=sc.nextLine();
        System.out.println("Enter your goals");
        goals=sc.nextLine();

    }
}
