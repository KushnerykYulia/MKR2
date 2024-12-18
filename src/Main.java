public class Main {
    public static void main(String[] args) {
        CharacterFactory warriorFactory = new WarriorFactory();
        CharacterFactory mageFactory = new MageFactory();
        CharacterFactory archerFactory = new ArcherFactory();

        Character warrior = warriorFactory.createCharacter("Воїн", 0, 0);
        Character mage = mageFactory.createCharacter("Маг", 5, 5);
        Character archer = archerFactory.createCharacter("Лучник", 10, 10);

        Arena arena = Arena.getInstance();
        arena.addObserver(new CharacterObserver());

        arena.addCharacter(warrior);
        arena.addCharacter(mage);
        arena.addCharacter(archer);
    }
}