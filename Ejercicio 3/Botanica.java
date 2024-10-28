public class Botanica {
    public static void main(String[] args) {
        Plants rosa = new Plants();
        rosa.nombre = "rosa";
        rosa.color = "azul";
        rosa.cantidad = 6;
        rosa.Estado_Flor = "Florecido";
        System.out.println(rosa.detalle());

        Plants claveles = new Plants();
        claveles.nombre = "clavel";
        claveles.color = "blanco";
        claveles.cantidad = 12;
        claveles.Estado_Flor = "No florecido";
        System.out.println(claveles.detalle());

        Plants pinos = new Plants();
        pinos.nombre = "pino";
        pinos.color = "verde oscuro";
        pinos.cantidad = 5;
        pinos.Estado_Flor = "No florecido";
        System.out.println(pinos.detalle());

        Plants orquideas = new Plants();
        orquideas.nombre = "orquidea";
        orquideas.color = "morado";
        orquideas.cantidad = 3;
        orquideas.Estado_Flor = "Florecido";
        System.out.println(orquideas.detalle());
    }
}