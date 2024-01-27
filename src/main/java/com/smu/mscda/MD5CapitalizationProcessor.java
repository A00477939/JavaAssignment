package com.smu.mscda;


import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class MD5CapitalizationProcessor {
    public static void main(String[] args) {
        System.out.println("This program will take a string and capitalize it and generate MD5 Hex");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input string");
        //String input = sc.nextLine();
        String input = "hritik";
        System.out.println("MD5 hash in hexadecimal format: " + GenerateMDshex(input));
        System.out.println("The capitalize string is " + GenerateCapital(input));


    }

    public static String GenerateMDshex(String input) {
        String md5Hex = DigestUtils.md5Hex(input);
        return md5Hex;
    }

    public static String GenerateCapital(String input){
        String Capital = StringUtils.capitalize(input);
        return Capital;


    }


}
