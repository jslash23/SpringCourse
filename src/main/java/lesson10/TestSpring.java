package lesson10;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {

        //обратимся к аpplicationContextNew.xml файлу
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContextNew.xml");

       /* MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusik();*/

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);
        //У бина computer есть внедренная зависимость musicPlayer
        //эта зависимость внедряется с помощью аннотации @Autowired
        //MusicPlayer это тоже бин у которого есть 2 зависимости classicalMusic, rockMusic
        //эти 2 зависимости внедряется с помощью аннотации @Autowired
        //и уже у бинов rockMusic и classicalMusic нет зависимостей
        //То есть у нас есть цепочка зависимостей Computer -> MusicPlayer -> rockMusic и classicalMusic
        //Spring сначала внедрил зависимости в наш MusicPlayer а уже потом внедрил зависимости в Computer
        //Если например мы выбрали внедрять зависимости через конструктор то мы должны придерживаться
        //этого стиля во всё проекте
        context.close();
    }
}
