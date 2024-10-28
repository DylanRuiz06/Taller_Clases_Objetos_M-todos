public class Procesadorestest {
    public static void main(String[] args) {
    Procesadores cpu = new Procesadores();
    cpu.marca = "AMD";
    cpu.modelo = "Ryzen 9500";
    cpu.hilos = 12;
    cpu.nucleos = 12;
    System.out.println(cpu.detallecpu());
}}