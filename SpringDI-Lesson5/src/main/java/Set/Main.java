package Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationConText.xml");
        System.out.println("Inject by constructor");
        PhoneNumber list1 = (PhoneNumber)context.getBean("list1");
        list1.print();
        System.out.println("Inject by setter");
        PhoneNumber list2 = (PhoneNumber)context.getBean("list2");
        list2.print();
    }
}
