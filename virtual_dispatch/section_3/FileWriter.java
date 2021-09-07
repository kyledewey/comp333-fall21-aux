// Refactoring: cleaning up code; making it easier
// to read, etc.
// FileWriter is a subtype of Writer
public class FileWriter implements Writer {
    private final FileOutputStream stream;

    public FileWriter(String destinationFile) {
        File file = new File(destinationFile);
        stream = new FileOutputStream(file);
    }

    public void writeThing(int thingToWrite) {
        stream.writeln(thingToWrite);
    }

    public void close() {
        stream.close();
    }
}
