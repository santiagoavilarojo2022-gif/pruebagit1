import java.util.Objects;
public class  clase_profesor extends clase_persona{

 protected String especialidad;

 protected int añosExperiencia;

 protected String materiasAsignadas;



public clase_profesor(){

    super();

}



public clase_profesor(String nombre, String apellido, int edad, String documento, String especialidad, int añosExperiencia, String materiasAsignadas){

super(nombre, apellido, edad, documento);

this.especialidad = especialidad;

this.añosExperiencia = añosExperiencia;

this.materiasAsignadas = materiasAsignadas;

}



public String Getespecialidad(){

    return this.especialidad;

}

public void Setespecialidad(String especialidad){

    this.especialidad= especialidad;

}

public int GetañosExperiencia(){

    return this.añosExperiencia;

}

public void SetañosExperiencia(int añosExperiencia){

    this.añosExperiencia= añosExperiencia;

}

public String GetmateriasAsignadas(){

    return this.materiasAsignadas;

}

public void SetmateriasAsignadas(String materiasAsignadas){

    this.materiasAsignadas=materiasAsignadas;

}

public String toString(){

    return "Profesor :"+ nombre + " "+ apellido + "| Edad: " + edad + " | Documento :" + documento+ "| Especialidad : " + especialidad + "| añosExperiencia: " + añosExperiencia + "| MateriasAsignadas :"+ materiasAsignadas ;

}



public boolean equals(Object o) {

        if (this == o) return true;

       

        if (o == null || getClass() != o.getClass()) return false;

       

        if (!super.equals(o)) return false;

       

        clase_profesor profesor = (clase_profesor) o;

       

        return this.añosExperiencia == profesor.añosExperiencia &&

               Objects.equals(this.especialidad, profesor.especialidad) &&

               Objects.equals(this.materiasAsignadas, profesor.materiasAsignadas);

    }



    public int hashCode() {

        return Objects.hash(super.hashCode(), especialidad, añosExperiencia, materiasAsignadas);

    }

}

 