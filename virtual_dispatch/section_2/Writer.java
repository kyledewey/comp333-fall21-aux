public class Writer {
    private final FileOutputStream stream;
    private final Socket socket;
    
    public Writer(final boolean userWantsConsole,
                  final String destinationFile,
                  final IPAddress address) {
        if (!userWantsConsole && destinationFile != null) {
            File file = new File(destinationFile);
            stream = new FileOutputStream(file);
            socket = null;
        } else if (!userWantsConsole && address != null) {
            socket = new Socket(address);
            stream = null;
        } else {
            stream = null;
            socket = null;
        }
    }

    public void writeThing(int thingToWrite) {
        if (stream != null) {
            stream.writeln(thingToWrite);
        } else if (socket != null) {
            socket.writeln(thingToWrite);
        } else {
            System.out.println(thingToWrite);
            stream.writeln(thingToWrite);
        }
    }

    public void close() {
        if (stream != null) {
            stream.close();
        } else if (socket != null) {
            socket.close();
        }
    }
}
