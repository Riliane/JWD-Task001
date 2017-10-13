package by.tc.task01.service.validation.director;

import java.util.HashMap;
import java.util.Map;

public class ValidatorDirector {
    Map<String, Command> map = new HashMap<>();

    public ValidatorDirector(){
        map.put("Oven", new OvenValidator());
        map.put("Laptop", new LaptopValidator());
        map.put("Refrigerator", new RefrigeratorValidator());
        map.put("TabletPC", new TabletValidator());
        map.put("VacuumCleaner", new VacuumValidator());
        map.put("Speakers", new SpeakersValidator());
    }

    public Command getCommand(String typeName){// "Laptop"
        Command command;
        command = map.get(typeName);
        return command;
    }
}

