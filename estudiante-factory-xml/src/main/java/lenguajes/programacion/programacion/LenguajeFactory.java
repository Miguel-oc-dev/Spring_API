package lenguajes.programacion.programacion;

import lenguajes.programacion.model.Lenguajes;

public class LenguajeFactory {
    private static LenguajeFactory lenguajeFactory = new LenguajeFactory();

    public static LenguajeFactory getInstance() {
        return lenguajeFactory;
    }

    public LenguajeProgramacion getLenguaje(String tipo) throws IllegalAccessException {
        if(tipo.equalsIgnoreCase("JAVA")) { // equalsIgnoreCase se utliza para que no se distinga entre mayusculas y minusculas
            return new Java();
        } else if(tipo.equalsIgnoreCase("PHP")) {
            return new PHP();
        } else if(tipo.equalsIgnoreCase("JAVASCRIPT")) {
            return new JavaScript();
        } else if(tipo.equalsIgnoreCase("CPLUSPLUS")) {
            return new CPlusPlus();
        } else if(tipo.equalsIgnoreCase("PYTHON")) {
            return new Python();
        } else if(tipo.equalsIgnoreCase("RUBY")) {
            return new Ruby();
        }
        throw new IllegalAccessException("No existe ese lenguaje de programación");
    }

}
