
import java.util.Objects;



public class clase_personal extends clase_persona{

    protected String departamento;

    protected int fechaIngreso;

    protected String puesto;



public clase_personal(){

    super();

}



    public clase_personal(String nombre, String apellido, int edad, String documento, String departamento, int fechaIngreso, String puesto){

        super(nombre, apellido, edad, documento);

         this.departamento = departamento;

        this.fechaIngreso = fechaIngreso;

        this.puesto=puesto;

    }



    public String Getdepartamento(){

        return this.departamento;

    }

    public void Setdepartamento (String departamento){

        this.departamento=departamento;

    }

   public int GetfechaIngreso(){

    return this.fechaIngreso;

   }

   public void SetfechaIngreso(int fechaIngreso){

    this.fechaIngreso=fechaIngreso;

   }

   public String Getpuesto(){

    return this.puesto;

   }

   public void Setpuesto(String puesto){

    this.puesto=puesto;

   }

    public String toString(){

        return "Nombre: "+ nombre +"| Apellido: " + apellido + "| Edad: " + edad +"| Documento: "+ documento + "| Departamento: "+ departamento + "| Fecha de ingreso: "+ fechaIngreso +"| Puesto: "+ puesto;

    }

    public boolean equals(Object o) {

        // 1. Verificación de memoria

        if (this == o) return true;

       

        if (o == null || getClass() != o.getClass()) return false;



        if (!super.equals(o)) return false;

   

        clase_personal personal = (clase_personal) o;

     

        return this.fechaIngreso == personal.fechaIngreso &&

               Objects.equals(this.departamento, personal.departamento) &&

               Objects.equals(this.puesto, personal.puesto);

    }



    @Override

    public int hashCode() {

        return Objects.hash(super.hashCode(), departamento, fechaIngreso, puesto);

    }

}


