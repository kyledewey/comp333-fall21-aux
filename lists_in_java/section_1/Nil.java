// [].append(...)
// null: billion-dollar mistake
//
// Object obj = ...;
// 
public class Nil implements ImmutableList {
    public Nil() {}

    public boolean equals(final Object other) {
        return other instanceof Nil;
    } // equals
    
    public String toString() {
        return "Nil";
    } // toString

    public int hashCode() {
        return 0;
    } // hashCode

    public boolean isEmpty() {
        return true;
    }

    public ImmutableList take(int numElements) {
        return new Nil();
    }
} // Nil
    
