package com.ketul;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindFileInPC {
    public static String found = "error";
    public static int count;

    public static void main(String[] args) {
        System.out.println(System.getProperty("user.home"));
        File f = new File(System.getProperty("user.home"));
        System.out.println(f);
        foundInsideDirectory(f);
    }

    public static  void foundInsideDirectory(File f) {
        String[] s = f.list();
        if (s != null) {
            for (String s1 : s) {
                File f1 = new File(f, s1);

                if (f1.isFile()) {
                    Pattern p2 = Pattern.compile(found, Pattern.CASE_INSENSITIVE);
                    Matcher m2 = p2.matcher(s1);

                    while (m2.find()) {
                        System.out.println(f1 + " ---> " + Thread.currentThread().getName());
                        count++;
                    }
                } else if (f1.isDirectory())
                    foundInsideDirectory(f1);
            }
        }
        else
            System.out.println("Array null-------------------" + f);
    }
}
