// 9.2 Herencia parte 2
// 9.3 Herencia parte 3: clase String Builder

package domain;

public class Empleado extends Persona{ // En java no hay Herencia multiple
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleados; // Es para incrementar
    
    // Constructor
    public Empleado(String nombre, double sueldo) {
        super(nombre);
        this.idEmpleado = ++Empleado.contadorEmpleados;
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return this.idEmpleado;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    // Es mas lento el signo + para concatenar cadenas por eso usamos StringBuilder
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{idEmpleado=").append(idEmpleado);
        sb.append(", sueldo=").append(sueldo);
        sb.append(", =").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
}
