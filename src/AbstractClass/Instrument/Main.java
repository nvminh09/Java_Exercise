package AbstractClass.Instrument;
public class Main {
    public static void main(String[] args) {
        Instrument violin = new Violin();
        Instrument glockenspiel = new Glockenspiel();
        violin.play();
        violin.tune();
        glockenspiel.play();
        glockenspiel.tune();
    }
}