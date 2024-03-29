package file.reader;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {
    public static void main(String[] args) throws URISyntaxException, IOException {
        URL location = Test.class.getClassLoader().getResource("file/reader/helloworld.txt");
        Path path = Paths.get(location.toURI());
        BaseFileReader lowercaseFileReader = new FileReaderWithLowercase(path);
        BaseFileReader uppercaseFileReader = new FileReaderWithUppercase(path);
        System.out.println(lowercaseFileReader.readFile());
        System.out.println(uppercaseFileReader.readFile());
    }
}