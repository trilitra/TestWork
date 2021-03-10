import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class FirstOptionWriterTest {


    @Test
    public void FirstOptionWriter() throws IOException {

        Map<String, List<Integer>> map = new HashMap<>();

        List <Integer> list = new ArrayList<>();
        list.add(3);
        list.add(-3);
        list.add(0);

        map.put("mark07", list);

        FirstOptionWriter obj = new FirstOptionWriter(map);

        BufferedReader br = new BufferedReader(new FileReader("FirstResult.json"));

        String line = br.readLine();

        map.clear();

        assertEquals("{\"mark07\":0}", line);

    }
}