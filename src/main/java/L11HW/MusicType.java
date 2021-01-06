package L11HW;

public enum MusicType {
     CLASSICAL,
     ROCK;

     public static MusicType getRandom() {
          return values()[(int) (Math.random() * values().length)];
     }

}
