package Aufgabe_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.lang.Math.random;

public class Aufruf4
{
    public static void main(String[] args) {

        List<Integer> liste = new ArrayList<>();
        Random zufallszahl = new Random();
        int zz = zufallszahl.nextInt(100)+1;


        for (int zahl = 0; zahl < zz; zahl++)
        {
            liste.add(zahl+zz);

        }

        System.out.println(liste.size());

        for (Integer i : liste)
        {
            System.out.println(i);
        }

    }
}
