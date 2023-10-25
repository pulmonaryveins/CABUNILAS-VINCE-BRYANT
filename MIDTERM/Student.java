import java.util.Scanner;

public class Student {
    public String firstName;
    public String middleName;
    public String lastName;
    public String suffix;

   
    public Student() {
        this.firstName = "";
        this.middleName = "";
        this.lastName = "";
        this.suffix = "";
    }

   
    public String getFullName() {
        StringBuilder fullName = new StringBuilder();
        if (!firstName.isEmpty()) {
            fullName.append("First Name: ").append(firstName).append("\n");
        }
        if (!middleName.isEmpty()) {
            fullName.append("Middle Name: ").append(middleName).append("\n");
        }
        if (!lastName.isEmpty()) {
            fullName.append("Last Name: ").append(lastName).append("\n");
        }
        if (!suffix.isEmpty()) {
            fullName.append("Suffix: ").append(suffix).append("\n");
        }
        return fullName.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();

        System.out.print("First Name: ");
        student.firstName = scanner.nextLine();

        System.out.print("Middle Name: ");
        student.middleName = scanner.nextLine();

        System.out.print("Last Name: ");
        student.lastName = scanner.nextLine();

        System.out.print("Suffix: ");
        student.suffix = scanner.nextLine();

        System.out.println("\nOutput Display:\n" + student.getFullName());
        System.out.println("");

        scanner.close();
    }
}