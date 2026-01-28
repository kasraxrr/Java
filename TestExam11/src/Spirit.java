public class Spirit {
    private Karma karma;
    private Capability capability;
    private boolean incarnated;

    public Spirit(Karma karma,Capability  capability){
        this.karma=karma;
        this.capability=capability;
        this.incarnated=false;
    }

    public boolean  isIncarnated(){
        return isIncarnated();
    }
    public void setIncarnated(boolean isIncarnated){
        this.incarnated=isIncarnated;
    }
    public Capability getCapability(){
        return capability;
    }
    public void setCapabilityForNextIncarnation(Capability capability){
        this.capability=capability;
    }

    public void addKarma(Karma karma) {
        this.karma = karma;
    }

    public Karma getKarma() {
        return karma;
    }

}
