public class Library {

    private int lenghtArray = 10;
    private static Book [] _arrayBook = new Book[100];
    private int _count = 0;
    public void createArray(Book book){
        // создает массив книг
        _arrayBook[_count] = book;
        _count++;

    }
    public Book[][] createDoubleArray(Book[][] booksArray){
        // создает двумерный массив книг
        booksArray = new Book[10][10];
        int count = 0;
        for(int i = 0; i<= 9; i++){
           for(int j = 0; j <= 9; j++){
               booksArray[i][j] = _arrayBook[count];
               count++;
           }
        }
        return booksArray;
    }


}
