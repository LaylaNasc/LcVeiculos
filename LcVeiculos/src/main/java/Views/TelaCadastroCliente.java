/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Views;

import Entidades.Cliente;
import Repository.ClienteRep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

/**
 *
 * @author layla
 */
public class TelaCadastroCliente extends javax.swing.JInternalFrame {

    private static TelaCadastroCliente instancia;
  

    public TelaCadastroCliente() {
        initComponents();
        inicializarEstadoBotoes();
    }

    public static TelaCadastroCliente getInstancia() {
        if (instancia == null) {
            instancia = new TelaCadastroCliente();
        }
        return instancia;
    }
    
    private void inicializarEstadoBotoes() {
        btnCadastraClint.setEnabled(true);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
    } 

    public void centralizar(JDesktopPane parent) {
        int parentWidth = parent.getWidth();
        int parentHeight = parent.getHeight();
        int width = this.getWidth();
        int height = this.getHeight();

        int x = (parentWidth - width) / 2;
        int y = (parentHeight - height) / 2;

        this.setLocation(x, y);
    }
    
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1CadastroVeiculo = new javax.swing.JPanel();
        jLabel1CadastroDeVeic = new javax.swing.JLabel();
        jLabelPlaca = new javax.swing.JLabel();
        jLabelFabricante = new javax.swing.JLabel();
        jLabelModelo = new javax.swing.JLabel();
        jLabelAnoModelo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelAcessorios = new javax.swing.JLabel();
        jTextFieldNomeClient = new javax.swing.JTextField();
        jTextFieldEnderecoClient = new javax.swing.JTextField();
        jTextFieldUf = new javax.swing.JTextField();
        btnCadastraClint = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextFieldEmailClient = new javax.swing.JTextField();
        jLCpfConsultar = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        lbErro = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnLimpar = new javax.swing.JButton();
        btnListarClientes = new javax.swing.JButton();
        fmtFTelefoneClient = new javax.swing.JFormattedTextField();
        ftmFCpfCliet = new javax.swing.JFormattedTextField();
        tfcpfConsultar = new javax.swing.JFormattedTextField();

        setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setTitle("Cadastro Cliente");
        getContentPane().setLayout(null);

        jPanel1CadastroVeiculo.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1CadastroDeVeic.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel1CadastroDeVeic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1CadastroDeVeic.setText("Cadastro de Cliente");
        jLabel1CadastroDeVeic.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        jLabelPlaca.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabelPlaca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPlaca.setText("Nome");
        jLabelPlaca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelFabricante.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabelFabricante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFabricante.setText("Endereço");
        jLabelFabricante.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelModelo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabelModelo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelModelo.setText("UF");
        jLabelModelo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelAnoModelo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabelAnoModelo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAnoModelo.setText("Telefone");
        jLabelAnoModelo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("CPF");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelAcessorios.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabelAcessorios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAcessorios.setText("Email");
        jLabelAcessorios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextFieldNomeClient.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextFieldEnderecoClient.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextFieldUf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnCadastraClint.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        btnCadastraClint.setText("Cadastrar");
        btnCadastraClint.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCadastraClint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrar(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jButton2.setText("Sair");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sair(evt);
            }
        });

        jTextFieldEmailClient.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLCpfConsultar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLCpfConsultar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLCpfConsultar.setText("CPF");
        jLCpfConsultar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnConsultar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Consultar(evt);
            }
        });

        btnAlterar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Alterar(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Excluir(evt);
            }
        });

        lbErro.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        lbErro.setForeground(new java.awt.Color(153, 51, 0));
        lbErro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbErro.setText("erro");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        btnLimpar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparCampos(evt);
            }
        });

        btnListarClientes.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        btnListarClientes.setText("Meus Clientes");
        btnListarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarClientes(evt);
            }
        });

        fmtFTelefoneClient.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        try {
            fmtFTelefoneClient.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        ftmFCpfCliet.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        try {
            ftmFCpfCliet.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftmFCpfCliet.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tfcpfConsultar.setBorder(new javax.swing.border.MatteBorder(null));
        try {
            tfcpfConsultar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfcpfConsultar.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel1CadastroVeiculoLayout = new javax.swing.GroupLayout(jPanel1CadastroVeiculo);
        jPanel1CadastroVeiculo.setLayout(jPanel1CadastroVeiculoLayout);
        jPanel1CadastroVeiculoLayout.setHorizontalGroup(
            jPanel1CadastroVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1CadastroVeiculoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1CadastroVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1CadastroVeiculoLayout.createSequentialGroup()
                        .addComponent(jLabel1CadastroDeVeic, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1CadastroVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1CadastroVeiculoLayout.createSequentialGroup()
                                .addGroup(jPanel1CadastroVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1CadastroVeiculoLayout.createSequentialGroup()
                                        .addGap(559, 559, 559)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1CadastroVeiculoLayout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(jLCpfConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1CadastroVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1CadastroVeiculoLayout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(lbErro, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1CadastroVeiculoLayout.createSequentialGroup()
                                                .addGap(36, 36, 36)
                                                .addComponent(tfcpfConsultar)))
                                        .addGap(18, 18, 18)
                                        .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnListarClientes, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1CadastroVeiculoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1CadastroVeiculoLayout.createSequentialGroup()
                        .addGroup(jPanel1CadastroVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1CadastroVeiculoLayout.createSequentialGroup()
                                .addComponent(jTextFieldEmailClient, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(103, 103, 103)
                                .addGroup(jPanel1CadastroVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1CadastroVeiculoLayout.createSequentialGroup()
                                        .addComponent(btnCadastraClint, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34)
                                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(fmtFTelefoneClient, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1CadastroVeiculoLayout.createSequentialGroup()
                                .addComponent(jLabelAcessorios, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(216, 216, 216)
                                .addComponent(jLabelAnoModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1CadastroVeiculoLayout.createSequentialGroup()
                                .addComponent(ftmFCpfCliet, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(171, 171, 171)
                                .addComponent(jTextFieldUf, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1CadastroVeiculoLayout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(216, 216, 216)
                                .addComponent(jLabelModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1CadastroVeiculoLayout.createSequentialGroup()
                                .addComponent(jTextFieldNomeClient, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(103, 103, 103)
                                .addComponent(jTextFieldEnderecoClient, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1CadastroVeiculoLayout.createSequentialGroup()
                                .addComponent(jLabelPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(216, 216, 216)
                                .addComponent(jLabelFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(43, 43, 43))))
        );
        jPanel1CadastroVeiculoLayout.setVerticalGroup(
            jPanel1CadastroVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1CadastroVeiculoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnListarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbErro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1CadastroVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1CadastroVeiculoLayout.createSequentialGroup()
                        .addGroup(jPanel1CadastroVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfcpfConsultar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addGroup(jPanel1CadastroVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLCpfConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1CadastroDeVeic, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1CadastroVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1CadastroVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEnderecoClient, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNomeClient, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1CadastroVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1CadastroVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldUf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1CadastroVeiculoLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(ftmFCpfCliet, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1CadastroVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAnoModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAcessorios, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1CadastroVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldEmailClient, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1CadastroVeiculoLayout.createSequentialGroup()
                        .addComponent(fmtFTelefoneClient, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)))
                .addGap(21, 21, 21)
                .addGroup(jPanel1CadastroVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastraClint, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(12, 12, 12))
        );

        getContentPane().add(jPanel1CadastroVeiculo);
        jPanel1CadastroVeiculo.setBounds(0, 5, 880, 510);

        setBounds(0, 0, 886, 546);
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrar
        Cliente obj = new Cliente();
        ClienteRep cli = new ClienteRep();
        obj.setNomeCliente(jTextFieldNomeClient.getText());
        obj.setEmail(jTextFieldEmailClient.getText());
        obj.setCpf(ftmFCpfCliet.getText());
        obj.setEndereco(jTextFieldEnderecoClient.getText());
        obj.setTelefone(fmtFTelefoneClient.getText());
        obj.setUf(jTextFieldUf.getText());        
        cli.cadastrarCliente(obj);
        limpar();
    }//GEN-LAST:event_cadastrar

    private void Consultar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Consultar
        ClienteRep clienteRep = new ClienteRep();

    try {
        String cpf = tfcpfConsultar.getText();

        if (cpf == null || cpf.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, insira um CPF válido.");
            return;
        }

        Cliente cliente = clienteRep.procurarCliente(cpf);

        if (cliente == null) {
            lbErro.setText("Cliente não encontrado.");
        
            return;
        }

        jTextFieldNomeClient.setText(cliente.getNomeCliente());
        jTextFieldEmailClient.setText(cliente.getEmail());
        jTextFieldEnderecoClient.setText(cliente.getEndereco());
        jTextFieldUf.setText(cliente.getUf());
        fmtFTelefoneClient.setText(cliente.getTelefone());
        ftmFCpfCliet.setText(cliente.getCpf());

        btnExcluir.setEnabled(true);
        btnAlterar.setEnabled(true);

    } catch (Exception ex) {
        Logger.getLogger(TelaCadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Ocorreu um erro ao consultar o cliente: " + ex.getMessage());
    }

    }//GEN-LAST:event_Consultar

    private void Alterar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Alterar

         try {
        ClienteRep cli = new ClienteRep();
        Cliente obj = cli.procurarCliente(tfcpfConsultar.getText());
        if(obj != null){
        obj.setNomeCliente(jTextFieldNomeClient.getText());
        obj.setEmail(jTextFieldEmailClient.getText());
        obj.setCpf(ftmFCpfCliet.getText());
        obj.setEndereco(jTextFieldEnderecoClient.getText());
        obj.setTelefone(fmtFTelefoneClient.getText());
        obj.setUf(jTextFieldUf.getText());        
        cli.alterarCliente(obj);
        }
        JOptionPane.showMessageDialog(null, "Cliente alterado com sucesso!");
        TelaListaCliente.getInstancia().atualizarTabelaClientes();
        limpar();

    } catch (Exception ex) {
        Logger.getLogger(TelaCadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Erro ao alterar o cliente: " + ex.getMessage());
    }
    }//GEN-LAST:event_Alterar

    private void Excluir(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Excluir
        
        ClienteRep clienteRep = new ClienteRep();

    try {
        Cliente cliente = new Cliente();
        cliente.setCpf(tfcpfConsultar.getText());
        cliente.setNomeCliente(jTextFieldNomeClient.getText());
        cliente.setEmail(jTextFieldEmailClient.getText());
        cliente.setEndereco(jTextFieldEnderecoClient.getText());
        cliente.setUf(jTextFieldUf.getText());
        cliente.setTelefone(fmtFTelefoneClient.getText());

        int resposta = JOptionPane.showConfirmDialog(null, "Você deseja realmente excluir o Cliente?", "Confirmação de Exclusão", JOptionPane.YES_NO_OPTION);

        if (resposta == JOptionPane.YES_OPTION) {
            try {
                clienteRep.excluir(cliente);
                JOptionPane.showMessageDialog(null, "Cliente excluído com sucesso.");
                limpar();
            } catch (Exception ex) {
                if (ex.getMessage().contains("veículo que não foi entregue")) {
                    JOptionPane.showMessageDialog(null, "Não é possível excluir o cliente, há um veículo que não foi entregue.");
                } else {
                    JOptionPane.showMessageDialog(null, "Erro ao excluir o cliente: " + ex.getMessage());
                }
                limpar();
            }
        } else {
            JOptionPane.showMessageDialog(null, "A exclusão foi cancelada.");
        }
    } catch (Exception ex) {
        Logger.getLogger(TelaCadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Ocorreu um erro ao excluir o cliente: " + ex.getMessage());
    }

    }//GEN-LAST:event_Excluir

    private void Sair(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sair
        this.dispose();
    }//GEN-LAST:event_Sair

    private void limparCampos(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparCampos
        // TODO add your handling code here:
        jTextFieldNomeClient.setText("");
        jTextFieldEnderecoClient.setText("");
        fmtFTelefoneClient.setText("");
        jTextFieldEmailClient.setText("");
        jTextFieldUf.setText("");
        ftmFCpfCliet.setText("");
        tfcpfConsultar.setText("");
        lbErro.setText("");
    }//GEN-LAST:event_limparCampos

    private void listarClientes(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarClientes
        TelaListaCliente telaListaCliente = TelaListaCliente.getInstancia();
    if (!telaListaCliente.isVisible()) {
        getParent().add(telaListaCliente);
        telaListaCliente.centralizar((JDesktopPane) getParent());
        telaListaCliente.setVisible(true);
    } else {
        telaListaCliente.requestFocus();
    }
    }//GEN-LAST:event_listarClientes
 
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastraClint;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnListarClientes;
    private javax.swing.JFormattedTextField fmtFTelefoneClient;
    private javax.swing.JFormattedTextField ftmFCpfCliet;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLCpfConsultar;
    private javax.swing.JLabel jLabel1CadastroDeVeic;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelAcessorios;
    private javax.swing.JLabel jLabelAnoModelo;
    private javax.swing.JLabel jLabelFabricante;
    private javax.swing.JLabel jLabelModelo;
    private javax.swing.JLabel jLabelPlaca;
    private javax.swing.JPanel jPanel1CadastroVeiculo;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldEmailClient;
    private javax.swing.JTextField jTextFieldEnderecoClient;
    private javax.swing.JTextField jTextFieldNomeClient;
    private javax.swing.JTextField jTextFieldUf;
    private javax.swing.JLabel lbErro;
    private javax.swing.JFormattedTextField tfcpfConsultar;
    // End of variables declaration//GEN-END:variables

public void limpar(){
    jTextFieldNomeClient.setText("");
    jTextFieldEnderecoClient.setText("");
    fmtFTelefoneClient.setText("");
    jTextFieldEmailClient.setText("");
    jTextFieldUf.setText("");
    ftmFCpfCliet.setText("");
    tfcpfConsultar.setText("");
    lbErro.setText("");
    
     inicializarEstadoBotoes();
}
  
} 