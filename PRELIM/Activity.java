import java.util.Scanner;


class Activity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Animal[] animals = { new Snake(), new Bee(), new Cow(), new Bird() };

        System.out.println("========== Activity One: What does the animal say? ===========");
        System.out.println("Choose an animal:");
        System.out.println("1. Snake");
        System.out.println("2. Bee");
        System.out.println("3. Cow");
        System.out.println("4. Bird");
        System.out.println("0. Exit");

        int choice;

        do {
            System.out.print("Enter a number 1-4 or 0 to exit: ");
            choice = scanner.nextInt();

            if (choice >= 1 && choice <= 4) {
                animals[choice - 1].makeSound();
            } else if (choice != 0) {
                System.out.println("Pick a number from 0-5 only.");
            }
        } while (choice != 0);
        
        System.out.println("");
        System.out.println("");
        System.out.println("Booting off...................................");
        scanner.close();
    }
}


class Animal {
    String sound;
    String name;
    String number;

    public void makeSound() {
        System.out.println(number +"What a " + name + " sounds like - " + sound);
    }
}

class Snake extends Animal {
    public Snake() {
        sound = "Hss! Hss! Hss!";
        name = "snake";
        number = "1. ";
    }
}

class Bee extends Animal {
    public Bee() {
        sound = "Buzz! Buzz! Buzz!";
        name = "bee";
        number = "2. ";
    }
}

class Cow extends Animal {
    public Cow() {
        sound = "Moo! Moo! Moo!";
        name = "cow";
        number = "3. ";
    }
}

class Bird extends Animal {
    public Bird() {
        sound = "Chirp! Chirp! Chirp!";
        name = "bird";
        number = "4. ";
    }
}
