package pianoInterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

public class MyFrame extends JFrame implements ActionListener {
    private MyButton myButton;
    private Notes notes;
    private JLabel jLabel1, jLabel;
    public MyFrame() {
        setSize(500, 300);
        setTitle("Ma fenêtre");
        setLayout(new BorderLayout());
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.createPiano();
        this.myButton = new MyButton();
    }

    public void createPiano() {
        this.notes=new Notes();
        jLabel = new JLabel("Ceci n'est pas un piano");
        jLabel1 = new JLabel("Mais presque...");
        JPanel jp = new JPanel();
        GridLayout gridLayout = new GridLayout(1, 8);
        jp.setBackground(Color.BLACK);
        jp.setLayout(gridLayout);

        for (Map.Entry mapentry : notes.getNotes().entrySet()) {
            myButton = new MyButton(mapentry.getValue().toString());
            jp.add(myButton);
            myButton.addActionListener(this);
        }
        this.add(jLabel, BorderLayout.NORTH);
        this.add(jp, BorderLayout.CENTER);
        this.add(jLabel1, BorderLayout.SOUTH);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        int valeur = 0;
        for (Map.Entry map : notes.getNotes().entrySet()) {
            if (map.getValue().toString().equals(((MyButton) source).getText())) {
                valeur = (int) map.getKey();
            }
        }
        jLabel1.setText("___ " + ((MyButton) source).getText() + " de code midi " +valeur);

    }
}
