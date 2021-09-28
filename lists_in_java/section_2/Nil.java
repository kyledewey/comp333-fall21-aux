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

    public int length() {
        return 0;
    }

    public int sum() {
        return 0;
    }
    
    // [].append([1, 2, 3]) ==> [1, 2, 3]
    // [].append([1])       ==> [1]
    // [].append([])        ==> []
    public ImmutableList append(final ImmutableList other) {
        return null;
    }
    
    public boolean contains(final int value) {
        return false;
    }

    public boolean isEmpty() {
        return true;
    }

    // this: Nil
    public ImmutableList addAmount(int amount) {
        return this;
    }

    public ImmutableList drop(int amount) {
        return this;
    }

    public ImmutableList take(int amount) {
        return this;
    }
} // Nil

