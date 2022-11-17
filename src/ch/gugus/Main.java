package ch.gugus;

import ch.gugus.d1_thermostat.D1;

import java.io.InputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose program to run");
        String programToRun = scan.nextLine();
        switch (programToRun)
        {
            case "D1":
                new D1().run();
                break;
            default:
                break;
        }
    }
}
