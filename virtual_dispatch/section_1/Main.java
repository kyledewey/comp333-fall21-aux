public class Main {
    // defined on Main class
    // 
    // Main.doComputation(...); // target must be specified;
    //                             target must be a class
    public static int doComputation(Writer writer) {
        // do some computation
        int output = ...; // intended to be some complex calculation
        writer.writeThing(output);

        return 42;
    }

    // -Writer
    //    -TerminalWriter
    //    -FileWriter
    //    -NetworkWriter
    //
    // Writer w = new TerminalWriter();
    public static Writer makeWriter(boolean userWantsConsole,
                                    String destinationFile,
                                    IpAddress address) {
        if (userWantsConsole) {
            // subtyping polymorphism - substituting TerminalWriter for Writer
            return new TerminalWriter();
        } else if (destinationFile != null) {
            return new FileWriter(destinationFile);
        } else if (address != null) {
            return new NetworkWriter(address);
        } else {
            throw new InvalidArgumentException("don't know where to write");
        }
    }
    
    // Takes some arguments from the user
    // Performs some computation
    // Depending on arguments, write output to the console,
    // or to a provided file
    public static void main(String[] args) {
        boolean userWantsConsole = doesUserWantConsole(args);
        String destinationFile = getDestinationFile(args);
        IpAddress address = getIPAddress(args);

        Writer writer = makeWriter(userWantsConsole,
                                   destinationFile,
                                   address);
        
        int output = doComputation(writer);

        // ad-hoc polymorphism / virtual dispatch / dynamic dispatch
        // writeThing calls the specific method on whatever the
        // runtime type of writer is
        writer.writeThing(output);

        writer.close();
    }
}
