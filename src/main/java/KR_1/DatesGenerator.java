package KR_1;


import java.io.File;
import java.io.FileOutputStream;

import java.time.LocalDate;
import java.util.Random;

/**
 * Created by shukhovvg on 26.12.2017.
 */
public class DatesGenerator {

    public static void initDates() {

        try {
            File file = new File("src/main/resources/text1.txt");

            FileOutputStream outputStream = new FileOutputStream(file);
            for (int i = 0; i < 10; i++) {
                outputStream.write(getRandomDate());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static byte[] getRandomDate() {

        Random random = new Random();
        int minDay = (int) LocalDate.of(1900, 1, 1).toEpochDay();
        int maxDay = (int) LocalDate.of(2015, 1, 1).toEpochDay();
        long randomDay = minDay + random.nextInt(maxDay - minDay);

        LocalDate randomDate = LocalDate.ofEpochDay(randomDay);
        String temp = randomDate.toString() + "\n";
        return temp.getBytes();
    }
}
