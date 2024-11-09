//CLASE 9

package domain;

public class Empleado extends Persona { //la clase empleado es hija de la clase persona
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleados; // Es para incrementar
    
    //Constructores
    //Clase 10: Agregamos un constructor vacio
    public Empleado(){ //constructor 1
        this.idEmpleado = ++Empleado.contadorEmpleados; //aqui se va ir generando el incremento de lo que son los objetos creados para idEmpleado
    }
    
    public Empleado(String nombre, double sueldo) { //constructor 2
        //super (nombre); //Comentamos por que ya no llamamos al constructura de la clase persona
        //this.idEmpleado = ++Empleado.contadorEmpleados; //Manera visible que tiene que tener cuando estamos trabajando dentro del contexto static
        this(); //Estamos llamando desde aqui al constructor vacio (llamar a un constructor interno)
        this.nombre = nombre;
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
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{idEmpleado=").append(idEmpleado);
        sb.append(", sueldo=").append(sueldo);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
}
