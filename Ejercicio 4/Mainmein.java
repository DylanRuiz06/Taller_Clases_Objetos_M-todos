public class Mainmein {
    public static void main(String[] args) {
        Carrito bmw = new Carrito();
        bmw.setMarca("BMW");
        bmw.setColor("negro");
        bmw.setModelo("2.xd");
        bmw.setCilindraje(2);

        System.out.println("Marca: " + bmw.getMarca());
        System.out.println("Color: " + bmw.getColor());
        System.out.println("Modelo: " + bmw.getModelo());
        System.out.println("Cilindraje: " + bmw.getCilindraje());

        System.out.println("Detalle: " + bmw.verDetalle());
        System.out.println("Acelerar: " + bmw.acelerar());
        System.out.println("Frenar a 80 km/h: " + bmw.frenar(80));
        System.out.println("Capacidad del tanque (cap 44, consumo 0.9f): " + bmw.capacidadTanque(44, 0.9f));
        System.out.println("Capacidad del tanque (cap 44, consumo 90): " + bmw.capacidadTanque(44, 90));
    }
}
