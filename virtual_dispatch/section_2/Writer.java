public class Writer {
    private final FileOutputStream stream;

    public Writer(final boolean userWantsConsole,
                  final String destinationFile) {
        if (!userWantsConsole) {
            File file = new File(destinationFile);
            stream = new FileOutputStream(file);
        } else {
            stream = null;
        }
    }

    public void writeThing(int thingToWrite) {
        if (stream == null) {
            System.out.println(thingToWrite);
        } else {
            stream.writeln(thingToWrite);
        }
    }

    public void close() {
        if (stream != null) {
            stream.close();
        }
    }
}
