package classes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
   
    @Test // Esxemplo de teste de um método da classe App.
    void TesteSoma(){
        App numeros = new App();
        Assertions.assertEquals(4, numeros.soma(2, 2));
    }
}
