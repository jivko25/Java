package gui.Modals;

import gui.Window.Window;

import javax.swing.*;

public class ModalController {

    public ModalController(){

    }

    public void displayPromotionPanel(){
        Window.getLayers().add(new PromotionPanel(), JLayeredPane.MODAL_LAYER);
    }

}
