public class Cheetah {
    private String name;
    private int age;
    private int speed;
    private int iq;
    private int speedCounter;
    private int iqCounter;

    public Cheetah(String name, int age, int speed, int iq) {
        this.name = name;
        this.age = age;
        this.speed = speed;
        this.iq = iq;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public int getSpeedCounter() {
        return speedCounter;
    }

    public void setSpeedCounter(int speedCounter) {
        this.speedCounter = speedCounter;
    }

    public int getIqCounter() {
        return iqCounter;
    }

    public void setIqCounter(int iqCounter) {
        this.iqCounter = iqCounter;
    }
}
