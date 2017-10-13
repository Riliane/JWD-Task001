package by.tc.task01.service.validation.director;

import by.tc.task01.entity.criteria.Criteria;

public interface Command {
    public <E> boolean execute(Criteria<E> criteria);
}
