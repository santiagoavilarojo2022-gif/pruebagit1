import java.util.Objects;



public class clase_materia  {

protected String nombre;

protected int codigos;

protected int creditos;

protected clase_profesor profesor;



public clase_materia(){

}



public clase_materia(String nombre, int codigos, int creditos, clase_profesor profesor ){

    this.nombre=nombre;

    this.codigos=codigos;

    this.creditos=creditos;

    this.profesor=profesor;

}



public String Getnombre(){

    return this.nombre;

}

public void Setnombre(String nombre){

    this.nombre=nombre;

}

public int Getcodigos(){

    return this.codigos;

}

public void Setcodigos(int codigos){

    this.codigos=codigos;

}

public int Getcreditos(){

    return this.creditos;

}

public void Setcreditos(int creditos){

    this.creditos=creditos;

}

public clase_profesor Getprofesor(){

    return this.profesor;

}

public void Setprofesor (clase_profesor profesor){

    this.profesor=profesor;

}

public String toString(){

    return "Nombre: " + nombre +"| Codigo: "+ codigos +"| Creditos: " + creditos +"Profesor: " + profesor ;

}

public boolean equals(Object o) {

        if (this == o) return true;

       

        if (o == null || getClass() != o.getClass()) return false;

       

        clase_materia materia = (clase_materia) o;

       

        return this.codigos == materia.codigos &&

               this.creditos == materia.creditos &&

               Objects.equals(this.nombre, materia.nombre) &&

               Objects.equals(this.profesor, materia.profesor);

    }



    public int hashCode() {

        return Objects.hash(nombre, codigos, creditos, profesor);

    }

} 