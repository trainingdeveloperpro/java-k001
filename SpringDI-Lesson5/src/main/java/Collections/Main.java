package Collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationConText.xml");
        System.out.println("Inject by constructor");
        Person person1 = (Person) context.getBean("person1");
        person1.print();
        System.out.println("Inject by setter");
        Person person2 = (Person) context.getBean("person2");
        person2.print();
    }
}
