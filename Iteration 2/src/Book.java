public class Book {

    private String _name;
    private String _writer;
    private String  _releaseYear;

    public Book(){

    }
    public Book(String name, String writer, String  releaseYear){
        _name = name;
        _writer = writer;
        _releaseYear = releaseYear;
    }

    public void display(int shelf, int num){
        System.out.println("Наиминование книги: " + _name);
        System.out.println("Автор: " + _writer);
        System.out.println("Год выпуска: " + _releaseYear);
        System.out.println("Книга находится на полке: " + (shelf + 1));
        System.out.println("Номер: " + (num + 1));
    }


    public String getName() {return _name;}

    public void setName(String name) {_name = name;}

    public String getWriter() {return _writer;}

    public void setWriter(String writer) {_writer = writer;}

    public String getReleaseYear() {return _releaseYear;}

    public void setReleaseYear(String  releaseYear) {_releaseYear = releaseYear;}
}
