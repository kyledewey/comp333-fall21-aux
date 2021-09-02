public class Main {
    // Program performs some computation
    // Program takes command-line arguments -
    // output destination (terminal or a file)
    public static void main(String[] args) {
        boolean userWantsConsole = doesUserWantConsole(args);
        String destinationFile = getDestinationFile(args);

        int output = doComputation();

        if (userWantsConsole) {
            System.out.println(output);
        } else {
            File file = new File(destinationFile);
            FileOutputStream stream = new FileOutputStream(file);
            stream.writeln(output);
            stream.close();
        }
    }
}
