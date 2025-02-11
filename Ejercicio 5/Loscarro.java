public class Loscarro {
    //atributos - propiedades- estados una banda
    private String marca;
    private String modelo;
    private String color;
    private int cilindraje;

    /* constructores, tiene el mismo nombre de la clase y comienza con mayus, puede recibir parametros
    pero no devuelve like a void */

    public Loscarro() {
    }

    public Loscarro(String marca) {
        this.marca = marca;
    }

    public Loscarro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    //metodos set y getr

    public String getMarca() {
        return marca;
    }

    /* public void setMarca(String marca) {
        this.marca = marca;
    }  useless */

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    //Metodos propio/calculos
    //camell case, get para mostrar, set para asignar
    public String verDetalle(){
        String infocar = "\nInformacion del vehiculo: \nMarca: " + getMarca() + "\n" +
        "Modelo: " + getModelo() + "\n" +
        "Color: " + getColor() + "\n" +
        "Cilindraje:" + getCilindraje();
        return infocar;
    }
    //Modifcicacion de metodods nativos

    /*clase "object", clase principal sobre la cual se fundamenta la POO, compilado e interpretado
    Bycode - punto intermedio entre programa fuente y programa objeto
    carillo == carillo2: false */
}
