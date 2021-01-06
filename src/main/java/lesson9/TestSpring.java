package lesson9;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {

        //обратимся к аpplicationContextNew.xml файлу
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContextNew.xml");


        //У нас создался объект мы его поместили в musicPlayer и
       Music music = context.getBean("rapMusic",Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(music);


        Music music2 = context.getBean("classicalMusic", Music.class);
        MusicPlayer classicalMusicPlayer = new MusicPlayer(music2);

        Music music3 = context.getBean("rockMusic", Music.class);
        MusicPlayer musicPlayer3 = new MusicPlayer(music3);

        //выполнили метод playMusik();
        musicPlayer.playMusik();
        classicalMusicPlayer.playMusik();
        musicPlayer3.playMusik();

        context.close();
    }
}
