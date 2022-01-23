package virtualkey;

public class Menu {  
	 public static void printWelcomeScreen(String application, String developer) { 
	  String company = String.format("Welcome to"+application + "This application was developed by "+ developer); 
	  String appFeatures = "You can use this application to :-\n" 
	       + " Access all files in the \"Virtualkeyrepostries\" folder\n" 
	       + " Search, add, or delete files in \"Virtualkeyrepostries\" folder.\n" 
	       + " Please enter correct filenames for searching or deleting files"; 
	  //System.out.println(company);  
	  System.out.println(appFeatures); 
	 }  
	 public static void menu() { 
	  String menu = " Select any option number from below and press Enter\n" 
	    + "1) Access all files inside \"Virtualkeyrepostries\" folder\n"  
	    + "2) Display menu for File operations\n" 
	    + "3) Exit program\n"; 
	  System.out.println(menu);  
	 }  
	 public static void menuOptions() { 
	  String fileMenu = "\n Select any option number from below and press Enter \n" 
	    + "1) Add new file to \"Virtualkeyrepostries\" folder\n" 
	    + "2) Delete a file from \"Virtualkeyrepostries\" folder\n" 
	    + "3) Search for a file from \"Virtualkeyrepostries\" folder\n"  
	    + "4) Show Previous Menu options \n"  
	    + "5) Exit program\n";  
	  System.out.println(fileMenu); 
	 }  
	}  