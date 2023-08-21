package model.daoimplementations;

import java.util.LinkedList;
import model.classes.Vehicle;
import model.interfaces.DAOVehicle;
import java.sql.*;
import javax.swing.JOptionPane;
import model.config.MySQLConnection;

public class VehicleDAOImplementations implements DAOVehicle {

    MySQLConnection mcon = new MySQLConnection();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public LinkedList<Vehicle> listVehicles() {
        LinkedList<Vehicle> list = new LinkedList<Vehicle>();
        String sql = "SELECT * FROM vehiculos";
        try {
            //Inicializa la base de datos
            con = mcon.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Vehicle vehicle = new Vehicle();
                vehicle.setId(rs.getInt(1));
                vehicle.setBrand(rs.getString(2));
                vehicle.setModel(rs.getString(3));
                vehicle.setYear(rs.getInt(4));
                list.add(vehicle);
            }
        } catch (Exception e) {
            System.out.println("ERROR LISTA VEHICULOS: " + e);
        }
        return list;
    }

    @Override
    public void add(Vehicle vehicle) {
        try {
            String query = "INSERT INTO vehiculos VALUES (0,?,?,?);";
            con = mcon.getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, vehicle.getBrand());
            ps.setString(2, vehicle.getModel());
            ps.setInt(3, vehicle.getYear());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Nuevo vehiculo registrado");
        } catch (Exception e) {
            System.out.println("ERROR AGREGAR VEHICULO: " + e);
        }
    }

    @Override
    public void edit(Vehicle vehicle) {
        String query = "UPDATE vehiculos SET marca=?, modelo=?, anio=? WHERE id=?;";
        try {
            con = mcon.getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, vehicle.getBrand());
            ps.setString(2, vehicle.getModel());
            ps.setInt(3, vehicle.getYear());
            ps.setInt(4, vehicle.getId());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Vehiculo actualizado correctamente");
        } catch (Exception e) {
            System.out.println("ERROR AL MODIFICAR VEHICULO: " + e);
        }
    }

    @Override
    public void delete(int id) {
        String sql = "DELETE from vehiculos WHERE id=?";
        try {
            con = mcon.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Vehiculo eliminado exitosamente");
        } catch (Exception e) {
        }
    }

}
