public class Piosenka implements Comparable<Piosenka>  {
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

    public boolean equals (Object piosenka){
        Piosenka p = (Piosenka) piosenka;
        return getTytuł().equals(p.getTytuł());

    }
    public int hashCode() {
        return tytuł.hashCode();}
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


    @Override
    public int compareTo(Piosenka o) {
        return tytuł.compareTo(o.getTytuł());
    }
}
