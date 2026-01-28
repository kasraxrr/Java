public class Karma{
    private int karmaCounter;

    public Karma(int initialKarmaCounter){
        this.karmaCounter=initialKarmaCounter;

    }
    public int getKarmaCounter(){
        return karmaCounter;
    }
    public void incrementKarmaCounter(int amount){
        this.karmaCounter+=amount;
    }

}
