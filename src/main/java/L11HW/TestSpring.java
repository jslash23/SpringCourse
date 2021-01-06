package L11HW;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class TestSpring {

    public static void main(String[] args) {

        //обратимся к аpplicationContextNew.xml файлу
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContextNew.xml");


       MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
      String song =  musicPlayer.playMusik(MusicType.CLASSICAL);
       System.out.println(song);



       /* Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);*/

        context.close();
    }
}
