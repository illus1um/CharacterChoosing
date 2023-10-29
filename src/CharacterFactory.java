public class CharacterFactory {
    public static Character createCharacter(String characterType) {
        if (characterType.equalsIgnoreCase("Witcher")) {
            return new Witcher();
        } else if (characterType.equalsIgnoreCase("Sorceress")) {
            return new Sorceress();
        } else if (characterType.equalsIgnoreCase("Vampire")) {
            return new Vampire();
        } else {
            throw new IllegalArgumentException("Unknown character");
        }
    }
}
