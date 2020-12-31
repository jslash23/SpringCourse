package spring;

public class MusicPlayer {
    private Musik musik;

    //IoC
    public MusicPlayer(Musik musik) {
        this.musik = musik;
    }
    public void playMusik(){
        System.out.println("Playing song: " + musik.getSong() + ",  Artist: " + musik.getNameOfArtist() +
                ",  age Of Artist: " + musik.getAgeOfArtist());
    }
}
