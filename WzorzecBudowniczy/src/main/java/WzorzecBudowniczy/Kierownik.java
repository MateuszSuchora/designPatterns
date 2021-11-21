package WzorzecBudowniczy;
public class Kierownik {
    public void wygenerujNapis(Budowniczy budowniczy,int[] tablica){
        budowniczy.budujNaglowek();
        budowniczy.budujTagi();
        budowniczy.budujBody(tablica);
    }
}
