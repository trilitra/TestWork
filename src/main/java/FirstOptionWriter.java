
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class FirstOptionWriter {

    public FirstOptionWriter(Map<String, List<Integer>> map) throws IOException {
        System.out.println("Записываем извлеченные данные(первый вариант записи) в файл FirstResult.java");
        JSONObject object = new JSONObject();
        for (Map.Entry<String, List<Integer>> entry : map.entrySet()) {
            List<Integer> list = entry.getValue();
            Integer summa = 0;
            for (Integer integer : list) {
                summa += integer;
            }
            object.put(entry.getKey(), summa);
        }
        FileWriter file = new FileWriter("FirstResult.json");
        file.write(object.toJSONString());
        file.flush();
        file.close();
        System.out.println("Результат записи (первый вариант) : " + object+ "\n");
    }

}



