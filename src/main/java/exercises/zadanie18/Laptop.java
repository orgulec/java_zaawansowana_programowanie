package exercises.zadanie18;

public class Laptop extends Computer {
    private final int battery;
    private final double screenSize;
    private final Screen screen;

    public Laptop(Cpu cpu, GPU gpu, RAM ram, int ramSlots, String mainboard, int battery, double screenSize, Screen screen) {
        super(cpu, gpu, ram, ramSlots, mainboard);
        this.battery = battery;
        this.screenSize = screenSize;
        this.screen = screen;
    }

    @Override
    public String toString() {
        return "Laptop " + super.toString() +
                ", Battery: " + battery + "mah" +
                ", Screen " + screenSize + "'' " +
                screen.name();
    }

}
