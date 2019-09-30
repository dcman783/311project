/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triageclasses;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cyani
 */
public class MedicalHistoryTest {
    
    public MedicalHistoryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of uploadMedicalHistory method, of class MedicalHistory.
     */
    @Test
    public void testUploadMedicalHistory() {
        System.out.println("uploadMedicalHistory");
        MedicalHistory instance = new MedicalHistory();
        instance.uploadMedicalHistory();
       
    }

    /**
     * Test of editMedicalHistory method, of class MedicalHistory.
     */
    @Test
    public void testEditMedicalHistory() {
        System.out.println("editMedicalHistory");
        MedicalHistory instance = new MedicalHistory();
        instance.editMedicalHistory();

    }

    /**
     * Test of setPrescriptions method, of class MedicalHistory.
     */
    @Test
    public void testSetPrescriptions() {
        System.out.println("setPrescriptions");
        String prescriptions = "";
        MedicalHistory instance = new MedicalHistory();
        instance.setPrescriptions(prescriptions);
     
    }

    /**
     * Test of setSurgeries method, of class MedicalHistory.
     */
    @Test
    public void testSetSurgeries() {
        System.out.println("setSurgeries");
        String surgeries = "";
        MedicalHistory instance = new MedicalHistory();
        instance.setSurgeries(surgeries);

    }

    /**
     * Test of setAllergies method, of class MedicalHistory.
     */
    @Test
    public void testSetAllergies() {
        System.out.println("setAllergies");
        String allergies = "";
        MedicalHistory instance = new MedicalHistory();
        instance.setAllergies(allergies);
 
    }

    /**
     * Test of setMemberName method, of class MedicalHistory.
     */
    @Test
    public void testSetMemberName() {
        System.out.println("setMemberName");
        String memberName = "";
        MedicalHistory instance = new MedicalHistory();
        instance.setMemberName(memberName);

    }

    /**
     * Test of setTobaccoUse method, of class MedicalHistory.
     */
    @Test
    public void testSetTobaccoUse() {
        System.out.println("setTobaccoUse");
        String tobaccoUse = "";
        MedicalHistory instance = new MedicalHistory();
        instance.setTobaccoUse(tobaccoUse);

    }

    /**
     * Test of setAlcoholUse method, of class MedicalHistory.
     */
    @Test
    public void testSetAlcoholUse() {
        System.out.println("setAlcoholUse");
        String alcoholUse = "";
        MedicalHistory instance = new MedicalHistory();
        instance.setAlcoholUse(alcoholUse);

    }

    /**
     * Test of setDrugUse method, of class MedicalHistory.
     */
    @Test
    public void testSetDrugUse() {
        System.out.println("setDrugUse");
        String drugUse = "";
        MedicalHistory instance = new MedicalHistory();
        instance.setDrugUse(drugUse);

    }

    /**
     * Test of setBloodType method, of class MedicalHistory.
     */
    @Test
    public void testSetBloodType() {
        System.out.println("setBloodType");
        String bloodType = "";
        MedicalHistory instance = new MedicalHistory();
        instance.setBloodType(bloodType);

    }

    /**
     * Test of getPrescriptions method, of class MedicalHistory.
     */
    @Test
    public void testGetPrescriptions() {
        System.out.println("getPrescriptions");
        MedicalHistory instance = new MedicalHistory();
        String expResult = "";
        String result = instance.getPrescriptions();
        assertEquals(expResult, result);

    }

    /**
     * Test of getSurgeries method, of class MedicalHistory.
     */
    @Test
    public void testGetSurgeries() {
        System.out.println("getSurgeries");
        MedicalHistory instance = new MedicalHistory();
        String expResult = "";
        String result = instance.getSurgeries();
        assertEquals(expResult, result);

    }

    /**
     * Test of getAllergies method, of class MedicalHistory.
     */
    @Test
    public void testGetAllergies() {
        System.out.println("getAllergies");
        MedicalHistory instance = new MedicalHistory();
        String expResult = "";
        String result = instance.getAllergies();
        assertEquals(expResult, result);

    }

    /**
     * Test of getMemberName method, of class MedicalHistory.
     */
    @Test
    public void testGetMemberName() {
        System.out.println("getMemberName");
        MedicalHistory instance = new MedicalHistory();
        String expResult = "";
        String result = instance.getMemberName();
        assertEquals(expResult, result);

    }

    /**
     * Test of getTobaccoUse method, of class MedicalHistory.
     */
    @Test
    public void testGetTobaccoUse() {
        System.out.println("getTobaccoUse");
        MedicalHistory instance = new MedicalHistory();
        String expResult = "";
        String result = instance.getTobaccoUse();
        assertEquals(expResult, result);

    }

    /**
     * Test of getAlcoholUse method, of class MedicalHistory.
     */
    @Test
    public void testGetAlcoholUse() {
        System.out.println("getAlcoholUse");
        MedicalHistory instance = new MedicalHistory();
        String expResult = "";
        String result = instance.getAlcoholUse();
        assertEquals(expResult, result);

    }

    /**
     * Test of getDrugUse method, of class MedicalHistory.
     */
    @Test
    public void testGetDrugUse() {
        System.out.println("getDrugUse");
        MedicalHistory instance = new MedicalHistory();
        String expResult = "";
        String result = instance.getDrugUse();
        assertEquals(expResult, result);

    }

    /**
     * Test of getBloodType method, of class MedicalHistory.
     */
    @Test
    public void testGetBloodType() {
        System.out.println("getBloodType");
        MedicalHistory instance = new MedicalHistory();
        String expResult = "";
        String result = instance.getBloodType();
        assertEquals(expResult, result);

    }
    
}
