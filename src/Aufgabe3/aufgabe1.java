package Aufgabe3;

import javax.swing.*;

public class aufgabe1
{

    public static void main(String[] args)
    {
        String eingabe = JOptionPane.showInputDialog("Bitte gib 20 oder Peter Pan ein."); //etwas vom nutzer einlesen

        switch(eingabe) //um einzelne fälle zu definieren
        {
            case "20": //wenn dieser fall eintritt mach das folgende
                int eingabe1 = Integer.parseInt(eingabe);
                JOptionPane.showMessageDialog(null, eingabe1*19);
                break; //immer break nach einem case, um den switch zu beenden, ansonsten werden alle cases ausgeführt

            case "Peter Pan":
                JOptionPane.showMessageDialog(null, "Bangarang");
                break;

            default://bei allen anderen eingaben soll das passieren
                System.err.println("Falsche Eingabe."); //gibt fehlermeldung in der konsole aus
        }


        //Aufgabe 4
        Person larissa = new Person(); //hier erstelle ich eine neue Instanz Person eine bestimmte Person bzw. setze werte für eine neue Person
        larissa.name = "Larissa"; //ich gehe mit . in meine Instanz Person und gebe den Variablen in deser Klasse meine werte
        larissa.alter = 19;
        larissa.printPerson();//hier führe ich die Klasse person aus; mit den neu gesetzten werten







    }


}
