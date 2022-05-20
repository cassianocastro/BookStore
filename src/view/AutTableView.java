package view;

import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.List;
import model.dao.AuthorDAO;
import model.dao.ConnectionSingleton;
import org.json.JSONObject;

/**
 *
 *
 */
public class AutTableView extends JFrame
{

    private int id;

    public AutTableView(BookView parent)
    {
        super("Autores Cadastrados");

        this.initComponents();
        this.initListeners(parent);
        this.loadTable();

        super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        super.setResizable(false);
        super.setLocationRelativeTo(null);
    }

    public int getID()
    {
        return this.id;
    }

    private void loadTable()
    {
        try
        {
            DefaultTableModel model = (DefaultTableModel) this.table.getModel();

            while ( this.table.getRowCount() > 0 )
            {
                model.removeRow(0);
            }
            Connection connection = ConnectionSingleton.getInstance();
            List<JSONObject> list = new AuthorDAO(connection).read();
            
            for ( JSONObject json : list )
            {
                model.addRow(
                    new Object[]
                    {
                        json.getInt("authorID"),
                        json.getString("firstName")
                        + " "
                        + json.getString("lastName")
                    }
                );
            }
        } catch (SQLException e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    private void initListeners(BookView parent)
    {
        this.buttonOkay.addActionListener((ActionEvent e) ->
        {
            int row = table.getSelectedRow();

            if ( row != -1 )
            {
                id = (int) table.getValueAt(row, 0);
                parent.getFieldAuthor().setText(String.valueOf(id));
            }
            dispose();
        });

        this.buttonCancel.addActionListener((ActionEvent e) ->
        {
            dispose();
        });
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

        jPanel3 = new JPanel();
        jPanel4 = new JPanel();
        jPanel1 = new JPanel();
        jPanel2 = new JPanel();
        jScrollPane1 = new JScrollPane();
        table = new JTable();
        buttonCancel = new JButton();
        buttonOkay = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new Color(173, 30, 45));

        GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new Color(12, 18, 12));

        GroupLayout jPanel4Layout = new GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new Color(194, 1, 20));

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new Color(236, 235, 243));

        table.setBackground(new Color(236, 235, 243));
        table.setForeground(new Color(12, 18, 12));
        table.setModel(new DefaultTableModel(
            new Object [][]
            {
                {null, null, null}
            },
            new String []
            {
                "ID", "Autor", "Title 3"
            }
        )
        {
            Class[] types = new Class []
            {
                Integer.class, String.class, Object.class
            };
            boolean[] canEdit = new boolean []
            {
                false, false, true
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        table.setToolTipText("");
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        table.setFillsViewportHeight(true);
        table.setGridColor(new Color(12, 18, 12));
        table.setSelectionBackground(new Color(152, 58, 69));
        table.setSelectionForeground(new Color(236, 235, 243));
        table.setShowGrid(true);
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0)
        {
            table.getColumnModel().getColumn(0).setPreferredWidth(150);
            table.getColumnModel().getColumn(1).setPreferredWidth(300);
        }

        buttonCancel.setBackground(new Color(236, 235, 243));
        buttonCancel.setFont(new Font("Dialog", 1, 14)); // NOI18N
        buttonCancel.setForeground(new Color(12, 18, 12));
        buttonCancel.setText("Cancelar");
        buttonCancel.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        buttonCancel.setContentAreaFilled(false);
        buttonCancel.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        buttonCancel.setFocusPainted(false);

        buttonOkay.setBackground(new Color(236, 235, 243));
        buttonOkay.setFont(new Font("Dialog", 1, 14)); // NOI18N
        buttonOkay.setForeground(new Color(12, 18, 12));
        buttonOkay.setText("Okay");
        buttonOkay.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        buttonOkay.setContentAreaFilled(false);
        buttonOkay.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        buttonOkay.setFocusPainted(false);

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 142, Short.MAX_VALUE)
                        .addComponent(buttonOkay, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonCancel, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 312, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonOkay, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCancel, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton buttonCancel;
    private JButton buttonOkay;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JPanel jPanel4;
    private JScrollPane jScrollPane1;
    private JTable table;
    // End of variables declaration//GEN-END:variables
}