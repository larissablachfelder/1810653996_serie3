package Aufgabe3;

public class Aufgabe2
{
    public static void main(String[] args)
    {
        for(int i = 0; i<3; i+=2)//wird jedes mal um 2 erhöht
        {
            printName();
        }

        //der Name wird nur 2 mal ausgegeben und zwar bei durchlauf 0 und 2 da der nächste durchlauf 4 wäre und dieser aber größer als 4 ist
    }

    public static void printName()//methode zum ausführen des Namens
    {
        System.out.println("Larissa Blachfelder");
    }
}
