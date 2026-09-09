package test.java.com.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class addTest { 

    @Test
    public void testAdd() {
        ADD add = new ADD();
        int result = add.add(2, 3);
        assertEquals(5, result);
    }
}
