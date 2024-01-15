package HW15January;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private MainTest mainTest;

    @Test
    public void getResult_testAllEmpty(){
        assertEquals(Arrays.asList(), Main.returnList(List.of(), List.of()) );
    }

    @Test
    public void getResult_testAllYes(){
        assertEquals(Arrays.asList("Yes", "Yes", "Yes", "Yes"), Main.returnList(List.of(1,1,1,1), List.of(1,1,1,1)));
    }

    @Test
    public void getResult_testAllNo(){
        assertEquals(Arrays.asList("No", "No","No","No"), Main.returnList(List.of(1,1,1,1), List.of(2,2,2,2)));
    }

    @Test
    public void getResult_testDiff(){
        assertEquals(Arrays.asList("Yes", "No", "Yes", "No"), Main.returnList(List.of(1,1,1,1), List.of(1,2,1,2)));
    }

}