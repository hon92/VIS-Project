/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import entity.Customer;
import entity.Employee;
import java.awt.Frame;

/**
 *
 * @author Honza
 */
public class CustomerDialog extends javax.swing.JDialog
{

    /**
     * Creates new form CustomerDialog
     */
    private Customer customer = null;
    private Employee owner = null;

    public CustomerDialog(java.awt.Frame parent, boolean modal, Customer customer)
    {
        this(parent, modal);
        this.customer = customer;
        initData();

    }

    public CustomerDialog(java.awt.Frame parent, boolean modal, Employee owner)
    {
        this(parent, modal);
        this.owner = owner;
    }

    protected CustomerDialog(Frame parent, boolean modal)
    {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e)
            {
                customer = null;
                dispose();
            }
        });

    }

    private void initData()
    {
        textFieldName.setText(customer.getName());
        textFieldLastName.setText(customer.getLastName());
        textFieldEmail.setText(customer.getEmail());
        textFieldPassword.setText(customer.getPassWord());
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textFieldName = new javax.swing.JTextField();
        textFieldLastName = new javax.swing.JTextField();
        textFieldEmail = new javax.swing.JTextField();
        textFieldPassword = new javax.swing.JTextField();
        buttonConfirm = new javax.swing.JButton();
        buttonStorno = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Customer dialog");

        jLabel1.setText("Name");

        jLabel2.setText("Last name");

        jLabel3.setText("Email");

        jLabel4.setText("Password");

        buttonConfirm.setText("Confirm");
        buttonConfirm.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                buttonConfirmActionPerformed(evt);
            }
        });

        buttonStorno.setText("Storno");
        buttonStorno.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                buttonStornoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldPassword)
                            .addComponent(textFieldEmail)
                            .addComponent(textFieldLastName)
                            .addComponent(textFieldName)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addComponent(buttonStorno, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textFieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonConfirm)
                    .addComponent(buttonStorno))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonConfirmActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_buttonConfirmActionPerformed
    {//GEN-HEADEREND:event_buttonConfirmActionPerformed
        createCustomer();
        dispose();
    }//GEN-LAST:event_buttonConfirmActionPerformed

    private void buttonStornoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_buttonStornoActionPerformed
    {//GEN-HEADEREND:event_buttonStornoActionPerformed
        // TODO add your handling code here:
        customer = null;
        dispose();
    }//GEN-LAST:event_buttonStornoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonConfirm;
    private javax.swing.JButton buttonStorno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField textFieldEmail;
    private javax.swing.JTextField textFieldLastName;
    private javax.swing.JTextField textFieldName;
    private javax.swing.JTextField textFieldPassword;
    // End of variables declaration//GEN-END:variables

    public void createCustomer()
    {
        if (customer != null)
        {
            customer.setName(textFieldName.getText());
            customer.setLastName(textFieldLastName.getText());
            customer.setEmail(textFieldEmail.getText());
            customer.setPassWord(textFieldPassword.getText());
        }

        else
        {

            customer = new Customer(
                    textFieldName.getText(),
                    textFieldLastName.getText(),
                    textFieldEmail.getText(),
                    textFieldPassword.getText(),
                    owner);
        }
    }

    public Customer getCustomer()
    {
        return customer;
    }
}
