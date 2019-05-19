package com.stackroute.pe4;

public class Transpose {
    public String transposesort(String p) {
        String[] sort = p.split(" ");
        String sortedlist = " ";
        for (int i = 0; i < sort.length; i++) {
            String list = sort[i];
            String sortlist = "";
            for (int j = list.length() - 1; j >= 0; j--) {
                sortlist = sortlist + list.charAt(j);
            }
            sortedlist = sortedlist + sortlist + " ";
        }
        String s = sortedlist.trim();
        return s;
    }
}



