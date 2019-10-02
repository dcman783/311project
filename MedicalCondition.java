/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triageclasses;
import java.util.Scanner;
/**
 *
 * @author cyani
 */
public class MedicalCondition {
    
    private String heartCondition;
    private String cholestrol;
    private String hypertension;
    private String depression;
    private String diabetes;
    
    Scanner sc = new Scanner(System.in);

    public void uploadMedicalCondition()
    {
        System.out.println("You will see a variety of medical "
                + "conditions listed below.  If any of them apply to"
                + "you, please enter the details of your condition.  If "
                + "not, just hit enter to proceed.");
        
        System.out.println("Heart Condition(s)");
        heartCondition = sc.nextLine();
        System.out.println("Cholestrol");
        cholestrol = sc.nextLine();
        System.out.println("Hypertension");
        hypertension = sc.nextLine();
        System.out.println("Depression");
        depression = sc.nextLine();
        System.out.println("Diabetes");
        diabetes = sc.nextLine();    
    }
    
    public void editMedicalCondition()
    {
        System.out.println("What would you like to change?");
        System.out.println("1. Heart Condition");
        System.out.println("2. Cholestrol");
        System.out.println("3. Hypertension");
        System.out.println("4. Depression");
        System.out.println("5. Diabetes");
        
        int n = sc.nextInt();
        
        switch(n){
            case 1:
                System.out.println("Enter Heart Condition: ");
                heartCondition = sc.nextLine();
                break;
            case 2:
                System.out.println("Enter cholestrol: ");
                cholestrol = sc.nextLine();
                break;
            case 3:
                System.out.println("Enter Hypertension: ");
                hypertension = sc.nextLine();
                break;
            case 4:
                System.out.println("Enter Depression: ");
                depression = sc.nextLine();
                break;
            case 5:
                System.out.println("Enter Diabetes: ");
                diabetes = sc.nextLine();
                break;
            default:
                System.out.println("Invalid input");
                break;
           
        }   
    }
        
    
    
    //Constructor
    
    public MedicalCondition(){
    heartCondition = "";
    cholestrol = "";
    hypertension = "";
    depression = "";
    diabetes = "";    
    }
    
    //Setters
    public void setHeartCondition(String heartCondition){
        this.heartCondition = heartCondition;
    }
    public void setCholestrol(String cholestrol){
        this.cholestrol = cholestrol;
    }
    public void setHypertension(String hypertension){
        this.hypertension = hypertension;
    }
    public void setDepression(String depression){
        this.depression = depression;
    }
    public void setDiabetes(String diabetes){
        this.diabetes = diabetes;
    }
    
    //Getters
    
}
