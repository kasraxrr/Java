import java.util.ArrayList;

public class BookList {
    private ArrayList<Book>books;
    public BookList(){
        books=new ArrayList<>();
    }
    public int getNumberOfBooks(){
        return books.size();
    }
    public void AddBook(Book book){
        books.add(book);
    }
    public Book getBook(int index){
        return books.get(index);
    }
    public Book getBook(String isbn){
        for (int i=0;i<books.size();i++){
            books.get(i).getIsbn().equals(isbn);
            return books.get(i);
        }return null;
    }
    public void removeBook(int index){
        books.remove(index);
    }
    public int getIndexOfFirstPrintedBook(){
        for (int i=0;i<books.size();i++) {
        if (books.get(i).getBookType().equals("Paperback"))
            return i;
        break;
        }return -1;
    }
    public Book[] getBooksByType(String bookType){
        ArrayList <Book>books2=new ArrayList<>();
        for (int i=0;i<books.size();i++){
           if (books.get(i).getBookType().equals(bookType)){
               books2.add(books.get(i));
            }

        }return books2.toArray(new Book[0]);
    }
    public Book[] getAllEBooks(){
        ArrayList <Book>books3=new ArrayList<>();
        for (int i=0;i<books.size();i++){
            if (books.get(i).getBookType().equals("E-book")){
                books3.add(books.get(i));
            }

        }return books3.toArray(new Book[0]);
    }
    @Override
    public String toString(){
        return " "+books;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj==null||getClass()!=obj.getClass())return false;
        BookList other=(BookList) obj;

        for (int i=0;i<books.size();i++){
            if (books.get(i).equals(other.getBook(i))){
                return true;
            }

        }return false;

    }


}
