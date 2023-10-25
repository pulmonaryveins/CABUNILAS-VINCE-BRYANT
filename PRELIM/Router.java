import java.util.Scanner;

public class Router {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Router ===");
        System.out.println("");
        System.out.println("Default Routes:");
        System.out.println("Cebu City (Start)");
        System.out.println("Minglanilla (Route 1)");
        System.out.println("San Fernando (Route 2)");
        System.out.println("Carcar (Route 3)");
        System.out.println("Barili (Route 4.1)");
        System.out.println("Dumanjug (Route 4.1.1)");
        System.out.println("Alcantara (Route 4.1.2)");
        System.out.println("Sibonga (Route 4.2)");
        System.out.println("Dumanjug (Route 4.2.1)");
        System.out.println("Alcantara (Route 4.2.2)");
        System.out.println("Argao (Route 5)");
        System.out.println("Ronda (Route 5.1)");
        System.out.println("Alcantara (Route 5.2)");
        System.out.println("Moalboal (End)");
        System.out.println("");
        
        System.out.print("Is Barili obstructed? (1 = Yes, 0 = No): ");
        int BariliObstructed = scanner.nextInt();

        if (BariliObstructed == 1) {
            System.out.print("Is Sibonga obstructed? (1 = Yes, 0 = No): ");
            int SibongaObstructed = scanner.nextInt();
            
            if (SibongaObstructed == 1) {
            
                
                System.out.println("");
                System.out.println("Recommended Route:");
                System.out.println("Cebu City (Start)");
                System.out.println("Minglanilla (Route 1)");
                System.out.println("San Fernando (Route 2)");
                System.out.println("Carcar (Route 3)");
                System.out.println("Sibonga (Route 4.2)");
                System.out.println("Argao (Route 5)");
                System.out.println("Ronda (Route 5.1)");
                System.out.println("Alcantara (Route 5.2)");
                System.out.println("Moalboal (End)");
                
            } else {
            
                System.out.println("Recommended Route:");
                System.out.println("Cebu City (Start)");
                System.out.println("Minglanilla (Route 1)");
                System.out.println("San Fernando (Route 2)");
                System.out.println("Carcar (Route 3)");
                System.out.println("Sibonga (Route 4.2)");
                System.out.println("Dumanjug (Route 4.2.1)");
                System.out.println("Alcantara (Route 4.2.2)");
                System.out.println("Moalboal (End)");
            }
            
        } else {
        
            System.out.println("Recommended Route:");
            System.out.println("Cebu City (Start)");
            System.out.println("Minglanilla (Route 1)");
            System.out.println("San Fernando (Route 2)");
            System.out.println("Carcar (Route 3)");
            System.out.println("Barili (Route 4.1)");
            System.out.println("Dumanjug (Route 4.1.1)");
            System.out.println("Alcantara (Route 4.1.2)");
            System.out.println("Moalboal (End)");
        }
    }
}