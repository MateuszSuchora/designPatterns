package Wzorce;
public class PodatekProgresywny implements PodatekStrategia{
    public double Evaluate(double kwota)
    {
        if(kwota<=10000){
            return kwota-(kwota *0.18);
        }
        else{
            return kwota-(kwota*0.36);
        }
    }
} 