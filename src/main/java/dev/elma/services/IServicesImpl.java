package dev.elma.services;

import dev.elma.dao.IDAO;

public class IServicesImpl implements IServices{
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
