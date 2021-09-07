// virtual dispatch

// Current structure: Writer does everything
// New structure:
// -Writer interface, has key methods, but no implementations
//    -TerminalWriter (writes to terminal)
//    -FileWriter     (writes to file)
//    -NetworkWriter  (write to the network)

// interfaces are very similar to abstract classes
public interface Writer {
    public void writeThing(int thing);
    public void close();
}
