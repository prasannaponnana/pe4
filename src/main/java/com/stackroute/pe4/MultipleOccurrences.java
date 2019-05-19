package com.stackroute.pe4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleOccurrences
{
    public String[] multiple(String str, String p)
    {
        Pattern pattern = Pattern.compile(p);
        Matcher matcher = pattern.matcher(str);
        StringBuffer b = new StringBuffer("");
        while (matcher.find())
        {
            b.append("found_at:" + matcher.start() + "-" + matcher.end() + "\n");
        }
        return b.toString().split("\n"); // return result
    }
}
