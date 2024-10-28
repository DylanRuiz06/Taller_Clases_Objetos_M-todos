public class Autotest {
    public static void main(String[] args) {
        Auto auto = new Auto();
        auto.marca = "Chevrolet";
        auto.color = "Azul";
        auto.cilindraje = 3.2;

        Auto mb =new Auto();
        mb.marca = "Merdedes Benz";
        mb.color = "Rojo";
        mb.modelo = "2B2";
        mb.cilindraje = 3.2;
        System.out.println(mb.detalleauto());
    }
}
