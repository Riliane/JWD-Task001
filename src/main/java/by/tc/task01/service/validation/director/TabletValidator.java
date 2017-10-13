package by.tc.task01.service.validation.director;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Map;

public class TabletValidator implements Command{
    public <E> boolean execute(Criteria<E> criteria){
        boolean hasCriteria = false;
        boolean isValid = true;
        Map<E, Object> criteriaMap = criteria.getAllCriteria();
        try {
            Object memoryRom = criteriaMap.get(SearchCriteria.TabletPC.MEMORY_ROM);
            if (memoryRom != null) {
                hasCriteria = true;
                Integer.parseInt(memoryRom.toString()); //will throw exception if it's not an integer number
            }
            Object flashMemoryCapacity = criteriaMap.get(SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY);
            if (flashMemoryCapacity != null) {
                hasCriteria = true;
                Integer.parseInt(flashMemoryCapacity.toString());
            }
            Object displayInches = criteriaMap.get(SearchCriteria.TabletPC.DISPLAY_INCHES);
            if (displayInches != null) {
                hasCriteria = true;
                Integer.parseInt(displayInches.toString());
            }
            Object batteryCapacity = criteriaMap.get(SearchCriteria.TabletPC.BATTERY_CAPACITY);
            if (batteryCapacity != null) {
                hasCriteria = true;
                Double.parseDouble(batteryCapacity.toString());
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
