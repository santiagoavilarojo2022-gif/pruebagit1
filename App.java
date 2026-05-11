public class App {
    public static void main(String[] args) {
        
        clase_persona persona = new clase_persona("Juan", "Perez", 45, "12345678");
        clase_estudiante estudiante = new clase_estudiante("Ana", "Gomez", 20, "40111222", "Sistemas", 8.5f, "Programación");
        clase_profesor profesor = new clase_profesor("Carlos", "Lopez", 50, "10987654", "Computación", 20, "Algoritmos");
        clase_personal personal = new clase_personal("Maria", "Diaz", 38, "30555666", "RRHH", 2015, "Directora");
        
        clase_materia materia = new clase_materia("Algoritmos Avanzados", 101, 4, profesor);

        System.out.println(persona.toString());
        System.out.println(estudiante.toString());
        System.out.println(profesor.toString());
        System.out.println(personal.toString());
        System.out.println(materia.toString());
    }
}