package model.interfaces;

import java.util.LinkedList;
import model.classes.Vehicle;

public interface DAOVehicle {
    public LinkedList<Vehicle> listVehicles();
    public void add(Vehicle vehicle);
    public void edit(Vehicle vehicle);
    public void delete(int id);
}
