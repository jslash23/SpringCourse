package spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.Musik;

public class TestSpring {

    public static void main(String[] args) {
        //обратимся к аpplicationContext.xml файлу
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        //создадим объект, реализующий интерфейс Music
        Musik musik = context.getBean("musicBean", Musik.class);


        //Внедрим этот объект в наш музыкальный плеер (создадим зависимость)
        MusicPlayer musicPlayer = new MusicPlayer(musik);

        //Этот музыкальный плеер использует эту зависимость что бы выполнить метод playMusik()
        musicPlayer.playMusik();
        context.close();
    }
}
