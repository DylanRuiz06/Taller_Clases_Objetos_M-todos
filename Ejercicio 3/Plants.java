public class Plants {
    String nombre;
    String color = "verde";
    String Estado_Flor = "Florecido";
    int cantidad = 1;

    public String detalle() {
        StringBuilder in = new StringBuilder();
        in.append("Tipo de planta: " + this.nombre + "\n");
        in.append("Color de la planta: " + this.color + "\n");
        in.append("Estado de la flor: " + this.Estado_Flor + "\n");
        in.append("Cantidad de la flor: " + this.cantidad + "\n");
        return in.toString();
    }
}