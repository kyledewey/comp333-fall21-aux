public class Main {
    public static int doComputation(Writer writer) {
        int tempOutput = 32; // some long-lasting computation

        // ad-hoc polymorphism / virtual dispatch / dynamic dispatch
        // specific method that gets called is determined by the
        // runtime type of the object you call it on
        writer.writeThing(tempOutput);

        //
        // virtual table
        // writeThing: offset 0
        // value at offset holds the memory address of the proper
        // writeThing method.
        //
        // Entry e = getVirtualTableEntry(writer, WRITE_THING_OFFSET)
        // Entry e = writer.table[0];
        // call(e, writer, tempOutput);

        // does some computation
        return 42;
    }

    // (Practically all) class-based object-oriented programming languages
    // inheritance === setting up subtypes
    //
    // - Writer (general type)
    //    - FileWriter (subtype)
    //    - NetworkWriter (subtype)
    //    - TerminalWriter (subtype)
    public static Writer makeWriter(boolean userWantsConsole,
                                    String destinationFile,
                                    IpAddress address) {
        if (destinationFile != null) {
            // subtyping polymorphism (can substitute specific type where
            // a general type is wanted)
            return new FileWriter(destinationFile);
        } else if (address != null) {
            return new NetworkWriter(address);
        } else if (userWantsConsole) {
            return new TerminalWriter();
        } else {
            throw new InvalidArgumentException("not sure what to open");
        }
    }
    
    public static void main(String[] args) {
        boolean userWantsConsole = doesUserWantConsole(args);
        String destinationFile = getDestinationFile(args);
        IpAddress address = getIpAddress(args);
        
        Writer writer = makeWriter(userWantsConsole,
                                   destinationFile,
                                   address);
        
        int output = doComputation(writer);

        writer.writeThing(output);

        writer.close();
    }
}
