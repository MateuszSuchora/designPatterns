package WzorzecBudowniczy;
public class BudowniczyWav extends Budowniczy{
    @Override
    public void budujNaglowek(){
        System.out.println("WavHeader");
    }
    @Override
    public void budujTagi(){
        System.out.println(" ");
    }
    @Override
    public void budujBody(int[] tablica){
        String s="";
        for(int i=0;i<10;i++){
            s=s+tablica[i]+",";
        }
        System.out.println(s);
    }
}
