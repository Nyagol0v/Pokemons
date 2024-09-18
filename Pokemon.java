public class Pokemon{
    private String name;
    private String type;
    private int health;
    private int power;

    public Pokemon(String name, String type, int health, int power) {
        this.name = name;
        this.type = type;
        this.health = health;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
