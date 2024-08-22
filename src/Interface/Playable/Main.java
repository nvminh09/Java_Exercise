package Interface.Playable;
public class Main {
    public static void main(String[] args) {
        Playable football = new Football();
        Playable volleyball = new Volleyball();
        Playable basketball = new Basketball();
        football.play();
        volleyball.play();
        basketball.play();
    }
}