package KR_2;


import java.awt.*;

/**
 * Created by shukhovvg on 28.12.2017.
 */
public class ListDesign {

    public ListDesign() {

        List list = new List(10,true);
        for (int i = 1; i < 11; i++) {
            list.add("String_" + i);
        }

    }

}
