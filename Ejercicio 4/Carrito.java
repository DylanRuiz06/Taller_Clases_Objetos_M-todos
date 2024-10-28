public class Carrito {
    private String marca;
    private String color = "verde";
    private String modelo;
    private int cilindraje;
    private float consumo = 4;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public float getConsumo() {
        return consumo;
    }

    public void setConsumo(float consumo) {
        this.consumo = consumo;
    }

    public String verDetalle() {
        String detalle = "La marca es: " + this.getMarca() + "\n" +
                "El modelo es: " + this.modelo + "\n" +
                "El color es: " + this.color + "\n" +
                "El cilindraje es: " + this.cilindraje;
        return detalle;
    }

    public String acelerar() {
        return "El auto marca " + this.marca + " está acelerando.";
    }

    public String frenar(int kmph) {
        return "El auto modelo " + this.modelo + " está frenando a " + kmph + " km/h.";
    }

    public float capacidadTanque(int cap, float pconsumo) {
        if (pconsumo <= 0) {
            throw new IllegalArgumentException("El consumo por distancia debe ser mayor que cero.");
        }
        return cap * pconsumo;
    }

    public float capacidadTanque(int cap, int pconsumo) {
        return cap * (pconsumo / 100.0f);
    }
}