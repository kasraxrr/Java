public class Capability {
    private  String lifePurpose;
    private int maxMemorySize;
    private int emotionalDispositionFactor;
    private int willAmount;

    public Capability(String lifePurpose,int maxMemorySize,int emotionalDispositionFactor,int willAmount) {
        this.lifePurpose = lifePurpose;
        this.maxMemorySize = maxMemorySize;
        this.emotionalDispositionFactor = emotionalDispositionFactor;
        this.willAmount = willAmount;
    }
        public String getLifePurpose(){
            return lifePurpose;
        }
        public int getMaxMemorySize(){
        return maxMemorySize;
        }
        public int getEmotionalDispositionFactor(){
        return emotionalDispositionFactor;
        }
        public int getWillAmount(){
        return willAmount;
        }


    }


