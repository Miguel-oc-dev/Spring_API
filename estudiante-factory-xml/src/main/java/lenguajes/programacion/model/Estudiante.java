package lenguajes.programacion.model;

import lenguajes.programacion.programacion.LenguajeProgramacion;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Estudiante {
    private String nombre;
    private int edad;
    private int numCuenta;
    private LenguajeProgramacion lenguaje;

    // Se crea un metodo para realizar el cambio de lenguaje
    public void cambiarLenguaje(LenguajeProgramacion nuevoLenguaje) {
        this.lenguaje = nuevoLenguaje;
        // getClass().getSimpleName() sirve para mostrar el nombre del lenguaje de manera simple y conciso
        System.out.println("El estudiante ha cambiado de lenguaje a " +nuevoLenguaje.getClass().getSimpleName());
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", numCuenta=" + numCuenta +
                ", lenguaje=" + lenguaje.getClass().getSimpleName() +
                '}';
    }
}
