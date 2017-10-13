package by.tc.task01.dao.impl.director;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Refrigerator;

public class RefrigeratorCreator implements Command {
    public Appliance execute(String str){
        if (str == null) {return null;}
        Refrigerator appl = new Refrigerator();
        String[] parameters = str.split("[\\s,:;]+"); //the first string is the appliance name
        for (int i = 1; i < parameters.length; i++) {
            String[] oneParam = parameters[i].split("=");
            if (oneParam[0].equalsIgnoreCase("POWER_CONSUMPTION")){
                appl.setPowerConsumption(Integer.parseInt(oneParam[1]));
            }
            if (oneParam[0].equalsIgnoreCase("WEIGHT")){
                appl.setWeight(Integer.parseInt(oneParam[1]));
            }
            if (oneParam[0].equalsIgnoreCase("FREEZER_CAPACITY")){
                appl.setFreezerCapacity(Double.parseDouble(oneParam[1]));
            }
            if (oneParam[0].equalsIgnoreCase("OVERALL_CAPACITY")){
                appl.setOverallCapacity(Double.parseDouble(oneParam[1]));
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
