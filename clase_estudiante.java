import java.util.Objects;
 class clase_estudiante extends clase_persona {

    protected String carrera;
    protected float promedio;
    protected String materias;
public clase_estudiante (String nombre, String apellido, int edad, String documento, String carrera, float promedio, String materias){

super( nombre,  apellido,  edad,  documento);

this.carrera=carrera;

this.promedio=promedio;

this.materias=materias;

}



public String Getcarrera(){

    return this.carrera;

}

public void Setcarrera(String carrera){

    this.carrera=carrera;

}

public float Getpromedio(){

    return this.promedio;

}

public void Setpromedio(float promedio){

    this.promedio=promedio;

}

public String Getmaterias(){

    return this.materias;

}

public void Setmaterias(String materias){

    this.materias=materias;

}

public String toString(){

return "Alumno: " + nombre + " " + apellido + "| Edad: " + edad + "| Documento: " + documento +"| Carrera :" + carrera + "| Promedio: " + promedio +"| Materias: " + materias;

}

public boolean equals(Object o) {

        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

       

        if (!super.equals(o)) return false;

       

        clase_estudiante estudiante = (clase_estudiante) o;



        return Float.compare(estudiante.promedio, this.promedio) == 0 &&

               Objects.equals(this.carrera, estudiante.carrera) &&

               Objects.equals(this.materias, estudiante.materias);

    }



    public int hashCode() {

        return Objects.hash(super.hashCode(), carrera, promedio, materias);

    }
}