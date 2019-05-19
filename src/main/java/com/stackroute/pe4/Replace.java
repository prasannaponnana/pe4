package com.stackroute.pe4;
public class Replace {
    public String replace(String args) {
        String str = "daily fry";
        String rs = str.replace("d","f"); // Replace 'h' with 's'
        System.out.println(rs);
        rs = rs.replace("l","t"); // Replace 's' with 'h'
        System.out.println(rs);
        return rs;
    }
}