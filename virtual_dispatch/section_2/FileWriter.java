public class FileWriter implements Writer {
    private final FileOutputStream stream;

    public FileWriter(final String destinationFile) {
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

    
