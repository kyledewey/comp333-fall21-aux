public class FileWriter implements Writer {
    private final FileOutputStream stream;

    public FileWriter(final String destinationFile) {
        final File file = new File(destinationFile);
        stream = new FileOutputStream(file);
    }
    
    public void writeThing(int thing) {
        stream.writeln(thing);
    }

    public void close() {
        stream.close();
    }
}
