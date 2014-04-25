/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package catdog;

/**
 *
 * @author Administrador
 */
public class CatDog {

    private String Rut;
    private String NombreApellido;
    private int Telefono;
    private String NombreAnimal;
    private String DiaIngreso;
    private String DiaSalida;
    private String IDanimal;

    public CatDog(String Rut, String NombreApellido, int Telefono, String NombreAnimal, String DiaIngreso, String DiaSalida) {
        this.Rut = Rut;
        this.NombreApellido = NombreApellido;
        this.Telefono = Telefono;
        this.NombreAnimal = NombreAnimal;
        this.DiaIngreso = DiaIngreso;
        this.DiaSalida = DiaSalida;
    }

    public String getRut() {
        return Rut;
    }

    public void setRut(String Rut) {
        this.Rut = Rut;
    }

    public String getNombreApellido() {
        return NombreApellido;
    }

    public void setNombreApellido(String NombreApellido) {
        this.NombreApellido = NombreApellido;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public String getNombreAnimal() {
        return NombreAnimal;
    }

    public void setNombreAnimal(String NombreAnimal) {
        this.NombreAnimal = NombreAnimal;
    }

    public String getDiaIngreso() {
        return DiaIngreso;
    }

    public void setDiaIngreso(String DiaIngreso) {
        this.DiaIngreso = DiaIngreso;
    }

    public String getDiaSalida() {
        return DiaSalida;
    }

    public void setDiaSalida(String DiaSalida) {
        this.DiaSalida = DiaSalida;
    }

    public String getIDanimal() {
        return IDanimal;
    }

    public void setIDanimal(String IDanimal) {
        this.IDanimal = IDanimal;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
