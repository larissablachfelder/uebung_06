package Aufgabe_2;

public class Main
{

    public static void main(String[] args)
    {
        int[] array = new int[10];

        //schleife um array zu füllen
        for(int i = 0; i < array.length; i++)
        {
            //+1 weil ich mit 0 starte
            array[i]=i+1;

        }

        for(Integer a : array)
        {
            System.out.println(a);
        }
    }
}
