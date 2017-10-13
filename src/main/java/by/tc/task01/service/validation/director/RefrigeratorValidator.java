package by.tc.task01.service.validation.director;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Map;

public class RefrigeratorValidator implements Command {
    public <E> boolean execute(Criteria<E> criteria){
        boolean hasCriteria = false;
        boolean isValid = true;
        Map<E, Object> criteriaMap = criteria.getAllCriteria();
        try {
            Object powerConsumption = criteriaMap.get(SearchCriteria.Refrigerator.POWER_CONSUMPTION);
            if (powerConsumption != null) {
                hasCriteria = true;
                Integer.parseInt(powerConsumption.toString()); //will throw exception if it's not an integer number
            }
            Object weight = criteriaMap.get(SearchCriteria.Refrigerator.WEIGHT);
            if (weight != null) {
                hasCriteria = true;
                Integer.parseInt(weight.toString());
            }
            Object frCapacity = criteriaMap.get(SearchCriteria.Refrigerator.FREEZER_CAPACITY);
            if (frCapacity != null) {
                hasCriteria = true;
                Double.parseDouble(frCapacity.toString());
            }
            Object overallCapacity = criteriaMap.get(SearchCriteria.Refrigerator.OVERALL_CAPACITY);
            if (overallCapacity != null) {
                hasCriteria = true;
                Double.parseDouble(overallCapacity.toString());
            }
            Object width = criteriaMap.get(SearchCriteria.Refrigerator.WIDTH);
            if (width != null) {
                hasCriteria = true;
                Double.parseDouble(width.toString());
            }
            Object height = criteriaMap.get(SearchCriteria.Refrigerator.HEIGHT);
            if (height != null) {
                hasCriteria = true;
                Double.parseDouble(height.toString());
            }
        }
        catch (NumberFormatException e){
            isValid = false;
        }
        if (!hasCriteria) return false;
        else return isValid;
    }
}
