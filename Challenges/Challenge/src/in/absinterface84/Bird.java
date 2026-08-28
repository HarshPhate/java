package in.absinterface84;

public abstract class Bird implements Flyable{

    private final String Breed;

    public Bird(String breed) {
        Breed = breed;
    }

    public String getBreed() {
        return Breed;
    }
}
