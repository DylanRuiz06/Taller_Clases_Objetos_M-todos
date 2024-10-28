public class Personajes {
    private String nombre;
    private String elemento;
    private String arma;
    private String rol;
    private int estrellas;
    static String juego = "GenshinImpact";
    public Personajes(){

    }

    public Personajes(String nombre) {
        this.nombre = nombre;
    }

    public Personajes(String nombre, String arma) {
        this (nombre);
        this.arma = arma;
    }

    public Personajes(String nombre, String arma, String rol) {
        this(nombre, arma);
        this.rol = rol;
    }

    public Personajes(String nombre, String arma, String rol, int estrellas) {
        this(nombre , arma, rol);
        this.estrellas = estrellas;
    }

    public Personajes(String nombre, String elemento, String arma, String rol, int estrellas) {
        this(nombre ,arma,rol,estrellas);
        this.elemento = elemento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public int getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }

    public String getElemento() {
        return elemento;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }

    public String verDetalle() {
        String info = "\nInformacion del personaje: \n Nombre del personaje: " + getNombre() + "\n" +
                "Elemento: " + getElemento() + "\n" +
                "Arma: " + getArma() + "\n" +
                "Rol: " + getRol() + "\n" +
                "Estrellas: " + getEstrellas() + "\n" +
                "Juego:" + Personajes.juego;
        return info;
    }
}
