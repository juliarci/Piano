package pianoInterface;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyButton extends JButton implements ActionListener {


    public MyButton() {
        super();
        initBouton();
    }


    public MyButton(String titre) {
        super(titre);
        initBouton();
    }

    private void initBouton() { this.addActionListener((ActionListener) this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(this.getText());

    }
}
