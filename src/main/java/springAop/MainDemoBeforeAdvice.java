package springAop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

    public class MainDemoBeforeAdvice {
        public static void main(String[] args) throws Exception {
            ApplicationContext context = new
                    ClassPathXmlApplicationContext("applicationContext.xml");
            Hello hello = (Hello) context.getBean("helloProxy");
            hello.method1();
            hello.method2();
        }
    }
