package ch.gugus.d1_thermostat;

public class Thermostat {
    private int temperature;
    private int min;
    private int max;
    private int increment;

    public Thermostat(int min, int max) {
        this.temperature = 15;
        this.increment = 0;
        if (differencMinMax(min, max)) {
            this.min = min;
            this.max = max;
        }
        else {
            this.min = 15;
            this.max = 15;
        }
    }

    public Thermostat(int temperature, int min, int max) {
        this.temperature = temperature;
        this.increment = 0;
        if (differencMinMax(min, max)) {
            this.min = min;
            this.max = max;
        }
        else {
            this.min = 15;
            this.max = 15;
        }
    }

    private boolean differencMinMax(int min, int max){
        return min <= max;
    }

    public void changeTemperature(int increment){
        if (!(temperature + increment > max || temperature + increment < min)) {
            this.temperature += increment;
            return;
        }

        System.out.println("Value exceeds the max or min temperature. No changes.");
    }

    public int getIncrement() {
        return increment;
    }

    public void setIncrement(int increment) {
        this.increment = increment;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
