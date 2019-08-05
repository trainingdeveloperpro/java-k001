package Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationConText.xml");
        System.out.println("Inject by constructor");
        Class class1 = (Class)context.getBean("class1");
        class1.print();
        System.out.println("Inject by setter");
        Class class2 = (Class)context.getBean("class2");
        class2.print();
    }
}
