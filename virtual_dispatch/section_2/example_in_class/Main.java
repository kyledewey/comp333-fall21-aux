public class Main { // Main.java
  public static void main(String[] args) {
    Conditional c = (randomBoolean()) ? new SubConditionA() : new SubConditionB();
    c.operation();
  }
}
