class CPU {
    double price;

    // Inner class Processor
    class Processor {
        int cores;
        String manufacturer;

        Processor(int cores, String manufacturer) {
            this.cores = cores;
            this.manufacturer = manufacturer;
        }

        void displayProcessorInfo() {
            System.out.println("Processor Cores: " + cores);
            System.out.println("Processor Manufacturer: " + manufacturer);
        }
    }

    // Static nested class RAM
    static class RAM {
        double memory;
        String manufacturer;

        RAM(double memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }

        void displayRAMInfo() {
            System.out.println("RAM Memory: " + memory + " GB");
            System.out.println("RAM Manufacturer: " + manufacturer);
        }
    }
}

public class CpuInheritance {
    public static void main(String[] args) {
        // Create an object of CPU
        CPU myCPU = new CPU();

        // Create an object of inner class Processor
        CPU.Processor myProcessor = myCPU.new Processor(4, "Intel");

        // Create an object of static nested class RAM
        CPU.RAM myRAM = new CPU.RAM(8.0, "Corsair");

        // Display information
        System.out.println("CPU Price: $" + myCPU.price);
        myProcessor.displayProcessorInfo();
        myRAM.displayRAMInfo();
    }
}

