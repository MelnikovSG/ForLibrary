import java.util.ArrayList;

public class Library {

    private static ArrayList<Book> _arrayBook = new ArrayList<>();

    public void createArray(Book book){
        _arrayBook.add(book);
    }
    public Book[][] createDoubleArray(Book[][] booksArray){
        int bookCount = 10;
        int shelfCount = (_arrayBook.size())/bookCount;
        booksArray = new Book[shelfCount][bookCount];

        int count = 0;
        for(int i = 0; i<= 9; i++){
           for(int j = 0; j <= 9; j++){
               booksArray[i][j] = _arrayBook.get(count);
               count++;
           }
        }
        return booksArray;
    }
}
