package lockedMe.com;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MyLockerr {
	String path="D:\\Simplilearn\\";
	String filename;
	String finalname;
	File f = new File(path);
	Scanner sc= new Scanner(System.in);
	
	//LIST OF ALL THE FILES IN ASCENDING ORDER
	public void listFiles() throws IOException
	{
	    System.out.println(" The total files present in a given folder ");
		File f = new File(path);
		File filen[]=f.listFiles();
		
		for(File ff: filen)
		  {
			String s= ff+" ";  // now ff is present in string format
			String ss[]= s.split("\\\\");
			System.out.println(ss[ss.length-1]);
	       }
		 mainContext();
	}
	
	//TO ADD A NEW FILE IN A DIRECTORY
	public void addFile() throws IOException
	{
	
       System.out.println("ADD A FILE: ");
		ArrayList<String> al= new ArrayList<>();
		{
		  System.out.println("Enter file name");
		  filename= sc.next();
	      finalname= path + filename;  //CONCATENATION
		
		  f = new File(finalname);
	      boolean res= f.createNewFile();
		
		  if(res==false) 
		  {
			System.out.println("file already exists in the directory");
		  }
		  else 
		  {
			System.out.println("file is created");
		  }
	     	al.add(filename);
         System.out.println(al);
		}
		businessLevelOperations();
	}
	// TO DELETE A FILE
	public void deleteFile() throws IOException 
	{
	System.out.println("DELETE A FILE ");
    sc= new Scanner(System.in);
	System.out.println("Enter file name you want to delete ");
	String filedel= sc.next();
	String finalfile = path+filedel;  //CONCATENATION
	
    f = new File(finalfile);
	f.delete();
	businessLevelOperations();
	}
	
	// SEARCHING OF A FILE
	public void searchFile() throws IOException 
	{
    System.out.println("SEARCHING OF A FILE ");
    sc= new Scanner(System.in);
    f = new File(path);
	System.out.println("enter the fle you want to search: ");
	String filesearch=sc.next();
	File filenn[]=f.listFiles();
	int flag=0;
	for(File ff:filenn) {
		if(ff.getName().equals(filesearch)) {
			flag=1;
			break;
		}
		else {
			flag=0;
		}
	}
	if(flag==1) {
		System.out.println("file is found");
	}
	else {
		System.out.println("file is not found");
	}
	businessLevelOperations();
   }
	
	// NAVIGATE BACK TO THE MAIN CONTEXT
	public void mainContext() throws IOException
	{
		System.out.println("\nSelect the option you want to perform in the application");
		System.out.println("\n 1. to get all the file names in an ascending order.\n 2. Business Level Operations. \n 3. Close the application.  ");
		int choice1= sc.nextInt();
		switch(choice1)
		{
		case 1: listFiles();
		        break;
		case 2: businessLevelOperations();
		        break;
		case 3: closeApplication();
		        break;
		default: System.out.println("Select the correct option");
		         break;
		}
	}
	
	//CLOSE APPLICATION
	public void closeApplication()
	{
      System.out.println("Press 1 to exit from the application");
      int choice1= sc.nextInt();
      if(choice1==1) {
    	  System.out.println("You have successfully exited");
    	  System.exit(0);
      }
      
   }
	
 public void businessLevelOperations() throws IOException
 {
	 System.out.println("You have multiple options to opt for the details of uer Interface. Select any one: ");
     System.out.println("\na. to add a new file from the exiting directory list. ");
     System.out.println("b. to delete a user specified file from the existing directory.");
     System.out.println("c. to search a user specified file.");
     System.out.println("d. to go back to the main context.");
     System.out.println("Choose one option: ");
     char choice2=sc.next().charAt(0);
     
     switch(choice2)
     {
     case 'a': addFile();
    	       break;
     case 'b': deleteFile();
               break;
     case 'c': searchFile();
               break;
     case 'd': mainContext();
               break;
     default: System.out.println("Select the correct option");
              businessLevelOperations();
              break;
    	 
     }
 }
	public static void main(String[] args) throws IOException 
	{
		//DEVELOPER'S DETAILS USING COMMAND LINE ARGUMENTS
		System.out.println("\n~~~~~~~~~  THIS IS MY FIRST ASSESSMENT PROJECT  ~~~~~~~~~");
		System.out.println("           Project Name: MY LOCKER");
		System.out.println("\nDEVELOPER'S DETAILS:");
		System.out.println("\nNAME: "+ args[0]);
		System.out.println("CURRENT STATUS: "+ args[1]);
		
		

		MyLockerr a= new MyLockerr();
		a.mainContext();

	}

}
