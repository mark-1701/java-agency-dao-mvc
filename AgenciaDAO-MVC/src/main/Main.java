package main;

import controller.Controller;
import model.daoimplementations.VehicleDAOImplementations;
import view.View;

public class Main {
    public static void main(String[] args) {
        VehicleDAOImplementations model = new VehicleDAOImplementations();
        View view = new View();
        Controller controller = new Controller(view, model);
        controller.start();
        controller.printInformation();
        view.setVisible(true);
    }
}
