package com.usjt.aquacontrol;

import View.LoginTela;

public class AquaControl {
    public static void main(String[] args) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginTela().setVisible(true);
            }
        });
    }
}
