public class PrintBook extends Book{
    private boolean isPaperback;


    public PrintBook(String title,String isbn,boolean paperback){
        super(title,isbn);
        isPaperback=paperback;
    }
    public String getBookType(){
        if (isPaperback)return "paperback";
        else return "hard cover";
    }

    @Override
    public  String toString(){
        return super.toString()+isPaperback;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj==null||getClass()!=obj.getClass())return false;
        PrintBook other=(PrintBook) obj;
        return (super.equals(other)&&isPaperback==other.isPaperback);

    }










}
