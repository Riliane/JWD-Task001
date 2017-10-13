package by.tc.task01.dao.impl.director;

import java.util.HashMap;
import java.util.Map;

public class ApplianceDirector{
    private Map<String, Command> map = new HashMap<>();

    public ApplianceDirector(){
        map.put("Oven", new OvenCreator());
        map.put("Laptop", new LaptopCreator());
        map.put("TabletPC", new TabletCreator());
        map.put("Refrigerator", new RefrigeratorCreator());
        map.put("VacuumCleaner", new VacuumCreator());
        map.put("Speakers", new SpeakersCreator());
    }

    public Command getCommand(String typeName){// "Laptop"
        Command command;
        command = map.get(typeName);
        return command;
    }
}