/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MainScreen.java
 *
 * Created on 2010-10-12, 10:02:30
 */

package com.xu81.lgtools.avg.view;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class MainScreen extends javax.swing.JFrame {

    /** Creates new form MainScreen */
    public MainScreen() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        jfc = new JFileChooser(new File("."));
        fmTools.toFront();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        deskMain = new javax.swing.JDesktopPane();
        fmMain = new javax.swing.JInternalFrame();
        jPanel2 = new javax.swing.JPanel();
        fmTools = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        fmProp = new javax.swing.JInternalFrame();
        jPanel3 = new javax.swing.JPanel();
        fmModule = new javax.swing.JInternalFrame();
        jPanel4 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        miNew = new javax.swing.JMenuItem();
        miOpen = new javax.swing.JMenuItem();
        miSave = new javax.swing.JMenuItem();
        miSaveAs = new javax.swing.JMenuItem();
        miMake = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        miExit = new javax.swing.JMenuItem();
        menuEdit = new javax.swing.JMenu();
        miCut = new javax.swing.JMenuItem();
        miCopy = new javax.swing.JMenuItem();
        miPaste = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        miProp = new javax.swing.JMenuItem();
        menuView = new javax.swing.JMenu();
        miTool = new javax.swing.JCheckBoxMenuItem();
        miModule = new javax.swing.JCheckBoxMenuItem();
        miProperties = new javax.swing.JCheckBoxMenuItem();
        miCode = new javax.swing.JCheckBoxMenuItem();
        menuHelp = new javax.swing.JMenu();
        miHelp = new javax.swing.JMenuItem();
        miAboutLG = new javax.swing.JMenuItem();
        miAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Loon-Simple AVG 脚本编辑工具");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        fmMain.setClosable(true);
        fmMain.setIconifiable(true);
        fmMain.setMaximizable(true);
        fmMain.setResizable(true);
        fmMain.setVisible(true);
        fmMain.addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                fmMainInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 528, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 559, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout fmMainLayout = new javax.swing.GroupLayout(fmMain.getContentPane());
        fmMain.getContentPane().setLayout(fmMainLayout);
        fmMainLayout.setHorizontalGroup(
            fmMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        fmMainLayout.setVerticalGroup(
            fmMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        fmMain.setBounds(90, 0, 540, 590);
        deskMain.add(fmMain, javax.swing.JLayeredPane.DEFAULT_LAYER);

        fmTools.setClosable(true);
        fmTools.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        fmTools.setVisible(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 78, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 559, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout fmToolsLayout = new javax.swing.GroupLayout(fmTools.getContentPane());
        fmTools.getContentPane().setLayout(fmToolsLayout);
        fmToolsLayout.setHorizontalGroup(
            fmToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        fmToolsLayout.setVerticalGroup(
            fmToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        fmTools.setBounds(0, 0, 90, 590);
        deskMain.add(fmTools, javax.swing.JLayeredPane.DEFAULT_LAYER);

        fmProp.setClosable(true);
        fmProp.setIconifiable(true);
        fmProp.setMaximizable(true);
        fmProp.setResizable(true);
        fmProp.setTitle("属性");
        fmProp.setVisible(true);
        fmProp.addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                fmPropInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 188, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 249, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout fmPropLayout = new javax.swing.GroupLayout(fmProp.getContentPane());
        fmProp.getContentPane().setLayout(fmPropLayout);
        fmPropLayout.setHorizontalGroup(
            fmPropLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        fmPropLayout.setVerticalGroup(
            fmPropLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        fmProp.setBounds(630, 0, 200, 280);
        deskMain.add(fmProp, javax.swing.JLayeredPane.DEFAULT_LAYER);

        fmModule.setClosable(true);
        fmModule.setIconifiable(true);
        fmModule.setMaximizable(true);
        fmModule.setResizable(true);
        fmModule.setTitle("组件");
        fmModule.setVisible(true);
        fmModule.addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                fmModuleInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 188, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout fmModuleLayout = new javax.swing.GroupLayout(fmModule.getContentPane());
        fmModule.getContentPane().setLayout(fmModuleLayout);
        fmModuleLayout.setHorizontalGroup(
            fmModuleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        fmModuleLayout.setVerticalGroup(
            fmModuleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        fmModule.setBounds(630, 280, 200, 310);
        deskMain.add(fmModule, javax.swing.JLayeredPane.DEFAULT_LAYER);

        menuFile.setMnemonic('F');
        menuFile.setText("文件(F)");

        miNew.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        miNew.setMnemonic('N');
        miNew.setText("新建(N)...");
        miNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miNewActionPerformed(evt);
            }
        });
        menuFile.add(miNew);

        miOpen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        miOpen.setMnemonic('O');
        miOpen.setText("打开(O)");
        menuFile.add(miOpen);

        miSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        miSave.setMnemonic('S');
        miSave.setText("保存(S)...");
        menuFile.add(miSave);

        miSaveAs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        miSaveAs.setMnemonic('A');
        miSaveAs.setText("另存为(A)...");
        menuFile.add(miSaveAs);

        miMake.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        miMake.setMnemonic('M');
        miMake.setText("生成(M)");
        menuFile.add(miMake);
        menuFile.add(jSeparator1);

        miExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        miExit.setMnemonic('X');
        miExit.setText("退出(X)");
        miExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miExitActionPerformed(evt);
            }
        });
        menuFile.add(miExit);

        jMenuBar1.add(menuFile);

        menuEdit.setMnemonic('E');
        menuEdit.setText("编辑(E)");

        miCut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        miCut.setText("剪切");
        menuEdit.add(miCut);

        miCopy.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        miCopy.setText("复制");
        menuEdit.add(miCopy);

        miPaste.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        miPaste.setText("粘贴");
        menuEdit.add(miPaste);
        menuEdit.add(jSeparator2);

        miProp.setText("属性");
        menuEdit.add(miProp);

        jMenuBar1.add(menuEdit);

        menuView.setMnemonic('V');
        menuView.setText("视图(V)");

        miTool.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_MASK));
        miTool.setSelected(true);
        miTool.setText("工具面板");
        menuView.add(miTool);

        miModule.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.CTRL_MASK));
        miModule.setSelected(true);
        miModule.setText("组件面板");
        menuView.add(miModule);

        miProperties.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.CTRL_MASK));
        miProperties.setSelected(true);
        miProperties.setText("属性面板");
        menuView.add(miProperties);

        miCode.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_4, java.awt.event.InputEvent.CTRL_MASK));
        miCode.setSelected(true);
        miCode.setText("代码帮助");
        menuView.add(miCode);

        jMenuBar1.add(menuView);

        menuHelp.setText("帮助");

        miHelp.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        miHelp.setText("帮助");
        menuHelp.add(miHelp);

        miAboutLG.setText("关于 Loon-Simple");
        menuHelp.add(miAboutLG);

        miAbout.setText("关于");
        menuHelp.add(miAbout);

        jMenuBar1.add(menuHelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(deskMain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 827, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(deskMain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miExitActionPerformed
        // TODO add your handling code here:
        if(isModify&&!isSaved){
            int result = JOptionPane.showConfirmDialog(this, "项目已改变，是否保存？", "保存",JOptionPane.YES_NO_CANCEL_OPTION);
            switch(result){
                case 0:
                    jfc.setDialogTitle("保存项目");
                    int jfcresult = jfc.showSaveDialog(this);
                    InfoView.showInfo("jfc="+jfcresult, InfoView.INFO);
                    if(jfcresult==0){
                        File f = jfc.getSelectedFile();
                    }
                    break;
                case 1:
                    System.exit(0);
                    break;
                case 2:
                default:
                    return;
            }
        }
        System.exit(0);
    }//GEN-LAST:event_miExitActionPerformed

    private void fmMainInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_fmMainInternalFrameActivated
        // TODO add your handling code here:
        fmTools.toFront();
    }//GEN-LAST:event_fmMainInternalFrameActivated

    private void fmPropInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_fmPropInternalFrameActivated
        // TODO add your handling code here:
        fmTools.toFront();
    }//GEN-LAST:event_fmPropInternalFrameActivated

    private void fmModuleInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_fmModuleInternalFrameActivated
        // TODO add your handling code here:
        fmTools.toFront();
    }//GEN-LAST:event_fmModuleInternalFrameActivated

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        // TODO add your handling code here:
        if(fmProp.isVisible()){
            fmProp.setLocation(this.getWidth() - fmProp.getWidth() - 5, fmProp.getY());
        }
        if(fmModule.isVisible()){
            fmModule.setLocation(this.getWidth() - fmModule.getWidth() - 5,fmModule.getY());
        }
        if(fmTools.isVisible()){
            fmTools.setLocation(1,fmTools.getY());
        }
    }//GEN-LAST:event_formComponentResized

    private void miNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miNewActionPerformed
        // TODO add your handling code here:
        JDialog newDialog = new NewDialog(this, true);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        newDialog.setLocation((int)(d.getWidth()-newDialog.getWidth())/2,(int)(d.getHeight() - newDialog.getHeight())/2);
        newDialog.setVisible(true);
    }//GEN-LAST:event_miNewActionPerformed

    private static boolean isSaved = false;
    private static boolean isModify = false;

    private static javax.swing.JFileChooser jfc;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane deskMain;
    private javax.swing.JInternalFrame fmMain;
    private javax.swing.JInternalFrame fmModule;
    private javax.swing.JInternalFrame fmProp;
    private javax.swing.JInternalFrame fmTools;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenu menuEdit;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenu menuHelp;
    private javax.swing.JMenu menuView;
    private javax.swing.JMenuItem miAbout;
    private javax.swing.JMenuItem miAboutLG;
    private javax.swing.JCheckBoxMenuItem miCode;
    private javax.swing.JMenuItem miCopy;
    private javax.swing.JMenuItem miCut;
    private javax.swing.JMenuItem miExit;
    private javax.swing.JMenuItem miHelp;
    private javax.swing.JMenuItem miMake;
    private javax.swing.JCheckBoxMenuItem miModule;
    private javax.swing.JMenuItem miNew;
    private javax.swing.JMenuItem miOpen;
    private javax.swing.JMenuItem miPaste;
    private javax.swing.JMenuItem miProp;
    private javax.swing.JCheckBoxMenuItem miProperties;
    private javax.swing.JMenuItem miSave;
    private javax.swing.JMenuItem miSaveAs;
    private javax.swing.JCheckBoxMenuItem miTool;
    // End of variables declaration//GEN-END:variables

}
