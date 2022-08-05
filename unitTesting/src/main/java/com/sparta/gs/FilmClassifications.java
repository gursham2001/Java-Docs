package com.sparta.gs;

public class FilmClassifications {

    public static String availableClassifications(int ageOfViewer)
    {
        String result;
        if (ageOfViewer <= 12)
        {
            result = "U, PG & 12 films are available.";
        }
        else if (ageOfViewer <= 15)
        {
            result = "U, PG, 12 & 15 films are available.";
        }
        else
        {
            result = "All films are available.";
        }
        return result;
    }
}
