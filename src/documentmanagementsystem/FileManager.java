
package documentmanagementsystem;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FileManager {
    private String filePath; 
    private ArrayList<Integer> documentID = new ArrayList<>();
    private ArrayList<String> listOfFiles = new ArrayList<>();
    private Integer fileIndex;
                  
    FileManager() { //Constructor
        // Sets the path to the folder where the documents are stored.
        filePath = Paths.get(".").toAbsolutePath().normalize().toString() + "\\documentHolder";
    }
    
    /**This method "listFilesOfFolder()" returns the list of file names, available in the "fileHolder" folder.
     * List of file names are stored and returned in an ArrayList of type String.
     */
    //public void listFilesOfFolder(){//(final File folder) {
    public String[] listFilesOfFolder(){
        final File folder = new File(filePath);
        System.out.println("List of Documents: "); //Testing, prints list of documents.
        
        int num = 0;
            //Do this FOR loop for every file in a given folder.
        for (final File fileEntry : folder.listFiles()) {
            if (fileEntry.isDirectory()) {//Only enter this loop if the given name is a folder.
                //listFilesOfFolder(fileEntry); // read folder inside folder
            } else {//Current file name is stored in a variable "fileEntry"
                System.out.println(fileEntry.getName()); //Testing, prints list of documents.
                listOfFiles.add(fileEntry.getName()); //add the file name to the Arraylist "listOfFiles"
                documentID.add(num); //give a document ID of this file
                num++;
            }
        }
       /*After all the file names have been read from the folder and stored in the ArrayList "listOfFiles",
        *it is copied to the "temp[]" arraylist and returned when needed. */
        String temp[] = new String[listOfFiles.size()];
        temp = listOfFiles.toArray(temp);
        return temp;
    }
    
        /* Method "openFile()" opens the currectly selected file. Currently selected on UserInterface file list.
         * This method is called when "Open File" button is clicked on the UserInterface GUI.
         */
    public void openFile(){
         // "try and catch" is an exception handler, to prevent the program from crashing if error occurs.
        try{
            // "fileIndex" variable holds the ID of currently selected file on the GUI list.
            // File variable "f" holds the full path = folder location + selected document name
            File f = new File(filePath + "\\" + listOfFiles.get(fileIndex));
            
            if (f.exists()) { //if selected file exists on the hard disk, do the actions below.
                if (Desktop.isDesktopSupported()) {  
                    Desktop.getDesktop().open(f);  // open selected file
                }
                else {  //if file not found, print the message
                    System.out.println("File does not exists!");  
                }
            }
        }   catch(Exception e) {e.printStackTrace();}  
        //method "catch" handles any errors and prints out the error without crashing the program
    }
    
    /* "deleteFile()" method is called when the "Delete File" button is clicked on the GUI.
     * This method deletes the selected file. "currentIndex"/ ID of the selected document is passed as an argument
     */
    public void deleteFile(int currentIndex){
        // File variable "tempFilePath" holds the full path = folder location + selected document name
        // document name is taken from the arrayList "listOfFiles" using the "currentIndex" ID.
        File tempFilePath = new File(filePath + "\\" + listOfFiles.get(currentIndex));
        
        try { // "try and catch" is an exception handler, to prevent the program from crashing if error occurs.
            tempFilePath.delete(); // deletes the selected file on the hard disk.
            
            // Displays popup message, saying which file was deleted just now.
            JOptionPane.showMessageDialog(null, "File: " + listOfFiles.get(currentIndex) 
                    + " is Deleted!", "Inane warning", JOptionPane.WARNING_MESSAGE);
        }  catch (Exception x) {
            // File errors are caught here, if any and printed out.
            System.err.println(x);
        }
        ///System.out.println("ListOfFiles array, Before: " + listOfFiles + "\nArray Size: " + listOfFiles.size()); //Testing
        // We have a global variable "listOfFiles" which holds the name of our file.
        // Now we remove the file name from this Arraylist.
        listOfFiles.remove(currentIndex); 
    }
    
    /* SETTER. This method sets the "fileIndex" variable to currently selected file ID,
                everytime a file is selected on the GUI list */
    public void setFileSelection(int index){
        if(index >= 0){ // if no file are selected, its value will be -1. So ignore any values below 0.
            this.fileIndex = index;
        }
    } //End of setter setFileSelection()
    
    /* The method "addFile()" is called when the user chooses a file and clicks "ADD File" button in the GUI's File Chooser.
     * This method adds the selected file to our Documents management Folder called "documentHolder".
     * It takes two arguments = "sourcePath" and "destFileName". 
     */
    public void addFile(String sourcePath, String destFileName){
        
        try { // "try and catch" is an exception handler, to prevent the program from crashing if error occurs.
            File src = new File(sourcePath); //Stores the location of the selected file to temp variable "src".
            File dest = new File(filePath + "\\" + destFileName); //Stores full location to the "documentHolder" + file name into "dest".
            Files.copy(src.toPath(), dest.toPath()); // Finally the file is copied to the stated folder.
            
            // Pop up message is displayed to inform that chosen file have been successfully uploaded/added to Documents folder
            JOptionPane.showMessageDialog(null, "File: " + destFileName + " is Uploaded!", "Inane warning",
                                        JOptionPane.WARNING_MESSAGE);
            
        } catch (IOException ex) { }//Any errors/exception are caught here.
        
        
    } //End of method addFile()
    
} // End of Class FileManager.java
