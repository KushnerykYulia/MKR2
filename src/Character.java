interface Character {
    String getName();
    int getX();
    int getY();
    int getHealth();
    void attack(Character target);
    void move(int dx, int dy);
}
