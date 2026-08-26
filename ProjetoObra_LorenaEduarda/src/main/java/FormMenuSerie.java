import javax.swing.JOptionPane;

public class FormMenuSerie extends javax.swing.JFrame {
    private GerencObra gerObra = GerencObra.getGerencObraUnic();
    private Serie s = new Serie();

    // SINGLETON
    private static FormMenuSerie formSerieUnic;
    
    private FormMenuSerie() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public static FormMenuSerie getFormSerieUnic() {
        if (formSerieUnic == null) {
            formSerieUnic = new FormMenuSerie();
        }
        return formSerieUnic;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btCadastrar = new javax.swing.JButton();
        btConsultar = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btRelatGeral = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        lbTitulo = new javax.swing.JLabel();
        lbAnoLanc = new javax.swing.JLabel();
        lbGen = new javax.swing.JLabel();
        lbNome = new javax.swing.JLabel();
        lbNac = new javax.swing.JLabel();
        lbNumTemp = new javax.swing.JLabel();
        lbTotalEp = new javax.swing.JLabel();
        inpTitulo = new javax.swing.JTextField();
        inpAnoLanc = new javax.swing.JTextField();
        inpGen = new javax.swing.JTextField();
        inpNome = new javax.swing.JTextField();
        inpNac = new javax.swing.JTextField();
        inpNumTemp = new javax.swing.JTextField();
        inpTotalEp = new javax.swing.JTextField();
        comboSerie = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Série");

        btCadastrar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        btConsultar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btConsultar.setText("Consultar");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        btAlterar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btAlterar.setText("Alterar");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        btExcluir.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btLimpar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btRelatGeral.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btRelatGeral.setText("Relatório Geral");
        btRelatGeral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRelatGeralActionPerformed(evt);
            }
        });

        btSair.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        lbTitulo.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lbTitulo.setText("Título");

        lbAnoLanc.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lbAnoLanc.setText("Ano de lançamento");

        lbGen.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lbGen.setText("Gênero");

        lbNome.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lbNome.setText("Nome do autor");

        lbNac.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lbNac.setText("Nacionalidade do autor");

        lbNumTemp.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lbNumTemp.setText("Número de temporadas");

        lbTotalEp.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lbTotalEp.setText("Total de episódios");

        inpTitulo.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        inpAnoLanc.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        inpGen.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        inpNome.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        inpNac.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        inpNumTemp.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        inpTotalEp.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        comboSerie.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        comboSerie.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione uma opção" }));
        comboSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSerieActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbGen, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAnoLanc, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNome, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbNumTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTotalEp, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inpTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inpAnoLanc, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inpGen, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inpNome, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inpNac, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inpNumTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inpTotalEp, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(btRelatGeral, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btLimpar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboSerie, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inpTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTitulo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inpAnoLanc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAnoLanc))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inpGen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbGen))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inpNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNome))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inpNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNac))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inpNumTemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNumTemp))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inpTotalEp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTotalEp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btRelatGeral, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        cadastrarSerie();
        cbSerie();
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        consultarSerie();
    }//GEN-LAST:event_btConsultarActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        atualizarSerie();
        cbSerie();
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        excluirSerie();
        cbSerie();
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btRelatGeralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRelatGeralActionPerformed
        relatTabGeral();
    }//GEN-LAST:event_btRelatGeralActionPerformed

    private void comboSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSerieActionPerformed
        selectCbSerie();
    }//GEN-LAST:event_comboSerieActionPerformed

    public void cadastrarSerie() {
        s = new Serie();
        
        try {
            s.setTitulo(inpTitulo.getText());
        }
        catch(EntradaStrException estr) {
            estr.validarInpStr();
            limpar();
            return;
        }
        
        try {
            s.setAnoLancamento(Integer.parseInt(inpAnoLanc.getText()));
        }
        catch(ValorMinException exv) {
            exv.validarInpNum();
            limpar();
            return;
        }
        catch(NumberFormatException nfex) {
            JOptionPane.showMessageDialog(
                null,
                "Erro: o ano de lançamento deve ser um número do tipo inteiro",
                "Erro ao cadastrar o ano de lançamento",
                JOptionPane.ERROR_MESSAGE
            );
            limpar();
            return;
        }
        
        try {
            s.setGenero(inpGen.getText());
        }
        catch(EntradaStrException estr) {
            estr.validarInpStr();
            limpar();
            return;
        }
        
        try {
            s.getAut().setNome(inpNome.getText());  // Reflexividade
        }
        catch(EntradaStrException estr) {
            estr.validarInpStr();
            limpar();
            return;
        }
        
        try {
            s.getAut().setNacionalidade(inpNac.getText());  // Reflexividade
        }
        catch(EntradaStrException estr) {
            estr.validarInpStr();
            limpar();
            return;
        }
        
        try {
            s.setNumTemporadas(Integer.parseInt(inpNumTemp.getText()));
        }
        catch(ValorMinException exv) {
            exv.validarInpNum();
            limpar();
            return;
        }
        catch(NumberFormatException nfex) {
            JOptionPane.showMessageDialog(
                null,
                "Erro: o número de temporadas deve ser um número do tipo inteiro",
                "Erro ao cadastrar o número de temporadas",
                JOptionPane.ERROR_MESSAGE
            );
            limpar();
            return;
        }
        
        try {
            s.setTotalEpisodios(Integer.parseInt(inpTotalEp.getText()));
        }
        catch(ValorMinException exv) {
            exv.validarInpNum();
            limpar();
            return;
        }
        catch(NumberFormatException nfex) {
            JOptionPane.showMessageDialog(
                null,
                "Erro: o número total de episódios deve ser um número do tipo inteiro",
                "Erro ao cadastrar o número total de episódios",
                JOptionPane.ERROR_MESSAGE
            );
            limpar();
            return;
        }
        
        s = gerObra.cadSerieGer(s);
        
        if (s != null) {
            JOptionPane.showMessageDialog(
                null,
                "Cadastro de série realizado com sucesso!",
                "Cadastro de série",
                JOptionPane.OK_OPTION
            );
        }
        else {
            JOptionPane.showMessageDialog(
                null,
                "Não foi possível concluir o cadastro, o título já existe",
                "Erro: cadastro de série",
                JOptionPane.OK_OPTION
            );
        }
        limpar();
    }
    
    public void consultarSerie() {
        s = new Serie();
        
        try {
            s.setTitulo(inpTitulo.getText());
        }
        catch(EntradaStrException estr) {
            estr.validarInpStr();
            return;
        }
        
        s = gerObra.consultarSerieGer(s);
        
        if (s != null) {
            inpTitulo.setText(s.getTitulo());
            
            inpAnoLanc.setText(Integer.toString(s.getAnoLancamento()));
            
            inpGen.setText(s.getGenero());
            
            inpNome.setText(s.getAut().getNome());  // Reflexividade
            
            inpNac.setText(s.getAut().getNacionalidade());  // Reflexividade
            
            inpNumTemp.setText(Integer.toString(s.getNumTemporadas()));
            
            inpTotalEp.setText(Integer.toString(s.getTotalEpisodios()));
            
            int tam_titulo = s.calcVal(s.getTitulo());
            int idade_obra = s.calcVal(s.getAnoLancamento());
            
            JOptionPane.showMessageDialog(
                null,
                "Dados da Série",
                "Consulta de Série",
                JOptionPane.OK_OPTION
            );
            
            JOptionPane.showMessageDialog(
                null,
                "Comprimento do título: " + tam_titulo,
                "Dados da Série",
                JOptionPane.OK_OPTION
            );
            
            JOptionPane.showMessageDialog(
                null,
                "Idade da série: " + idade_obra,
                "Dados da Série",
                JOptionPane.OK_OPTION
            );
        }
        else {
            JOptionPane.showMessageDialog(
                null,
                "Título não encontrado",
                "Erro: consulta de série",
                JOptionPane.OK_OPTION
            );
            limpar();
        }
    }
    
    public void atualizarSerie() {
        s = new Serie();
        
        try {
            s.setTitulo(inpTitulo.getText());
        }
        catch(EntradaStrException estr) {
            estr.validarInpStr();
        }
        
        s = gerObra.atualizarSerieGer(s);
        
        if (s != null) {
            inpTitulo.setText(s.getTitulo());
            
            inpAnoLanc.setText(Integer.toString(s.getAnoLancamento()));
            
            inpGen.setText(s.getGenero());
            
            inpNome.setText(s.getAut().getNome());  // Reflexividade
            
            inpNac.setText(s.getAut().getNacionalidade());  // Reflexividade
            
            inpNumTemp.setText(Integer.toString(s.getNumTemporadas()));
            
            inpTotalEp.setText(Integer.toString(s.getTotalEpisodios()));
            
            JOptionPane.showMessageDialog(
                null,
                "Título alterado com sucesso",
                "Atualização de Série",
                JOptionPane.OK_OPTION
            );
        }
        else {
            JOptionPane.showMessageDialog(
                null,
                "Não foi possível atualizar o título",
                "Erro ao atualizar a Série",
                JOptionPane.OK_OPTION
            );
            return;
        }
        limpar();
    }
    
    public void excluirSerie() {
        s = new Serie();
        
        try {
            s.setTitulo(inpTitulo.getText());
        }
        catch(EntradaStrException estr) {
            estr.validarInpStr();
            return;
        }
        
        s = gerObra.excluirSerieGer(s);
        
        if (s == null) {
            JOptionPane.showMessageDialog(
                null,
                "O título foi excluído com sucesso",
                "Remoção de Livro",
                JOptionPane.OK_OPTION
            );
        }
        else {
            JOptionPane.showMessageDialog(
                null,
                "Não foi possível excluir o título",
                "Erro ao remover o título",
                JOptionPane.OK_OPTION
            );
            return;
        }
        limpar();
    }
    
    public void relatTabGeral() {
        FormRelSerieTab.getFormRelSerieTabUnic().setVisible(true);
    }
    
    public void cbSerie() {
        comboSerie.removeAllItems();
        comboSerie.addItem("Selecione uma opção");
        
        for (Serie s : gerObra.getBdSerie()) {
            comboSerie.addItem("Título: " + s.getTitulo() + "   |   Ano de lançamento: " + s.getAnoLancamento());
        }
    }
    
    public void selectCbSerie() {
        if (comboSerie.getSelectedIndex() >= 1) {
            String valLinha = comboSerie.getSelectedItem().toString();
            
            JOptionPane.showMessageDialog(
                null,
                "Informações da obra selecionada:\n" + valLinha,
                "Dados da obra escolhida",
                JOptionPane.INFORMATION_MESSAGE
            );
        }
    }
    
    public void limpar() {
        inpTitulo.setText("");
        inpAnoLanc.setText("");
        inpGen.setText("");
        inpNome.setText("");
        inpNac.setText("");
        inpNumTemp.setText("");
        inpTotalEp.setText("");
        inpTitulo.requestFocus();
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
            java.util.logging.Logger.getLogger(FormMenuSerie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMenuSerie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMenuSerie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMenuSerie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMenuSerie().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btRelatGeral;
    private javax.swing.JButton btSair;
    private javax.swing.JComboBox<String> comboSerie;
    private javax.swing.JTextField inpAnoLanc;
    private javax.swing.JTextField inpGen;
    private javax.swing.JTextField inpNac;
    private javax.swing.JTextField inpNome;
    private javax.swing.JTextField inpNumTemp;
    private javax.swing.JTextField inpTitulo;
    private javax.swing.JTextField inpTotalEp;
    private javax.swing.JLabel lbAnoLanc;
    private javax.swing.JLabel lbGen;
    private javax.swing.JLabel lbNac;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbNumTemp;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbTotalEp;
    // End of variables declaration//GEN-END:variables
}
