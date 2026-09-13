import java.util.Scanner;

public class Activity2 {
    public void cinemaTicketing(){
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("===CINEMA TICKET SYSTEM===");

        System.out.println("Select Format (1. REGULAR 2. 3D 3. IMAX ): ");
        int format = sc.nextInt();
        System.out.println("Enter Screening Hour (24-hour Format, e.g, 18): ");
        int hour = sc.nextInt();

        double BasePrice;
        String FormatName;

        switch (format){
            case 1:
                FormatName = "REGULAR";
                BasePrice = 350;
                break;
            case 2:
                FormatName = "3D";
                BasePrice = 400;
                break;
            case 3:
                FormatName = "IMAX";
                BasePrice = 450;
                break;
            default:
                System.out.println("Invalid Format!");
                return;
        }
        double Peakhour = 0;
        if (hour >= 17 && hour <= 20){
            Peakhour = 50;
        }
        double TotalCost = BasePrice + Peakhour;

        System.out.println("---TICKET BREAKDOWN---");
        System.out.println("Screening Format: " +FormatName);
        System.out.printf("Base Ticket Price: PHP %.2fn\n",BasePrice);
        System.out.printf("Peak Hour Fee:  PHP %.2fn\n",Peakhour);
        System.out.println("--------------------------------");
        System.out.printf("TOTAL TICKET COST: PHP%.2fn\n",TotalCost);
        System.out.println("STATUS:  SEAT RESERVED");
    }
}
