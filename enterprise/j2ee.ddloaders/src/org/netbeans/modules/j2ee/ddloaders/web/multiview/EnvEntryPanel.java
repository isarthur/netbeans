/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.netbeans.modules.j2ee.ddloaders.web.multiview;

/**
 * EnvEntryPanel.java
 * Panel for adding/editing env entries
 *
 * Created on April 11, 2005
 * @author  mkuchtiak
 */
public class EnvEntryPanel extends javax.swing.JPanel {

    /** Creates new form FilterMappingPanel */
    public EnvEntryPanel() {
        initComponents();
        org.netbeans.modules.xml.multiview.Utils.makeTextAreaLikeTextField(descriptionTA, nameTF);
    }

    void setEnvEntryName(String name) {
        nameTF.setText(name);
    }
    
    void setEnvEntryType(String type) {
        typeCB.setSelectedItem(type);
    }
    
    void setEnvEntryValue(String val) {
        valueTF.setText(val);
    }
    
    void setDescription(String val) {
        descriptionTA.setText(val);
    }
    
    String getEnvEntryName() {
        return nameTF.getText();
    }
    
    String getEnvEntryType() {
        return (String)typeCB.getSelectedItem();
    }
    
    String getEnvEntryValue() {
        return valueTF.getText();
    }
    
    String getDescription() {
        return descriptionTA.getText();
    }
    
    javax.swing.JTextField getNameTF() {
        return nameTF;
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup1 = new javax.swing.ButtonGroup();
        nameLabel = new javax.swing.JLabel();
        nameTF = new javax.swing.JTextField();
        typeLabel = new javax.swing.JLabel();
        typeCB = new javax.swing.JComboBox();
        valueLabel = new javax.swing.JLabel();
        valueTF = new javax.swing.JTextField();
        descriptionLabel = new javax.swing.JLabel();
        descriptionTA = new javax.swing.JTextArea();

        setLayout(new java.awt.GridBagLayout());

        nameLabel.setLabelFor(nameTF);
        org.openide.awt.Mnemonics.setLocalizedText(nameLabel, org.openide.util.NbBundle.getMessage(EnvEntryPanel.class, "LBL_EnvEntryName")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 12, 0, 0);
        add(nameLabel, gridBagConstraints);

        nameTF.setColumns(20);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 12, 0, 12);
        add(nameTF, gridBagConstraints);

        typeLabel.setLabelFor(typeCB);
        org.openide.awt.Mnemonics.setLocalizedText(typeLabel, org.openide.util.NbBundle.getMessage(EnvEntryPanel.class, "LBL_EnvEntryType")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 12, 0, 0);
        add(typeLabel, gridBagConstraints);

        typeCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "java.lang.String", "java.lang.Boolean", "java.lang.Character", "java.lang.Integer", "java.lang.Byte", "java.lang.Short", "java.lang.Long", "java.lang.Float", "java.lang.Double" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 12, 0, 12);
        add(typeCB, gridBagConstraints);

        valueLabel.setLabelFor(valueTF);
        org.openide.awt.Mnemonics.setLocalizedText(valueLabel, org.openide.util.NbBundle.getMessage(EnvEntryPanel.class, "LBL_EnvEntryValue")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 12, 0, 0);
        add(valueLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 12, 0, 12);
        add(valueTF, gridBagConstraints);

        descriptionLabel.setLabelFor(descriptionTA);
        org.openide.awt.Mnemonics.setLocalizedText(descriptionLabel, org.openide.util.NbBundle.getMessage(EnvEntryPanel.class, "LBL_description")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 12, 0, 0);
        add(descriptionLabel, gridBagConstraints);

        descriptionTA.setRows(3);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 12, 0, 12);
        add(descriptionTA, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JTextArea descriptionTA;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTF;
    private javax.swing.JComboBox typeCB;
    private javax.swing.JLabel typeLabel;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JTextField valueTF;
    // End of variables declaration//GEN-END:variables
    
}