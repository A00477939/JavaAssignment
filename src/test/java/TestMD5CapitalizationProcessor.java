import com.smu.mscda.MD5CapitalizationProcessor;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMD5CapitalizationProcessor {

    private String testName="hritik";

    @DisplayName("Capital or not")
    @Test
    public void testGenerateCapital() {
        assertEquals("Hritik", MD5CapitalizationProcessor.GenerateCapital(testName),"It should return Hritik");
    }

    @DisplayName("String to MD5")
    @Test
    public void testGenerateMD5() {
        String testName = "hritik";
        assertEquals("869efc77714025828952f9f0b1b378f5", MD5CapitalizationProcessor.GenerateMDshex(testName),"It should return 869efc77714025828952f9f0b1b378f5");
    }
}
