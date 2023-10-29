import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Choose a character from The Witcher 3:");
        System.out.println("1. Witcher");
        System.out.println("2. Sorceress");
        System.out.println("3. Vampire");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of your chosen character: ");
        int choice = scanner.nextInt();

        Character chosenCharacter = null;

        switch (choice) {
            case 1 -> chosenCharacter = CharacterFactory.createCharacter("Witcher");
            case 2 -> chosenCharacter = CharacterFactory.createCharacter("Sorceress");
            case 3 -> chosenCharacter = CharacterFactory.createCharacter("Vampire");
            default -> {
                System.out.println("Invalid choice. Exiting.");
                System.exit(0);
            }
        }

        chosenCharacter.select();
    }
}