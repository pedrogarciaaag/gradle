/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package prueba;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
    @Test void appSumaCorrecta() {
        App classUnderTest = new App();
        assertEquals(5, classUnderTest.sumar(3, 2));
    }
    @Test void appRestarCorrecta() {
        App classUnderTest = new App();
        assertEquals(1, classUnderTest.sumar(3, 2));
    }
}
