import java.io.*;
import java.util.List;
import java.util.Map;


public class App {
    private static final String[] filePath = {"source01.csv", "source02.csv", "source03.csv"};
    private static final String[] markerList = {"mark01", "mark17", "mark23", "mark35", "markFV", "markFX", "markFT"};

    public static void main(String[] args) {
        System.out.println("Запуск программы");
        ReadAndExtract obj = new ReadAndExtract();
        try {
            Map<String, List<Integer>> map = obj.readAndExtract(filePath, markerList);
            new FirstOptionWriter(map);
            new SecondOptionWriter(map, markerList);
            new ThirdOptionWriter(map);
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
