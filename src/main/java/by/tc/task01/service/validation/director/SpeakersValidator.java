package by.tc.task01.service.validation.director;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Map;

public class SpeakersValidator implements Command{
    public <E> boolean execute(Criteria<E> criteria){
        boolean hasCriteria = false;
        boolean isValid = true;
        Map<E, Object> criteriaMap = criteria.getAllCriteria();
        try {
            Object powerConsumption = criteriaMap.get(SearchCriteria.Speakers.POWER_CONSUMPTION);
            if (powerConsumption != null) {
                hasCriteria = true;
                Integer.parseInt(powerConsumption.toString());
            }
            Object number = criteriaMap.get(SearchCriteria.Speakers.NUMBER_OF_SPEAKERS);
            if (number != null) {
                hasCriteria = true;
                Integer.parseInt(number.toString());
            }
            Object cordLength = criteriaMap.get(SearchCriteria.Speakers.CORD_LENGTH);
            if (cordLength != null) {
                hasCriteria = true;
                Integer.parseInt(cordLength.toString());
            }
        }
        catch (NumberFormatException e){
            isValid = false;
        }
        if (!hasCriteria) return false;
        else return isValid;
    }
}
