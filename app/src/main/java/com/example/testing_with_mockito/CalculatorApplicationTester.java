package com.example.testing_with_mockito;

import org.junit.Assert;
import org.junit.Test;

;

public class CalculatorApplicationTester {
    CalculatorApplication calculatorApplication = new CalculatorApplication();
    //@Mock annotation est utilisée pour créer l'objet fictif à injecter
    CalculatorService calcService;
    @Test
    public void testAdd(){
// ajouter le comportement de calcService pour additionner deux nombres
        when(calcService.add(10.0,20.0)).thenReturn(30.00);
// tester la fonctionnalité d'ajout
        Assert.assertEquals(calculatorApplication.add(10.0, 20.0),30.0,0);
    }

}