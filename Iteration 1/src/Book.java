public class Book {

    private int _ID;
    private String _name;
    private String _writer;
    private int _releaseYear;

    public Book(int ID, String name, String writer, int releaseYear){
        _ID = ID;
        _name = name;
        _writer = writer;
        _releaseYear = releaseYear;
    }

    public void display(){
        System.out.println(_ID);
        System.out.println(_name);
        System.out.println(_writer);
        System.out.println(_releaseYear);
    }

    public int getID() {
        return _ID;
    }

    public void setID(int ID) {
        this._ID = ID;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        this._name = name;
    }

    public String getWriter() {
        return _writer;
    }

    public void setWriter(String writer) {
        this._writer = writer;
    }

    public int getReleaseYear() {
        return _releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this._releaseYear = releaseYear;
    }
}
