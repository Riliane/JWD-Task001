package by.tc.task01.dao.impl.director;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.VacuumCleaner;

public class VacuumCreator implements Command {
    public Appliance execute(String str){
        if (str == null) {return null;}
        VacuumCleaner appl = new VacuumCleaner();
        String[] parameters = str.split("[\\s,:;]+"); //the first string is the appliance name
        for (int i = 1; i < parameters.length; i++) {
            String[] oneParam = parameters[i].split("=");
            if (oneParam[0].equalsIgnoreCase("POWER_CONSUMPTION")){
                appl.setPowerConsumption(Integer.parseInt(oneParam[1]));
            }
            if (oneParam[0].equalsIgnoreCase("BAG_TYPE")) {
                appl.setBagType(oneParam[1]);
            }
            if (oneParam[0].equalsIgnoreCase("FILTER_TYPE")) {
                appl.setFilterType(oneParam[1]);
            }
            if (oneParam[0].equalsIgnoreCase("WAND_TYPE")) {
                appl.setWandType(oneParam[1]);
            }
            if (oneParam[0].equalsIgnoreCase("CLEANING_WIDTH")){
                appl.setCleaningWidth(Integer.parseInt(oneParam[1]));
            }
            if (oneParam[0].equalsIgnoreCase("MOTOR_SPEED_REGULATION")){
                appl.setMotorSpeedRegulation(Integer.parseInt(oneParam[1]));
            }
        }
        return appl;
    }
}
