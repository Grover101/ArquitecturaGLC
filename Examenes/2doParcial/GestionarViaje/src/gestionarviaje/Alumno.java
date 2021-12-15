package gestionarviaje;

/**
 *
 * @author grover
 */
public class Alumno {
    public String celularIdentidad;
    public String nombreCompleto;
    public Sexo sexo;

    public Alumno(String celularIdentidad, String nombreCompleto, Sexo sexo) {
        this.celularIdentidad = celularIdentidad;
        this.nombreCompleto = nombreCompleto;
        this.sexo = sexo;
    }

    public String getCelularIdentidad() {
        return celularIdentidad;
    }

    public void setCelularIdentidad(String celularIdentidad) {
        this.celularIdentidad = celularIdentidad;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }
    
    
}

enum Sexo {
    Masculino,
    Femenino
}