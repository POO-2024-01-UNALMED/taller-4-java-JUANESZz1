package classroom;

public class Grupo {

    public Persona[] estudiantes;
    public Persona profesor;
    public Asignatura asignatura;
    public final int codigo;
    public String horario;

    public Grupo(Persona[] estudiantes, Persona profesor, Asignatura asignatura, int codigo, String horario) {
        this.estudiantes = estudiantes;
        this.profesor = profesor;
        this.asignatura = asignatura;
        this.codigo = codigo;
        this.horario = horario;
    }

    public Grupo(int cantidadEstudiantes, Persona profesor, Asignatura asignatura, int codigo, String horario) {
        this.estudiantes = new Persona[cantidadEstudiantes];
        this.profesor = profesor;
        this.asignatura = asignatura;
        this.codigo = codigo;
        this.horario = horario;
    }

    public Grupo(Persona[] estudiantes, Persona profesor, Asignatura asignatura) {
        this.estudiantes = estudiantes;
        this.profesor = profesor;
        this.asignatura = asignatura;
        this.codigo = 0;
        this.horario = "";
    }

    void cambiarEstudiante(Persona estudianteViejo, Persona estudianteNuevo) {
        if (estudianteViejo != null) {
            for (int i = 0; i < estudiantes.length; i++) {
                if (estudiantes[i] != null && estudiantes[i].getCedula() == estudianteViejo.getCedula()) {
                    estudiantes[i] = estudianteNuevo;
                    break;
                }
            }
        }
    }

    void cambiarEstudiante(int indice, Persona estudiante) {
        if (indice >= 0 && indice < estudiantes.length) {
            estudiantes[indice] = estudiante;
        }
    }
}

