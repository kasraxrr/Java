package model;

import java.util.ArrayList;

public class CdList {
    private ArrayList<Cd> cds;

    public CdList() {
        cds = new ArrayList<>();
    }

    public Cd getCd(int index) {
        return cds.get(index);
    }

    public void addCd(Cd cd) {
        cds.add(cd);
    }

    public CdList getCdsByTitle(String title) {
        CdList cdsPerTitle = new CdList();
        for (int i = 0; i < cds.size(); i++) {
            if (cds.get(i).getTitle().equals(title)) {
                cdsPerTitle.addCd(cds.get(i));
            }
        }
        return cdsPerTitle;
    }

    public int getNumberOfCds() {
        return cds.size();
    }

    public void removeCdByIndex(int index) {
        cds.remove(index);
    }

    public Cd removeFirstCdByTitle(String title) {
        for (int i = 0; i < cds.size(); i++) {
            if (cds.get(i).getTitle().equals(title)) {
                Cd removedCd=cds.get(i);
                cds.remove(cds.get(i));
                return removedCd;
            }


        }return null;
    }
    @Override
    public String toString(){
        return " "+cds;
    }
}
