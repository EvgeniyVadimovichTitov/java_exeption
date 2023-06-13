package controller;

import model.Data;
import model.Repository;

public class Controller implements Controllable{

    private Repository rep;

    public Controller(Repository rep) {
        this.rep = rep;
    }

    @Override
    public void save(Data data) {
        rep.save(data);
    }
}
