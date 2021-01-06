package L12;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {

        //обратимся к аpplicationContextNew.xml файлу
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContextNew.xml");


       /* Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);*/


        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        ClassicalMusic classicalMusic1 = context.getBean("classicalMusic", ClassicalMusic.class);
       /* ClassicalMusic classicalMusic2 = context.getBean("classicalMusic", ClassicalMusic.class);
        System.out.println(classicalMusic1 == classicalMusic2);//проверим что два бина указывают на один и тот же
        //участок памяти, на экран вывелось  tru это означает что скоп Singlton сработал правильно

        //при  prototype выводится false это значит что два бина указывают на разные участки памяти*/



        context.close();
    }
}
