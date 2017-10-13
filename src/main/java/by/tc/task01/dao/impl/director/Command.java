package by.tc.task01.dao.impl.director;

import by.tc.task01.entity.Appliance;

public interface Command{
    public Appliance execute(String str);
}

