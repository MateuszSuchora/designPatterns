package Wzorce;
public class PodatekLiniowy implements PodatekStrategia{
    public double Evaluate(double kwota)
    {
        return kwota - (kwota *0.19);
    }
} 
