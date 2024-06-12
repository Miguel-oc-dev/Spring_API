package fes.aragon;

import fes.aragon.model.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Iterator;

@SpringBootApplication
public class SpringXmlApplication {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext(new String[]{
				"bean-configuration.xml","bean-servicio.xml"
		});
		Persona p=(Persona) context.getBean("persona");
		p.setNombre("miguel");
		p.setEdad(34);
		System.out.println(p);
		System.out.println("----------");
		Persona p2=(Persona) context.getBean("personaDos");
		System.out.println(p2);
		System.out.println("----------");
		Persona p3=(Persona) context.getBean("personaTres");
		System.out.println(p3);
		System.out.println("----------");
		Empleado em1=context.getBean("empleadoUno", Empleado.class);
		System.out.println(em1.getNumTrabajador());
		em1.getActividades().realiza();
		em1.setNombre("Rosa");
		em1.setEdad(23);
		System.out.println(em1);
		System.out.println("-------");
		EmpleadoC em4=context.getBean("empleadoCuatro", EmpleadoC.class);
		System.out.println(em4);
		for(Actividades ac: em4.getActividades()){
			ac.realiza();
		}
		System.out.println("-------");
		EmpleadoC em5=context.getBean("empleadoCinco", EmpleadoC.class);
		System.out.println(em5);
		for(Actividades ac: em5.getActividades()){
			ac.realiza();
		}
		System.out.println("-------");
		EmpleadoM em6=context.getBean("empleadoSeis", EmpleadoM.class);
		System.out.println(em6);
		for(Iterator<String> iter = em6.getActividades().keySet().iterator(); iter.hasNext();){
				String llave=iter.next();
			System.out.println("Llave: "+llave);
			em6.getActividades().get(llave).realiza();
		}
	}

}
