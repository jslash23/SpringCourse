package lesson8;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {

    List<Music> musicList = new ArrayList<>();

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }


    private String name;
    private int volume;

    public void doMyInit(){
        System.out.println("Doing my initialisation");
    }

    public void doMyDestroy(){
        System.out.println("Doing my destroy!");
    }



    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    //IoC
    //В конструктор MusicPlayer принимается объект реализующий интерфейс Music


    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public MusicPlayer(){
    }

    public void playMusicList(){
        for(Music music : musicList) {
            System.out.println("Playing: " + music.getSong() + "  " + music.getNameOfArtist());
        }
    }


    @Override
    public String toString() {
        return "MusicPlayer{" +
                "musicList=" + musicList +
                ", name='" + name + '\'' +
                ", volume=" + volume +
                '}';
    }
}
