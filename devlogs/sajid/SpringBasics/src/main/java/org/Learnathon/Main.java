package org.Learnathon;

import org.Learnathon.BeanLifecycle.Cake;
import org.Learnathon.BeanLifecycle.Coke;
import org.Learnathon.BeanLifecycle.File;
import org.Learnathon.ConstructorInjection.Person;
//import org.Learnathon.SetterInjection.Employee;
import org.Learnathon.AutoWiring.Employee;
import org.Learnathon.SetterInjection.Question;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
   //   AbstractApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//       Employee employee = (Employee) context.getBean("employee");
//         System.out.println(employee);
//        Question question=(Question) context.getBean("question",Question.class);
//        question.displayInfo();
//        Person person=(Person)context.getBean("person",Person.class);
//        System.out.println(person.toString());
//            Cake cake=(Cake)context.getBean("cake",Cake.class);
//            Coke coke=(Coke)context.getBean("coke",Coke.class);
//            File file=(File)context.getBean("file",File.class);
//            context.registerShutdownHook();
        ApplicationContext context = new ClassPathXmlApplicationContext("config2.xml");
        Employee employee = context.getBean("employee", Employee.class);

    }
    }
