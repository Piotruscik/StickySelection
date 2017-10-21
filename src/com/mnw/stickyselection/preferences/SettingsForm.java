package com.mnw.stickyselection.preferences;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;

import javax.swing.*;
import java.awt.*;

public class SettingsForm {

    private JCheckBox checkboxCycleThrough;
    private JButton buttonAddSelectionGroup;
    private JLabel refreshWarning;
    private JPanel panelColorScheme;
    private JPanel mainPanel;

    public JCheckBox getCheckboxCycleThrough() {
        return checkboxCycleThrough;
    }

    public JButton getButtonAddSelectionGroup() {
        return buttonAddSelectionGroup;
    }

    public JLabel getRefreshWarning() {
        return refreshWarning;
    }

    public JPanel getPanelColorScheme() {
        return panelColorScheme;
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     */
    private void $$$setupUI$$$() {
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayoutManager(3, 1, new Insets(0, 0, 0, 0), -1, -1));
        checkboxCycleThrough = new JCheckBox();
        checkboxCycleThrough.setText(
                "\"When navigating to next selection, start from the beginning of the document if we reached the end "
                        + "(similar for \\\"previous\\\" navigation)");
        mainPanel.add(checkboxCycleThrough,
                      new GridConstraints(0,
                                          0,
                                          1,
                                          1,
                                          GridConstraints.ANCHOR_WEST,
                                          GridConstraints.FILL_NONE,
                                          GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                                          GridConstraints.SIZEPOLICY_FIXED,
                                          null,
                                          null,
                                          null,
                                          0,
                                          false));
        refreshWarning = new JLabel();
        refreshWarning.setForeground(new Color(-4493708));
        refreshWarning.setText(
                "In order to make actions correcly reflected in the Keymap section, reopening settings may be "
                        + "necessary.");
        refreshWarning.setVisible(false);
        mainPanel.add(refreshWarning,
                      new GridConstraints(2,
                                          0,
                                          1,
                                          1,
                                          GridConstraints.ANCHOR_WEST,
                                          GridConstraints.FILL_NONE,
                                          GridConstraints.SIZEPOLICY_FIXED,
                                          GridConstraints.SIZEPOLICY_FIXED,
                                          null,
                                          null,
                                          null,
                                          0,
                                          false));
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayoutManager(2, 3, new Insets(0, 0, 0, 0), -1, -1));
        mainPanel.add(panel1,
                      new GridConstraints(1,
                                          0,
                                          1,
                                          1,
                                          GridConstraints.ANCHOR_CENTER,
                                          GridConstraints.FILL_BOTH,
                                          GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                                          GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW,
                                          null,
                                          null,
                                          null,
                                          0,
                                          false));
        panel1.setBorder(BorderFactory.createTitledBorder("Color Scheme"));
        panelColorScheme = new JPanel();
        panelColorScheme.setLayout(new BorderLayout(0, 0));
        panel1.add(panelColorScheme,
                   new GridConstraints(1,
                                       0,
                                       1,
                                       3,
                                       GridConstraints.ANCHOR_CENTER,
                                       GridConstraints.FILL_BOTH,
                                       GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                                       GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                                       null,
                                       null,
                                       null,
                                       0,
                                       false));
        buttonAddSelectionGroup = new JButton();
        buttonAddSelectionGroup.setText("Add New Paint Group");
        panel1.add(buttonAddSelectionGroup,
                   new GridConstraints(0,
                                       1,
                                       1,
                                       1,
                                       GridConstraints.ANCHOR_CENTER,
                                       GridConstraints.FILL_HORIZONTAL,
                                       GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                                       GridConstraints.SIZEPOLICY_FIXED,
                                       null,
                                       null,
                                       null,
                                       0,
                                       false));
        final Spacer spacer1 = new Spacer();
        panel1.add(spacer1,
                   new GridConstraints(0,
                                       0,
                                       1,
                                       1,
                                       GridConstraints.ANCHOR_CENTER,
                                       GridConstraints.FILL_HORIZONTAL,
                                       GridConstraints.SIZEPOLICY_WANT_GROW,
                                       1,
                                       null,
                                       null,
                                       null,
                                       0,
                                       false));
        final Spacer spacer2 = new Spacer();
        panel1.add(spacer2,
                   new GridConstraints(0,
                                       2,
                                       1,
                                       1,
                                       GridConstraints.ANCHOR_CENTER,
                                       GridConstraints.FILL_HORIZONTAL,
                                       GridConstraints.SIZEPOLICY_WANT_GROW,
                                       1,
                                       null,
                                       null,
                                       null,
                                       0,
                                       false));
    }

    /** @noinspection ALL */
    public JComponent $$$getRootComponent$$$() { return mainPanel; }
}
