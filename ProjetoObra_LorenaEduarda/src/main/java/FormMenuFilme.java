import javax.swing.JOptionPane;

public class FormMenuFilme extends javax.swing.JFrame {
    private GerencObra gerObra = GerencObra.getGerencObraUnic();
    private Filme f = new Filme();

    // SINGLETON
    private static FormMenuFilme formFilmeUnic;
    
    private FormMenuFilme() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public static FormMenuFilme getFormFilmeUnic() {
        if (formFilmeUnic == null) {
            formFilmeUnic = new FormMenuFilme();
        }
        return formFilmeUnic;
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
        lbTitulo1 = new javax.swing.JLabel();
        lbTitulo2 = new javax.swing.JLabel();
        lbTitulo3 = new javax.swing.JLabel();
        lbTitulo4 = new javax.swing.JLabel();
        lbTitulo5 = new javax.swing.JLabel();
        lbTitulo6 = new javax.swing.JLabel();
        inpTitulo = new javax.swing.JTextField();
        inpAnoLanc = new javax.swing.JTextField();
        inpGen = new javax.swing.JTextField();
        inpNome = new javax.swing.JTextField();
        inpNac = new javax.swing.JTextField();
        inpDuracao = new javax.swing.JTextField();
        inpDiretor = new javax.swing.JTextField();
        comboFilme = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Filme");

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

        lbTitulo1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lbTitulo1.setText("Ano de lançamento");

        lbTitulo2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lbTitulo2.setText("Gênero");

        lbTitulo3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lbTitulo3.setText("Nome do autor");

        lbTitulo4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lbTitulo4.setText("Nacionalidade do autor");

        lbTitulo5.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lbTitulo5.setText("Duração do filme (HH:MM:SS)");

        lbTitulo6.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lbTitulo6.setText("Diretor do filme");

        inpTitulo.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        inpAnoLanc.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        inpGen.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        inpNome.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        inpNac.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        inpDuracao.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        inpDiretor.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        comboFilme.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        comboFilme.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione uma opção" }));
        comboFilme.setPreferredSize(new java.awt.Dimension(165, 24));
        comboFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboFilmeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTitulo5, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbTitulo4, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbTitulo6, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inpDiretor, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(inpNac, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(inpDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 145, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(comboFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(28, 28, 28))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbTitulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbTitulo3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(98, 98, 98)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(inpGen, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(inpNome, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(inpAnoLanc, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(inpTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(btRelatGeral, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTitulo)
                    .addComponent(inpTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTitulo1)
                    .addComponent(inpAnoLanc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTitulo2)
                    .addComponent(inpGen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTitulo3)
                    .addComponent(inpNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTitulo4)
                    .addComponent(inpNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTitulo5)
                    .addComponent(inpDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTitulo6)
                    .addComponent(inpDiretor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btRelatGeral, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(comboFilme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(68, Short.MAX_VALUE))
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
        cadastrarFilme();
        cbFilme();
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        consultarFilme();
    }//GEN-LAST:event_btConsultarActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        atualizarFilme();
        cbFilme();
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        excluirFilme();
        cbFilme();
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btRelatGeralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRelatGeralActionPerformed
        relatTabGeral();
    }//GEN-LAST:event_btRelatGeralActionPerformed

    private void comboFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboFilmeActionPerformed
        selectCbFilme();
    }//GEN-LAST:event_comboFilmeActionPerformed

    public void cadastrarFilme() {
        f = new Filme();
        
        try {
            f.setTitulo(inpTitulo.getText());
        }
        catch(EntradaStrException estr) {
            estr.validarInpStr();
            limpar();
            return;
        }
        
        try {
            f.setAnoLancamento(Integer.parseInt(inpAnoLanc.getText()));
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
            f.setGenero(inpGen.getText());
        }
        catch(EntradaStrException estr) {
            estr.validarInpStr();
            limpar();
            return;
        }
        
        try {
            f.getAut().setNome(inpNome.getText());  // Reflexividade
        }
        catch(EntradaStrException estr) {
            estr.validarInpStr();
            limpar();
            return;
        }
        
        try {
            f.getAut().setNacionalidade(inpNac.getText());  // Reflexividade
        }
        catch(EntradaStrException estr) {
            estr.validarInpStr();
            limpar();
            return;
        }
        
        try {
            f.setDuracao(inpDuracao.getText());
        }
        catch(EntradaStrException estr) {
            estr.validarInpStr();
            limpar();
            return;
        }
        
        try {
            f.setDiretor(inpDiretor.getText());
        }
        catch(EntradaStrException estr) {
            estr.validarInpStr();
            limpar();
            return;
        }
        
        f = gerObra.cadFilmeGer(f);
        
        if (f != null) {
            JOptionPane.showMessageDialog(
                null,
                "Cadastro de filme realizado com sucesso!",
                "Cadastro de filme",
                JOptionPane.OK_OPTION
            );
        }
        else {
            JOptionPane.showMessageDialog(
                null,
                "Não foi possível concluir o cadastro, o título já existe",
                "Erro: cadastro de filme",
                JOptionPane.OK_OPTION
            );
        }
        limpar();
    }
    
    public void consultarFilme() {
        f = new Filme();
        
        try {
            f.setTitulo(inpTitulo.getText());
        }
        catch(EntradaStrException estr) {
            estr.validarInpStr();
            return;
        }
        
        f = gerObra.consultarFilmeGer(f);
        
        if (f != null) {
            inpTitulo.setText(f.getTitulo());
            
            inpAnoLanc.setText(Integer.toString(f.getAnoLancamento()));
            
            inpGen.setText(f.getGenero());
            
            inpNome.setText(f.getAut().getNome());  // Reflexividade
            
            inpNac.setText(f.getAut().getNacionalidade());  // Reflexividade
            
            inpDuracao.setText(f.getDuracao());
            
            inpDiretor.setText(f.getDiretor());
            
            int tam_titulo = f.calcVal(f.getTitulo());
            int idade_obra = f.calcVal(f.getAnoLancamento());
            
            JOptionPane.showMessageDialog(
                null,
                "Dados do Filme",
                "Consulta de Filme",
                JOptionPane.OK_OPTION
            );
            
            JOptionPane.showMessageDialog(
                null,
                "Comprimento do título: " + tam_titulo,
                "Dados do Filme",
                JOptionPane.OK_OPTION
            );
            
            JOptionPane.showMessageDialog(
                null,
                "Idade do filme: " + idade_obra,
                "Dados do Filme",
                JOptionPane.OK_OPTION
            );
        }
        else {
            JOptionPane.showMessageDialog(
                null,
                "Título não encontrado",
                "Erro: consulta de filme",
                JOptionPane.OK_OPTION
            );
            limpar();
        }
    }
    
    public void atualizarFilme() {
        f = new Filme();
        
        try {
            f.setTitulo(inpTitulo.getText());
        }
        catch(EntradaStrException estr) {
            estr.validarInpStr();
        }
        
        f = gerObra.atualizarFilmeGer(f);
        
        if (f != null) {
            inpTitulo.setText(f.getTitulo());
            
            inpAnoLanc.setText(Integer.toString(f.getAnoLancamento()));
            
            inpGen.setText(f.getGenero());
            
            inpNome.setText(f.getAut().getNome());  // Reflexividade
            
            inpNac.setText(f.getAut().getNacionalidade());  // Reflexividade
            
            inpDuracao.setText(f.getDuracao());
            
            inpDiretor.setText(f.getDiretor());
            
            JOptionPane.showMessageDialog(
                null,
                "Título alterado com sucesso",
                "Atualização de Filme",
                JOptionPane.OK_OPTION
            );
        }
        else {
            JOptionPane.showMessageDialog(
                null,
                "Não foi possível atualizar o título",
                "Erro ao atualizar o Filme",
                JOptionPane.OK_OPTION
            );
            return;
        }
        limpar();
    }
    
    public void excluirFilme() {
        f = new Filme();
        
        try {
            f.setTitulo(inpTitulo.getText());
        }
        catch(EntradaStrException estr) {
            estr.validarInpStr();
        }
        
        f = gerObra.excluirFilmeGer(f);
        
        if (f == null) {
            JOptionPane.showMessageDialog(
                null,
                "O título foi excluído com sucesso",
                "Remoção de Filme",
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
        FormRelFilmeTab.getFormRelFilmeTabUnic().setVisible(true);
    }
    
    public void cbFilme() {
        comboFilme.removeAllItems();
        comboFilme.addItem("Selecione uma opção");
        
        for (Filme f : gerObra.getBdFilme()) {
            comboFilme.addItem("Título: " + f.getTitulo() + "   |   Ano de lançamento: " + f.getAnoLancamento());
        }
    }
    
    public void selectCbFilme() {
        if (comboFilme.getSelectedIndex() >= 1) {
            String valLinha = comboFilme.getSelectedItem().toString();
            
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
        inpDuracao.setText("");
        inpDiretor.setText("");
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
            java.util.logging.Logger.getLogger(FormMenuLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMenuLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMenuLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMenuLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMenuFilme().setVisible(true);
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
    private javax.swing.JComboBox<String> comboFilme;
    private javax.swing.JTextField inpAnoLanc;
    private javax.swing.JTextField inpDiretor;
    private javax.swing.JTextField inpDuracao;
    private javax.swing.JTextField inpGen;
    private javax.swing.JTextField inpNac;
    private javax.swing.JTextField inpNome;
    private javax.swing.JTextField inpTitulo;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbTitulo1;
    private javax.swing.JLabel lbTitulo2;
    private javax.swing.JLabel lbTitulo3;
    private javax.swing.JLabel lbTitulo4;
    private javax.swing.JLabel lbTitulo5;
    private javax.swing.JLabel lbTitulo6;
    // End of variables declaration//GEN-END:variables
}
