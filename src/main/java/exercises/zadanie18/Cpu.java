package exercises.zadanie18;

import java.util.Objects;

public class Cpu {
    private String producer;
    private double speed;
    private int cores;

    public Cpu(String producer, double speed, int cores) {
        this.producer = producer;
        this.speed = speed;
        this.cores = cores;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    @Override
    public String toString() {
        return "Cpu: " + producer + " " + speed + "GHz" +
                " (x" + cores + " Cores)";
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Cpu cpu)) return false;
        return Double.compare(speed, cpu.speed) == 0 && cores == cpu.cores && Objects.equals(producer, cpu.producer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(producer, speed, cores);
    }
}
