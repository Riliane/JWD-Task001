package by.tc.task01.entity;

public class Speakers extends Appliance{
    private int powerConsumption;
    private int number;
    private String frequencyRange;
    private int cordLength;

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getFrequencyRange() {
        return frequencyRange;
    }

    public void setFrequencyRange(String frequencyRange) {
        this.frequencyRange = frequencyRange;
    }

    public int getCordLength() {
        return cordLength;
    }

    public void setCordLength(int cordLength) {
        this.cordLength = cordLength;
    }

    @Override
    public String toString() {
        return "Refrigerator:\nPower consumption: " + powerConsumption + "\nNumber of speakers: " + number + "\nFrequency range: " + frequencyRange + "\nCord length: " + cordLength;
    }

    // you may add your own code here
}
