package Wzorce;
public class PodatekUSA implements PodatekStrategia{
    public double Evaluate(double kwota)
    {
        return kwota - (kwota *0.10);
    }
} 
