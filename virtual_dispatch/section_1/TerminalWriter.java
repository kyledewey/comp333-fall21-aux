public class TerminalWriter implements Writer {
    public void writeThing(final int thing) {
        System.out.println(thing);
    }

    public void close() {}
}
