// TerminalWriter is a subtype of Writer
public class TerminalWriter implements Writer {
    public TerminalWriter() {}

    public void writeThing(int thingToWrite) {
        System.out.println(thingToWrite);
    }

    public void close() {}
}
