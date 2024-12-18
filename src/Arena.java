import java.util.*;
class Arena {
    private static Arena instance = new Arena();
    private List<Character> characters = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    private Arena() {}

    public static Arena getInstance() {
        return instance;
    }

    public void addCharacter(Character character) {
        characters.add(character);
        System.out.println(character.getName() + " приєднався до арени!");
        notifyObservers(character);
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    private void notifyObservers(Character character) {
        for (Observer observer : observers) {
            observer.update(character);
        }
    }
}
