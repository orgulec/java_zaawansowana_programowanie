package exercises.zadanie18;

public class ComputerApp {
    public static void main(String[] args) {

        Cpu cpu1 = new Cpu("INTEL Pentium", 2.3, 8);
        Computer computer1 = new Computer(cpu1, GPU.NVIDIA_GEFORCE, RAM.DDR2, 4, "EnergyStar");
        computer1.addRam(RAM.DDR2);
        computer1.addRam(RAM.DDR2);

        System.out.println(computer1);

        Cpu cpu2 = new Cpu("INTEL Core 2 Duo",2.66,2);
        Computer laptop1 = new Laptop(cpu2,GPU.ATI_RADEON,RAM.SDRAM,2,"ASUS",5000,15.5,Screen.LED);

        System.out.println(laptop1);

        Cpu cpu3 = new Cpu("AMD Ryzen", 3.2,16);
        Computer workstation = new Computer(cpu3,GPU.NVIDIA_GEFORCE2,RAM.DDR2,8,"Gigabyte Master");
        workstation.addRam(RAM.DDR2);
        workstation.addRam(RAM.DDR2);

        System.out.println(workstation);

    }
}
