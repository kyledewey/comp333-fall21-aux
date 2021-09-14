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

    public int length() {
        return 0;
    }

    public int sum() {
        return 0;
    }
    
    public ImmutableList append(final ImmutableList other) {
        return null;
    }
    
    public boolean contains(final int value) {
        return false;
    }

    public boolean isEmpty() {
        return false;
    }

    // [1, 2, 3].addAmount(4)
    // 
    // amount: 4
    // head: 1
    // tail: [2, 3]
    // this: [1, 2, 3]
    // return value: [5, 6, 7]
    public ImmutableList addAmount(int amount) {
        // rest = [2, 3].addAmount(4)
        // rest = new Cons(2, new Cons(3, new Nil())).addAmount(4)
        // rest: [6, 7]
        ImmutableList rest = tail.addAmount(amount);
        return new Cons(head + amount, rest); // [5, 6, 7]
    }

    // [8, 9, 10].drop(1) ==> [9, 10].drop(0) ==> [9, 10]
    public ImmutableList drop(int amount) {
        if (amount <= 0) {
            return this;
        } else {
            return tail.drop(amount - 1);
        }
    }
} // Cons
