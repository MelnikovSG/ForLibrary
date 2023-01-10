public class Finder {

    Book[][] arrayBook;
    Library library = new Library();
    Boolean flag = true;

    public void findBook(String sings) {
        arrayBook = library.createDoubleArray(arrayBook);

        for (int i = 0; i < arrayBook.length; i++) {
            for (int j = 0; j < arrayBook[i].length; j++) {
                if (arrayBook[i][j].getName().equals(sings) ||
                        arrayBook[i][j].getWriter().equals(sings) ||
                            arrayBook[i][j].getReleaseYear().equals(sings)) {
                    arrayBook[i][j].display(i, j);
                    return;
                } else flag = false;
            }
        }
        if(!flag) System.out.println("Книга не найдена");
    }
}
