public class Procesadores {
    String marca = "Intel";
    String modelo = "I9";
    int hilos = 12;
    Integer nucleos = 12;

    public String detallecpu(){
        StringBuilder cpu = new StringBuilder();
        cpu.append("La marca del procesador es:  " + this.marca + "\n");
        cpu.append("El modelo del procesador es: " + this.modelo + "\n");
        cpu.append("El procesador tiene " + this.hilos + " hilos \n");
        cpu.append("El procesador tiene " + this.nucleos + " nucleos \n");
        return cpu.toString();
    }

}
