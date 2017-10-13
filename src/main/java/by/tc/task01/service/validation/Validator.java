package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.validation.director.Command;
import by.tc.task01.service.validation.director.ValidatorDirector;

public class Validator {
	
	public static <E> boolean criteriaValidator(Criteria<E> criteria) {
		String applianceType = criteria.getApplianceType();
        ValidatorDirector director = new ValidatorDirector();
        Command command = director.getCommand(applianceType);
        if (command == null) return false; //if somehow applianceType isn't a type present in the map
        boolean isValid = command.execute(criteria);
		// you may add your own code here
		
		return isValid;
	}

}

//you may add your own new classes