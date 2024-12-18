class MageFactory implements CharacterFactory {
    public Character createCharacter(String name, int x, int y) {
        return new Mage(name, x, y);
    }
}