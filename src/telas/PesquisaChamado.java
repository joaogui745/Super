package telas;

import Locadora.ListaChamados;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Locadora.Chamado;

public class PesquisaChamado extends javax.swing.JFrame {
    private int indexUltimo;

    public PesquisaChamado() {
        initComponents();
    }
    
    public void mostrarChamado(Chamado chamado, int index){
        indexUltimo = index;
        DefaultTableModel modelo = new DefaultTableModel(new Object[] {"Data", "Tipo", "Origem", "Destino", "Cliente"},0);
        Object linha[] = new Object[] {chamado.getData(), chamado.getTipo(), chamado.getOrigem(), chamado.getDestino(), chamado.getCliente().getNome()};
        modelo.addRow(linha);
        tblChamado.setModel(modelo);
        tblChamado.setDefaultEditor(Object.class, null);
    }
    public void clearPesquisa(){
        txtData.setText("");
        txtData.requestFocus();
    }
    
    private void clearTabela(){
        DefaultTableModel modelo = (DefaultTableModel) tblChamado.getModel();
        modelo.setRowCount(0);
        tblChamado.revalidate();
    }
    public void selectTable(){
        tblChamado.setRowSelectionInterval(0, 0);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPesquisa = new javax.swing.JPanel();
        lblData = new javax.swing.JLabel();
        btnOK = new javax.swing.JButton();
        txtData = new javax.swing.JFormattedTextField();
        pnlLista = new javax.swing.JPanel();
        scrChamado = new javax.swing.JScrollPane();
        tblChamado = new javax.swing.JTable();
        btnEditar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pesquisa de Chamados");

        pnlPesquisa.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar"));

        lblData.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblData.setText("Data:");

        btnOK.setBackground(java.awt.Color.lightGray);
        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        try {
            txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout pnlPesquisaLayout = new javax.swing.GroupLayout(pnlPesquisa);
        pnlPesquisa.setLayout(pnlPesquisaLayout);
        pnlPesquisaLayout.setHorizontalGroup(
            pnlPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPesquisaLayout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnOK)
                .addContainerGap(167, Short.MAX_VALUE))
        );
        pnlPesquisaLayout.setVerticalGroup(
            pnlPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPesquisaLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(pnlPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblData)
                    .addComponent(btnOK)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        tblChamado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Data", "Tipo", "Origem", "Destino", "Cliente"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblChamado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblChamadoMouseClicked(evt);
            }
        });
        scrChamado.setViewportView(tblChamado);

        javax.swing.GroupLayout pnlListaLayout = new javax.swing.GroupLayout(pnlLista);
        pnlLista.setLayout(pnlListaLayout);
        pnlListaLayout.setHorizontalGroup(
            pnlListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlListaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(scrChamado, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlListaLayout.setVerticalGroup(
            pnlListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrChamado, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pencil.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setEnabled(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/voltar.png"))); // NOI18N
        btnCancelar.setText("Voltar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/x.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(pnlLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addGap(18, 18, 18)
                .addComponent(btnExcluir)
                .addGap(18, 18, 18)
                .addComponent(btnEditar)
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar)
                    .addComponent(btnCancelar)
                    .addComponent(btnExcluir))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        String data = txtData.getText();
        if (data.charAt(9) == ' '){
            JOptionPane.showMessageDialog(null, "Preencha a data corretamente!", "Aviso", JOptionPane.WARNING_MESSAGE);
            clearTabela();
        }
        else{
        int i = 0;
            boolean found = false;
            while (! found && i < ListaChamados.size()){
                if (data.equals(ListaChamados.get(i).getData())){
                    found = true;
                    break;
                }
                i += 1;
            }
            if (found){
                mostrarChamado(ListaChamados.get(i), i);
            }
            else{
                JOptionPane.showMessageDialog(null, "Chamado não encontrado!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                clearTabela();
            }
            
        }
    }//GEN-LAST:event_btnOKActionPerformed

    private void tblChamadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblChamadoMouseClicked
        int row = tblChamado.getSelectedRow();
        if (row == 0){
            btnExcluir.setEnabled(true);
            btnEditar.setEnabled(true);
        }
    }//GEN-LAST:event_tblChamadoMouseClicked

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        ListaChamados.remove(indexUltimo);
        // Zerar a Tabela
        DefaultTableModel modelo = (DefaultTableModel) tblChamado.getModel();
        modelo.setRowCount(0);
        tblChamado.revalidate();
        btnExcluir.setEnabled(false);
        btnEditar.setEnabled(false);
        JOptionPane.showMessageDialog(null, "Chamado Excluido!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        clearPesquisa();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        boolean edit = true;
        new InsereDadosChamado(edit, this, indexUltimo).setVisible(true);
    }//GEN-LAST:event_btnEditarActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnOK;
    private javax.swing.JLabel lblData;
    private javax.swing.JPanel pnlLista;
    private javax.swing.JPanel pnlPesquisa;
    private javax.swing.JScrollPane scrChamado;
    private javax.swing.JTable tblChamado;
    private javax.swing.JFormattedTextField txtData;
    // End of variables declaration//GEN-END:variables
}
