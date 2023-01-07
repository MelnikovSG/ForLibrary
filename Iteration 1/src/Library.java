import java.util.List;
import java.util.Arrays;
public class Library {

    Book book1 = new Book(1, "Война и мир", "Лев Толстой", 1869);
    Book book2 = new Book(2, "1984", "Джордж Оруэлл", 1949);
    Book book3 = new Book(3, "Улисс", "Джеймс Джойс", 1922);



    public Book[][] createArray(Book[][] arrayBook){
        // создает массив книг
        arrayBook = new Book[][]{
                {book1, book2},
                {book3}
        };
        return arrayBook;
    }

    public Book[][] addArray(Book[][] arrayBook){
        // добавляет в массив новый элемент
        return arrayBook;
    }

}
