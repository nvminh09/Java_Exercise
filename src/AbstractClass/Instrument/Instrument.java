// Write a Java program to create an abstract class Instrument with abstract methods play() and tune().
// Create subclasses for Glockenspiel and Violin that extend the Instrument class and implement
// the respective methods to play and tune each instrument.
package AbstractClass.Instrument;
abstract class Instrument {
    public abstract void play();
    public abstract void tune();
}