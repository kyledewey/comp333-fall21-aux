// virtual dispatch

// Current structure: Writer does everything
// New structure:
// -Writer interface, has key methods, but no implementations
//    -TerminalWriter (writes to terminal)
//    -FileWriter     (writes to file)
//    -NetworkWriter  (write to the network)
// public interface Writer

    
public class Writer {
    private final FileOutputStream stream;
    private final Socket socket;
    
    public Writer(final boolean userWantsConsole,
                  final String destinationFile,
                  final IpAddress address) {
        if (userWantsConsole) {
            stream = null;
            socket = null;
        } else if (destinationFile != null) {
            final File file = new File(destinationFile);
            stream = new FileOutputStream(file);
            socket = null;
        } else if (address != null) {
            socket = new Socket(address);
            stream = null;
        } else {
            throw new InvalidArgumentException("not sure what to open");
        }
    }

    public void writeThing(final int thingToWrite) {
        if (stream != null) {
            stream.writeln(thingToWrite);
        } else if (socket != null) {
            socket.writeln(thingToWrite);
        } else {
            System.out.println(thingToWrite);
        }
    }

    // defined on Writer objects
    // Writer w1 = new Writer(...);
    // Writer w2 = new Writer(...);
    // w1.close(); // target must be specified;
    //                target must be an object
    // w2.close();
    public void close() {
        if (stream != null) {
            stream.close();
        } else if (socket != null) {
            socket.close();
        }
    }
}

