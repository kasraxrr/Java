public class Intellect {
    private String lifePurpose;
    private String[] memory;
    private int memorySize;

    public Intellect(String lifePurpose, int maxMemorySize) {
        this.lifePurpose = lifePurpose;
        this.memory = new String[maxMemorySize];
    }

    public void addToMemory(String memoryItem) {
        for (int i = 0; i < memorySize; i++) {
            if (memory[i] == null) {
                memory[i] = memoryItem;
                break;
            }
        }
    }

    public String recallLatestMemoryItem() {
        return memory[memorySize - 1];
    }

    public String recallOlderMemoryItem(int index) {
        for (int i = index; i < memorySize; i++) {
            return memory[i];
        }
        return null;
    }

    public boolean isInMemory(String item) {
        for (int i = 0; i < memorySize; i++) {
            if (memory[i] == null) {
                memory[i] = item;
                return true;
            }
        }
        return false;
    }
}
