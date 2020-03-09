package gui.Menu.EditMenu.Buttons;

import Engine.GameState;
import Engine.Movement.MovementControls.MoveHistory;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RedoButton extends JMenuItem {

    public RedoButton(){
        this.setText("Redo");


        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GameState.history.redo();
            }
        });

    }
}
