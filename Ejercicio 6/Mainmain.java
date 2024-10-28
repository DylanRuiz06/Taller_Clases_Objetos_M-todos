
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Mainmain {
    public static void main(String[] args) {
    //instanciar:
    Loscarro carrillo = new Loscarro("BMW", "2Xd", "negro", 233);
    /*carrillo.setModelo("2Xd");
    carrillo.setColor("Blanco");
    carrillo.setCilindraje(4);*/
    //metodo para imprimir:
    System.out.println("Info: " + carrillo.verDetalle());
    /*set - get ó constructos con parametros, los dos estan bien, elegir el que mas te pinte
    otro obejto on las mismas carcateristicas pero no es igual al primero "carillo":     */

    Loscarro carrillo2 = new Loscarro("BMW2","2xd2");
    //whitout set, de puro poner constructores
    carrillo2.setColor("Blanco");
    carrillo2.setCilindraje(4);
    System.out.println("carrillo.verDetalle() = " + carrillo2.verDetalle());
    }
}
