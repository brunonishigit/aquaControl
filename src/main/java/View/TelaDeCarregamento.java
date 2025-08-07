/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author Hirok
 */
public class TelaDeCarregamento extends javax.swing.JFrame {
    private int usuarioId;

    /**
     * Creates new form TelaDeCarregamento
     */
    public TelaDeCarregamento(int usuarioId) {
        this.usuarioId = usuarioId;
        initComponents();
        iniciarCarregamento(); // Já inicia ao abrir
    }
    
    public void iniciarCarregamento() {
    new Thread(() -> {
        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(100);
                final int progresso = i;

                SwingUtilities.invokeLater(() -> {
                    loadingvalue.setText(progresso + "%");
                    loadingbar.setValue(progresso);

                    if (progresso == 10) {
                        dicas.setText("Água é vida. Economize cada gota");
                    } else if (progresso == 30) {
                        dicas.setText("Feche a torneira! Cada segundo conta");
                    } else if (progresso == 50) {
                        dicas.setText("Sem água, não há futuro.");
                    } else if (progresso == 70) {
                        dicas.setText("Preservar hoje para não faltar amanhã.");
                    } else if (progresso == 90) {
                        dicas.setText("Cuidar da água é cuidar da terra.");
                    }
                });
            }
            
             // Ao final, abre a próxima tela (opcional) e fecha esta
                SwingUtilities.invokeLater(() -> {
                    System.out.println("Usuario ID para CRUDTela: " + usuarioId);
                    dispose();
                    CRUDTela tela = new CRUDTela(usuarioId);
                    tela.setVisible(true);
            });
            
        } catch (InterruptedException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }).start();
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        loadingbar = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        loadingvalue = new javax.swing.JLabel();
        dicas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Blue Modern Dolphin Logo Design (1).png"))); // NOI18N

        loadingbar.setBackground(new java.awt.Color(0, 102, 102));
        loadingbar.setForeground(new java.awt.Color(0, 102, 102));
        loadingbar.setBorderPainted(false);
        loadingbar.setStringPainted(true);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Carregando...");

        loadingvalue.setText("0%");

        dicas.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        dicas.setForeground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(loadingvalue, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(56, 56, 56))
                    .addComponent(loadingbar, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(dicas, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(dicas, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loadingvalue, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loadingbar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dicas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar loadingbar;
    private javax.swing.JLabel loadingvalue;
    // End of variables declaration//GEN-END:variables
}
