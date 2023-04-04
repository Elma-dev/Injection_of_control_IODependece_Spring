package dev.elma.services;

import dev.elma.dao.IDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class IServicesImpl implements IServices{
    @Autowired
    IDAO dao;
    @Override
    public double calculate() {
        return dao.getData()/23;
    }

    public IDAO getDao() {
        return dao;
    }

    public void setDao(IDAO dao) {
        this.dao = dao;
    }
}
