package KR_1;


import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by shukhovvg on 26.12.2017.
 */
public class DateConverter {
    private File text2 = new File("src/main/resources/text2.txt");
    private File text3 = new File("src/main/resources/text3.txt");

    public DateConverter() {
        DatesGenerator.initDates();
    }

    public void convertDates() {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(DatesGenerator.file));
            StringBuilder convertedDates = new StringBuilder();
            StringBuilder backUpDates = new StringBuilder();
            String line = reader.readLine();
            while (line != null) {
                convertedDates.append(convert(line)).append("\n");
                backUpDates.append(line).append(" - ").append(convert(line)).append("\n");
                line = reader.readLine();
            }
            writeConvertedDates(convertedDates.toString(), text2);
            writeConvertedDates(backUpDates.toString(), text3);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private String convert(String oldDate) {
        final String OLD_FORMAT = "yyyy-MM-dd";
        final String NEW_FORMAT = "dd MMMM yyyy";
        String oldDateString = oldDate;
        String newDateString;

        SimpleDateFormat sdf = new SimpleDateFormat(OLD_FORMAT);
        Date d = null;
        try {
            d = sdf.parse(oldDateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        sdf.applyPattern(NEW_FORMAT);
        newDateString = sdf.format(d);
        return newDateString;
    }

    private void writeConvertedDates(String date, File file) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(file);
            writer.write(date);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
