import javax.print.Doc;

// Clases:
public class Doctor {
    // Atributos:
    static int id = 0;
    String name;
    String email;
    String speciality;

    Doctor(/* parámetros */) {
        // Instrucciones que se ejecutan al crear/instanciar
        // un nuevo objeto con la clase Doctor...
        System.out.println("Imprimiendo constructor");
        id++;
    }

    public Doctor(String name, String speciality) {
        this.name = name;
        this.speciality = speciality;
    }

    // Comportamientos (métodos):
    public void showName() {
        // Instrucciones...
        System.out.println(name);
    }

    public void showId(){
        System.out.println("El ID del doctor es:" + id);
    }

}