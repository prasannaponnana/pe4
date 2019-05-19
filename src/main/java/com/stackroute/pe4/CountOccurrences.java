package com.stackroute.pe4;

public class CountOccurrences {

    public static int sortlists(String str)
    {
                int sortlists = str.length() - str.replaceAll("a", "").length();
                return sortlists;
            }

        }


