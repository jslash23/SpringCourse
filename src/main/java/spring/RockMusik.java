package spring;

public class RockMusik implements Musik {
    @Override
    public String getSong() {
        return "Corn";
    }

    @Override
    public String getNameOfArtist() {
        return "Jack";
    }

    @Override
    public int getAgeOfArtist() {
        return 41;
    }
}
