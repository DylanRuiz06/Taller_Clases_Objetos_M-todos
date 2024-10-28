import java.util.ArrayList;

class Uniuni {
   private String nombreUni;
   private ArrayList<Estudiante> estudiantes;
   private ArrayList<Curso> cursos;

   public Uniuni(String nombreUni) {
      this.nombreUni = nombreUni;
      this.estudiantes = new ArrayList<>();
      this.cursos = new ArrayList<>();
   }

   public void addEstudiante(Estudiante estudiante) {
      estudiantes.add(estudiante);
   }

   public void addCurso(Curso curso) {
      cursos.add(curso);
   }

   public String getNombreUni() {
      return nombreUni;
   }

   public void setNombreUni(String nombreUni) {
      this.nombreUni = nombreUni;
   }

   public String verDetalleUniversidad() {
      StringBuilder detalle = new StringBuilder("Nombre de la Universidad: " + getNombreUni() + "\n");
      detalle.append("Estudiantes matriculados:\n");
      for (Estudiante est : estudiantes) {
         detalle.append(est.getNombre()).append(" - ID: ").append(est.getId()).append("\n");
      }
      detalle.append("\nCursos disponibles:\n");
      for (Curso curso : cursos) {
         detalle.append("Curso: ").append(curso.getMateria()).append("\n");
      }
      return detalle.toString();
   }
}