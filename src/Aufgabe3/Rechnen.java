package Aufgabe3;

public class Rechnen
{
    public static void main(String[] args)
    {

        System.out.println(add( 5, 10)); //hier wird meine INT methode aufgerufen und die variablen deklariert; es wird ein int erkannt
        System.out.println(add(6.0, 20.0)); //double wird sofort erkannt

    }

    public static int add(int a, int b)//das iost meine int methode mit 2 parametern und gibt das ergebnis zurück
    {

        int sum = a + b;
        return sum;
    }

    public static double add(double a, double b)//das gleiche passiert hier mit double
    {

        double sum2 = a + b;
        return sum2;
    }
}
