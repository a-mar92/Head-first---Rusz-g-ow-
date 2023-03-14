import java.util.Comparator;

public class ArtystaCompare implements Comparator<Piosenka>  {

    @Override
    public int compare(Piosenka p1,Piosenka p2 ) {
        return  p1.getAutor().compareTo(p2.getAutor());
    }
}
