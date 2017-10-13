package by.tc.task01.dao.impl.director;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Speakers;

public class SpeakersCreator implements Command {
    public Appliance execute(String str){
        if (str == null) {return null;}
        Speakers appl = new Speakers();
        String[] parameters = str.split("[\\s,:;]+"); //the first string is the appliance name
        for (int i = 1; i < parameters.length; i++) {
            String[] oneParam = parameters[i].split("=");
            if (oneParam[0].equalsIgnoreCase("POWER_CONSUMPTION")){
                appl.setPowerConsumption(Integer.parseInt(oneParam[1]));
            }
            if (oneParam[0].equalsIgnoreCase("FREQUENCY_RANGE")) {
                appl.setFrequencyRange(oneParam[1]);
            }
            if (oneParam[0].equalsIgnoreCase("NUMBER_OF_SPEAKERS")){
                appl.setNumber(Integer.parseInt(oneParam[1]));
            }
            if (oneParam[0].equalsIgnoreCase("CORD_LENGTH")){
                appl.setCordLength(Integer.parseInt(oneParam[1]));
            }
        }
        return appl;
    }
}
