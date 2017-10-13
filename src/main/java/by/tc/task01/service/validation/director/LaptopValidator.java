package by.tc.task01.service.validation.director;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Map;

public class LaptopValidator implements Command {
    public <E> boolean execute(Criteria<E> criteria){
        boolean hasCriteria = false;
        boolean isValid = true;
        //criteria.get(SearchCriteria.Laptop.MEMORY_ROM);
        Map<E, Object> criteriaMap = criteria.getAllCriteria();
        try {
            Object memoryRom = criteriaMap.get(SearchCriteria.Laptop.MEMORY_ROM);
            if (memoryRom != null) {
                hasCriteria = true;
                Integer.parseInt(memoryRom.toString()); //will throw exception if it's not an integer number
            }
            Object systemMemory = criteriaMap.get(SearchCriteria.Laptop.SYSTEM_MEMORY);
            if (systemMemory != null) {
                hasCriteria = true;
                Integer.parseInt(systemMemory.toString());
            }
            Object displayInches = criteriaMap.get(SearchCriteria.Laptop.DISPLAY_INCHS);
            if (displayInches != null) {
                hasCriteria = true;
                Integer.parseInt(displayInches.toString());
            }
            Object batteryCapacity = criteriaMap.get(SearchCriteria.Laptop.BATTERY_CAPACITY);
            if (batteryCapacity != null) {
                hasCriteria = true;
                Double.parseDouble(batteryCapacity.toString());
            }
            Object cpu = criteriaMap.get(SearchCriteria.Laptop.CPU);
            if (cpu != null) {
                hasCriteria = true;
                Double.parseDouble(cpu.toString());
            }
            //string isn't checked
        }
        catch (NumberFormatException e){
            isValid = false;
        }
        if (!hasCriteria) return false;
        else return isValid;
    }
}
