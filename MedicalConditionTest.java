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
public class MedicalConditionTest {
    
    public MedicalConditionTest() {
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
     * Test of uploadMedicalCondition method, of class MedicalCondition.
     */
    @Test
    public void testUploadMedicalCondition() {
        System.out.println("uploadMedicalCondition");
        MedicalCondition instance = new MedicalCondition();
        instance.uploadMedicalCondition();
    }

    /**
     * Test of editMedicalCondition method, of class MedicalCondition.
     */
    @Test
    public void testEditMedicalCondition() {
        System.out.println("editMedicalCondition");
        MedicalCondition instance = new MedicalCondition();
        instance.editMedicalCondition();

    }

    /**
     * Test of setHeartCondition method, of class MedicalCondition.
     */
    @Test
    public void testSetHeartCondition() {
        System.out.println("setHeartCondition");
        String heartCondition = "";
        MedicalCondition instance = new MedicalCondition();
        instance.setHeartCondition(heartCondition);
    }

    /**
     * Test of setCholestrol method, of class MedicalCondition.
     */
    @Test
    public void testSetCholestrol() {
        System.out.println("setCholestrol");
        String cholestrol = "";
        MedicalCondition instance = new MedicalCondition();
        instance.setCholestrol(cholestrol);

    }

    /**
     * Test of setHypertension method, of class MedicalCondition.
     */
    @Test
    public void testSetHypertension() {
        System.out.println("setHypertension");
        String hypertension = "";
        MedicalCondition instance = new MedicalCondition();
        instance.setHypertension(hypertension);

    }

    /**
     * Test of setDepression method, of class MedicalCondition.
     */
    @Test
    public void testSetDepression() {
        System.out.println("setDepression");
        String depression = "";
        MedicalCondition instance = new MedicalCondition();
        instance.setDepression(depression);

    }

    /**
     * Test of setDiabetes method, of class MedicalCondition.
     */
    @Test
    public void testSetDiabetes() {
        System.out.println("setDiabetes");
        String diabetes = "";
        MedicalCondition instance = new MedicalCondition();
        instance.setDiabetes(diabetes);

    }
    
}
