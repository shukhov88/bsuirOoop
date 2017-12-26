package IPR_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

/**
 * Created by shukhovvg on 26.12.2017.
 */
public class SearchInfo {

    public static void searchGuttler(List<Animal> animals) {

        int border = 0;

        try {
            System.out.print("Please, enter the gutter search border: ");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String temp = reader.readLine();
            border = Integer.parseInt(temp);
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i).getFood() >= border) {
                animals.get(i).printAnimalInfo();
            }
        }
    }
}
