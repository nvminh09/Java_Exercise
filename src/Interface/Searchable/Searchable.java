// Write a Java program to create an interface Searchable with a method search(String keyword) that
// searches for a given keyword in a text document. Create two classes Document and WebPage that
// implement the Searchable interface and provide their own implementations of the search() method.
package Interface.Searchable;
interface Searchable {
    boolean search(String keyword);
}