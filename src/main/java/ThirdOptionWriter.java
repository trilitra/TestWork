
import org.json.simple.JSONObject;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class ThirdOptionWriter {
    public ThirdOptionWriter(Map<String, List<Integer>> map) throws IOException {
        System.out.println("Записываем извлеченные данные(третий вариант записи) в файл ThirdResult.java");
        JSONObject object = new JSONObject();
        for (Map.Entry<String, List<Integer>> entry : map.entrySet()) {
            List<Integer> list = entry.getValue();
            list.sort(Comparator.reverseOrder());
            object.put(entry.getKey(), list);
        }
        FileWriter file = new FileWriter("ThirdResult.json");
        file.write(object.toJSONString());
        file.flush();
        file.close();
        System.out.println("Результат записи (третий вариант) : " + object + "\n");
    }
}
