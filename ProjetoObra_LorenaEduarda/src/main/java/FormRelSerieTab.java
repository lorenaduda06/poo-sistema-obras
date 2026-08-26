import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormRelSerieTab extends javax.swing.JFrame {
    private GerencObra gerObra = GerencObra.getGerencObraUnic();
    private Serie s = new Serie();

    // SINGLETON
    private static FormRelSerieTab formRelSerieTabUnic;
    
    private FormRelSerieTab() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public static FormRelSerieTab getFormRelSerieTabUnic() {
        if (formRelSerieTabUnic == null) {
            formRelSerieTabUnic = new FormRelSerieTab();
        }
        return formRelSerieTabUnic;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        containerTabSeries = new javax.swing.JScrollPane();
        tabSeries = new javax.swing.JTable();
        btSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        tabSeries.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "TÍTULO", "ANO DE LANÇAMENTO", "GÊNERO", "NOME DO AUTOR", "NACIONALIDADE DO AUTOR", "NÚMERO DE TEMPORADAS", "TOTAL DE EPISÓDIOS"
            }
        ));
        tabSeries.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabSeriesMouseClicked(evt);
            }
        });
        containerTabSeries.setViewportView(tabSeries);

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Relatório geral de Séries");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(containerTabSeries, javax.swing.GroupLayout.DEFAULT_SIZE, 1162, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btSair)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(454, 454, 454))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(containerTabSeries, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btSair))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        listarTabSerie();
    }//GEN-LAST:event_formWindowActivated

    private void tabSeriesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabSeriesMouseClicked
        selecionarTab();
    }//GEN-LAST:event_tabSeriesMouseClicked

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    public void listarTabSerie() {
        DefaultTableModel modelo = (DefaultTableModel) tabSeries.getModel();
        
        int posicaoLinha = 0;
        
        modelo.setRowCount(posicaoLinha);
        
        for (Serie s : gerObra.getBdSerie()) {
            modelo.insertRow(posicaoLinha, new Object[]{
                s.getTitulo(), s.getAnoLancamento(), s.getGenero(),
                s.getAut().getNome(), s.getAut().getNacionalidade(),    // Reflexividade
                s.getNumTemporadas(), s.getTotalEpisodios()
            });
            posicaoLinha++;
        }
    }
    
    public void selecionarTab() {
        String valor_linhaTab = "";
        
        int posicaoLinha = tabSeries.getSelectedRow();
        
        for (int col = 0; col < tabSeries.getColumnCount(); col++) {
            valor_linhaTab += tabSeries.getModel().getValueAt(posicaoLinha, col).toString();
            
            if (col + 1 < tabSeries.getColumnCount()) {
                valor_linhaTab += "\n";
            }
        }
        
        JOptionPane.showMessageDialog(
            null,
            "Dados cadastrados na linha " + posicaoLinha + " são:\n" + valor_linhaTab,
            "Registros da tabela",
            JOptionPane.OK_OPTION
        );
    }
    
    public void sair() {
        int resp;
        resp = JOptionPane.showConfirmDialog(
                null,
                "Deseja realmente sair?",
                "Sair",
                JOptionPane.YES_NO_OPTION
        );
        
        if (resp == 0) {
            dispose();
        }
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormRelSerieTab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormRelSerieTab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormRelSerieTab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormRelSerieTab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormRelSerieTab().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSair;
    private javax.swing.JScrollPane containerTabSeries;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTable tabSeries;
    // End of variables declaration//GEN-END:variables
}
