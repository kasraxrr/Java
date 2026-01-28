public class Ebook extends Book{
    private String url;

    public Ebook(String title,String isbn,String url){
        super(title,isbn);
        this.url=url;
    }

    public String getUrl() {
        return url;
    }
    public String getBookType(){
        return "E-book";
    }
    @Override
    public String toString(){
        return super.toString()+url;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj==null||getClass()!=obj.getClass())return false;
        Ebook other=(Ebook) obj;
        return (super.equals(other)&&url.equals(other.url));

    }
}
