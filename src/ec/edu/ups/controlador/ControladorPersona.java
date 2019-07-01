/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;


import ec.edu.ups.modelo.Persona;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 
 */
public class ControladorPersona {

    private BaseDatos miBaseDatos;

    public ControladorPersona() {
        miBaseDatos = new BaseDatos();
    }

    public void create(Persona persona) {
        Format formato = new SimpleDateFormat("yyyy-MM-dd");
        String fecha = formato.format(persona.getFechaNacimiento());
        String sql = "INSERT INTO \"PERSONA\" VALUES('" + persona.getCedula() + "', '"
                + persona.getNombre() + "', '"
                + persona.getApellido() + "', "
                + persona.getEdad() + ", '"
                + fecha + "', '" + persona.getCelular() + "'," + persona.getSalario() + ");";

        miBaseDatos.conectar();
        try {
            Statement sta = miBaseDatos.getConexionBD().createStatement();
            sta.execute(sql);
            miBaseDatos.desconectar();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public Persona buscar(String cedula) {
        Persona persona=new Persona();
        try{
            String sql=" SELECT *FROM\"PERSONA\"WHERE\"PER_CEDULA\"='"+cedula+"';";
            System.out.println(sql);
            miBaseDatos.conectar();
            Statement sta=miBaseDatos.getConexionBD().createStatement();
            ResultSet rs=sta.executeQuery(sql);
            while(rs.next()){
                persona.setCedula(rs.getString("PER_CEDULA"));
                persona.setNombre(rs.getString("PER_NOMBRES"));
                persona.setApellido(rs.getString("PER_APELLIDOS"));
                persona.setCelular(rs.getString("PER_CELULAR"));
                persona.setEdad(rs.getInt("PER_EDAD"));
                persona.setFechaNacimiento(rs.getDate("PER_F.NACIMIENTO"));
                persona.setSalario(rs.getDouble("PER_SALARIO"));
                
            }
            rs.close();
            sta.close();
            miBaseDatos.desconectar();
        }catch(SQLException ex){
            ex.printStackTrace();
        } catch (Exception ex) {
            Logger.getLogger(ControladorPersona.class.getName()).log(Level.SEVERE, null, ex);
        }
        return persona;
    }

    public void delete(String cedula){
        String sql = "DELETE FROM \"PERSONA\" WHERE \"PER_CEDULA\" = '" + cedula + "';";
        miBaseDatos.conectar();
        try {
            Statement sta = miBaseDatos.getConexionBD().createStatement();
            sta.execute(sql);
            miBaseDatos.desconectar();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void update(Persona persona){
        Format formato = new SimpleDateFormat("yyyy-MM-dd");
        String fecha = formato.format(persona.getFechaNacimiento());
        String sql = "UPDATE \"PERSONA\" SET \"PER_NOMBRES\" = '" + persona.getNombre() + "',"
                + "\"PER_APELLIDOS\" = '" + persona.getApellido() + "',"
                + "\"PER_EDAD\" = " + persona.getEdad() + ","
                + "\"PER_F.NACIMIENTO\" = '" + fecha + "',"
                + "\"PER_CELULAR\" = '" + persona.getCelular() + "',"
                + "\"PER_SALARIO\" = " + persona.getSalario()
                + "WHERE \"PER_CEDULA\" = '" + persona.getCedula() + "';";
        miBaseDatos.conectar();
        try {
            Statement sta = miBaseDatos.getConexionBD().createStatement();
            sta.execute(sql);
            miBaseDatos.desconectar();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public List<Persona> listar() {
        List<Persona> listadoPersona = new ArrayList<Persona>();
        miBaseDatos.conectar();
        try {
            Statement sta = miBaseDatos.getConexionBD().createStatement();
            String sql = "SELECT * FROM \"PERSONA\";";
            ResultSet respuesta = sta.executeQuery(sql);
            while(respuesta.next()){
                Persona p = new Persona();
                p.setCedula(respuesta.getString(1));
                p.setNombre(respuesta.getString(2));
                p.setApellido(respuesta.getString(3));
                p.setEdad(respuesta.getInt(4));
                p.setFechaNacimiento(respuesta.getDate(5));
                p.setCelular(respuesta.getString(6));
                p.setSalario(respuesta.getDouble(7));
                listadoPersona.add(p);
            }
        }catch(SQLException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            Logger.getLogger(ControladorPersona.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listadoPersona;
    }
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            

}
