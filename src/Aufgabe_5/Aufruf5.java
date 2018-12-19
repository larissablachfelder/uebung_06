package Aufgabe_5;

public class Aufruf5
{
    public static void main(String[] args)
    {
        int[][] array = new int [5][5];

        for(int i = 0; i < array.length; i++)
        {

            for (int j = 0; j < array[i].length; j++)
            {
                array[i][j] = i * j;

            }

        }

        for(int[] i : array)
        {
            for(Integer j : i)
            {
                System.out.println(j);
            }
        }
    }
}
