package by.tc.task01.dao.impl.director;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Oven;

class OvenCreator implements Command{
    public Appliance execute(String str){
        if (str == null) {return null;}
        Oven appl = new Oven();
        String[] parameters = str.split("[\\s,:;]+"); //the first string is the appliance name
        for (int i = 1; i < parameters.length; i++) {
            String[] oneParam = parameters[i].split("=");
            if (oneParam[0].equalsIgnoreCase("POWER_CONSUMPTION")){
                appl.setPowerConsumption(Integer.parseInt(oneParam[1]));
            }
            if (oneParam[0].equalsIgnoreCase("WEIGHT")){
                appl.setWeight(Integer.parseInt(oneParam[1]));
            }
            if (oneParam[0].equalsIgnoreCase("CAPACITY")){
                appl.setCapacity(Integer.parseInt(oneParam[1]));
            }
            if (oneParam[0].equalsIgnoreCase("DEPTH")){
                appl.setDepth(Double.parseDouble(oneParam[1]));
            }
            if (oneParam[0].equalsIgnoreCase("HEIGHT")){
                appl.setHeight(Double.parseDouble(oneParam[1]));
            }
            if (oneParam[0].equalsIgnoreCase("WIDTH")){
                appl.setWidth(Double.parseDouble(oneParam[1]));
            }
        }
        return appl;
    }
}
