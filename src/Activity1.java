import java.util.Scanner;

public class Activity1 {
    public void userGreeting() {
        System.out.println("Hello from Activity 1!");
        Scanner sc = new  Scanner(System.in);

        String name, gender;
        int byear;

        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter Birth Year: ");
        byear = sc.nextInt();
        System.out.print("Enter gender: ");
        gender = sc.next();

        System.out.println("Hello, "+name+"! your age is "+(2026-byear));
        System.out.println("You were born in "+byear+" and your gender is  "+gender);
    }


}
