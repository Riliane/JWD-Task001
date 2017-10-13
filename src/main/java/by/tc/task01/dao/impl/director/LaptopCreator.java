package by.tc.task01.dao.impl.director;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;

class LaptopCreator implements Command{
    public Appliance execute(String str){
        if (str == null) {return null;}
        Laptop appl = new Laptop();
        String[] parameters = str.split("[\\s,:;]+"); //the first string is the appliance name
        for (int i = 1; i < parameters.length; i++) {
            String[] oneParam = parameters[i].split("=");
            if (oneParam[0].equalsIgnoreCase("DISPLAY_INCHS")){
                appl.setDisplayInches(Integer.parseInt(oneParam[1]));
            }
            if (oneParam[0].equalsIgnoreCase("MEMORY_ROM")){
                appl.setMemoryRom(Integer.parseInt(oneParam[1]));
            }
            if (oneParam[0].equalsIgnoreCase("SYSTEM_MEMORY")){
                appl.setSystemMemory(Integer.parseInt(oneParam[1]));
            }
            if (oneParam[0].equalsIgnoreCase("CPU")){
                appl.setCpu(Double.parseDouble(oneParam[1]));
            }
            if (oneParam[0].equalsIgnoreCase("BATTERY_CAPACITY")){
                appl.setBatteryCapacity(Double.parseDouble(oneParam[1]));
            }
            if (oneParam[0].equalsIgnoreCase("OS")){
                appl.setOs(oneParam[1]);
            }
        }
        //set
        return appl;
    }
}
