package lesson9;


public class MusicPlayer {

    private Music music;

    private String name;
    private int volume;

    public MusicPlayer(Music music) {
        this.music = music;
    }

public void playMusik (){
    System.out.println("bam-bam-bambambum       " +  music.getSong());
}


    //IoC
    //В конструктор MusicPlayer принимается объект реализующий интерфейс Music

}
