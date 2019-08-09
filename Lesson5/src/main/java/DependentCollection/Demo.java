package DependentCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext1.xml");
        Person person = (Person) context.getBean("person");
        person.print();

        Person person1 = (Person) context.getBean("person2");
        person1.print();
    }
}