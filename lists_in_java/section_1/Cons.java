// [1, ...].append(...)
public class Cons implements ImmutableList {
    // ---BEGIN INSTANCE VARIABLES---
    public final int head;
    public final ImmutableList tail;
    // ---END INSTANCE VARIABLES---

    public Cons(final int head, final ImmutableList tail) {
        this.head = head;
        this.tail = tail;
    } // Cons

    public boolean equals(final Object other) {
        if (other instanceof Cons) {
            final Cons otherCons = (Cons)other;
            return head == otherCons.head && tail.equals(otherCons.tail);
        } else {
            return false;
        }
    } // equals
    
    public String toString() {
        return "Cons(" + head + ", " + tail.toString() + ")";
    } // toString

    public int hashCode() {
        return sum();
    } // hashCode

    public boolean isEmpty() {
        return false;
    }

    // [8, 9, 7].take(2) ==> 8 + [9, 7].take(1) ==> [8, 9]
    public ImmutableList take(int numElements) {
        // head: 8
        if (numElements <= 0) {
            return new Nil();
        } else {
            // rest: [9]
            ImmutableList rest = tail.take(numElements - 1);
            return new Cons(head, rest);
        }
    }
} // Cons
