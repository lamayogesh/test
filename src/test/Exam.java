package test;

public class Exam {
    public static void main(String[] args) {

        String name = "HELLO";
        String name1 = "hello";
        String name3 = "hi";

        boolean name4=name.equalsIgnoreCase(name1);
        boolean name5=name.equalsIgnoreCase(name3);
        System.out.println("StringequalsIgnoreCase "+name4);
        System.out.println("StringequalsIgnoreCase "+name5);

    }
}
