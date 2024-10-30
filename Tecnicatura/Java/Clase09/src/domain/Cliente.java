// 9.5 Herencia parte 5: Presentamos la tarea de hoy
// Crear la clase Cliente

package domain;

import java.util.Date;

public class Cliente extends Persona{
    private int idCliente;
    private Date fechaRegistro;
    private boolean idVip;
    private static int contadorClientes;
    
    // Constructor
    public Cliente(Date fechaRegistro, boolean idVip, String nombre, 
            char genero, int edad, String direccion) {
        super(nombre, genero, edad, direccion);
        this.idCliente = ++Cliente.contadorClientes;
        this.fechaRegistro = fechaRegistro;
        this.idVip = idVip;
    }

    public int getIdCliente() {
        return this.idCliente;
    }

    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isIdVip() {
        return this.idVip;
    }

    public void setIdVip(boolean idVip) {
        this.idVip = idVip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{idCliente=").append(idCliente);
        sb.append(", fechaRegistro=").append(fechaRegistro);
        sb.append(", idVip=").append(idVip);
        sb.append(", =").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
}
