package Logica;

public class Empleados {
    int id;
    String nombre;
    String apellidos;
    String jerarquia;
    int sueldo;

    public Empleados() {
    }

    public Empleados(int id, String nombre, String apellidos, String jerarquia, int sueldo) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.jerarquia = jerarquia;
        this.sueldo = sueldo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getJerarquia() {
        return jerarquia;
    }

    public void setJerarquia(String jerarquia) {
        this.jerarquia = jerarquia;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
}
