package me.springframework.sfgdi;

import me.springframework.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args)
	{
		ApplicationContext appContext = SpringApplication.run(SfgDiApplication.class, args);

		I18nController i18nController = (I18nController) appContext.getBean("i18nController");
		System.out.println(i18nController.printGreeting());

		MyController myController = (MyController) appContext.getBean("myController");

		System.out.println("--------------- Dependency Injection with SpringBoot ---------------");

		System.out.println("--------------- Primary Bean D.I.");
		System.out.println(myController.sayHello());

		System.out.println("--------------- Property based D.I.");
		PropertyInjectedController propInjCntr = (PropertyInjectedController) appContext.getBean("propertyInjectedController");
		System.out.println(propInjCntr.printGreeting());

		System.out.println("--------------- Setter based D.I.");
		SetterInjectedController setInjCntr = (SetterInjectedController) appContext.getBean("setterInjectedController");
		System.out.println(setInjCntr.printGreeting());

		System.out.println("--------------- Constructor based D.I.");
		ConstructorInjectedController conInjCntr = (ConstructorInjectedController) appContext.getBean("constructorInjectedController");
		System.out.println(conInjCntr.printGreeting());

		System.out.println("--------------- Demonstration of PRIMARY BEAN'S usage");

	}

}
