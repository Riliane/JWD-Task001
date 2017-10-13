package by.tc.task01.service.validation.director;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Map;

public class VacuumValidator implements Command{
    public <E> boolean execute(Criteria<E> criteria){
        boolean hasCriteria = false;
        boolean isValid = true;
        Map<E, Object> criteriaMap = criteria.getAllCriteria();
        try {
            Object powerConsumption = criteriaMap.get(SearchCriteria.VacuumCleaner.POWER_CONSUMPTION);
            if (powerConsumption != null) {
                hasCriteria = true;
                Integer.parseInt(powerConsumption.toString()); //will throw exception if it's not an integer number
            }
            Object cleaningWidth = criteriaMap.get(SearchCriteria.VacuumCleaner.CLEANING_WIDTH);
            if (cleaningWidth != null) {
                hasCriteria = true;
                Integer.parseInt(cleaningWidth.toString());
            }
            Object motorSpeed = criteriaMap.get(SearchCriteria.VacuumCleaner.MOTOR_SPEED_REGULATION);
            if (motorSpeed != null) {
                hasCriteria = true;
                Integer.parseInt(motorSpeed.toString());
            }
        }
        catch (NumberFormatException e){
            isValid = false;
        }
        if (!hasCriteria) return false;
        else return isValid;
    }
}
