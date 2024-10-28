class Estudiante {
    private String nombre;
    private String id;

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    public Estudiante(String nombre, String id) {
        this(nombre);
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String verEstudiante() {
        return "Información del Estudiante:\nNombre: " + getNombre() + "\nID: " + getId() + "\n";
    }
}