package spring;

public class RapMusic implements Musik {
    @Override
    public String getNameOfArtist() {
        return "Basta";
    }

    @Override
    public int getAgeOfArtist() {
        return 30;
    }

    @Override
    public String getSong() {
        return "Tak plachet Vesna";
    }
}
