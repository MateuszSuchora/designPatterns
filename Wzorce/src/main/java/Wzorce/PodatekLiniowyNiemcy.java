package Wzorce;
public class PodatekLiniowyNiemcy implements PodatekStrategia{
    public double Evaluate(double kwota)
    {
        return kwota-(kwota *0.20);
    }
} 
