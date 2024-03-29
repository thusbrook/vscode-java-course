package file.reader;

import java.nio.file.Path;

class FileReaderWithUppercase extends BaseFileReader {
    protected FileReaderWithUppercase(Path filePath) {
        super(filePath);
    }

    @Override
    protected String mapFileLine(String line) {
        return line.toUpperCase();
    }
}