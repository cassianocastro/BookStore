package view;

import controller.ConfigController;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;

/**
 *
 *
 */
public class ConfigView extends JFrame
{

    private final ConfigController controller;

    public ConfigView(ConfigController controller)
    {
        super("Configurações");

        this.controller = controller;

        this.initComponents();
        this.initListeners();

        super.setLocationRelativeTo(null);
        super.setVisible(true);
    }

    private void initListeners()
    {
        this.cancelButton.addActionListener((ActionEvent e) ->
        {
            super.dispose();
        });

        this.saveButton.addActionListener((ActionEvent event) ->
        {
            this.controller.saveConfiguration();
        });
    }

    public String[] getConfig()
    {
        String[] args = new String[6];

        args[0] = this.portField    .getText();
        args[1] = this.hostField    .getText();
        args[2] = this.driverField  .getText();
        args[3] = this.databaseField.getText();
        args[4] = this.userField    .getText();
        args[5] = String.valueOf(this.passwordField.getPassword());

        return args;
    }

    public void setConfig(String[] args)
    {
        this.hostField    .setText(args[0]);
        this.portField    .setText(args[1]);
        this.databaseField.setText(args[2]);
        this.userField    .setText(args[3]);
        this.passwordField.setText(args[4]);
        this.driverField  .setText(args[5]);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new JPanel();
        jLabel8 = new JLabel();
        jLabel7 = new JLabel();
        jPanel2 = new JPanel();
        labelResponse = new JLabel();
        jPanel3 = new JPanel();
        jPanel4 = new JPanel();
        hostField = new JTextField();
        portField = new JTextField();
        databaseField = new JTextField();
        userField = new JTextField();
        passwordField = new JPasswordField();
        driverField = new JTextField();
        saveButton = new JButton();
        cancelButton = new JButton();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Configurações de acesso ao banco de dados");
        setBackground(new Color(236, 235, 243));
        setResizable(false);

        jPanel1.setBackground(new Color(194, 1, 20));

        jLabel8.setIcon(new ImageIcon(getClass().getResource("/lib/img/iconfinder_6593863_and_config_configuration_files_folder_icon_64px.png"))); // NOI18N

        jLabel7.setIcon(new ImageIcon(getClass().getResource("/lib/img/settings-gears.png"))); // NOI18N

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel8)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(30, 30, 30))
        );

        jPanel2.setBackground(new Color(12, 18, 12));

        labelResponse.setFont(new Font("Dialog", 1, 15)); // NOI18N
        labelResponse.setForeground(new Color(236, 235, 243));
        labelResponse.setHorizontalAlignment(SwingConstants.CENTER);
        labelResponse.setToolTipText("");

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(labelResponse, GroupLayout.PREFERRED_SIZE, 264, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(labelResponse, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBackground(new Color(173, 30, 45));

        GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new Color(236, 235, 243));

        hostField.setBackground(new Color(236, 235, 243));
        hostField.setForeground(new Color(12, 18, 12));
        hostField.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(12, 18, 12), 2), "Servidor/IP", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Liberation Sans", 0, 15), new Color(12, 18, 12))); // NOI18N
        hostField.setCaretColor(new Color(194, 1, 20));
        hostField.setSelectedTextColor(new Color(236, 235, 243));
        hostField.setSelectionColor(new Color(152, 58, 69));

        portField.setBackground(new Color(236, 235, 243));
        portField.setForeground(new Color(12, 18, 12));
        portField.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(12, 18, 12), 2), "Porta", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Liberation Sans", 0, 15), new Color(12, 18, 12))); // NOI18N
        portField.setCaretColor(new Color(194, 1, 20));
        portField.setSelectedTextColor(new Color(236, 235, 243));
        portField.setSelectionColor(new Color(152, 58, 69));

        databaseField.setBackground(new Color(236, 235, 243));
        databaseField.setForeground(new Color(12, 18, 12));
        databaseField.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(12, 18, 12), 2), "Base de Dados", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Liberation Sans", 0, 15), new Color(12, 18, 12))); // NOI18N
        databaseField.setCaretColor(new Color(194, 1, 20));
        databaseField.setSelectedTextColor(new Color(236, 235, 243));
        databaseField.setSelectionColor(new Color(152, 58, 69));

        userField.setBackground(new Color(236, 235, 243));
        userField.setForeground(new Color(12, 18, 12));
        userField.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(12, 18, 12), 2), "Usuário", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Liberation Sans", 0, 15), new Color(12, 18, 12))); // NOI18N
        userField.setCaretColor(new Color(194, 1, 20));
        userField.setSelectedTextColor(new Color(236, 235, 243));
        userField.setSelectionColor(new Color(152, 58, 69));

        passwordField.setBackground(new Color(236, 235, 243));
        passwordField.setForeground(new Color(12, 18, 12));
        passwordField.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(12, 18, 12), 2), "Senha", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Liberation Sans", 0, 15), new Color(12, 18, 12))); // NOI18N
        passwordField.setCaretColor(new Color(194, 1, 20));
        passwordField.setSelectedTextColor(new Color(236, 235, 243));
        passwordField.setSelectionColor(new Color(152, 58, 69));

        driverField.setEditable(false);
        driverField.setBackground(new Color(236, 235, 243));
        driverField.setForeground(new Color(12, 18, 12));
        driverField.setText("mysql");
        driverField.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(12, 18, 12), 2), "Banco", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Liberation Sans", 0, 15), new Color(12, 18, 12))); // NOI18N
        driverField.setCaretColor(new Color(194, 1, 20));
        driverField.setSelectedTextColor(new Color(236, 235, 243));
        driverField.setSelectionColor(new Color(152, 58, 69));

        saveButton.setBackground(new Color(194, 1, 20));
        saveButton.setFont(new Font("Dialog", 1, 15)); // NOI18N
        saveButton.setForeground(new Color(12, 18, 12));
        saveButton.setText("Salvar");
        saveButton.setBorder(BorderFactory.createLineBorder(new Color(194, 1, 20), 3));
        saveButton.setContentAreaFilled(false);
        saveButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        saveButton.setFocusPainted(false);
        saveButton.setVerifyInputWhenFocusTarget(false);

        cancelButton.setBackground(new Color(194, 1, 20));
        cancelButton.setFont(new Font("Dialog", 1, 15)); // NOI18N
        cancelButton.setForeground(new Color(12, 18, 12));
        cancelButton.setText("Cancelar");
        cancelButton.setBorder(BorderFactory.createLineBorder(new Color(194, 1, 20), 3));
        cancelButton.setContentAreaFilled(false);
        cancelButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        cancelButton.setFocusPainted(false);

        GroupLayout jPanel4Layout = new GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                    .addGroup(GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addComponent(saveButton, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelButton, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))
                    .addComponent(driverField, GroupLayout.Alignment.LEADING)
                    .addComponent(passwordField, GroupLayout.Alignment.LEADING)
                    .addComponent(userField, GroupLayout.Alignment.LEADING)
                    .addComponent(databaseField, GroupLayout.Alignment.LEADING)
                    .addComponent(portField, GroupLayout.Alignment.LEADING)
                    .addComponent(hostField, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(hostField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(portField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(databaseField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(driverField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelButton, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton cancelButton;
    private JTextField databaseField;
    private JTextField driverField;
    private JTextField hostField;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JPanel jPanel4;
    private JLabel labelResponse;
    private JPasswordField passwordField;
    private JTextField portField;
    private JButton saveButton;
    private JTextField userField;
    // End of variables declaration//GEN-END:variables
}