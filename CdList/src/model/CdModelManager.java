package model;

public class CdModelManager implements CdModel{
    private CdList cdlist;

    public CdModelManager(){
        this.cdlist=new CdList();
    }
    @Override
    public Cd getCd(int index){
        return cdlist.getCd(index);
    }
    @Override
    public CdList getCdsByTitle(String title){
        return cdlist.getCdsByTitle(title);
    }
    @Override
    public int getNumberOfCds(){
        return cdlist.getNumberOfCds();
    }
    @Override
    public void addCd(Cd cd){
        cdlist.addCd(cd);
    }
    @Override
    public Cd removeFirstCdByTitle(String title){
        return cdlist.removeFirstCdByTitle(title);

    }
    @Override
    public void clear(){
        this.cdlist=new CdList();
    }

}
