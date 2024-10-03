package Teoria.PasoPorReferencia;

public class PasoPorReferncia {
    public static void main(String[] args) {
        Persona estudiante = new Persona("nacho", 32);
        System.out.println(estudiante.getNombre());

        //pasamos por referencia al objeto
        cambioValor(estudiante);

        System.out.println(estudiante.getNombre());

        Persona estudiante2 = new Persona();
        estudiante2 = cambiarElValor(estudiante);
        System.out.println("estudiante2.getNombre() = " + estudiante2.getNombre());
    }


    public static void cambioValor(Persona persona) {
        persona.setNombre("Ignacio");
    }

    public static Persona cambiarElValor(Persona persona) {
        persona.setNombre("velazquez");
        return persona;
    }
}
