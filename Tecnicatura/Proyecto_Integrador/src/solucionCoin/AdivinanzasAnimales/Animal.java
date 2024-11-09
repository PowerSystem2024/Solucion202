class Animal {
    private String nombre;
    private String descripcion;
    private String[] opciones;
    private String respuestaCorrecta;

    public Animal(String nombre, String descripcion, String[] opciones, String respuestaCorrecta) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.opciones = opciones;
        this.respuestaCorrecta = respuestaCorrecta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String[] getOpciones() {
        return opciones;
    }

    public String getRespuestaCorrecta() {
        return respuestaCorrecta;
    }
}