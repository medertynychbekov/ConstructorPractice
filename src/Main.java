public class Main {
    public static void main(String[] args) {

        Dolphin dolphin = new Dolphin("Dolphin", 2, 20, 22);

        Cheetah cheetah = new Cheetah("Cheetah", 2, 80, 17);

        dolphin.setCheetah(cheetah);
        dolphin.comparator();

        dolphin.setValue();

    }
}