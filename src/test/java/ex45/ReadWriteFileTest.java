package ex45;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ReadWriteFileTest {
    private ReadWriteFile readWriteFile;
    @BeforeEach
    void setUp() {
        readWriteFile = new ReadWriteFile();
        readWriteFile.inputFile = "src/main/resources/exercise45_input.txt";
    }

    @AfterEach
    void tearDown() {
        readWriteFile = null;
    }

    @Test
    void readFile() throws IOException {
        readWriteFile.outputFile = "src/main/resources/myoutputfile";
        String result = readWriteFile.readFile();
        assertNotNull(result);
    }

    @Test
    void replaceAndWrite() throws IOException {
        readWriteFile.outputFile = "src/main/resources/myoutputfile";
        String result = readWriteFile.readFile();
        readWriteFile.replaceAndWrite(result);

        String outputFile = "myoutputfile";
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource(outputFile).getFile());
        String absolutePath = file.getAbsolutePath();

        assertTrue(file.exists());

    }
}