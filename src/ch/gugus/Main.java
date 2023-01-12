package ch.gugus;

import ch.gugus.d1_thermostat.D1;
import ch.gugus.d2_school.D2;
import ch.gugus.d3_tree.D3;
import ch.gugus.v1_blockbuster.V1;
import ch.gugus.v2_football.V2;
import ch.gugus.v3_portfolio.V3;

import java.io.InputStream;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author Kalel TBZ
 */
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
                    break;
                case "v2":
                    new V2().run();
                    break;
                case "d2":
                    new D2().run();
                    break;
                case "d3":
                    new D3().run();
                    break;
                case "v3":
                    new V3().run();
                    break;
                case "q":
                    return;
                default:
                    break;
            }
        }

    }
}
