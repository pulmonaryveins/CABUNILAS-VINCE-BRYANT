import java.util.Scanner;

public class ActivityThreeCabunilas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double phpToDollarConversionRate = 56.00;
       
        double c1P = 100.00;
        double c2P = 150.00;
        double c3P = 200.00;
        double r1P = 35.00;
        double r2P = 50.00;

        
        System.out.println("");
        System.out.println("=== Menu ===");
        System.out.println("");
        System.out.println("C1 = Php " + c1P);
        System.out.println("C2 = Php " + c2P);
        System.out.println("C3 = Php " + c3P);
        System.out.println("");
        System.out.println("=== Add-ons ===");
        System.out.println("");
        System.out.println("R1 = Php " + r1P);
        System.out.println("R2 = Php " + r2P);
        System.out.println("");

        
        System.out.print("Enter order code (CAPITAL | C1, C2, C3, R1, R2): ");
        String order = scanner.nextLine();
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

       
        double totalP = 0.0;
        switch (order) {
            case "C1":
                totalP = c1P * quantity;
                break;
            case "C2":
                totalP = c2P * quantity;
                break;
            case "C3":
                totalP = c3P * quantity;
                break;
            case "R1":
                totalP = r1P * quantity;
                break;
            case "R2":
                totalP = r2P * quantity;
                break;
            default:
                System.out.println("Invalid order code.");
                return;
                
        }
           
        double totalPriceInDollars = totalP / phpToDollarConversionRate;

        System.out.println("Total Price (PHP): Php " + totalP);
        System.out.println("Total Price (USD): $" + totalPriceInDollars);
        System.out.println("Quantity: " + quantity);
        System.out.println("Order Code: " + order);    
    }
}