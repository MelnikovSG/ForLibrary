import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        ReadFile readFile = new ReadFile();
        Finder finder = new Finder();

        readFile.fileReading();
        System.out.println("Для поиска книги введите название, автора или год выпуска книги: ");
        finder.findBook(sc.nextLine());
    }
}