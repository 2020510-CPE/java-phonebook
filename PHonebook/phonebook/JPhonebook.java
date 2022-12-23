/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package phonebook;


/**
 *
 * @author user
 */
public class JPhonebook implements CRUD_Interface {

    public static void main(String[] args) {
        //Initialize Data Structure
        CRUD_Interface.DB_Initialize();
        //Insert Sample Data
        System.out.println("Adding Sample Data");
        CRUD_Interface.addRow("Jesie", "Llanes", "03/04/2002", "Lipa City", "2020510@ub.edu.ph", "09481441303");
        //Initialize GUI
        PhonebookApp app = new PhonebookApp();
        app.setVisible(true);
        System.out.println("Hello World!");
        
        
    }
}
