package view;
import model.Cd;
import model.CdModel;
public class CdConsoleView {
    private CdModel cdmodel;
    public CdConsoleView(CdModel model){
        this.cdmodel=model;
    }
    public void start(){
       int index=0;
       String title,artist;
        Cd cd;
       boolean running=true;
       while (running){
           System.out.println("get cd by index press 1");
           System.out.println("get cd by title press 2");
           System.out.println("get number of cds press 3");
           System.out.println("add cd 4");
           System.out.println("remove first cd by title 5");
           System.out.println("clear 6");
           System.out.println("exit 0");

       }
    }

}
