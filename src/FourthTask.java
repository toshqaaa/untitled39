import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

/*
Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
который запишет эту строку в простой текстовый файл, обработайте исключения.
 */
public class FourthTask {
    private static final Logger logger = LoggerFactory.getLogger(FourthTask.class);

    public String stringGenerator() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            stringBuilder.append("TEST");
        }
        return stringBuilder.toString();
    }

    public void writer() {
        try {
            FileWriter fileWriter = new FileWriter("test.txt");
            fileWriter.write(stringGenerator());
            fileWriter.close();
        } catch (IOException e) {
            logger.error("ВСЕ ОЧЕНЬ ПЛОХО", e);
        }
    }

//    public void writer() throws IOException {
//        FileOutputStream fileOutputStream = new
//                FileOutputStream("C:\\Users\\toshqaaa\\Desktop\\test.txt");
//
//        fileOutputStream.write(stringGenerator().getBytes());
//
//        fileOutputStream.close();
//    }
}
