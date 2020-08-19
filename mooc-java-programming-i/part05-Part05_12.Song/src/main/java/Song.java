
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }

    public boolean equals(Object compared) {
        // if the variables are located in the same position, they are equal
        if (this == compared) {
            return true;
        }

        // if the type of the compared object is not SimpleDate, the objects are not equal
        if (!(compared instanceof Song)) {
            return false;
        }

        // convert the Object type compared object
        // into an SimpleDate type object called comparedSimpleDate
        Song comparedInfo = (Song) compared;

        // if the values of the object variables are the same, the objects are equal
        if (this.artist.equals(comparedInfo.artist) &&
                this.name.equals(comparedInfo.name) &&
                this.durationInSeconds == comparedInfo.durationInSeconds){
            return true;
        }
        return false;

    }




}
