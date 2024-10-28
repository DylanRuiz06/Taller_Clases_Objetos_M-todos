public class Auto {
    String marca;
    String modelo = "Aveo";
    String color = "Negro";
    double cilindraje;

    public String detalleauto(){
        StringBuilder mb = new StringBuilder();
        mb.append("mb.modelo = " + this.modelo + "\n");
        mb.append("mb = " + this.color + "\n");
        mb.append("mb.cilindraje = " + this.cilindraje + "\n");
        mb.append("marca = " + this.marca + "\n");
        return mb.toString();

    }
}
