public class PrintedBook extends Book{
    private boolean isPaperback;


    public PrintedBook(String title,String isbn,boolean paperback){
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
        PrintedBook other=(PrintedBook) obj;
        return (super.equals(other)&&isPaperback==other.isPaperback);

    }










}
