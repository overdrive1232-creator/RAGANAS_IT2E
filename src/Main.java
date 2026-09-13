import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1. Initialize the Scanner object
        Scanner sc = new Scanner(System.in);

        System.out.println("-----PORTFOLIO OF ACTIVITY-----");
        System.out.println("NAME: RYLE ROI RAGANAS");
        System.out.println("E2 : IT26");
        System.out.println("-----------CONTENTS------------");
        System.out.println("1. ACTIVITY 1");
        System.out.println("2. ACTIVITY 2");
        System.out.println("-------------------------------");
        System.out.print("ENTER SELECTION: ");

        int select = sc.nextInt();
        System.out.println("--------------------------------");

        if (select == 1) {
            // Fix spelling to match your actual class name (e.g., Activity1)
            Activity1 act1 = new Activity1();
            act1.userGreeting();
        } else if (select == 2) {
            Activity2 act2 = new Activity2();
            // 2. Fixed variable name from 'act' to 'act2'
            act2.cinemaTicketing();
        } else {
            System.out.println("Select Not Found!");
        }

        sc.close();
    }
}