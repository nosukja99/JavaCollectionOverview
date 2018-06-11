package com.company;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        ArrayList<String> movieTitles = new ArrayList<>();
        //Scanner scanner = new Scanner(System.in);
        String movieTitle;
        String answer = "";
        while (!answer.equals("q") && !answer.equals("Q")) {
            System.out.println("Please enter your favorite movie Title.");
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            movieTitle = in.readLine();
            if (movieTitles.contains(movieTitle)) {
                System.out.println("The movie already exist in the list.");

            } else{
                movieTitles.add(movieTitle);
            }
            System.out.println("Do you have more movie? Please input 'y' or 'Y.\n" +
                    "or if you want to quit, please type 'q' or 'Q'.");
            answer = in.readLine();
        }
        Collections.sort(movieTitles, String.CASE_INSENSITIVE_ORDER);

        for (String title : movieTitles)
        {
            System.out.println(title);
        }
        //System.out.println(movieTitles);
    }
}
