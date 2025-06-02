import java.util.Arrays;

public class ContiguousAllocation {
    int[] memory; // Representasi memori sebagai array
    int[] processSizes; // Ukuran proses yang ingin dialokasikan

    public ContiguousAllocation(int totalMemorySize) {
        this.memory = new int[totalMemorySize]; // 1 unit = 1 KB
        Arrays.fill(memory, -1); // -1 artinya kosong, 0+ adalah ID proses
    }

    // Method untuk alokasi First Fit
    public void firstFit(int[] processSizes) {
        for (int processID = 0; processID < processSizes.length; processID++) {
            int size = processSizes[processID];
            boolean allocated = false;

            // Cari hole pertama yang cukup besar
            for (int i = 0; i < memory.length; i++) {
                if (memory[i] == -1) {
                    int count = 0;
                    int j = i;
                    while (j < memory.length && memory[j] == -1 && count < size) {
                        count++;
                        j++;
                    }
                    if (count >= size) {
                        // Alokasikan proses
                        for (int k = 0; k < size; k++) {
                            memory[i + k] = processID;
                        }
                        System.out.println("Proses " + processID + " (" + size + "KB) dialokasikan dari alamat " + i);
                        allocated = true;
                        break;
                    }
                }
            }

            if (!allocated) {
                System.out.println("Proses " + processID + " (" + size + "KB) TIDAK BISA dialokasikan.");
            }
        }
    }

    // Menampilkan status memori
    public void printMemoryStatus() {
        System.out.println("\nStatus Memori:");
        for (int i = 0; i < memory.length; i++) {
            System.out.print((memory[i] == -1 ? "[ ]" : "[" + memory[i] + "]"));
        }
        System.out.println();
    }

    // Main method untuk test
    public static void main(String[] args) {
        int totalMemory = 20; // Total memori 20KB
        int[] processes = {5, 7, 3, 6}; // Ukuran proses dalam KB

        ContiguousAllocation allocator = new ContiguousAllocation(totalMemory);
        System.out.println("Alokasi Memori dengan Metode First Fit");
        allocator.firstFit(processes);
        allocator.printMemoryStatus();
    }
}
