import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Mainmain {
    public static void main(String[] args) {

        Personajes pj = new Personajes("Hu Tao", "Pyro", "Lanza", "DPS", 5);

        System.out.println("Info: " + pj.verDetalle());

        Personajes pj2 = new Personajes("Furina","Espada Ligera");

        System.out.println("carrillo.verDetalle() = " + pj2.verDetalle());
    }


}