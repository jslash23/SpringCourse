package lesson11;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {

        //обратимся к аpplicationContextNew.xml файлу
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContextNew.xml");


        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);

        context.close();
    }
}
