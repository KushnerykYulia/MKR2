class CharacterObserver implements Observer {
    @Override
    public void update(Character character) {
        System.out.println("Новий персонаж " + character.getName() + " з'явився на арені!");
    }
}