package Aufgabe_1;

import javax.swing.*;

public class Main {

    public static void main(String[] args)
    {
        //aufgabe 1
        String eins = JOptionPane.showInputDialog("Bitte Wort eingeben!");
        String zwei = JOptionPane.showInputDialog("Bitte zweites Wort eingeben!");
        String drei = JOptionPane.showInputDialog("Bitte drittes Wort eingeben!");

        if (eins.substring(0,3).equals(zwei.substring(0,3)))
        {
            System.out.println("Die ersten drei Zeichen sind bei mind. zwei Worten gleich gleich.");

        }

        else if (eins.substring(0,3).equals(drei.substring(0,3)))
        {
            System.out.println("Die ersten drei Zeichen sind bei mind. zwei Worten gleich.");

        }

        else if (drei.substring(0,3).equals(zwei.substring(0,3)))
        {
            System.out.println("Die ersten drei Zeichen sind bei mind. zwei Worten gleich.");

        }

        else
        {
            System.out.println("Die Zeichen sind nicht gleich.");
        }







    }
}
