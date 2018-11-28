package Aufgabe3;

public class Vehicle //hier wird die Instanz vehicle erzeugt
{
    int doors; //variablen deklariert
    int ps;
    String color;

    public void countDoors()//methode gibt nichts zurück; führt nur aus was drinn steht
    {
        System.out.println("Das Fahrzeug besitzt " + doors + " Türen.");
    }

    public String vehicleColor()//methode gibt color zurück, der deklariert wurde und wird erst im Aufruf ausgeführt
    {

        return color;//color wird zurückgegeben
    }


}
