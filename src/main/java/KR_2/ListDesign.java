package KR_2;


import java.awt.*;
import java.awt.event.*;

/**
 * Created by shukhovvg on 28.12.2017.
 */
public class ListDesign extends Frame implements ItemListener, ActionListener, WindowListener {

    List list;
    TextArea ta;
    Button button;

    public ListDesign() {
        super("KR_2");
        //setLayout(new FlowLayout(FlowLayout.CENTER));
        setSize(220,300);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        list = new List (10, false );
        for (int i = 1; i < 11; i++) {
            list.add("Row_" + i);
        }
        ta = new TextArea(2, 20);
        button = new Button("to dialog");
        button.disable();
        add(list);
        add(ta);
        add(button);
        addWindowListener(this);
        setVisible(true);
        list.addItemListener(this);
        button.addActionListener(this);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        ta.append(list.getSelectedItem());
        if (ta.getText().length() > 100) {
            button.enable();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (ta.getText().length() > 100) {
            Dialog dialog = new Dialog(this, "dialog", false);
            dialog.add(ta);
            dialog.setSize(400,200);
            dialog.setVisible(true);
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {}

    @Override
    public void windowClosing(WindowEvent e) {
        this.dispose();
    }

    @Override
    public void windowClosed(WindowEvent e) {}

    @Override
    public void windowIconified(WindowEvent e) {}

    @Override
    public void windowDeiconified(WindowEvent e) {}

    @Override
    public void windowActivated(WindowEvent e) {}

    @Override
    public void windowDeactivated(WindowEvent e) {}
}
