package virtualkey;

public class Virtualkeyinstaller {
public static void main(String[] args) {
FileOperations.createFolderIfFolderNotAvailable("Virtualkeyrepostries");
Menu.printWelcomeScreen(" Virtual key ", "**********");
Options.welcomeInput();
}
}