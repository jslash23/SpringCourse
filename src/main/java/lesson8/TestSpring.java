package lesson8;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {

        //обратимся к аpplicationContext.xml файлу
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

       /* RockMusic rockMusic = context.getBean("musicBean1", RockMusic.class );
        RapMusic rapMusic =context.getBean("musicBean2", RapMusic.class);
        ClassicalMusic classicalMusic = context.getBean("musicBean3", ClassicalMusic.class );*/

       lesson8.MusicPlayer musicPlayer = context.getBean("musicPlayer", lesson8.MusicPlayer.class);
        lesson8.MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);
        lesson8.MusicPlayer musicPlayer3 = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer2.getName());
        System.out.println(musicPlayer3.getName());




        //создадим объект, реализующий интерфейс Music
       /////// Music music = context.getBean("musicBean", Music.class);

        //Внедрим этот объект в наш музыкальный плеер (создадим зависимость)
        //Бин musicBean мы внедряем вручную через конструктор класса МusicPlayer
        // при этом вручную мы создаем новый объект musicPlayer
        //MusicPlayer musicPlayer = new MusicPlayer(musik);

        //Этот музыкальный плеер использует эту зависимость что бы выполнить метод playMusik()
       // musicPlayer.playMusik();

       /* MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);

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
