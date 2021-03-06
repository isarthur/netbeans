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
package org.netbeans.modules.php.project.ui.customizer;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;
import org.netbeans.spi.project.ui.support.ProjectCustomizer;
import org.openide.awt.Mnemonics;
import org.openide.util.NbBundle;

public class TestingProviderPanel extends JPanel {

    private static final ActionListener NOOP_ACTION_LISTENER = new NoopActionListener();

    private final ProjectCustomizer.Category category;
    private final PhpProjectProperties uiProps;
    private final String providerIdentifier;
    private final JComponent providerComponent;
    private final ActionListener originalStoreListener;
    private final ActionListener originalOkButtonListener;

    // @GuardedBy("EDT")
    private boolean originalCategoryValid;
    // @GuardedBy("EDT")
    private String originalErrorMessage;


    TestingProviderPanel(ProjectCustomizer.Category category, PhpProjectProperties uiProps,
            String providerIdentifier, JComponent providerComponent) {
        assert EventQueue.isDispatchThread();
        assert category != null;
        assert uiProps != null;
        assert providerIdentifier != null;
        assert providerComponent != null;

        this.category = category;
        this.uiProps = uiProps;
        this.providerIdentifier = providerIdentifier;
        this.providerComponent = providerComponent;
        originalStoreListener = category.getStoreListener();
        originalOkButtonListener = category.getOkButtonListener();
        rememberValues();

        initComponents();
        init();
    }

    private void init() {
        assert EventQueue.isDispatchThread();
        if (uiProps.getTestingProviders().contains(providerIdentifier)) {
            showProviderPanel();
        } else {
            hideProviderPanel();
        }
    }

    public String getProviderIdentifier() {
        return providerIdentifier;
    }

    public void showProviderPanel() {
        assert EventQueue.isDispatchThread();
        // switch ui
        notActiveLabel.setVisible(false);
        providerPanel.add(providerComponent, BorderLayout.CENTER);
        // restore values
        category.setStoreListener(originalStoreListener);
        category.setOkButtonListener(originalOkButtonListener);
        category.setErrorMessage(originalErrorMessage);
        category.setValid(originalCategoryValid);
    }

    public void hideProviderPanel() {
        assert EventQueue.isDispatchThread();
        rememberValues();
        // switch ui
        category.setStoreListener(NOOP_ACTION_LISTENER);
        category.setOkButtonListener(NOOP_ACTION_LISTENER);
        notActiveLabel.setVisible(true);
        providerPanel.remove(providerComponent);
        category.setErrorMessage(null);
        category.setValid(true);
    }

    private void rememberValues() {
        assert EventQueue.isDispatchThread();
        originalCategoryValid = category.isValid();
        originalErrorMessage = category.getErrorMessage();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        notActiveLabel = new JLabel();
        providerPanel = new JPanel();

        Mnemonics.setLocalizedText(notActiveLabel, NbBundle.getMessage(TestingProviderPanel.class, "TestingProviderPanel.notActiveLabel.text")); // NOI18N

        providerPanel.setLayout(new BorderLayout());

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(providerPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(notActiveLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(notActiveLabel)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(providerPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JLabel notActiveLabel;
    private JPanel providerPanel;
    // End of variables declaration//GEN-END:variables

    //~ Inner classes

    private static final class NoopActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // noop
        }

    }

}
