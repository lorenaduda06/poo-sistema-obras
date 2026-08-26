import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormRelLivroTab extends javax.swing.JFrame {
    private GerencObra gerObra = GerencObra.getGerencObraUnic();
    private Livro l = new Livro();

    // SINGLETON
    private static FormRelLivroTab formRelLivroTabUnic;
    
    private FormRelLivroTab() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public static FormRelLivroTab getFormRelLivroTabUnic() {
        if (formRelLivroTabUnic == null) {
            formRelLivroTabUnic = new FormRelLivroTab();
        }
        return formRelLivroTabUnic;
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btSair = new javax.swing.JButton();
        containerTabLivros = new javax.swing.JScrollPane();
        tabLivros = new javax.swing.JTable();
        lbTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        tabLivros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "TÍTULO", "ANO DE LANÇAMENTO", "GÊNERO", "NOME DO AUTOR", "NACIONALIDADE DO AUTOR", "NÚMERO DE PÁGINAS", "EDITORA"
            }
        ));
        tabLivros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabLivrosMouseClicked(evt);
            }
        });
        containerTabLivros.setViewportView(tabLivros);

        lbTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbTitulo.setText("Relatório geral de Livros");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(containerTabLivros, javax.swing.GroupLayout.DEFAULT_SIZE, 1074, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btSair)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(452, 452, 452)
                .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btSair)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(containerTabLivros, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(23, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        listarTabLivro();
    }//GEN-LAST:event_formWindowActivated

    private void tabLivrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabLivrosMouseClicked
        selecionarTab();
    }//GEN-LAST:event_tabLivrosMouseClicked

    public void listarTabLivro() {
        DefaultTableModel modelo = (DefaultTableModel) tabLivros.getModel();
        
        int posicaoLinha = 0;
        
        modelo.setRowCount(posicaoLinha);
        
        for (Livro l : gerObra.getBdLivro()) {
            modelo.insertRow(posicaoLinha, new Object[]{
                l.getTitulo(), l.getAnoLancamento(), l.getGenero(),
                l.getAut().getNome(), l.getAut().getNacionalidade(),    // Reflexividade
                l.getNumPaginas(), l.getEditora()
            });
            posicaoLinha++;
        }
    }
    
    public void selecionarTab() {
        String valor_linhaTab = "";
        
        int posicaoLinha = tabLivros.getSelectedRow();
        
        for (int col = 0; col < tabLivros.getColumnCount(); col++) {
            valor_linhaTab += tabLivros.getModel().getValueAt(posicaoLinha, col).toString();
            
            if (col + 1 < tabLivros.getColumnCount()) {
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
            java.util.logging.Logger.getLogger(FormRelLivroTab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormRelLivroTab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormRelLivroTab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormRelLivroTab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormRelLivroTab().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSair;
    private javax.swing.JScrollPane containerTabLivros;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JTable tabLivros;
    // End of variables declaration//GEN-END:variables
}
