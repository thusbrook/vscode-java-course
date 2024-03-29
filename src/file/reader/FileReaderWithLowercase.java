package file.reader;

import java.nio.file.Path;

class FileReaderWithLowercase extends BaseFileReader {
    protected FileReaderWithLowercase(Path filePath) {
        super(filePath);
    }

    @Override
    protected String mapFileLine(String line) {
        return line.toLowerCase();
    }
}
