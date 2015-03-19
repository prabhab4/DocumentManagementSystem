
package documentmanagementsystem;

import java.io.File;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class UserInterface extends javax.swing.JFrame {

    private FileManager fileManager;
    private DefaultListModel dlm;
    
    public UserInterface() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileListDisplayScroller = new javax.swing.JScrollPane();
        fileListDisplay = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        fileChooserDisplay = new javax.swing.JFileChooser();
        openFileButton = new javax.swing.JButton();
        deleteFileButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        addFileButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Document Management Systems | By Kyle");
        setBackground(new java.awt.Color(255, 51, 0));
        setName("userWindow"); // NOI18N
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        fileListDisplay.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        fileListDisplay.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                fileListDisplayValueChanged(evt);
            }
        });
        fileListDisplayScroller.setViewportView(fileListDisplay);

        jLabel1.setText("List of Available Documents");

        fileChooserDisplay.setDialogType(javax.swing.JFileChooser.CUSTOM_DIALOG);
        fileChooserDisplay.setApproveButtonText("ADD File");
        fileChooserDisplay.setControlButtonsAreShown(false);
        fileChooserDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileChooserDisplayActionPerformed(evt);
            }
        });

        openFileButton.setText("Open File");
        openFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openFileButtonActionPerformed(evt);
            }
        });

        deleteFileButton.setText("Delete File");
        deleteFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteFileButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Select a file below to Upload:");

        addFileButton2.setText("ADD File");
        addFileButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFileButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fileChooserDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(openFileButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(deleteFileButton, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(fileListDisplayScroller, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel2))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addFileButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fileListDisplayScroller, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(openFileButton)
                        .addGap(18, 18, 18)
                        .addComponent(deleteFileButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fileChooserDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addFileButton2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /* Codes to run when the file chooser display is being used. (Add File Section) */
    private void fileChooserDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileChooserDisplayActionPerformed
        
        System.out.println("File Chosen: " + fileChooserDisplay.getSelectedFile().getName()); //Testing, prints chosen file
        System.out.println(fileChooserDisplay.getSelectedFile().getAbsolutePath()); //Testing, prints selected file's path.
        
        // "addFile()" method in "FileManager" class is called. Currently selected file's path and name is passed with it.
        // Adds the selected file to the document holder folder. (Uploads)
        fileManager.addFile(fileChooserDisplay.getSelectedFile().getAbsolutePath(), fileChooserDisplay.getSelectedFile().getName());
        ///-------------------
        fileManager = new FileManager(); //"fileManager" object is reinitialised to update the newly added file.
        String[] tempArray = fileManager.listFilesOfFolder(); //newly updated files are stored in teh "tempArray" arraylist.
        dlm = new DefaultListModel(); //Creating the variable "dlm", type "DefaultListModel" which is used to display files list in GUI
        
        for (String hold:tempArray) { //Gets every file names and temporarily stores in "hold" String variable
            dlm.addElement(hold); //every file name from "hold" is added to the list.
        }
        fileListDisplay.setModel(dlm); //list is finally added to the GUI Display.
        
    }//GEN-LAST:event_fileChooserDisplayActionPerformed

    /* Codes to run when the window is inizialised */
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        fileManager = new FileManager(); //Initialising the "FileManager" class.
        String[] tempArray  = fileManager.listFilesOfFolder(); //Gets the list of available files from the "fileHolder" folder and store in "tempArray".
        dlm = new DefaultListModel(); //Creating the variable "dlm", type "DefaultListModel" which is used to display files list in GUI
        
        for (String hold:tempArray) { //Gets every file names and temporarily stores in "hold" String variable
            dlm.addElement(hold); //every file name from "hold" is added to the list.
        }
        fileListDisplay.setModel(dlm); //list is finally added to the GUI Display.
        
        fileChooserDisplay.setControlButtonsAreShown(false); //Hiding its open and cancel buttons, because we don't need Cancel button.
    }//GEN-LAST:event_formWindowOpened

    /* Codes to run when "Delete File" button is Clicked */
    private void deleteFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteFileButtonActionPerformed
        // "index" stores the currently selected files ID/position.
        int index = fileListDisplay.getSelectedIndex();
        
            //index of the list is equals to -1 if nothing is selected. Actual values are 0 or above
        if (index != -1) { // Only run this code if a value is selected from the Documents list.
            fileManager.setFileSelection(index); //set the index of the currently selected file
            System.out.println("delete File index: " + index); //Testing, printing
            dlm.remove(index); //Remove the name of the selected file from the GUI file list.
            
            fileManager.deleteFile(index); //calling the method in "FileManager" class which deletes the seleted file.
                                    //Currently selected index is also passed through the method.
        }
    }//GEN-LAST:event_deleteFileButtonActionPerformed
    
    /* Codes to run when a value is selected at Documents list display. */
    private void fileListDisplayValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_fileListDisplayValueChanged
        //System.out.println("Value changed, index selected: " + fileListDisplay.getSelectedIndex()); //Testing
        
        // Sets the value of the selected index in "FileManager" class, everytime a file name is selected from the GUI list.
        fileManager.setFileSelection(fileListDisplay.getSelectedIndex());
    }//GEN-LAST:event_fileListDisplayValueChanged

    /* Codes to run when "Open File" button is clicked */
    private void openFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openFileButtonActionPerformed
        // Opens the selected File
        fileManager.openFile(); // "openFile()" method in "FileManager" is called.
        System.out.println("Open File Button CLicked. " ); //Testing, prints message to indicate open file button is clicked
    }//GEN-LAST:event_openFileButtonActionPerformed

    /* Codes to run when the "ADD file" button is pressed. (Add File Section) */
    private void addFileButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFileButton2ActionPerformed
        // TODO add your handling code here:
        
        try{ //Error handler "try and catch"
            
            // "addFile()" method in "FileManager" class is called. Currently selected file's path and name is passed with it.
            // Adds the selected file to the document holder folder. (Uploads)
            fileManager.addFile(fileChooserDisplay.getSelectedFile().getAbsolutePath(), fileChooserDisplay.getSelectedFile().getName());
            ///-------------------
            fileManager = new FileManager(); //"fileManager" object is reinitialised to update the newly added file.
            String[] tempArray = fileManager.listFilesOfFolder(); //newly updated files are stored in teh "tempArray" arraylist.
            dlm = new DefaultListModel(); //Creating the variable "dlm", type "DefaultListModel" which is used to display files list in GUI

            for (String hold:tempArray) { //Gets every file names and temporarily stores in "hold" String variable
                dlm.addElement(hold); //every file name from "hold" is added to the list.
            }
            fileListDisplay.setModel(dlm); //list is finally added to the GUI Display.
            
        } catch(NullPointerException e){ //Displays a message, if none of the file is selected to upload/Add.
            JOptionPane.showMessageDialog(this, "\nSelect a File First!", null, WIDTH);
        }
        
        
    }//GEN-LAST:event_addFileButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addFileButton2;
    private javax.swing.JButton deleteFileButton;
    private javax.swing.JFileChooser fileChooserDisplay;
    private javax.swing.JList fileListDisplay;
    private javax.swing.JScrollPane fileListDisplayScroller;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton openFileButton;
    // End of variables declaration//GEN-END:variables
}