package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.impl.director.ApplianceDirector;
import by.tc.task01.dao.impl.director.Command;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ApplianceDAOImpl implements ApplianceDAO{

	private ApplianceDirector director = new ApplianceDirector();

	@Override
	public <E> Appliance find(Criteria<E> criteria) {
		String applianceType = criteria.getApplianceType();
        Map<E, Object> criteriaMap = criteria.getAllCriteria();
        List<String> criteriaSubstrings = new ArrayList<String>();
        Set criteriaSet = criteriaMap.keySet();
        for (Object key : criteriaSet){
            Object val = criteriaMap.get(key);
            String criteriaString = key.toString() + "=" + val.toString();
            criteriaSubstrings.add(criteriaString);
        }
        String applianceString = null;
        try {
            File file = new File("src/main/resources/appliances_db.txt");
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader in = new BufferedReader(new FileReader(file.getAbsoluteFile()));
            String fileString;
            boolean isFitting = false;
            fileString = in.readLine();
            while (fileString != null && !fileString.contains(applianceType)) {
                fileString = in.readLine(); //read until reach the needed appliances or end of file
            }
            while (fileString != null && fileString.contains(applianceType)) { //read needed appliances until reach the wrong appliances or end
                isFitting = true;
                for (String a : criteriaSubstrings) {
                    if (!(fileString.toUpperCase().contains(a.toUpperCase()))) { //even one criteria is missing
                        isFitting = false;
                        break;
                    }
                }
                if (isFitting) {
                    applianceString = fileString;
                    break;
                }
                fileString = in.readLine();
            }
            in.close();
        }
        catch (IOException e){
            System.out.println("File error");
        }
            Command command = director.getCommand(applianceType);//"Oven"
        if (command == null){return null;}
            Appliance appl = command.execute(applianceString);


		return appl;
	}

	// you may add your own code here

}


//you may add your own new classes
