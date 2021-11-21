package WzorzecKomenda;

import java.io.File;
import java.io.FileNotFoundException;

public interface Task {
    public void wykonaj(File file) throws FileNotFoundException;
    public boolean czyJuz(int godzina, int minuta);
    
}
