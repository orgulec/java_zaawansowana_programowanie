package exercises.zadanie18;

import lombok.Getter;
import lombok.Setter;

import java.util.LinkedList;
import java.util.List;

@Getter
@Setter
public class Computer {
    private Cpu cpu;
    private GPU gpu;
    private RAM ram;
    private int ramSlots;
    private String mainboard;
    private List<RAM> ramMemory = new LinkedList<>();

    public Computer(Cpu cpu, GPU gpu, RAM ram, int ramSlots, String mainboard) {
        this.cpu = cpu;
        this.gpu = gpu;
        this.ram = ram;
        this.ramSlots = ramSlots;
        this.mainboard = mainboard;
        addRam(ram);
    }

    @Override
    public String toString() {
        return "Computer: " + mainboard +
                ", " + cpu.toString() +
                ", RAM: " + getRamSize() + "GB " + ram +
                ", Ram Slots: " + ramMemory.size() + "/" + ramSlots +
                ", GFX: " + gpu.toString();
    }

    private int getRamSize() {
/*        AtomicInteger fullSize = new AtomicInteger();
        ramMemory.forEach((k) -> {
            fullSize.addAndGet(k.size);
        });
        return (int) fullSize.intValue();*/
        return ramMemory.stream()
                .mapToInt(entry -> entry.size).sum();
    }

    public boolean addRam(RAM ram) {
        if (ramMemory.size() < ramSlots) {
            return ramMemory.add(ram);
        } else {
            System.out.println("Not enough Ram Slots.");
            return false;
        }
    }
}
