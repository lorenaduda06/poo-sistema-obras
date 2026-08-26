import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormRelFilmeTab extends javax.swing.JFrame {
    private GerencObra gerObra = GerencObra.getGerencObraUnic();
    private Filme f = new Filme();

    // SINGLETON
    private static FormRelFilmeTab formRelFilmeTabUnic;
    
    private FormRelFilmeTab() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public static FormRelFilmeTab getFormRelFilmeTabUnic() {
        if (formRelFilmeTabUnic == null) {
            formRelFilmeTabUnic = new FormRelFilmeTab();
        }
        return formRelFilmeTabUnic;
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        containerTabFIlmes = new javax.swing.JScrollPane();
        tabFilmes = new javax.swing.JTable();
        btSair = new javax.swing.JButton();
        lbTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        tabFilmes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "TÍTULO", "ANO DE LANÇAMENTO", "GÊNERO", "NOME DO AUTOR", "NACIONALIDADE DO AUTOR", "DURAÇÃO", "DIREÇÃO"
            }
        ));
        tabFilmes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabFilmesMouseClicked(evt);
            }
        });
        containerTabFIlmes.setViewportView(tabFilmes);

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        lbTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbTitulo.setText("Relatório geral de Filmes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(containerTabFIlmes, javax.swing.GroupLayout.DEFAULT_SIZE, 1140, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btSair)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(434, 434, 434))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lbTitulo)
                .addGap(18, 18, 18)
                .addComponent(containerTabFIlmes, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btSair)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        listarTabFilme();
    }//GEN-LAST:event_formWindowActivated

    private void tabFilmesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabFilmesMouseClicked
        selecionarTab();
    }//GEN-LAST:event_tabFilmesMouseClicked

    public void listarTabFilme() {
        DefaultTableModel modelo = (DefaultTableModel) tabFilmes.getModel();
        
        int posicaoLinha = 0;
        
        modelo.setRowCount(posicaoLinha);
        
        for (Filme f : gerObra.getBdFilme()) {
            modelo.insertRow(posicaoLinha, new Object[]{
                f.getTitulo(), f.getAnoLancamento(), f.getGenero(),
                f.getAut().getNome(), f.getAut().getNacionalidade(),    // Reflexividade
                f.getDuracao(), f.getDiretor()
            });
            posicaoLinha++;
        }
    }
    
    public void selecionarTab() {
        String valor_linhaTab = "";
        
        int posicaoLinha = tabFilmes.getSelectedRow();
        
        for (int col = 0; col < tabFilmes.getColumnCount(); col++) {
            valor_linhaTab += tabFilmes.getModel().getValueAt(posicaoLinha, col).toString();
            
            if (col + 1 < tabFilmes.getColumnCount()) {
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
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormRelFilmeTab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormRelFilmeTab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormRelFilmeTab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormRelFilmeTab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormRelFilmeTab().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSair;
    private javax.swing.JScrollPane containerTabFIlmes;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JTable tabFilmes;
    // End of variables declaration//GEN-END:variables
}
