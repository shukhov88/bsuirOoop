package KR_2;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by shukhovvg on 28.12.2017.
 */
public class Runner extends Frame implements ItemListener {
    /*@Override
    public void itemStateChanged(ItemEvent e) {

    }

    public static void main(String args[]) {
        ListDesign list = new ListDesign();
        Choice ch = new Choice();

        ch.add("Strings from list goes here");
    }*/


    List lst;
    Checkbox chb;
    Choice ch;

    public Runner(){
        super("Фреймовое окно");
        setLayout(new FlowLayout(FlowLayout.CENTER));
        setSize(300,200);
        lst = new List (2, false );
        lst.addItem ("1 BSUIR");
        lst.addItem ("2 BSEU");
        lst.addItem ("3 BSU");
        chb=new Checkbox("Кнопка с независимой фиксацией");
        ch=new Choice();
        ch.add("Сюда переносятся строки со списка");
        add(lst);
        add(ch);
        add(chb);
        setVisible(true);
        lst.addItemListener(this);
    }
    public void itemStateChanged(ItemEvent ie){
        ch.addItem(lst.getSelectedItem());
    }
    public static void main(String args[]){
        Runner list = new Runner();
    }


}
