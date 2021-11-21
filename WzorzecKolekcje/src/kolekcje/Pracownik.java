
package kolekcje;

import java.io.Serializable;

public class Pracownik implements  Comparable<Pracownik> {

    private String imie;
    private String nazwisko;
    

    public Pracownik(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
       
    }
   

    public int compareTo(Pracownik o) {
        int porownaneNazwiska = nazwisko.compareTo(o.nazwisko);
        if (porownaneNazwiska == 0) {
            return imie.compareTo(o.imie);
        } else {
            return porownaneNazwiska;
        }
    }

   
}


