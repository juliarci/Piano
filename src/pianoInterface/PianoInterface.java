package pianoInterface;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

public class PianoInterface {
    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame();
        myFrame.setLayout(new BorderLayout());
        JLabel jLabel = new JLabel("Ceci n'est pas un piano");
        JLabel jLabel1=new JLabel("Mais presque...");
        JPanel jp = new JPanel();
        jp.setBackground(Color.BLACK);
        GridLayout gridLayout = new GridLayout(1, 8);
        Notes notes = new Notes();
        jp.setLayout(gridLayout);

        for (Map.Entry mapentry : notes.getNotes().entrySet()) {
            MyButton myButton=new MyButton(mapentry.getValue().toString());
            jp.add(myButton);
        }

        myFrame.add(jLabel, BorderLayout.NORTH);
        myFrame.add(jp, BorderLayout.CENTER);
        myFrame.add(jLabel1, BorderLayout.SOUTH);
        myFrame.setVisible(true);
    }
}
