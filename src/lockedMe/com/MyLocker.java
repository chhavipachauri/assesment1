package lockedMe.com;

import java.io.File; 
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MyLocker {

	public static void main(String[] args) throws IOException {
		int ab;
		String path="D:\\Simplilearn\\";
		Scanner sc= new Scanner(System.in);
		//USING COMMAND LINE ARGUMENTS
		System.out.println("\n~~~~~~~~~  THIS IS MY FIRST ASSESSMENT PROJECT  ~~~~~~~~~");
		System.out.println("           Project Name: MY LOCKER");
		System.out.println("\nDEVELOPER'S DETAILS:");
		System.out.println("NAME: "+args[0]);
		System.out.println("CURRENT STATUS: " + args[1]);
		
		
		
	    do {
	    	System.out.println("\nSelect the option you want to perform in the application");
			System.out.println("\n1. to get all the file names in ascending order.\n 2. To retrieve business level operations. 3. Close the application.  ");
			int choice1= sc.nextInt();
			switch(choice1)
			{
			case 1: // TO LIST ALL THE FILE NAMES IN ASCENDING ORDER
				System.out.println(" The total files present in a given folder ");
				File f = new File(path);
				File filen[]=f.listFiles();
				
				for(File ff: filen)
				  {
					String s= ff+" ";  // now ff is present in string format
					String ss[]= s.split("\\\\");
					System.out.println(ss[ss.length-1]);
			       }
					break;
					
			case 2: // BUSINESS OPERATIONS
				    do {
				    
				      System.out.println("You have multiple options to opt for file operations. Select any one: ");
				      System.out.println("\na. to add a new file from the exiting directory list. ");
				      System.out.println("b. to delete a user specified file from the existing directory.");
				      System.out.println("c. to search a user specified file.");
				      System.out.println("d. to go back to the main context.");
				      
				      System.out.println("Choose one option: ");
				      char choice2=sc.next().charAt(0);
				      
				      switch(choice2)
				      {
				      case 'a': //TO CREATE A NEW FILE IN A DIRECTORY
				    	       System.out.println("ADD A FILE: ");
				    	       path= "D:\\Simplilearn\\";
				    			ArrayList<String> al= new ArrayList<>();
				    			{
				    			  System.out.println("Enter file name");
				    			  String filename= sc.next();
				    		      String finalname= path + filename;  //CONCATENATION
				    			
				    			  f = new File(finalname);
				    			  //f.createNewFile();
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
				                 break;
				                 
				      case 'b': // TO DELETE A FILE
				    	        System.out.println("DELETE A FILE ");
				    	        path= "D:\\Simplilearn\\";
				    		    sc= new Scanner(System.in);
				    			System.out.println("Enter file name you want to delete ");
				    			String filedel= sc.next();
				    			String finalfile = path+filedel;  //CONCATENATION
				    			
				    		    f = new File(finalfile);
				    			f.delete();
				    			break;
				    			
				      case 'c': // SEARCHING OF A FILE
				    	        System.out.println("SEARCHING OF A FILE ");
				    	        path= "D:\\Simplilearn\\";
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
				    			break;
				    			
				      case 'd': // NAVIGATE BACK TO THE MAIN CONTEXT
				    	        System.out.println(" if you want to go back to the main context press 1");
				    	        int a=sc.nextInt();
				    	        if(a==1)
				    	        {
				    	        	System.out.println("You have successfully exited");
				    	        	System.exit(0);
				    	        }
				    	        
                                break;
                       default: System.out.println("Wrong choice entered");         
                                return;
				      }
				      System.out.println("\nif u want to perform the operation again press 2");
				      ab=sc.nextInt();
				    }
				    while(ab==2);
				       
				case 3: //CLOSE APPLICATION
					    System.out.println("Press 1 to continue from the main context");
					    int b=sc.nextInt();
					    if(b==1)
		    	        {
		    	        	break;
		    	        }
					    
			    default: System.out.println("Wrong input");
			              return;
			              
		}
			
	    System.out.println("\nif u want to exit from the operation  press 2");
        ab=sc.nextInt();
        
	}
	    while(ab!=2);
	    
	}
}