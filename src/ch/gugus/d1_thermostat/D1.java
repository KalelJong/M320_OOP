package ch.gugus.d1_thermostat;

import java.util.Scanner;

public class D1 {

    public void run(){
        System.out.println("Thermostat Program");
        Scanner scan = new Scanner(System.in);

        System.out.println("Set your max temperature");
        int max = scan.nextInt();

        System.out.println("Set your min temperature");
        int min = scan.nextInt();

        System.out.println("Set Temperature? Yes [y] No []");
        String setTemperature = scan.next();

        Thermostat thermo;

        if (setTemperature.equals("y"))
        {
            System.out.println("Set your temperature");
            int temperature = scan.nextInt();

            thermo = new Thermostat(temperature, min, max);
        }
        else
        {
            thermo = new Thermostat(min, max);
        }

        while (true)
        {
            System.out.println("Increment/decrement temperature [i]");
            System.out.println("Quit [q]");
            Scanner option = new Scanner(System.in);
            switch (option.nextLine()){
                case "i":
                    int tempChange = 0;
                    System.out.println("Type in how many degrees you would like to add or subtract");
                    tempChange = scan.nextInt();
                    thermo.changeTemperature(tempChange);
                    System.out.println("New temperature " + thermo.getTemperature());
                    break;
                case "q":
                    System.out.println("Bye");
                    return;
            }
        }
    }
}
