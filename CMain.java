
public class CMain
{
public static void main (String []p_arg)
{
 final IFahrzeug1 l_auto1 = new CAuto("rot", "beetle", 5, 250, false);
final IFahrzeug1 l_suv1 = new CSuv1 ("rot", "beetle", 5, 250,false);

    l_auto1.schalte(1);
    l_auto1.beschleunige(30);
    l_auto1.bremse(0);
    System.out.println(((CAuto)l_auto1).getGang());
    System.out.println(((CAuto)l_auto1).getGeschwindigkeit());

    l_suv1.schalte(1);
    l_suv1.beschleunige(50);
    l_suv1.bremse(0);
    System.out.println(((CAuto)l_suv1).getGang());
    System.out.println(((CAuto)l_suv1).getGeschwindigkeit());
}
}