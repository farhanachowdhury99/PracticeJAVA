package databaseconection;

public class Movie {

private int id;
private String name;
private String Genre;

public Movie(){

}

    public Movie(int id, String name, String genre) {
        this.id = id;
        this.name = name;
        Genre = genre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }
}
