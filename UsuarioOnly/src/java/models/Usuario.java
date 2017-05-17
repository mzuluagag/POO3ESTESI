/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Sergio
 */
public class Usuario {
    private String nombres;
    private String apellidos;
    private String sobrenombre;
    private String email;
    private String id;
    private String fechaDeNacimiento;
    private double presupuesto;
    private String rol;

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
    
    public Usuario(){
        
    }
    public Usuario(String nombres, String apellidos, String sobrenombre,
            String email, String id, String fechaDeNacimiento){
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.sobrenombre = sobrenombre;
        this.email = email;
        this.id = id;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.rol = "Usuario";
        this.presupuesto = 0;
        
    }
    public Usuario(String nombres, String apellidos, String sobrenombre,
            String email, String id, String fechaDeNacimiento,
             double presupuesto){
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.sobrenombre = sobrenombre;
        this.email = email;
        this.id = id;
        this.fechaDeNacimiento= fechaDeNacimiento;
        this.rol = "Usuario";
        this.presupuesto = 0;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getSobrenombre() {
        return sobrenombre;
    }

    public void setSobrenombre(String sobrenombre) {
        this.sobrenombre = sobrenombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto += presupuesto;
    }
    





}
