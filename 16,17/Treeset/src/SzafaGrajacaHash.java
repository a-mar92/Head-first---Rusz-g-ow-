import java.io.*;
import java.util.*;

public class SzafaGrajacaHash {
    LinkedList<Piosenka> listaPiosenek = new LinkedList<>();

    public void pobieraniePiosenek() throws IOException {

        try {
            File file = new File("D:\\studia\\java\\zaraczke\\16,17\\ListaPiosenek2.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String wiersz = null;

            while ((wiersz = reader.readLine()) != null) {
                dodajPiosenke(wiersz);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    private void dodajPiosenke(String wiersz) {
        String[] element = wiersz.split("/");
        Piosenka piosenka = new Piosenka(element[0], element[1], element[2], element[3]);
        listaPiosenek.add(piosenka);

    }

    public void dzialanie() throws IOException {
        pobieraniePiosenek();
        System.out.println(listaPiosenek);

        HashSet<Piosenka> zbiorPiosenkek = new HashSet<Piosenka>();
        TreeSet<Piosenka> piosenkiTree = new TreeSet<>();
        piosenkiTree.addAll(listaPiosenek);
        zbiorPiosenkek.addAll(listaPiosenek);
        System.out.println(zbiorPiosenkek);
        System.out.println(piosenkiTree);
    }


}
