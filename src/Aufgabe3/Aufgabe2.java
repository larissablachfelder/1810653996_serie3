package Aufgabe3;

import javax.swing.*;

public class Aufgabe2
{
    public static void main(String[] args)
    {
        for(int i = 0; i<3; i+=2)//wird jedes mal um 2 erhöht
        {
            printName();

        }
        //der Name wird nur 2 mal ausgegeben und zwar bei durchlauf 0 und 2 da der nächste durchlauf 4 wäre und dieser aber größer als 4 ist


        //aufgabe3
        for(int j = 0; j<5; j++)
        {
            printName();//NAme wird ausgegeben
            printAge(19 + j);//Alter wird ausgegeben und bei jedem durchlauf um 1 erhöht

        }


    }



    public static void printName()//methode zum ausführen des Namens es wird nichts zurückgegeben
    {
        System.out.println("Larissa Blachfelder");
    }


    //aufgabe3

    public static int printAge(int age)//es wird ein int zurückgegeben
    {

        System.out.println("Alter: " + age);
        return age; //hier wird das ALter als int zurückgegeben
    }
}
