package by.tc.task01.entity;

public class TabletPC extends Appliance{
    private double batteryCapacity;
    private String color;
    private int memoryRom;
    private int flashMemoryCapacity;
    private int displayInches;

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(int memoryRom) {
        this.memoryRom = memoryRom;
    }

    public int getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public void setFlashMemoryCapacity(int flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    public int getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(int displayInches) {
        this.displayInches = displayInches;
    }

    public String toString() {
        return "Laptop:\nBattery capacity: " + batteryCapacity + "\nMemory ROM:" + memoryRom + "\nFlash memory capacity:" + flashMemoryCapacity + "\nDisplay:" + displayInches + "\"\nColor:" + color;
    }
    // you may add your own code here
}
