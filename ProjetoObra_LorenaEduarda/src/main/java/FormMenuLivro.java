import javax.swing.JOptionPane;

public class FormMenuLivro extends javax.swing.JFrame {
    private GerencObra gerObra = GerencObra.getGerencObraUnic();
    private Livro l = new Livro();
    
    // SINGLETON
    private static FormMenuLivro formLivroUnic;

    private FormMenuLivro() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public static FormMenuLivro getFormLivroUnic() {
        if (formLivroUnic == null) {
            formLivroUnic = new FormMenuLivro();
        }
        return formLivroUnic;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitulo = new javax.swing.JLabel();
        lbAnoLanc = new javax.swing.JLabel();
        lbGen = new javax.swing.JLabel();
        lbNac = new javax.swing.JLabel();
        lbNome = new javax.swing.JLabel();
        lbNumPag = new javax.swing.JLabel();
        lbEditora = new javax.swing.JLabel();
        inpTitulo = new javax.swing.JTextField();
        inpAnoLanc = new javax.swing.JTextField();
        inpGen = new javax.swing.JTextField();
        inpNome = new javax.swing.JTextField();
        inpNac = new javax.swing.JTextField();
        inpNumPag = new javax.swing.JTextField();
        inpEditora = new javax.swing.JTextField();
        btCadastrar = new javax.swing.JButton();
        btConsultar = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btRelatGeral = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        comboLivro = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Livro");
        setPreferredSize(new java.awt.Dimension(504, 490));

        lbTitulo.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTitulo.setText("Título");

        lbAnoLanc.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lbAnoLanc.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbAnoLanc.setText("Ano de lançamento");

        lbGen.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lbGen.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbGen.setText("Gênero");

        lbNac.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lbNac.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbNac.setText("Nacionalidade do autor");

        lbNome.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lbNome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbNome.setText("Nome do autor");

        lbNumPag.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lbNumPag.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbNumPag.setText("Número de páginas");

        lbEditora.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lbEditora.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbEditora.setText("Editora");

        inpTitulo.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        inpTitulo.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        inpAnoLanc.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        inpAnoLanc.setPreferredSize(new java.awt.Dimension(81, 26));

        inpGen.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        inpGen.setPreferredSize(new java.awt.Dimension(81, 26));

        inpNome.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        inpNome.setPreferredSize(new java.awt.Dimension(81, 26));

        inpNac.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        inpNac.setPreferredSize(new java.awt.Dimension(81, 26));

        inpNumPag.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        inpNumPag.setPreferredSize(new java.awt.Dimension(81, 26));

        inpEditora.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        inpEditora.setPreferredSize(new java.awt.Dimension(81, 26));

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

        comboLivro.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        comboLivro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione uma opção" }));
        comboLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboLivroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbAnoLanc, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbGen, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbNome, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbNumPag, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbNac, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                                .addGap(37, 37, 37)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(inpAnoLanc, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inpTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inpGen, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inpNome, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inpNac, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inpNumPag, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inpEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(btRelatGeral, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(comboLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(31, 31, 31)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inpTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTitulo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inpAnoLanc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAnoLanc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inpGen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbGen))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(lbNac))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(inpNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbNome))))
                        .addGap(22, 22, 22)
                        .addComponent(lbNumPag))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(inpNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(inpNumPag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inpEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEditora))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btRelatGeral, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(83, Short.MAX_VALUE))
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
        cadastrarLivro();
        cbLivro();
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        consultarLivro();
    }//GEN-LAST:event_btConsultarActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        atualizarLivro();
        cbLivro();
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        excluirLivro();
        cbLivro();
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btRelatGeralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRelatGeralActionPerformed
        relatTab();
    }//GEN-LAST:event_btRelatGeralActionPerformed

    private void comboLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboLivroActionPerformed
        selectCbLivro();
    }//GEN-LAST:event_comboLivroActionPerformed

    public void cadastrarLivro() {
        l = new Livro();
        
        try {
            l.setTitulo(inpTitulo.getText());
        }
        catch(EntradaStrException estr) {
            estr.validarInpStr();
            limpar();
            return;
        }
        
        try {
            l.setAnoLancamento(Integer.parseInt(inpAnoLanc.getText()));
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
            l.setGenero(inpGen.getText());
        }
        catch(EntradaStrException estr) {
            estr.validarInpStr();
            limpar();
            return;
        }
        
        try {
            l.getAut().setNome(inpNome.getText());  // Reflexividade
        }
        catch(EntradaStrException estr) {
            estr.validarInpStr();
            limpar();
            return;
        }
        
        try {
            l.getAut().setNacionalidade(inpNac.getText());  // Reflexividade
        }
        catch(EntradaStrException estr) {
            estr.validarInpStr();
            limpar();
            return;
        }
        
        try {
            l.setNumPaginas(Integer.parseInt(inpNumPag.getText()));
        }
        catch(ValorMinException exv) {
            exv.validarInpNum();
            limpar();
            return;
        }
        catch(NumberFormatException nfex) {
            JOptionPane.showMessageDialog(
                null,
                "Erro: o número de páginas deve ser do tipo inteiro",
                "Erro ao cadastrar o número de páginas",
                JOptionPane.ERROR_MESSAGE
            );
            limpar();
            return;
        }
        
        try {
            l.setEditora(inpEditora.getText());
        }
        catch(EntradaStrException estr) {
            estr.validarInpStr();
            limpar();
            return;
        }
        
        l = gerObra.cadLivroGer(l);
        
        if (l != null) {
            JOptionPane.showMessageDialog(
                null,
                "Cadastro de livro realizado com sucesso!",
                "Cadastro de livro",
                JOptionPane.OK_OPTION
            );
        }
        else {
            JOptionPane.showMessageDialog(
                null,
                "Não foi possível concluir o cadastro, o título já existe",
                "Erro: cadastro de livro",
                JOptionPane.OK_OPTION
            );
        }
        limpar();
    }
    
    public void consultarLivro() {
        l = new Livro();
        
        try {
            l.setTitulo(inpTitulo.getText());
        }
        catch(EntradaStrException estr) {
            estr.validarInpStr();
            return;
        }
        
        l = gerObra.consultarLivroGer(l);
        
        if (l != null) {
            inpTitulo.setText(l.getTitulo());
            
            inpAnoLanc.setText(Integer.toString(l.getAnoLancamento()));
            
            inpGen.setText(l.getGenero());
            
            inpNome.setText(l.getAut().getNome());  // Reflexividade
            
            inpNac.setText(l.getAut().getNacionalidade());  // Reflexividade
            
            inpNumPag.setText(Integer.toString(l.getNumPaginas()));
            
            inpEditora.setText(l.getEditora());
            
            int tam_titulo = l.calcVal(l.getTitulo());
            int idade_obra = l.calcVal(l.getAnoLancamento());
            int tempo_leitura = l.processamentoVal();
            
            JOptionPane.showMessageDialog(
                null,
                "Dados do Livro",
                "Consulta de Livro",
                JOptionPane.OK_OPTION
            );
            
            JOptionPane.showMessageDialog(
                null,
                "Comprimento do título: " + tam_titulo,
                "Dados do Livro",
                JOptionPane.OK_OPTION
            );
            
            JOptionPane.showMessageDialog(
                null,
                "Idade do livro: " + idade_obra,
                "Dados do Livro",
                JOptionPane.OK_OPTION
            );
            
            JOptionPane.showMessageDialog(
                null,
                "Tempo médio de leitura: " + tempo_leitura + " minutos",
                "Dados do Livro",
                JOptionPane.OK_OPTION
            );
        }
        else {
            JOptionPane.showMessageDialog(
                null,
                "Título não encontrado",
                "Erro: consulta de livro",
                JOptionPane.OK_OPTION
            );
            limpar();
        }
    }
    
    public void atualizarLivro() {
        l = new Livro();
        
        try {
            l.setTitulo(inpTitulo.getText());
        }
        catch(EntradaStrException estr) {
            estr.validarInpStr();
        }
        
        l = gerObra.atualizarLivroGer(l);
        
        if (l != null) {
            inpTitulo.setText(l.getTitulo());
            
            inpAnoLanc.setText(Integer.toString(l.getAnoLancamento()));
            
            inpGen.setText(l.getGenero());
            
            inpNome.setText(l.getAut().getNome());  // Reflexividade
            
            inpNac.setText(l.getAut().getNacionalidade());  // Reflexividade
            
            inpNumPag.setText(Integer.toString(l.getNumPaginas()));
            
            inpEditora.setText(l.getEditora());
            
            JOptionPane.showMessageDialog(
                null,
                "Título alterado com sucesso",
                "Atualização de Livro",
                JOptionPane.OK_OPTION
            );
        }
        else {
            JOptionPane.showMessageDialog(
                null,
                "Não foi possível atualizar o título",
                "Erro ao atualizar o Livro",
                JOptionPane.OK_OPTION
            );
            return;
        }
        limpar();
    }
    
    public void excluirLivro() {
        l = new Livro();
        
        try {
            l.setTitulo(inpTitulo.getText());
        }
        catch(EntradaStrException estr) {
            estr.validarInpStr();
            return;
        }
        
        l = gerObra.excluirLivroGer(l);
        
        if (l == null) {
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
    
    public void relatTab() {
        FormRelLivroTab.getFormRelLivroTabUnic().setVisible(true);
    }
    
    public void cbLivro() {
        comboLivro.removeAllItems();
        comboLivro.addItem("Selecione uma opção");
        
        for (Livro l : gerObra.getBdLivro()) {
            comboLivro.addItem("Título: " + l.getTitulo() + "   |   Ano de lançamento: " + l.getAnoLancamento());
        }
    }
    
    public void selectCbLivro() {
        if (comboLivro.getSelectedIndex() >= 1) {
            String valLinha = comboLivro.getSelectedItem().toString();
            
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
        inpNumPag.setText("");
        inpEditora.setText("");
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
                new FormMenuLivro().setVisible(true);
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
    private javax.swing.JComboBox<String> comboLivro;
    private javax.swing.JTextField inpAnoLanc;
    private javax.swing.JTextField inpEditora;
    private javax.swing.JTextField inpGen;
    private javax.swing.JTextField inpNac;
    private javax.swing.JTextField inpNome;
    private javax.swing.JTextField inpNumPag;
    private javax.swing.JTextField inpTitulo;
    private javax.swing.JLabel lbAnoLanc;
    private javax.swing.JLabel lbEditora;
    private javax.swing.JLabel lbGen;
    private javax.swing.JLabel lbNac;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbNumPag;
    private javax.swing.JLabel lbTitulo;
    // End of variables declaration//GEN-END:variables
}
