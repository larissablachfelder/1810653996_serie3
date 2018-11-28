package Aufgabe3;

public class Aufruf //hier findet der Aufruf der Instanz Vehicle statt
{
    public static void main(String[] args)
    {
        Vehicle myFirstObject = new Vehicle();//ich erstelle eine neue Instant

        myFirstObject.color = "Blau";//ich gebe dieser den Wert hier
        myFirstObject.doors = 5;
        myFirstObject.ps = 200;

        System.out.println("Die Farbe ist: " + myFirstObject.vehicleColor(myFirstObject.color)); //hier wird die Methode der Farbe ausgeführt und auf der Konsole ausgegeben
        myFirstObject.countDoors(); //hier wird die methode der Türen aufgerufen

        //das attribut ps wird zwar deklariert und ein wert zugewiesen, aber nicht ausgeführt oder ausgegeben
    }
}
