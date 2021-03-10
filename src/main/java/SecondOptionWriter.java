

import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class SecondOptionWriter {

    public SecondOptionWriter(Map<String, List<Integer>> map, String[] markerList) throws IOException {
        System.out.println("Записываем извлеченные данные(второй вариант записи) в файл SecondResult.java");
        JSONObject obj = new JSONObject();

        for (String str : markerList) {
            obj.put(str, null);
        }

        for (Map.Entry<String, List<Integer>> entry : map.entrySet()) {
            List<Integer> list = entry.getValue();
            Integer summa = 0;
            for (Integer i : list) {
                summa += i;
            }
            obj.put(entry.getKey(), summa);
        }
        FileWriter file = new FileWriter("SecondResult.json");
        file.write(obj.toJSONString());
        file.flush();
        file.close();
        System.out.println("Результат записи (второй вариант) : " + obj + "\n");
    }
}



