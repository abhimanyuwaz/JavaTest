package newpackage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.FileNameMap;
import java.util.ArrayList;
import java.util.Scanner;

public class FinalAssessment {
    
    //FinalAssessment fa= new FinalAssessment();
    
    public static void main(String[] args) 
    {
        /*System.out.println("Hello World!");*/
        System.out.println("\n**************************************\n");
        System.out.println("\t Welcome to Application \n");
        System.out.println("**************************************");
       
        FinalAssessment fa1= new FinalAssessment();
        fa1.optionsSelection();
       // displayFilename();
    
    
    }
    private  void optionsSelection() 
    {
        System.out.println("**************************************");
        System.out.println("**************************************");
        String filename, conetnt;
        String[] arr = 
        	{   "1. Add a File ",
                "2. Delete the File",
                "3. Search the FIle",
                "4. Show all File ",
                "5. Close the application"
                
        };
        int[] arr1 = {1,2,3,4,5};
        int  slen = arr1.length;
        for(int i=0; i<slen;i++)
        {
            System.out.println(arr[i]);
            // display the all the Strings mentioned in the String array
        }
    
        System.out.println("\nEnter your choice:\t");
        Scanner sc = new Scanner(System.in);
        int  options =  sc.nextInt();
        
        for(int j=1;j<=slen;j++)
        {
            if(options==j)
            {
                switch (options)
                {
                    case 1:
                      
                        System.out.println("All the File Names Present in the Folder : \n");
                       
                        System.out.println("Enter the File Name\n");
                        sc = new Scanner(System.in);
                        filename=sc.nextLine();
                        
                        System.out.println("Enter the Content ");
                        sc = new Scanner(System.in);
                        conetnt=sc.nextLine();
                        
                        createFilename(filename,conetnt);
                        break;
                    case 2:
                        
                        System.out.println("Enter the Filename to be Deleted \n");
                        sc = new Scanner(System.in);
                        filename = sc.nextLine();
                        deleteFile(filename);
                       

                        break;
                    case 3:
                        
                        System.out.println("Enter the file name to Search from a Particular Directory ...\n");
                        sc = new Scanner(System.in);
                        System.out.println("Enter the File Name ");
                        filename = sc.nextLine();
                        searchFilename(filename);
                        
                        break; 
                        
                    case 4:
                        
                   
                        System.out.println("All the Files : ");
                        allFilename();
                        
                      
                        
                        break;
                    default:
                        System.out.println("You have made an invalid choice!");
                        break;
                }
            }
        }

    }
    
    public static void displayFilename()
    {
    	String [] filenames;
    	File f= new File("C:\\Users\\waz78153\\OneDrive - Viavi Solutions Inc\\Desktop\\TestFiles");
    	
    	filenames=f.list();
    	
    	for(String pathanme:filenames)
    	{
    		System.out.println(pathanme);
    		
    	}
    	
    	   FinalAssessment fa1= new FinalAssessment();
           fa1.optionsSelection();
    }
    
    public static void deleteFile(String filename)
    {
        try
        {
        String [] filenames;
        boolean delete=false;
        File f= new File("C:\\Users\\waz78153\\OneDrive - Viavi Solutions Inc\\Desktop\\TestFiles");
        filenames=f.list();
        
        for(String pathanme:filenames)
        {
            if(filename.equals(pathanme))
            {
                File file= new File("C:\\Users\\waz78153\\OneDrive - Viavi Solutions Inc\\Desktop\\TestFiles\\"+filename);
                
                
                file.delete();  
                delete=true;
            }
            
            
        }
        if(!delete)
        {
            System.out.println(" File Not Found ");
            
        }
        else
        {
            System.out.println("File Deleted ");
        }
        
        FinalAssessment fa1= new FinalAssessment();
        fa1.optionsSelection();
        
        
        }
        catch(Exception e)
        {
            System.out.println("File Noy Found ");
            FinalAssessment fa1= new FinalAssessment();
           
            fa1.optionsSelection();
        }
    }
    
    
    public static void createFilename(String filename,String Content)
    {
        try 
        {
    	String [] filenames;
    	File f= new File("C:\\Users\\waz78153\\OneDrive - Viavi Solutions Inc\\Desktop\\TestFiles\\"+filename);
       
        FileWriter writer = new FileWriter(f);
        writer.write(Content);
        writer.close();
    	
    	
			f.createNewFile();
			
			System.out.println("File Created ");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
        FinalAssessment fa1= new FinalAssessment();
        fa1.optionsSelection();
    }
    public static void searchFilename(String name)
    {
    	String [] filenames;
    	File f= new File("C:\\Users\\waz78153\\OneDrive - Viavi Solutions Inc\\Desktop\\TestFiles\\");
    	
    	filenames=f.list();
    	
    	for(String pathanme:filenames)
    	{
    		//System.out.println(pathanme);3
    	    
    	  //  System.out.println("Name "+name+"File Name "+pathanme);
    		if(name.equals(pathanme))
    		{
    		    System.out.println("========================================");
    			System.out.println("File Name found");
    			System.out.println(pathanme);
    			 System.out.println("========================================");
    		}
    		
    	}
    
    	   FinalAssessment fa1= new FinalAssessment();
           fa1.optionsSelection();
    }
    public static void allFilename()
    {
    	String [] filenames;
    	File f= new File("C:\\Users\\waz78153\\OneDrive - Viavi Solutions Inc\\Desktop\\TestFiles\\");
    	
    	filenames=f.list();
    	System.out.println("========================================");
    	for(String pathanme:filenames)
    	{
    		//System.out.println(pathanme);3
    	    
    	  //  System.out.println("Name "+name+"File Name "+pathanme);
    		
    		    
    			System.out.println(pathanme);
    			 
    		
    		
    	}
    
    	   FinalAssessment fa1= new FinalAssessment();
           fa1.optionsSelection();
    }
    

}
