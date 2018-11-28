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

    public String vehicleColor(String color)//methode gibt string zurück und wird erst im Aufruf ausgeführt
    {
        return color;//color wird zurückgegeben
    }


}
