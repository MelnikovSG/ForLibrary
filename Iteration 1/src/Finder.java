public class Finder {

    Book[][] arrayBook;
    Library library = new Library();

    public void findBook(String nameOrAutor) {
        arrayBook = library.createArray(arrayBook);

        for (int i = 0; i <= arrayBook.length; i++) {
            for (int j = 0; j <= arrayBook[i].length; j++) {
                if (arrayBook[i][j].getName().equals(nameOrAutor) ||
                        arrayBook[i][j].getWriter().equals(nameOrAutor)) {
                    arrayBook[i][j].display();
                    return;
                } else System.out.println("Книга не найдена");
            }
        }
    }
}
