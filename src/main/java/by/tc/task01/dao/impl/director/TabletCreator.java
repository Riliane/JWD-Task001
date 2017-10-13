package by.tc.task01.dao.impl.director;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.TabletPC;

public class TabletCreator implements Command {
    public Appliance execute(String str){
        if (str == null) {return null;}
        TabletPC appl = new TabletPC();
        String[] parameters = str.split("[\\s,:;]+"); //the first string is the appliance name
        for (int i = 1; i < parameters.length; i++) {
            String[] oneParam = parameters[i].split("=");
            if (oneParam[0].equalsIgnoreCase("DISPLAY_INCHES")){
                appl.setDisplayInches(Integer.parseInt(oneParam[1]));
            }
            if (oneParam[0].equalsIgnoreCase("MEMORY_ROM")){
                appl.setMemoryRom(Integer.parseInt(oneParam[1]));
            }
            if (oneParam[0].equalsIgnoreCase("FLASH_MEMORY_CAPACITY")){
                appl.setFlashMemoryCapacity(Integer.parseInt(oneParam[1]));
            }
            if (oneParam[0].equalsIgnoreCase("BATTERY_CAPACITY")){
                appl.setBatteryCapacity(Double.parseDouble(oneParam[1]));
            }
            if (oneParam[0].equalsIgnoreCase("COLOR")){
                appl.setColor(oneParam[1]);
            }
        }
        //set
        return appl;
    }
}
