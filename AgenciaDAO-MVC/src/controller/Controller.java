package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.classes.Vehicle;
import model.daoimplementations.VehicleDAOImplementations;
import view.View;

public class Controller extends MouseAdapter implements ActionListener {

    private View view;
    private VehicleDAOImplementations model;

    public Controller(View view, VehicleDAOImplementations model) {
        this.view = view;
        this.model = model;

        this.view.btnClean.addActionListener(this);
        this.view.btnAdd.addActionListener(this);
        this.view.btnUpdate.addActionListener(this);
        this.view.btnDelete.addActionListener(this);
        this.view.tableVehicles.addMouseListener(this);
    }

    public void start() {
        view.setTitle("Sistema Agencia");
        view.setResizable(false);
        view.setLocationRelativeTo(null);
        loadTableVehicles();
        view.textID.setEditable(false);
    }

    public void printInformation() {
        model.listVehicles();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == view.btnClean) {
            cleanScreen();
        }
        if (e.getSource() == view.btnAdd) {
            if (fieldValidation()) {
                String brand = view.textBrand.getText();
                String vehicleModel = view.textModel.getText();
                int year = Integer.valueOf(view.textYear.getText());
                Vehicle vehicle = new Vehicle(0, brand, vehicleModel, year);
                this.model.add(vehicle);
                loadTableVehicles();
            }
        }
        if (e.getSource() == view.btnUpdate) {
            if (fieldValidation()) {
                int id = Integer.valueOf(view.textID.getText());
                String brand = view.textBrand.getText();
                String vehicleModel = view.textModel.getText();
                int year = Integer.valueOf(view.textYear.getText());
                Vehicle vehicle = new Vehicle(id, brand, vehicleModel, year);
                model.edit(vehicle);
                loadTableVehicles();
            }
        }
        if (e.getSource() == view.btnDelete) {
            int id = Integer.valueOf(view.textID.getText());
            model.delete(id);
            loadTableVehicles();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == view.tableVehicles) {
            selectDatos();
        }
    }

    private void loadTableVehicles() {
        String columns[] = {"ID", "Marca", "Modelo", "Año"};
        DefaultTableModel table = new DefaultTableModel(null, columns);
        for (Vehicle v : model.listVehicles()) {
            Object row[] = new Object[5];
            row[0] = v.getId();
            row[1] = v.getBrand();
            row[2] = v.getModel();
            row[3] = v.getYear();
            table.addRow(row);
        }
        view.tableVehicles.setModel(table);
    }

    private boolean fieldValidation() {
        String brand = view.textBrand.getText();
        String vehicleModel = view.textModel.getText();
        String year = view.textYear.getText();
        if (brand.isEmpty() | vehicleModel.isEmpty() | year.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debes de llenar todos los campos");
            return false;
        }
        return true;
    }

    private void cleanScreen() {
        view.textID.setText("");
        view.textBrand.setText("");
        view.textModel.setText("");
        view.textYear.setText("");
    }

    public void selectDatos() {
        int row = view.tableVehicles.getSelectedRow();
        view.textID.setText(view.tableVehicles.getValueAt(row, 0).toString());
        view.textBrand.setText(view.tableVehicles.getValueAt(row, 1).toString());
        view.textModel.setText(view.tableVehicles.getValueAt(row, 2).toString());
        view.textYear.setText(view.tableVehicles.getValueAt(row, 3).toString());
    }

}
