package spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class TestSpring {

    public static void main(String[] args) {

        //обратимся к аpplicationContext.xml файлу
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        //создадим объект, реализующий интерфейс Music
       /////// Music music = context.getBean("musicBean", Music.class);

        //Внедрим этот объект в наш музыкальный плеер (создадим зависимость)
        //Бин musicBean мы внедряем вручную через конструктор класса МusicPlayer
        // при этом вручную мы создаем новый объект musicPlayer
        //MusicPlayer musicPlayer = new MusicPlayer(musik);

        //Этот музыкальный плеер использует эту зависимость что бы выполнить метод playMusik()
       // musicPlayer.playMusik();

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);

        musicPlayer.playMusicList();

        musicPlayer.setVolume(20);
        boolean  test =  musicPlayer ==  musicPlayer2;
        System.out.println(test);

        System.out.println( musicPlayer.getVolume());
        System.out.println(musicPlayer2.getVolume());

        //musicPlayer.playMusicList();
        //Действия Спринга
       /* MusicPlayer musicPlayer1 = new MusicPlayer();
        musicPlayer1.setMusic(сюда в качестве аргумента передаем musicBean);*/
        //System.out.println(musicPlayer.getName() + " " + musicPlayer.getVolume());
        context.close();
    }
}
