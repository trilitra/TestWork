import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class SecondOptionWriterTest {


    @Test
    public void SecondOptionWriter() throws IOException {

        Map<String, List<Integer>> map = new HashMap<>();

        List <Integer> list = new ArrayList<>();
        list.add(3);
        list.add(-3);
        list.add(0);

        map.put("mark07", list);

        String[] markerList = {"mark07", "mark7"};

        SecondOptionWriter obj = new SecondOptionWriter(map, markerList);

        BufferedReader br = new BufferedReader(new FileReader("SecondResult.json"));

        String line = br.readLine();

        map.clear();

        assertEquals("{\"mark7\":null,\"mark07\":0}", line);

    }
}