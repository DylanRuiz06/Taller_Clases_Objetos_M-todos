import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Mainmain {
    public static void main(String[] args) {

        Uniuni uni = new Uniuni("Universidad de Las Américas");

        Estudiante stu = new Estudiante("Carlos Perez", "I199");
        Curso cur = new Curso("Programación", 9, 7, 8);


        uni.addEstudiante(stu);
        uni.addCurso(cur);


        System.out.println("Información de la universidad:");
        System.out.println(uni.verDetalleUniversidad());

        System.out.println("Información del estudiante:");
        System.out.println(stu.verEstudiante());

        System.out.println("Información del curso:");
        System.out.println(cur.verDetalleCurso());

        JOptionPane.showMessageDialog(null, uni.verDetalleUniversidad());
        JOptionPane.showMessageDialog(null, stu.verEstudiante());
        JOptionPane.showMessageDialog(null, cur.verDetalleCurso());
    }
}