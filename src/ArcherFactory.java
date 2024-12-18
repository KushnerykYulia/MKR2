class ArcherFactory implements CharacterFactory {
    public Character createCharacter(String name, int x, int y) {
        return new Archer(name, x, y);
    }
}