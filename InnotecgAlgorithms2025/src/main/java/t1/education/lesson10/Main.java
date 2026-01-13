package t1.education.lesson10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    private static String path = "InnotecgAlgorithms2025/src/main/java/t1/education/lesson10/task.txt";

    public static void main(String[] args) throws IOException {

        Stream<String> lines = Files.lines(Path.of(path));

        Map<Integer, List<String>> map = lines.parallel()
                .filter(x -> x.split(":").length == 2)
                .map(x -> String.valueOf(x.charAt(0)).toUpperCase() + x.substring(1).toLowerCase())
                .collect(Collectors.groupingBy(x -> Integer.valueOf(x.split(":")[1]), Collectors.mapping(x -> x.split(":")[0], Collectors.toList())));


        System.out.println(map);

    }


}
