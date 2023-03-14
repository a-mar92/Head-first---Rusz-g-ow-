public class Piosenka  {
    String tytuł;
    String autor;
    String ocena;
    String bmp;

    public Piosenka(String tytuł, String autor, String ocena, String bmp) {
        this.tytuł = tytuł;
        this.autor = autor;
        this.ocena = ocena;
        this.bmp = bmp;
    }

    @Override
    public String toString() {
        return tytuł;
    }

    public String getTytuł() {
        return tytuł;
    }

    public String getAutor() {
        return autor;
    }

    public String getOcena() {
        return ocena;
    }

    public String getBmp() {
        return bmp;
    }




}
