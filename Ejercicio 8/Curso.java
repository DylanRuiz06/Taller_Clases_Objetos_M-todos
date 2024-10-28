class Curso {
    private String materia;
    private float nota;
    private float nota2;
    private float nota3;

    public Curso(String materia) {
        this.materia = materia;
    }

    public Curso(String materia, float nota) {
        this(materia);
        this.nota = nota;
    }

    public Curso(String materia, float nota, float nota2) {
        this(materia, nota);
        this.nota2 = nota2;
    }

    public Curso(String materia, float nota, float nota2, float nota3) {
        this(materia, nota, nota2);
        this.nota3 = nota3;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNota3() {
        return nota3;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }

    public String verDetalleCurso() {
        return "Información del Curso:\nMateria: " + getMateria() +
                "\nNota 1: " + getNota() +
                "\nNota 2: " + getNota2() +
                "\nNota 3: " + getNota3() + "\n";
    }
}
