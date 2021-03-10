import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class ReadAndExtractTest {

    @Test
    public void readAndExtractTest() throws IOException {
        ReadAndExtract obj = new ReadAndExtract();

        Map<String, List<Integer>> map = new HashMap<>();

        List <Integer> list = new ArrayList<>();
        list.add(3);
        list.add(-3);
        list.add(0);

        map.put("mark07", list);

        String[] markerList = {"mark07"};
        String[] filepath = {"test.csv"};

        assertEquals(map, obj.readAndExtract(filepath, markerList));
    }
}