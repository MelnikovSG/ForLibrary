import java.io.*;

public class ReadFile {


    Library library = new Library();
    public void fileReading() throws IOException {

            BufferedReader reader = new BufferedReader(new FileReader("ListOfBook.txt"));
            String line;
            while ((line = reader.readLine()) != null){
                String[] words = line.split(", ");
                Book book = new Book();
                book.setName(words[0]);
                book.setWriter(words[1]);
                book.setReleaseYear(words[2]);
                library.createArray(book);
            }
            reader.close();
    }
}
