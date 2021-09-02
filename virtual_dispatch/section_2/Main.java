public class Main {
    public static int doComputation(Writer writer) {
        int tempOutput = 32; // some long-lasting computation

        writer.writeThing(tempOutput);

        // does some computation
        return 42;
    }
    
    public static void main(String[] args) {
        boolean userWantsConsole = doesUserWantConsole(args);
        String destinationFile = getDestinationFile(args);
        IpAddress address = getIpAddress(args);
        
        Writer writer = new Writer(userWantsConsole, destinationFile, address);
        
        int output = doComputation(writer);

        writer.writeThing(output);

        writer.close();
    }
}
