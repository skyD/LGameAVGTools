/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * NewDialog.java
 *
 * Created on 2010-10-13, 17:12:56
 */
package com.xu81.lgtools.avg.view;

import java.awt.CardLayout;
import javax.swing.JList;
import javax.swing.JPanel;

/**
 *
 * @author Administrator
 */
public class NewDialog extends javax.swing.JDialog {

    /** Creates new form NewDialog */
    public NewDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        nextPanels = new JPanel[pNum];
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cardPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        fmCat = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        liCat = new javax.swing.JList();
        fmProj = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        liProj = new javax.swing.JList();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDesc = new javax.swing.JTextPane();
        btnCancle = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("新建");
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        cardPanel.setLayout(new java.awt.CardLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        fmCat.setBorder(javax.swing.BorderFactory.createTitledBorder("分类"));
        fmCat.setMinimumSize(new java.awt.Dimension(200, 100));
        fmCat.setPreferredSize(new java.awt.Dimension(200, 338));

        liCat.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "工程", "文件", "其他" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        liCat.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        liCat.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                liCatValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(liCat);

        javax.swing.GroupLayout fmCatLayout = new javax.swing.GroupLayout(fmCat);
        fmCat.setLayout(fmCatLayout);
        fmCatLayout.setHorizontalGroup(
            fmCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
        );
        fmCatLayout.setVerticalGroup(
            fmCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
        );

        jSplitPane1.setLeftComponent(fmCat);

        fmProj.setBorder(javax.swing.BorderFactory.createTitledBorder("项目"));
        fmProj.setMinimumSize(new java.awt.Dimension(200, 100));
        fmProj.setPreferredSize(new java.awt.Dimension(200, 338));

        liProj.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        liProj.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                liProjValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(liProj);

        javax.swing.GroupLayout fmProjLayout = new javax.swing.GroupLayout(fmProj);
        fmProj.setLayout(fmProjLayout);
        fmProjLayout.setHorizontalGroup(
            fmProjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
        );
        fmProjLayout.setVerticalGroup(
            fmProjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(fmProj);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
        );

        txtDesc.setEditable(false);
        jScrollPane1.setViewportView(txtDesc);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE))
        );

        cardPanel.add(jPanel2, "card2");

        btnCancle.setText("取消");
        btnCancle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancleActionPerformed(evt);
            }
        });

        btnNext.setText("下一步");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnPrev.setText("上一步");
        btnPrev.setEnabled(false);
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(284, Short.MAX_VALUE)
                .addComponent(btnPrev)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNext)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancle)
                .addContainerGap())
            .addComponent(cardPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancle)
                    .addComponent(btnNext)
                    .addComponent(btnPrev))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void liCatValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_liCatValueChanged
        // TODO add your handling code here:
        String val = ((JList) evt.getSource()).getSelectedValue().toString();
        if ("工程".equals(val)) {
            liProj.setListData(proj[0]);
        } else if ("文件".equals(val)) {
            liProj.setListData(proj[1]);
        } else if ("其他".equals(val)) {
            liProj.setListData(proj[2]);
        }
    }//GEN-LAST:event_liCatValueChanged

    private void btnCancleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancleActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCancleActionPerformed

    private void liProjValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_liProjValueChanged
        // TODO add your handling code here:
        String p = ((JList) evt.getSource()).getSelectedValue().toString();
        if (p != null && !"".equals(p)) {
            for(int i=0;i<pNum;i++){
                if(nextPanels[i]!=null)
                    cardPanel.remove(nextPanels[i]);
            }
            if ("项目".equals(p)) {
                if(pp==null){
                    pp = new ProjectPanel();
                    nextPanels[0] = pp;
                }
                cardPanel.add("Second card",pp);
            } else if ("场景".equals(p)) {
            } else if ("脚本文件".equals(p)) {
            } else if ("文件夹".equals(p)) {
            } else if ("空白文件".equals(p)) {
            }
        }
    }//GEN-LAST:event_liProjValueChanged

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
        InfoView.showInfo("a", InfoView.INFO);
    }//GEN-LAST:event_formKeyPressed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        if(!isFinish){
            ((CardLayout)cardPanel.getLayout()).next(cardPanel);
            btnPrev.setEnabled(true);
        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        // TODO add your handling code here:
        ((CardLayout)cardPanel.getLayout()).previous(cardPanel);
        if(isFinish){
            isFinish = false;
            btnNext.setText("下一步");
        }
        if(isFirst){
            btnPrev.setEnabled(false);
        }
    }//GEN-LAST:event_btnPrevActionPerformed

    String[][] proj = {{"项目", "场景"}, {"脚本文件"}, {"文件夹", "空白文件"}};
    String selProj;
    ProjectPanel pp;
    boolean isFinish = false;
    boolean isFirst = true;
    JPanel[] nextPanels;
    int pNum = 5;


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancle;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JPanel cardPanel;
    private javax.swing.JPanel fmCat;
    private javax.swing.JPanel fmProj;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JList liCat;
    private javax.swing.JList liProj;
    private javax.swing.JTextPane txtDesc;
    // End of variables declaration//GEN-END:variables
}