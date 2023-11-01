package exercises.zadanie18;

public enum GPU {
    ATI_RADEON(16, "AGP"),
    NVIDIA_GEFORCE(16, "AGP"),
    NVIDIA_GEFORCE2(32, "PCI E"),
    INTEGRATED(4, "PCI");
    private final double memory;
    private final String type;

    GPU(double memory, String type) {
        this.memory = memory;
        this.type = type;
    }

    @Override
    public String toString() {
        return this.name() + " " +
                memory + "GB " + type;
    }
}
