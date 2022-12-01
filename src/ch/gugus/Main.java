package ch.gugus;

import ch.gugus.d1_thermostat.D1;
import ch.gugus.v1_blockbuster.V1;

import java.io.InputStream;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while (true){
            Scanner scan = new Scanner(System.in);
            System.out.println("Choose program to run");
            String programToRun = scan.nextLine();
            switch (programToRun.toLowerCase())
            {
                case "d1":
                    new D1().run();
                    break;
                case "v1":
                    new V1().run();
                case "q":
                    return;
                default:
                    break;
            }
        }

    }
}
