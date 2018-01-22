package training.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import training.spring.impls.robot.ModelT1000;

public class Start {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		ModelT1000 t1000 = (ModelT1000) context.getBean("t1000Empty");
		t1000.dance();
        t1000.fire();
	}
}
