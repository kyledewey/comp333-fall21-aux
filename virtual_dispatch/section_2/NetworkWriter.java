public class NetworkWriter implements Writer {
    private final Socket socket;

    public NetworkWriter(final IpAddress address) {
        socket = new Socket(address);
    }

    public void writeThing(int thingToWrite) {
        socket.writeln(thingToWrite);
    }

    public void close() {
        socket.close();
    }
}
