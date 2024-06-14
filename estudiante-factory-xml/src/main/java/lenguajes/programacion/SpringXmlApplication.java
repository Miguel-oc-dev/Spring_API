package lenguajes.programacion;

import lenguajes.programacion.model.Estudiante;
import lenguajes.programacion.programacion.LenguajeFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringXmlApplication {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "bean-configuration.xml"
        );

        try {
            Estudiante estudiante1 = context.getBean("estudiante1", Estudiante.class);
            estudiante1.getLenguaje().programar();
            System.out.println(estudiante1.toString());
            System.out.println("-------");

            Estudiante estudiante2 = context.getBean("estudiante2", Estudiante.class);
            estudiante2.getLenguaje().programar();
            System.out.println(estudiante2.toString());
            System.out.println("-------");

            // Se realiza el cambio de lenguaje de programacion
            estudiante1.cambiarLenguaje(LenguajeFactory.getInstance().getLenguaje("PHP"));
            estudiante1.getLenguaje().programar();
            System.out.println(estudiante1.toString());
            System.out.println("-------");

            estudiante1.cambiarLenguaje(LenguajeFactory.getInstance().getLenguaje("JAVASCRIPT"));
            estudiante1.getLenguaje().programar();
            System.out.println(estudiante1.toString());
            System.out.println("-------");

            estudiante1.cambiarLenguaje(LenguajeFactory.getInstance().getLenguaje("CPLUSPLUS"));
            estudiante1.getLenguaje().programar();
            System.out.println(estudiante1.toString());
            System.out.println("-------");

            estudiante1.cambiarLenguaje(LenguajeFactory.getInstance().getLenguaje("PYTHON"));
            estudiante1.getLenguaje().programar();
            System.out.println(estudiante1.toString());
            System.out.println("-------");

            estudiante1.cambiarLenguaje(LenguajeFactory.getInstance().getLenguaje("RUBY"));
            estudiante1.getLenguaje().programar();
            System.out.println(estudiante1.toString());
            System.out.println("-------");


        } catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
        }
    }
}
