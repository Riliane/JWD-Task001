package by.tc.task01.service.validation.director;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Map;

public class OvenValidator implements Command {
    public <E> boolean execute(Criteria<E> criteria){
        boolean hasCriteria = false;
        boolean isValid = true;

        Map<E, Object> criteriaMap = criteria.getAllCriteria();
        try {
            Object powerConsumption = criteriaMap.get(SearchCriteria.Oven.POWER_CONSUMPTION);
            if (powerConsumption != null) {
                hasCriteria = true;
                Integer.parseInt(powerConsumption.toString()); //will throw exception if it's not an integer number
            }
            Object capacity = criteriaMap.get(SearchCriteria.Oven.CAPACITY);
            if (capacity != null) {
                hasCriteria = true;
                Integer.parseInt(capacity.toString());
            }
            Object weight = criteriaMap.get(SearchCriteria.Oven.WEIGHT);
            if (weight != null) {
                hasCriteria = true;
                Integer.parseInt(weight.toString());
            }
            Object height = criteriaMap.get(SearchCriteria.Oven.HEIGHT);
            if (height != null) {
                hasCriteria = true;
                Double.parseDouble(height.toString());
            }
            Object width = criteriaMap.get(SearchCriteria.Oven.WIDTH);
            if (width != null) {
                hasCriteria = true;
                Double.parseDouble(width.toString());
            }
            Object depth = criteriaMap.get(SearchCriteria.Oven.DEPTH);
            if (depth != null) {
                hasCriteria = true;
                Double.parseDouble(depth.toString());
            }
        }
        catch (NumberFormatException e){
            isValid = false;
        }
        if (!hasCriteria) return false;
        else return isValid;
    }
}
