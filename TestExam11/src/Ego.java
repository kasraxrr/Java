import java.util.ArrayList;

public class Ego {
    private int egoStrength;
    private ArrayList<String>mantras;
    private int numberOfMantras;
    public Ego(){
        this.mantras=new ArrayList<String>();
    }
    public void addMantra(String mantra){
        mantras.add(mantra);
        numberOfMantras++;
    }
    public int getNumberOfMantras(){
        return numberOfMantras;
    }

    public int getEgoStrength() {
        return egoStrength;
    }

    public String getMantra(int index) {
        return mantras.get(index);
    }
    public String censor(String memoryItem){
        for (int i = 0; i < numberOfMantras; i++) {
            if (mantras.get(i).equals(memoryItem)){
                return mantras.get(i);
            }
        }return null;
    }
}
