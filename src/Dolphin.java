public class Dolphin {
    private String name;
    private int age;
    private int speed;
    private int iq;
    private int speedCounter;
    private int iqCounter;

    private Cheetah cheetah;

    public Dolphin(String name, int age, int speed, int iq) {
        this.name = name;
        this.age = age;
        this.speed = speed;
        this.iq = iq;
    }

    public void comparator() {
        if (speed > cheetah.getSpeed()) {
            speedCounter = speedCounter + 1;
        } else {
            cheetah.setSpeedCounter(cheetah.getSpeedCounter() + 1);
        }

        if (iq > cheetah.getIq()){
            iqCounter += 1;
        }else {
            cheetah.setIqCounter(cheetah.getIqCounter() + 1);
        }
    }

    public void setValue(){
        if (speedCounter > cheetah.getSpeedCounter()){
            System.out.println("дельфин гепарддан ылдам!");
        }else {
            System.out.println("Гепард дельфинден ылдам");
        }

        if (iqCounter > cheetah.getIqCounter()){
            System.out.println("Дельфин гепарддан акылдуураак");
        }else {
            System.out.println("Гепард дельфинден акылдуураак");
        }
    }

    public Cheetah getCheetah() {
        return cheetah;
    }

    public void setCheetah(Cheetah cheetah) {
        this.cheetah = cheetah;
    }
}
