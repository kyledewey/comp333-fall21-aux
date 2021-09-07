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
    
    // Takes some arguments from the user
    // Performs some computation
    // Depending on arguments, write output to the console,
    // or to a provided file
    public static void main(String[] args) {
        boolean userWantsConsole = doesUserWantConsole(args);
        String destinationFile = getDestinationFile(args);
        IpAddress address = getIPAddress(args);

        Writer writer = new Writer(userWantsConsole,
                                   destinationFile,
                                   address);
        
        int output = doComputation(writer);
        writer.writeThing(output);

        writer.close();
    }
}
