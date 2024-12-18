class Archer implements Character {
    private String name;
    private int health = 120, attackPower = 30, x, y;

    public Archer(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public void attack(Character target) {
        System.out.println(name + " атакує стрілою " + target.getName());
    }

    @Override
    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }
}