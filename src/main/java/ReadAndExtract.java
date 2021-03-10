import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class ReadAndExtract {
    private static final Map<String, List<Integer>> map = new HashMap<>();


    public Map<String, List<Integer>> readAndExtract(String[] filePath, String[] markerList) throws IOException {
        System.out.println("Извлекаем данные из указанных файлов" + "\n");

        for (String fileName : filePath) {
            BufferedReader br = new BufferedReader(new FileReader(fileName));

            String line = br.readLine();
            while (line != null) {
                for (String str : markerList) {
                    int i = line.indexOf(str);
                    if (i != -1) {
                        int s = i + str.length();
                        Integer extractedValue = Integer.valueOf(line.substring(s + 1));
                        refresh(str, extractedValue);
                    }
                }
                line = br.readLine();
            }
            br.close();
        }
        return map;
    }

    private void refresh(String str, Integer i) {
        List<Integer> list = map.computeIfAbsent(str, k -> new ArrayList<>());
        list.add(i);
    }
}
