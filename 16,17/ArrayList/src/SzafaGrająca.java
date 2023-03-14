import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SzafaGrająca {
    ArrayList<Piosenka> listaPiosenek = new ArrayList<>();
    public void pobieraniePiosenek() throws IOException {

        try {
            File file = new File("D:\\studia\\java\\zaraczke\\16,17\\ListaPiosenek.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String wiersz = null;

            while ((wiersz = reader.readLine()) != null) {
                dodajPiosenke(wiersz);
            }
        } catch (Exception e){
         e.printStackTrace();}


    }
    private void dodajPiosenke(String wiersz) {
        String [] element = wiersz.split("/");
        Piosenka piosenka = new Piosenka(element[0],element[1],element[2],element[3]);
        listaPiosenek.add(piosenka);

    }

    public void dzialanie() throws IOException {
        pobieraniePiosenek();

        System.out.println(listaPiosenek);

        System.out.println(listaPiosenek);
        ArtystaCompare artystaCompare = new ArtystaCompare();
        Collections.sort(listaPiosenek,artystaCompare);
        System.out.println("sortowanie po artystach " + listaPiosenek);

    }




}
