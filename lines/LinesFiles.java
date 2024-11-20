package lines;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;
import java.io.IOException;

/*
 * 11/19/2024 - 5:50 AM
 * @author Vyshali Prabananth Lal
 */

public class LinesFiles {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("/Users/vyshali/Desktop/Files/sampleFile.txt");

        //  Stream<String> streamFromFiles = Files.lines(path);

        try (Stream<String> streamFromFile = Files.lines(path)) {
            streamFromFile.forEach(System.out::println);
        } catch (IOException io) {
            System.out.println(io.getMessage());
            throw io;
        }
    }
}
