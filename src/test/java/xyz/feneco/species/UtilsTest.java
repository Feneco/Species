package xyz.feneco.species;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UtilsTest {
    @Test
    void strHashTest(){
        Assertions.assertEquals(6952252463157L, Utils.strHash("Feneco"));
        Assertions.assertEquals(193457010L, Utils.strHash("Fox"));
        Assertions.assertEquals(229430952803912L, Utils.strHash("Kitsune"));
        Assertions.assertEquals(6952717427467L, Utils.strHash("Raposa"));
    }
}
