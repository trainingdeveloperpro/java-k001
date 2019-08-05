package DIMap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beansMap.xml");
        Person person = (Person) context.getBean("person");
        person.print();
        Person person1 = (Person) context.getBean("person2");
        person1.print();
    }
}
