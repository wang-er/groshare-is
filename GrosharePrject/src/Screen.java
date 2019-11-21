
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.List;
import java.awt.Point;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.text.DecimalFormat;
import javax.swing.DefaultListModel;
import javax.swing.FocusManager;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author erinwang
 * 
 * 
 */






public class Screen extends javax.swing.JFrame {
    class PTextField extends JTextField {

    public PTextField(final String proptText) {
        super(proptText);
        addFocusListener(new FocusListener() {

            @Override
            public void focusLost(FocusEvent e) {
                if(getText().isEmpty()) {
                    setText(proptText);
                }
            }

            @Override
            public void focusGained(FocusEvent e) {
                if(getText().equals(proptText)) {
                    setText("");
                }
            }
        });

    }

}
    
        DefaultListModel<String> model = new DefaultListModel<>();
    private static DecimalFormat df = new DecimalFormat("0.00");
    double currentTotal = 12.49;
    double indTotal = 3.12;
    double calculatorTotal = 0.00;
    double[] spinnerPrices;
    boolean appleAdded = false;

    private ChangeListener makeABoi(int i) {
        return new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent event) {
                JSpinner boi = (JSpinner) event.getSource();
                System.out.println(boi.getValue());
                double previousPrice = spinnerPrices[i];
                spinnerPrices[i] = (double) boi.getValue();

                calculatorTotal = calculatorTotal + spinnerPrices[i] - previousPrice;
                jTextField4.setText("$" + df.format(calculatorTotal));

            }
        };
    }

    /**
     * Creates new form Screen
     */
    public Screen() {
        initComponents();
//         this.PopupApple.setVisible(false);
         this.ListScreen.setVisible(false);
         this.AddScreen.setVisible(false);
         this.Notifications.setVisible(false);
         this.GroupScreen.setVisible(false);
         this.PurchaseScreen.setVisible(false);
         this.SummaryScreen.setVisible(false);
         this.InputScreen.setVisible(false);
                 this.HomeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-a_home 2.png")));
        this.HomeButton.setForeground(new java.awt.Color(200, 200, 200));
         this.HomeScreen.setVisible(true);
          this.BackButton.setVisible(false);
         
    }
    
    
    private void ButtonNonActivation(){
        this.HomeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-a_home.png")));
        this.HomeButton.setForeground(new java.awt.Color(255, 255, 255));
        
        this.ListButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-ingredients_list.png")));
        this.ListButton.setForeground(new java.awt.Color(255, 255, 255));
        
        this.AddButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-plus_math.png")));
        this.AddButton.setForeground(new java.awt.Color(255, 255, 255));
        
        this.PurchaseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-money.png")));
        this.PurchaseButton.setForeground(new java.awt.Color(255, 255, 255));
        
        this.GroupButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-conference_call.png")));
        this.GroupButton.setForeground(new java.awt.Color(255, 255, 255));    
    }
    
    private void ButtonActivated(String screen) {
        if(screen.equals("Home")) {
                    this.HomeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-a_home 2.png")));
        this.HomeButton.setForeground(new java.awt.Color(200, 200, 200));
            
        }
        if(screen.equals("List")) {
        this.ListButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-ingredients_list 2.png")));
        this.ListButton.setForeground(new java.awt.Color(200, 200, 200));
        }
         if(screen.equals("Add")) {
                     this.AddButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-plus.png")));
        this.AddButton.setForeground(new java.awt.Color(200, 200, 200));
            
        }
        if(screen.equals("Purchase")) {
        this.PurchaseButton.setForeground(new java.awt.Color(200, 200, 200));
         this.PurchaseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-money 2.png")));
            
        }
        if(screen.equals("Group")) {
         this.GroupButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-conference_call 2.png")));
        this.GroupButton.setForeground(new java.awt.Color(200, 200, 200));
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        PopupAppleDialog = new javax.swing.JDialog();
        PopupApple1 = new javax.swing.JPanel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jPanel41 = new javax.swing.JPanel();
        jLabel76 = new javax.swing.JLabel();
        ExitProfile2 = new javax.swing.JButton();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jSeparator16 = new javax.swing.JSeparator();
        jComboBox2 = new javax.swing.JComboBox<>();
        jSpinner2 = new javax.swing.JSpinner();
        jButton3 = new javax.swing.JButton();
        PopupJessDialog = new javax.swing.JDialog();
        PopupJess = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jPanel35 = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        ExitProfile1 = new javax.swing.JButton();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel79 = new javax.swing.JLabel();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        NotificationDialog = new javax.swing.JDialog();
        NotificationScreen = new javax.swing.JPanel();
        jPanel42 = new javax.swing.JPanel();
        jLabel82 = new javax.swing.JLabel();
        ExitProfile3 = new javax.swing.JButton();
        Notifications = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel12 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel13 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        jPanel14 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        jPanel15 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        PopupItem = new javax.swing.JDialog();
        PopupApple2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jPanel43 = new javax.swing.JPanel();
        jLabel83 = new javax.swing.JLabel();
        ExitProfile4 = new javax.swing.JButton();
        jSeparator17 = new javax.swing.JSeparator();
        jComboBox3 = new javax.swing.JComboBox<>();
        jSpinner3 = new javax.swing.JSpinner();
        jButton15 = new javax.swing.JButton();
        jTextField2 = new PTextField("Input Name");
        PopupEdit = new javax.swing.JDialog();
        PopupApple3 = new javax.swing.JPanel();
        jLabel85 = new javax.swing.JLabel();
        jPanel44 = new javax.swing.JPanel();
        jLabel86 = new javax.swing.JLabel();
        ExitProfile5 = new javax.swing.JButton();
        jComboBox4 = new javax.swing.JComboBox<>();
        jSpinner4 = new javax.swing.JSpinner();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        AppScreen = new javax.swing.JPanel();
        NavBar = new javax.swing.JPanel();
        HomeButton = new javax.swing.JButton();
        AddButton = new javax.swing.JButton();
        ListButton = new javax.swing.JButton();
        PurchaseButton = new javax.swing.JButton();
        GroupButton = new javax.swing.JButton();
        Header = new javax.swing.JPanel();
        BackButton = new javax.swing.JButton();
        Notification = new javax.swing.JButton();
        HeaderLabel = new javax.swing.JLabel();
        BodyPart = new javax.swing.JPanel();
        AddScreen = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        Notification9 = new javax.swing.JButton();
        Notification10 = new javax.swing.JButton();
        Notification11 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jPanel29 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        Notification5 = new javax.swing.JButton();
        jPanel31 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        Notification6 = new javax.swing.JButton();
        jPanel32 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        Notification7 = new javax.swing.JButton();
        jPanel33 = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        Notification8 = new javax.swing.JButton();
        jTextField1 = new PTextField("Search...");
        Notification12 = new javax.swing.JButton();
        Notification13 = new javax.swing.JButton();
        Notification14 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        ListScreen = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel9 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel36 = new javax.swing.JLabel();
        Notification1 = new javax.swing.JButton();
        jPanel27 = new javax.swing.JPanel();
        jCheckBox3 = new javax.swing.JCheckBox();
        jLabel38 = new javax.swing.JLabel();
        Notification3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        GroupScreen = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        JessProfile = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        jButton16 = new javax.swing.JButton();
        HomeScreen = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel6 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        PurchaseScreen = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel25 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jButton17 = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JSeparator();
        jPanel18 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jButton18 = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JSeparator();
        jPanel21 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel27 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        InputScreen = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        GeneratedList = new javax.swing.JPanel();
        jTextField4 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        SummaryScreen = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jPanel26 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jPanel36 = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jPanel40 = new javax.swing.JPanel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        jPanel37 = new javax.swing.JPanel();
        jPanel38 = new javax.swing.JPanel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jPanel39 = new javax.swing.JPanel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-chevron_right.png"))); // NOI18N
        jLabel6.setToolTipText("");

        jLabel10.setText("jLabel10");

        PopupApple1.setBackground(new java.awt.Color(204, 204, 204));
        PopupApple1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel74.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-apple_filled.png"))); // NOI18N
        PopupApple1.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 100, 100));

        jLabel75.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel75.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel75.setText("How many?");
        PopupApple1.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 130, 50));

        jPanel41.setBackground(new java.awt.Color(0, 153, 102));
        jPanel41.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel76.setBackground(new java.awt.Color(255, 255, 255));
        jLabel76.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(255, 255, 255));
        jLabel76.setText("Add");
        jPanel41.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, -1, 50));

        ExitProfile2.setBackground(new java.awt.Color(255, 102, 102));
        ExitProfile2.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        ExitProfile2.setForeground(new java.awt.Color(255, 255, 255));
        ExitProfile2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-delete_sign.png"))); // NOI18N
        ExitProfile2.setBorderPainted(false);
        ExitProfile2.setContentAreaFilled(false);
        ExitProfile2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ExitProfile2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ExitProfile2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ExitProfile2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitProfile2ActionPerformed(evt);
            }
        });
        jPanel41.add(ExitProfile2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 50, 50));

        PopupApple1.add(jPanel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 50));

        jLabel77.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel77.setText("Apples");
        PopupApple1.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 90, 50));

        jLabel78.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel78.setText("No one has requested this item yet");
        PopupApple1.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 220, 30));

        jSeparator16.setBackground(new java.awt.Color(255, 255, 255));
        PopupApple1.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 360, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Count", "Dozen", "Box", "Cup", " ", " " }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        PopupApple1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 130, 30));
        PopupApple1.add(jSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 90, -1));

        jButton3.setBackground(new java.awt.Color(0, 153, 102));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Add to grocery list!");
        jButton3.setBorderPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        PopupApple1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 320, 50));

        PopupAppleDialog.getContentPane().add(PopupApple1, java.awt.BorderLayout.CENTER);
        PopupJess.setVisible(false);

        PopupJess.setBackground(new java.awt.Color(204, 204, 204));
        PopupJess.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-man_with_yellow_glasses_in_blue_shirt 2.png"))); // NOI18N
        PopupJess.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, 100));

        jLabel58.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel58.setText("She currently owes you $10.00!");
        PopupJess.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 360, 50));

        jPanel35.setBackground(new java.awt.Color(0, 153, 102));
        jPanel35.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel59.setBackground(new java.awt.Color(255, 255, 255));
        jLabel59.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setText("View Profile");
        jPanel35.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, -1, 50));

        ExitProfile1.setBackground(new java.awt.Color(255, 102, 102));
        ExitProfile1.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        ExitProfile1.setForeground(new java.awt.Color(255, 255, 255));
        ExitProfile1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-delete_sign.png"))); // NOI18N
        ExitProfile1.setBorderPainted(false);
        ExitProfile1.setContentAreaFilled(false);
        ExitProfile1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ExitProfile1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ExitProfile1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ExitProfile1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitProfile1ActionPerformed(evt);
            }
        });
        jPanel35.add(ExitProfile1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 50, 50));

        PopupJess.add(jPanel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 50));

        jLabel60.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel60.setText("Jessica J.");
        PopupJess.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 90, 50));

        jLabel61.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel61.setText("Joined on 10/28/19");
        PopupJess.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 220, 30));

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("- Vegetarian\n- Gluten-free\n- No nuts\n- No pineapple");
        PopupJess.add(jTextArea2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 150, 70));

        jLabel79.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel79.setText("Diet Restrictions");
        PopupJess.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 230, 30));

        jSeparator14.setBackground(new java.awt.Color(255, 255, 255));
        PopupJess.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 360, 10));

        jSeparator15.setBackground(new java.awt.Color(255, 255, 255));
        PopupJess.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 360, -1));

        PopupJessDialog.getContentPane().add(PopupJess, java.awt.BorderLayout.CENTER);

        NotificationScreen.setBackground(new java.awt.Color(204, 204, 204));
        NotificationScreen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel42.setBackground(new java.awt.Color(0, 153, 102));
        jPanel42.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel82.setBackground(new java.awt.Color(255, 255, 255));
        jLabel82.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(255, 255, 255));
        jLabel82.setText("Notfications");
        jPanel42.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, -1, 50));

        ExitProfile3.setBackground(new java.awt.Color(255, 102, 102));
        ExitProfile3.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        ExitProfile3.setForeground(new java.awt.Color(255, 255, 255));
        ExitProfile3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-delete_sign.png"))); // NOI18N
        ExitProfile3.setBorderPainted(false);
        ExitProfile3.setContentAreaFilled(false);
        ExitProfile3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ExitProfile3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ExitProfile3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ExitProfile3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitProfile3ActionPerformed(evt);
            }
        });
        jPanel42.add(ExitProfile3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 50, 50));

        NotificationScreen.add(jPanel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 50));

        Notifications.setBackground(new java.awt.Color(255, 255, 255));
        Notifications.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setLayout(new javax.swing.BoxLayout(jPanel10, javax.swing.BoxLayout.Y_AXIS));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-person_male.png"))); // NOI18N
        jLabel14.setText("Jason added 6 pears onto the list!");
        jPanel11.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 60));

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-chevron_right 2.png"))); // NOI18N
        jButton11.setToolTipText("");
        jButton11.setBorderPainted(false);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 60, 60));

        jPanel10.add(jPanel11);
        jPanel10.add(jSeparator3);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-person_male.png"))); // NOI18N
        jLabel15.setText("Jason added 6 pears onto the list!");
        jPanel12.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 60));

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-chevron_right 2.png"))); // NOI18N
        jButton12.setToolTipText("");
        jButton12.setBorderPainted(false);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 60, 60));

        jPanel10.add(jPanel12);
        jPanel10.add(jSeparator4);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-person_male.png"))); // NOI18N
        jLabel16.setText("Jason added 6 pears onto the list!");
        jPanel13.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 60));

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-chevron_right 2.png"))); // NOI18N
        jButton13.setToolTipText("");
        jButton13.setBorderPainted(false);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 60, 60));

        jPanel10.add(jPanel13);
        jPanel10.add(jSeparator5);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-person_male.png"))); // NOI18N
        jLabel17.setText("Jason added 6 pears onto the list!");
        jPanel14.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 60));

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-chevron_right 2.png"))); // NOI18N
        jButton10.setToolTipText("");
        jButton10.setBorderPainted(false);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 60, 60));

        jPanel10.add(jPanel14);
        jPanel10.add(jSeparator6);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-person_male.png"))); // NOI18N
        jLabel18.setText("Jason added 6 pears onto the list!");
        jPanel15.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 60));

        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-chevron_right 2.png"))); // NOI18N
        jButton14.setToolTipText("");
        jButton14.setBorderPainted(false);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 60, 60));

        jPanel10.add(jPanel15);

        jScrollPane3.setViewportView(jPanel10);

        Notifications.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 380, 370));

        NotificationScreen.add(Notifications, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 440));
        HomeScreen.setVisible(false);

        NotificationDialog.getContentPane().add(NotificationScreen, java.awt.BorderLayout.CENTER);
        PopupJess.setVisible(false);

        PopupApple2.setBackground(new java.awt.Color(204, 204, 204));
        PopupApple2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel21.setText("This eventually will be added to the list screen ");
        jPanel4.add(jLabel21);

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel22.setText("with the correct name and count");
        jPanel4.add(jLabel22);

        PopupApple2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 330, 60));

        jLabel80.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel80.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-question_mark_filled.png"))); // NOI18N
        PopupApple2.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 100, 100));

        jLabel81.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel81.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel81.setText("How many?");
        PopupApple2.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 130, 50));

        jPanel43.setBackground(new java.awt.Color(0, 153, 102));
        jPanel43.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel83.setBackground(new java.awt.Color(255, 255, 255));
        jLabel83.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(255, 255, 255));
        jLabel83.setText("Add");
        jPanel43.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, -1, 50));

        ExitProfile4.setBackground(new java.awt.Color(255, 102, 102));
        ExitProfile4.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        ExitProfile4.setForeground(new java.awt.Color(255, 255, 255));
        ExitProfile4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-delete_sign.png"))); // NOI18N
        ExitProfile4.setBorderPainted(false);
        ExitProfile4.setContentAreaFilled(false);
        ExitProfile4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ExitProfile4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ExitProfile4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ExitProfile4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitProfile4ActionPerformed(evt);
            }
        });
        jPanel43.add(ExitProfile4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 50, 50));

        PopupApple2.add(jPanel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 50));

        jSeparator17.setBackground(new java.awt.Color(255, 255, 255));
        PopupApple2.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 360, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Count", "Dozen", "Box", "Cup", " ", " " }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        PopupApple2.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 130, 30));
        PopupApple2.add(jSpinner3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 90, -1));

        jButton15.setBackground(new java.awt.Color(0, 153, 102));
        jButton15.setForeground(new java.awt.Color(255, 255, 255));
        jButton15.setText("Add to grocery list!");
        jButton15.setBorderPainted(false);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        PopupApple2.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 320, 50));
        PopupApple2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 240, 60));

        PopupItem.getContentPane().add(PopupApple2, java.awt.BorderLayout.CENTER);
        PopupJess.setVisible(false);

        PopupApple3.setBackground(new java.awt.Color(204, 204, 204));
        PopupApple3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel85.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel85.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel85.setText("Change quantity");
        PopupApple3.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 160, 50));

        jPanel44.setBackground(new java.awt.Color(0, 153, 102));
        jPanel44.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel86.setBackground(new java.awt.Color(255, 255, 255));
        jLabel86.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel86.setForeground(new java.awt.Color(255, 255, 255));
        jLabel86.setText("Edit");
        jPanel44.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, -1, 50));

        ExitProfile5.setBackground(new java.awt.Color(255, 102, 102));
        ExitProfile5.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        ExitProfile5.setForeground(new java.awt.Color(255, 255, 255));
        ExitProfile5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-delete_sign.png"))); // NOI18N
        ExitProfile5.setBorderPainted(false);
        ExitProfile5.setContentAreaFilled(false);
        ExitProfile5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ExitProfile5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ExitProfile5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ExitProfile5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitProfile5ActionPerformed(evt);
            }
        });
        jPanel44.add(ExitProfile5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 50, 50));

        PopupApple3.add(jPanel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 50));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Count", "Dozen", "Box", "Cup", " ", " " }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        PopupApple3.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 130, 30));
        PopupApple3.add(jSpinner4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 90, -1));

        jButton19.setBackground(new java.awt.Color(0, 153, 102));
        jButton19.setForeground(new java.awt.Color(255, 255, 255));
        jButton19.setText("Save Changes");
        jButton19.setBorderPainted(false);
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        PopupApple3.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 170, 50));

        jButton20.setText("Delete item");
        PopupApple3.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 100, 50));

        PopupEdit.getContentPane().add(PopupApple3, java.awt.BorderLayout.CENTER);
        PopupJess.setVisible(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(153, 255, 102));
        jTabbedPane1.setForeground(new java.awt.Color(255, 204, 102));
        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 360, 20));

        AppScreen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NavBar.setBackground(new java.awt.Color(0, 153, 102));
        NavBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HomeButton.setBackground(new java.awt.Color(255, 255, 255));
        HomeButton.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        HomeButton.setForeground(new java.awt.Color(255, 255, 255));
        HomeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-a_home.png"))); // NOI18N
        HomeButton.setText("Home");
        HomeButton.setBorderPainted(false);
        HomeButton.setContentAreaFilled(false);
        HomeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HomeButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        HomeButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        HomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButtonActionPerformed(evt);
            }
        });
        NavBar.add(HomeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 64, -1));

        AddButton.setBackground(new java.awt.Color(255, 255, 255));
        AddButton.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        AddButton.setForeground(new java.awt.Color(255, 255, 255));
        AddButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-plus_math.png"))); // NOI18N
        AddButton.setText("Add food");
        AddButton.setBorderPainted(false);
        AddButton.setContentAreaFilled(false);
        AddButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        AddButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });
        NavBar.add(AddButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 80, 61));

        ListButton.setBackground(new java.awt.Color(255, 255, 255));
        ListButton.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        ListButton.setForeground(new java.awt.Color(255, 255, 255));
        ListButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-ingredients_list.png"))); // NOI18N
        ListButton.setText("List");
        ListButton.setBorderPainted(false);
        ListButton.setContentAreaFilled(false);
        ListButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ListButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ListButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListButtonActionPerformed(evt);
            }
        });
        NavBar.add(ListButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 80, -1));

        PurchaseButton.setBackground(new java.awt.Color(255, 51, 51));
        PurchaseButton.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        PurchaseButton.setForeground(new java.awt.Color(255, 255, 255));
        PurchaseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-money.png"))); // NOI18N
        PurchaseButton.setText("Purchases");
        PurchaseButton.setToolTipText("");
        PurchaseButton.setBorderPainted(false);
        PurchaseButton.setContentAreaFilled(false);
        PurchaseButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PurchaseButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PurchaseButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        PurchaseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PurchaseButtonActionPerformed(evt);
            }
        });
        NavBar.add(PurchaseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 0, 90, -1));

        GroupButton.setBackground(new java.awt.Color(255, 255, 255));
        GroupButton.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        GroupButton.setForeground(new java.awt.Color(255, 255, 255));
        GroupButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-conference_call.png"))); // NOI18N
        GroupButton.setText("Group");
        GroupButton.setBorderPainted(false);
        GroupButton.setContentAreaFilled(false);
        GroupButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GroupButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        GroupButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        GroupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GroupButtonActionPerformed(evt);
            }
        });
        NavBar.add(GroupButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 0, 64, -1));

        AppScreen.add(NavBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 400, -1));

        Header.setBackground(new java.awt.Color(0, 153, 102));
        Header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BackButton.setBackground(new java.awt.Color(255, 102, 102));
        BackButton.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        BackButton.setForeground(new java.awt.Color(255, 255, 255));
        BackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-chevron_left.png"))); // NOI18N
        BackButton.setBorderPainted(false);
        BackButton.setContentAreaFilled(false);
        BackButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BackButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BackButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        Header.add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 0, -1, 50));

        Notification.setBackground(new java.awt.Color(255, 102, 102));
        Notification.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        Notification.setForeground(new java.awt.Color(255, 255, 255));
        Notification.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-bell.png"))); // NOI18N
        Notification.setBorderPainted(false);
        Notification.setContentAreaFilled(false);
        Notification.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Notification.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Notification.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Notification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NotificationActionPerformed(evt);
            }
        });
        Header.add(Notification, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 50, 50));

        HeaderLabel.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        HeaderLabel.setForeground(new java.awt.Color(255, 255, 255));
        HeaderLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HeaderLabel.setText("Groshare");
        Header.add(HeaderLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 0, 400, 50));

        AppScreen.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 50));

        BodyPart.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddScreen.setBackground(new java.awt.Color(255, 255, 255));
        AddScreen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel34.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel55.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel55.setText("Select a category!");
        jPanel34.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 280, 30));

        jLabel56.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setText("Search or");
        jPanel34.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 280, 30));

        AddScreen.add(jPanel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 280, 260));

        Notification9.setBackground(new java.awt.Color(102, 153, 0));
        Notification9.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        Notification9.setForeground(new java.awt.Color(255, 255, 255));
        Notification9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-cauliflower_filled.png"))); // NOI18N
        Notification9.setBorderPainted(false);
        Notification9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Notification9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Notification9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Notification9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Notification9ActionPerformed(evt);
            }
        });
        AddScreen.add(Notification9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 50, 50));

        Notification10.setBackground(new java.awt.Color(153, 102, 255));
        Notification10.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        Notification10.setForeground(new java.awt.Color(255, 255, 255));
        Notification10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-questions_filled.png"))); // NOI18N
        Notification10.setBorderPainted(false);
        Notification10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Notification10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Notification10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Notification10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Notification10ActionPerformed(evt);
            }
        });
        AddScreen.add(Notification10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 50, 50));

        Notification11.setBackground(new java.awt.Color(255, 153, 51));
        Notification11.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        Notification11.setForeground(new java.awt.Color(255, 255, 255));
        Notification11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-orange_filled.png"))); // NOI18N
        Notification11.setBorderPainted(false);
        Notification11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Notification11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Notification11.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Notification11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Notification11ActionPerformed(evt);
            }
        });
        AddScreen.add(Notification11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 50, 50));

        jPanel29.setLayout(new javax.swing.BoxLayout(jPanel29, javax.swing.BoxLayout.Y_AXIS));

        jPanel30.setBackground(new java.awt.Color(255, 255, 255));
        jPanel30.setLayout(new java.awt.BorderLayout());

        jLabel45.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel45.setText("Apples");
        jPanel30.add(jLabel45, java.awt.BorderLayout.CENTER);

        Notification5.setBackground(new java.awt.Color(255, 102, 102));
        Notification5.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        Notification5.setForeground(new java.awt.Color(255, 255, 255));
        Notification5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-plus_math 2.png"))); // NOI18N
        Notification5.setBorderPainted(false);
        Notification5.setContentAreaFilled(false);
        Notification5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Notification5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Notification5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Notification5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Notification5ActionPerformed(evt);
            }
        });
        jPanel30.add(Notification5, java.awt.BorderLayout.LINE_END);

        jPanel29.add(jPanel30);

        jPanel31.setBackground(new java.awt.Color(255, 255, 255));
        jPanel31.setLayout(new java.awt.BorderLayout());

        jLabel51.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel51.setText("Pears");
        jPanel31.add(jLabel51, java.awt.BorderLayout.CENTER);

        Notification6.setBackground(new java.awt.Color(255, 102, 102));
        Notification6.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        Notification6.setForeground(new java.awt.Color(255, 255, 255));
        Notification6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-plus_math 2.png"))); // NOI18N
        Notification6.setBorderPainted(false);
        Notification6.setContentAreaFilled(false);
        Notification6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Notification6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Notification6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Notification6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Notification6ActionPerformed(evt);
            }
        });
        jPanel31.add(Notification6, java.awt.BorderLayout.LINE_END);

        jPanel29.add(jPanel31);

        jPanel32.setBackground(new java.awt.Color(255, 255, 255));
        jPanel32.setLayout(new java.awt.BorderLayout());

        jLabel53.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel53.setText("Bananas");
        jPanel32.add(jLabel53, java.awt.BorderLayout.CENTER);

        Notification7.setBackground(new java.awt.Color(255, 102, 102));
        Notification7.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        Notification7.setForeground(new java.awt.Color(255, 255, 255));
        Notification7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-plus_math 2.png"))); // NOI18N
        Notification7.setBorderPainted(false);
        Notification7.setContentAreaFilled(false);
        Notification7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Notification7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Notification7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Notification7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Notification7ActionPerformed(evt);
            }
        });
        jPanel32.add(Notification7, java.awt.BorderLayout.LINE_END);

        jPanel29.add(jPanel32);

        jPanel33.setBackground(new java.awt.Color(255, 255, 255));
        jPanel33.setLayout(new java.awt.BorderLayout());

        jLabel54.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel54.setText("Grapes");
        jPanel33.add(jLabel54, java.awt.BorderLayout.CENTER);

        Notification8.setBackground(new java.awt.Color(255, 102, 102));
        Notification8.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        Notification8.setForeground(new java.awt.Color(255, 255, 255));
        Notification8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-plus_math 2.png"))); // NOI18N
        Notification8.setBorderPainted(false);
        Notification8.setContentAreaFilled(false);
        Notification8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Notification8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Notification8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Notification8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Notification8ActionPerformed(evt);
            }
        });
        jPanel33.add(Notification8, java.awt.BorderLayout.LINE_END);

        jPanel29.add(jPanel33);

        jScrollPane5.setViewportView(jPanel29);

        AddScreen.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 280, 260));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        AddScreen.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 350, 40));

        Notification12.setBackground(new java.awt.Color(153, 153, 0));
        Notification12.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        Notification12.setForeground(new java.awt.Color(255, 255, 255));
        Notification12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-wheat_filled.png"))); // NOI18N
        Notification12.setBorderPainted(false);
        Notification12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Notification12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Notification12.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Notification12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Notification12ActionPerformed(evt);
            }
        });
        AddScreen.add(Notification12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 50, 50));

        Notification13.setBackground(new java.awt.Color(255, 102, 102));
        Notification13.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        Notification13.setForeground(new java.awt.Color(255, 255, 255));
        Notification13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-steak_rare_filled.png"))); // NOI18N
        Notification13.setBorderPainted(false);
        Notification13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Notification13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Notification13.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Notification13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Notification13ActionPerformed(evt);
            }
        });
        AddScreen.add(Notification13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 50, 50));

        Notification14.setBackground(new java.awt.Color(0, 153, 204));
        Notification14.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        Notification14.setForeground(new java.awt.Color(255, 255, 255));
        Notification14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-tetra_pak_filled.png"))); // NOI18N
        Notification14.setBorderPainted(false);
        Notification14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Notification14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Notification14.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Notification14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Notification14ActionPerformed(evt);
            }
        });
        AddScreen.add(Notification14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 50, 50));

        jButton7.setText("Add manually");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        AddScreen.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 280, 60));

        BodyPart.add(AddScreen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 440));
        ListScreen.setVisible(false);

        ListScreen.setBackground(new java.awt.Color(255, 255, 255));
        ListScreen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setBackground(new java.awt.Color(0, 153, 102));
        jButton4.setText("Select items to checkout!");
        jButton4.setAutoscrolls(true);
        jButton4.setEnabled(false);
        jButton4.setFocusable(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        ListScreen.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 360, 50));

        jPanel9.setLayout(new javax.swing.BoxLayout(jPanel9, javax.swing.BoxLayout.Y_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1, java.awt.BorderLayout.LINE_START);

        jLabel36.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel36.setText("Pepsi, 12 count");
        jPanel1.add(jLabel36, java.awt.BorderLayout.CENTER);

        Notification1.setBackground(new java.awt.Color(255, 102, 102));
        Notification1.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        Notification1.setForeground(new java.awt.Color(255, 255, 255));
        Notification1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-edit.png"))); // NOI18N
        Notification1.setBorderPainted(false);
        Notification1.setContentAreaFilled(false);
        Notification1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Notification1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Notification1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Notification1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Notification1ActionPerformed(evt);
            }
        });
        jPanel1.add(Notification1, java.awt.BorderLayout.LINE_END);

        jPanel9.add(jPanel1);

        jPanel27.setBackground(new java.awt.Color(255, 255, 255));
        jPanel27.setLayout(new java.awt.BorderLayout());

        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });
        jPanel27.add(jCheckBox3, java.awt.BorderLayout.LINE_START);

        jLabel38.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel38.setText("Pears, 8 count");
        jPanel27.add(jLabel38, java.awt.BorderLayout.CENTER);

        Notification3.setBackground(new java.awt.Color(255, 102, 102));
        Notification3.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        Notification3.setForeground(new java.awt.Color(255, 255, 255));
        Notification3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-edit.png"))); // NOI18N
        Notification3.setBorderPainted(false);
        Notification3.setContentAreaFilled(false);
        Notification3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Notification3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Notification3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Notification3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Notification3ActionPerformed(evt);
            }
        });
        jPanel27.add(Notification3, java.awt.BorderLayout.LINE_END);

        jPanel9.add(jPanel27);

        jScrollPane1.setViewportView(jPanel9);

        ListScreen.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 360, 290));

        jButton1.setText("Add more items!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        ListScreen.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 360, 50));

        BodyPart.add(ListScreen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 440));
        ListScreen.setVisible(false);

        GroupScreen.setBackground(new java.awt.Color(255, 255, 255));
        GroupScreen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel22.setBackground(new java.awt.Color(233, 233, 233));
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-ginger_man_in_yellow_shirt.png"))); // NOI18N
        jPanel22.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 80));

        jLabel35.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel35.setText("Kevin S.");
        jPanel22.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 90, 50));

        GroupScreen.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 180, 90));

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));
        jPanel24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-man_with_beard_in_suit.png"))); // NOI18N
        jPanel24.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jLabel41.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel41.setText("John Smith (You)");
        jPanel24.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 200, 50));

        jButton2.setText("Edit Profile");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel24.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 120, -1));

        jLabel42.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel42.setText("Allergies: None");
        jPanel24.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 210, 20));

        jLabel43.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel43.setText("Diet Restrictions: None");
        jPanel24.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 210, 20));

        GroupScreen.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 380, 130));

        jPanel25.setBackground(new java.awt.Color(233, 233, 233));
        jPanel25.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-man_in_red_glasses_and_yellow_shirt.png"))); // NOI18N
        jPanel25.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 80));

        jLabel40.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel40.setText("Jason L.");
        jPanel25.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 90, 50));

        GroupScreen.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 180, 90));

        JessProfile.setBackground(new java.awt.Color(233, 233, 233));
        JessProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JessProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JessProfileMouseClicked(evt);
            }
        });
        JessProfile.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-man_with_yellow_glasses_in_blue_shirt.png"))); // NOI18N
        JessProfile.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 80));

        jLabel47.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel47.setText("Jessica J.");
        JessProfile.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 90, 50));

        GroupScreen.add(JessProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 180, 90));
        GroupScreen.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 380, 20));

        jButton16.setText("Add more members");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        GroupScreen.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 380, 60));

        BodyPart.add(GroupScreen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 440));
        HomeScreen.setVisible(false);

        HomeScreen.setBackground(new java.awt.Color(255, 255, 255));
        HomeScreen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));
        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-chevron_right.png"))); // NOI18N
        jLabel2.setToolTipText("");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 30, 30));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("You currently owe:");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 30));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("$12.96");
        jLabel5.setToolTipText("");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 70, 30));

        HomeScreen.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 380, 70));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel3.setText("Recent History");
        HomeScreen.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, 20));

        jPanel6.setLayout(new javax.swing.BoxLayout(jPanel6, javax.swing.BoxLayout.Y_AXIS));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-person_male.png"))); // NOI18N
        jLabel1.setText("Jason added 6 pears to the list!");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 60));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-chevron_right 2.png"))); // NOI18N
        jButton8.setToolTipText("");
        jButton8.setBorderPainted(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 60, 60));

        jPanel6.add(jPanel2);
        jPanel6.add(jSeparator1);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-person_male.png"))); // NOI18N
        jLabel7.setText("Jason added 12 pepsi to the list!");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 290, 60));

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-chevron_right 2.png"))); // NOI18N
        jButton9.setToolTipText("");
        jButton9.setBorderPainted(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 60, 60));

        jPanel6.add(jPanel3);
        jPanel6.add(jSeparator2);

        jScrollPane2.setViewportView(jPanel6);

        HomeScreen.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 380, 180));

        BodyPart.add(HomeScreen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 440));
        HomeScreen.setVisible(false);

        PurchaseScreen.setBackground(new java.awt.Color(255, 255, 255));
        PurchaseScreen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(102, 102, 102));
        jPanel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("You currently owe:");
        jPanel8.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 30));

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("$12.96");
        jPanel8.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 70, 30));
        jPanel8.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 360, -1));

        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Kevin");
        jPanel8.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 30));

        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Jason");
        jPanel8.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 20));

        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel29.setText("  $2.96");
        jPanel8.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, -1, 30));

        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel31.setText("$10.00");
        jPanel8.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, -1, 20));

        PurchaseScreen.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 380, 100));

        jLabel13.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel13.setText("Recent Purchases");
        PurchaseScreen.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, 20));

        jPanel16.setLayout(new javax.swing.BoxLayout(jPanel16, javax.swing.BoxLayout.Y_AXIS));

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-person_male.png"))); // NOI18N
        jLabel19.setText("Your purchase, November 7th");
        jPanel17.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 60));

        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-chevron_right 2.png"))); // NOI18N
        jButton17.setToolTipText("");
        jButton17.setBorderPainted(false);
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel17.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 60, 60));

        jPanel16.add(jPanel17);
        jPanel16.add(jSeparator7);

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-person_male.png"))); // NOI18N
        jLabel20.setText("Jason's purchase, November 7th");
        jPanel18.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 60));

        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-chevron_right 2.png"))); // NOI18N
        jButton18.setToolTipText("");
        jButton18.setBorderPainted(false);
        jPanel18.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 60, 60));

        jPanel16.add(jPanel18);
        jPanel16.add(jSeparator8);

        jScrollPane4.setViewportView(jPanel16);

        PurchaseScreen.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 370, 150));

        jPanel21.setBackground(new java.awt.Color(102, 102, 102));
        jPanel21.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Others owe you:");
        jPanel21.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 30));

        jLabel24.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("$10.00");
        jPanel21.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 70, 30));
        jPanel21.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 360, -1));

        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Jessica");
        jPanel21.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 20));

        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel30.setText("$10.00");
        jPanel21.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, -1, 20));

        PurchaseScreen.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 380, 100));

        BodyPart.add(PurchaseScreen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 440));
        HomeScreen.setVisible(false);

        InputScreen.setBackground(new java.awt.Color(255, 255, 255));
        InputScreen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        GeneratedList.setLayout(new java.awt.GridLayout(0, 2));
        jScrollPane6.setViewportView(GeneratedList);

        InputScreen.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 360, 350));

        jTextField4.setEditable(false);
        jTextField4.setText("$000.00");
        jTextField4.setToolTipText("");
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        InputScreen.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, 90, 40));

        jLabel37.setText("Total Price");
        InputScreen.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));

        jButton5.setText("Submit Prices");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        InputScreen.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 180, 50));

        BodyPart.add(InputScreen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 440));
        ListScreen.setVisible(false);

        SummaryScreen.setBackground(new java.awt.Color(255, 255, 255));
        SummaryScreen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel39.setText("Total Price");
        SummaryScreen.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel8.setText("Split prices:");
        SummaryScreen.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 20));

        jPanel26.setLayout(new javax.swing.BoxLayout(jPanel26, javax.swing.BoxLayout.Y_AXIS));

        jPanel28.setBackground(new java.awt.Color(255, 255, 255));
        jPanel28.setLayout(new java.awt.BorderLayout());

        jLabel62.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel62.setText("$1.30");
        jPanel28.add(jLabel62, java.awt.BorderLayout.LINE_END);

        jLabel64.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel64.setText("You");
        jPanel28.add(jLabel64, java.awt.BorderLayout.CENTER);

        jPanel26.add(jPanel28);

        jPanel36.setBackground(new java.awt.Color(255, 255, 255));
        jPanel36.setLayout(new java.awt.BorderLayout());

        jLabel63.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel63.setText("$15.64");
        jPanel36.add(jLabel63, java.awt.BorderLayout.LINE_END);

        jLabel65.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel65.setText("Jason");
        jPanel36.add(jLabel65, java.awt.BorderLayout.CENTER);

        jLabel70.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel70.setText("Jason");
        jPanel36.add(jLabel70, java.awt.BorderLayout.CENTER);

        jPanel26.add(jPanel36);

        jPanel40.setBackground(new java.awt.Color(255, 255, 255));
        jPanel40.setLayout(new java.awt.BorderLayout());

        jLabel71.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel71.setText("$2.00");
        jPanel40.add(jLabel71, java.awt.BorderLayout.LINE_END);

        jLabel72.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel72.setText("Jason");
        jPanel40.add(jLabel72, java.awt.BorderLayout.CENTER);

        jLabel73.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel73.setText("Jessica");
        jPanel40.add(jLabel73, java.awt.BorderLayout.CENTER);

        jPanel26.add(jPanel40);

        jScrollPane8.setViewportView(jPanel26);

        SummaryScreen.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 360, 170));

        jTextField6.setEditable(false);
        jTextField6.setText("$18.64");
        jTextField6.setToolTipText("");
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        SummaryScreen.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 90, 40));

        jButton6.setText("Close");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        SummaryScreen.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 180, 50));

        jPanel37.setLayout(new javax.swing.BoxLayout(jPanel37, javax.swing.BoxLayout.Y_AXIS));

        jPanel38.setBackground(new java.awt.Color(255, 255, 255));
        jPanel38.setLayout(new java.awt.BorderLayout());

        jLabel66.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel66.setText("$10.30");
        jPanel38.add(jLabel66, java.awt.BorderLayout.LINE_END);

        jLabel67.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel67.setText("Apples, 12 count");
        jPanel38.add(jLabel67, java.awt.BorderLayout.CENTER);

        jPanel37.add(jPanel38);

        jPanel39.setBackground(new java.awt.Color(255, 255, 255));
        jPanel39.setLayout(new java.awt.BorderLayout());

        jLabel68.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel68.setText("$8.64");
        jPanel39.add(jLabel68, java.awt.BorderLayout.LINE_END);

        jLabel69.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel69.setText("Pears, 8 count");
        jPanel39.add(jLabel69, java.awt.BorderLayout.CENTER);

        jPanel37.add(jPanel39);

        jScrollPane9.setViewportView(jPanel37);

        SummaryScreen.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 360, 90));

        BodyPart.add(SummaryScreen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 440));
        ListScreen.setVisible(false);

        AppScreen.add(BodyPart, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 400, 440));

        getContentPane().add(AppScreen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListButtonActionPerformed
        for(int i = 0; i < this.BodyPart.getComponentCount(); i++) {
            this.BodyPart.getComponent(i).setVisible(false);
        }
        
        ButtonNonActivation();
        ButtonActivated("List");
        this.ListScreen.setVisible(true);
        this.HeaderLabel.setText("List");
        ButtonActivated("List");
         this.BodyPart.repaint();
    }//GEN-LAST:event_ListButtonActionPerformed

    private void HomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButtonActionPerformed
               for(int i = 0; i < this.BodyPart.getComponentCount(); i++) {
            this.BodyPart.getComponent(i).setVisible(false);
        }
        ButtonNonActivation();
        ButtonActivated("Home");
        
       this.HomeScreen.setVisible(true);
       this.HeaderLabel.setText("Groshare");
        this.BodyPart.repaint();
    }//GEN-LAST:event_HomeButtonActionPerformed

    private void PurchaseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PurchaseButtonActionPerformed
               for(int i = 0; i < this.BodyPart.getComponentCount(); i++) {
            this.BodyPart.getComponent(i).setVisible(false);
        }
               ButtonNonActivation();
              ButtonActivated("Purchase");
                  this.PurchaseScreen.setVisible(true);
               
       this.HeaderLabel.setText("Purchases");
        this.BodyPart.repaint();
    }//GEN-LAST:event_PurchaseButtonActionPerformed

    private void GroupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GroupButtonActionPerformed
               for(int i = 0; i < this.BodyPart.getComponentCount(); i++) {
            this.BodyPart.getComponent(i).setVisible(false);
        }
               ButtonNonActivation();
              ButtonActivated("Group");
       this.GroupScreen.setVisible(true);
       this.HeaderLabel.setText("My Group");
        this.BodyPart.repaint();
    }//GEN-LAST:event_GroupButtonActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
               for(int i = 0; i < this.BodyPart.getComponentCount(); i++) {
            this.BodyPart.getComponent(i).setVisible(false);
        }
        ButtonNonActivation();
        ButtonActivated("Add");

       this.AddScreen.setVisible(true);
       this.HeaderLabel.setText("Add to list");
        this.jPanel34.setVisible(true);
        this.jScrollPane5.setVisible(false);
//        this.PopupApple.setVisible(false);
        this.BodyPart.repaint();
    }//GEN-LAST:event_AddButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
                     for(int i = 0; i < this.BodyPart.getComponentCount(); i++) {
            this.BodyPart.getComponent(i).setVisible(false);
        }
                             ButtonNonActivation();
        ButtonActivated("List");
        
        this.GeneratedList.removeAll();
        this.GeneratedList.validate();
        this.GeneratedList.repaint();
                     
       this.ListScreen.setVisible(true);
       
       this.HeaderLabel.setText("List");
       this.BackButton.setVisible(false);
        this.BodyPart.repaint();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        List test = new List();
        
        for (int i = 0; i < this.jPanel9.getComponentCount(); i++) {
            JPanel innerPanel = (JPanel) this.jPanel9.getComponent(i);
            JCheckBox temp = (JCheckBox) innerPanel.getComponent(0);
            JLabel tempName = (JLabel) innerPanel.getComponent(1);

            if (temp.isSelected()) {
                test.add(tempName.getText());
            }
        }

        double current = 0.0;
        double min = 0;
        double max = (double) Integer.MAX_VALUE;
        double step = 0.01;
        this.spinnerPrices = new double[test.getItemCount()];

        if (test.getItemCount() > 0) {
            this.InputScreen.setVisible(true);
            this.BackButton.setVisible(true);
             this.HeaderLabel.setText("Input Prices");
            this.ListScreen.setVisible(false);
            for (int i = 0; i < test.getItemCount(); i++) {
                JSpinner spinner = new JSpinner(
                        new SpinnerNumberModel(current, min, max, step));
                JComponent editor = new JSpinner.NumberEditor(spinner, "#0.00");
                spinner.setEditor(editor);
                spinner.addChangeListener(this.makeABoi(i));
                JLabel title = new JLabel(test.getItem(i));
                this.GeneratedList.add(title);
                this.GeneratedList.add(spinner);
                this.GeneratedList.validate();
                this.GeneratedList.repaint();
            }
        }
        
     
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void JessProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JessProfileMouseClicked
        this.PopupJessDialog.setSize(360,370);
        this.PopupJess.setVisible(true);
        this.PopupJessDialog.setVisible(true);
    }//GEN-LAST:event_JessProfileMouseClicked

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        this.jButton4.setEnabled(true);
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void Notification1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Notification1ActionPerformed

        this.PopupEdit.setSize(360, 350);
        this.PopupApple3.setVisible(true);
        this.PopupEdit.setVisible(true);
    }//GEN-LAST:event_Notification1ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
         this.jPanel9.getComponents();
        this.jButton4.setEnabled(true);
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void Notification3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Notification3ActionPerformed
       
        this.PopupEdit.setSize(360, 350);
        this.PopupApple3.setVisible(true);
        this.PopupEdit.setVisible(true);
    }//GEN-LAST:event_Notification3ActionPerformed

    private void Notification5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Notification5ActionPerformed
        this.PopupAppleDialog.setSize(360, 350);
        this.PopupAppleDialog.setVisible(true);
    }//GEN-LAST:event_Notification5ActionPerformed

    private void Notification6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Notification6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Notification6ActionPerformed

    private void Notification7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Notification7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Notification7ActionPerformed

    private void Notification8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Notification8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Notification8ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        this.jPanel34.setVisible(false);
        this.jScrollPane5.setVisible(true);
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void Notification10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Notification10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Notification10ActionPerformed

    private void Notification11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Notification11ActionPerformed
//        javax.swing.JPanel jPanelTest;
//        jPanelTest = new javax.swing.JPanel();
//        
//        javax.swing.JLabel jLabelTest = new javax.swing.JLabel();
//        javax.swing.JButton NotificationTest = new javax.swing.JButton();
//        
//        jPanelTest.setBackground(new java.awt.Color(255, 255, 255));
//        jPanelTest.setLayout(new java.awt.BorderLayout());
//
//        jLabelTest.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
//        jLabelTest.setText("Pears");
//        jPanelTest.add(jLabelTest, java.awt.BorderLayout.CENTER);
//
//        NotificationTest.setBackground(new java.awt.Color(255, 102, 102));
//        NotificationTest.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
//        NotificationTest.setForeground(new java.awt.Color(255, 255, 255));
//        NotificationTest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-plus_math 2.png"))); // NOI18N
//        NotificationTest.setBorderPainted(false);
//        NotificationTest.setContentAreaFilled(false);
//        NotificationTest.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
//        NotificationTest.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
//        NotificationTest.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
//        
//        jPanelTest.add(NotificationTest, java.awt.BorderLayout.LINE_END);
//
//        this.jPanel29.add(jPanelTest);
//        this.jScrollPane5.validate();
//
//        this.jScrollPane5.repaint();
           this.jPanel34.setVisible(false);
           this.jScrollPane5.setVisible(true);
    }//GEN-LAST:event_Notification11ActionPerformed

    private void Notification9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Notification9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Notification9ActionPerformed

    private void Notification12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Notification12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Notification12ActionPerformed

    private void Notification13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Notification13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Notification13ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.GeneratedList.removeAll();
        this.GeneratedList.validate();
        this.GeneratedList.repaint();
         this.BackButton.setVisible(false);

        for (int i = this.jPanel9.getComponentCount() - 1; i >= 0; i--) {
            JPanel innerPanel = (JPanel) this.jPanel9.getComponent(i);
            JCheckBox temp = (JCheckBox) innerPanel.getComponent(0);
            if (temp.isSelected()) {
                this.jPanel9.remove(innerPanel);
            }
        }

        this.jPanel9.validate();
        this.jPanel9.repaint();

        this.currentTotal += this.calculatorTotal;
        //        this.totalPrice.setText("$" + df.format((this.currentTotal / this.model.getSize())));
        //        this.totalCost.setText("$" + df.format(this.currentTotal));

        //        this.jPanel4.repaint();

        this.calculatorTotal = 0.00;
        

        this.InputScreen.setVisible(false);
        this.HeaderLabel.setText("November 7, 2019");
                 ButtonNonActivation();
        ButtonActivated("Purchase");
        this.SummaryScreen.setVisible(true);
        
        this.appleAdded = false;
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        this.HomeScreen.setVisible(false);
                 ButtonNonActivation();
        ButtonActivated("Purchase");
        this.HeaderLabel.setText("Purchases");
        this.PurchaseScreen.setVisible(true);
    }//GEN-LAST:event_jPanel5MouseClicked

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        this.SummaryScreen.setVisible(true);
         ButtonNonActivation();
        ButtonActivated("Purchase");
        this.HeaderLabel.setText("November 7, 2019");
        this.PurchaseScreen.setVisible(false);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
               this.HomeScreen.setVisible(false);
                       ButtonNonActivation();
        ButtonActivated("Purchase");
        this.HeaderLabel.setText("Purchases");
        this.PurchaseScreen.setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.SummaryScreen.setVisible(false);
        ButtonNonActivation();
        ButtonActivated("Purchase");
        this.HeaderLabel.setText("Purchases");
        this.PurchaseScreen.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void ExitProfile2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitProfile2ActionPerformed
         this.PopupAppleDialog.setVisible(false);
    }//GEN-LAST:event_ExitProfile2ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
          this.PopupAppleDialog.setVisible(false);
        for(int i = 0; i < this.BodyPart.getComponentCount(); i++) {
           this.BodyPart.getComponent(i).setVisible(false);
        }
        
        
        
        javax.swing.JPanel jPanelTest;
        jPanelTest = new javax.swing.JPanel();
        
        javax.swing.JLabel jLabelTest = new javax.swing.JLabel();
        javax.swing.JButton NotificationTest = new javax.swing.JButton();
        javax.swing.JCheckBox jCheckBoxTest = new javax.swing.JCheckBox();
        
        jPanelTest.setBackground(new java.awt.Color(200, 200, 200));
        jPanelTest.setLayout(new java.awt.BorderLayout());
        
        
        jPanelTest.add(jCheckBoxTest, java.awt.BorderLayout.LINE_START);
        jCheckBoxTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxTestActionPerformed(evt);
            }
        });

        jLabelTest.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabelTest.setText("Apples, 12 count");
        jPanelTest.add(jLabelTest, java.awt.BorderLayout.CENTER);

        NotificationTest.setBackground(new java.awt.Color(255, 102, 102));
        NotificationTest.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        NotificationTest.setForeground(new java.awt.Color(255, 255, 255));
        NotificationTest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-edit.png"))); // NOI18N
        NotificationTest.setBorderPainted(false);
        NotificationTest.setContentAreaFilled(false);
        NotificationTest.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NotificationTest.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        NotificationTest.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanelTest.add(NotificationTest, java.awt.BorderLayout.LINE_END);

        if(!this.appleAdded){
        this.jPanel9.add(jPanelTest);
        this.appleAdded = true;
        
        }
        
       ButtonNonActivation();
        ButtonActivated("List");
       this.ListScreen.setVisible(true);
       this.HeaderLabel.setText("List");
        this.BodyPart.repaint();
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void ExitProfile1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitProfile1ActionPerformed
        this.PopupJessDialog.setVisible(false);
    }//GEN-LAST:event_ExitProfile1ActionPerformed

    private void Notification14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Notification14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Notification14ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                       for(int i = 0; i < this.BodyPart.getComponentCount(); i++) {
            this.BodyPart.getComponent(i).setVisible(false);
        }
        ButtonNonActivation();
        ButtonActivated("Add");
       this.AddScreen.setVisible(true);
       this.HeaderLabel.setText("Add to list");
        this.jPanel34.setVisible(true);
        this.jScrollPane5.setVisible(false);
//        this.PopupApple.setVisible(false);
        this.BodyPart.repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void NotificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NotificationActionPerformed
        this.Notifications.setVisible(true);
        this.NotificationDialog.setSize(400, 475);
        this.NotificationDialog.setVisible(true);
        
    }//GEN-LAST:event_NotificationActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
           for(int i = 0; i < this.BodyPart.getComponentCount(); i++) {
            this.BodyPart.getComponent(i).setVisible(false);
        }
        ButtonNonActivation();
        ButtonActivated("List");
       this.ListScreen.setVisible(true);
       this.HeaderLabel.setText("List");
//        this.PopupApple.setVisible(false);
        this.BodyPart.repaint();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
                   for(int i = 0; i < this.BodyPart.getComponentCount(); i++) {
            this.BodyPart.getComponent(i).setVisible(false);
        }
        ButtonNonActivation();
        ButtonActivated("List");
       this.ListScreen.setVisible(true);
       this.HeaderLabel.setText("List");
//        this.PopupApple.setVisible(false);
        this.BodyPart.repaint();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        this.NotificationDialog.setVisible(false);
    for(int i = 0; i < this.BodyPart.getComponentCount(); i++) {
            this.BodyPart.getComponent(i).setVisible(false);
        }
        ButtonNonActivation();
        ButtonActivated("List");
       this.ListScreen.setVisible(true);
       this.HeaderLabel.setText("List");
//        this.PopupApple.setVisible(false);
        this.BodyPart.repaint();
        
    }//GEN-LAST:event_jButton10ActionPerformed

    private void ExitProfile3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitProfile3ActionPerformed
        this.NotificationDialog.setVisible(false);
    }//GEN-LAST:event_ExitProfile3ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
                this.NotificationDialog.setVisible(false);
    for(int i = 0; i < this.BodyPart.getComponentCount(); i++) {
            this.BodyPart.getComponent(i).setVisible(false);
        }
        ButtonNonActivation();
        ButtonActivated("List");
       this.ListScreen.setVisible(true);
       this.HeaderLabel.setText("List");
//        this.PopupApple.setVisible(false);
        this.BodyPart.repaint();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
                this.NotificationDialog.setVisible(false);
    for(int i = 0; i < this.BodyPart.getComponentCount(); i++) {
            this.BodyPart.getComponent(i).setVisible(false);
        }
        ButtonNonActivation();
        ButtonActivated("List");
       this.ListScreen.setVisible(true);
       this.HeaderLabel.setText("List");
//        this.PopupApple.setVisible(false);
        this.BodyPart.repaint();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
               this.NotificationDialog.setVisible(false);
    for(int i = 0; i < this.BodyPart.getComponentCount(); i++) {
            this.BodyPart.getComponent(i).setVisible(false);
        }
        ButtonNonActivation();
        ButtonActivated("List");
       this.ListScreen.setVisible(true);
       this.HeaderLabel.setText("List");
//        this.PopupApple.setVisible(false);
        this.BodyPart.repaint();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
                this.NotificationDialog.setVisible(false);
    for(int i = 0; i < this.BodyPart.getComponentCount(); i++) {
            this.BodyPart.getComponent(i).setVisible(false);
        }
        ButtonNonActivation();
        ButtonActivated("List");
       this.ListScreen.setVisible(true);
       this.HeaderLabel.setText("List");
//        this.PopupApple.setVisible(false);
        this.BodyPart.repaint();
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        this.jPanel4.setVisible(false);
        this.PopupItem.setSize(360, 350);
        this.PopupApple2.setVisible(true);
        this.PopupItem.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void ExitProfile4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitProfile4ActionPerformed
        this.PopupItem.setVisible(false);
    }//GEN-LAST:event_ExitProfile4ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        this.jPanel4.setVisible(true);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void ExitProfile5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitProfile5ActionPerformed
        this.PopupEdit.setVisible(false);
    }//GEN-LAST:event_ExitProfile5ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton19ActionPerformed

       private void jCheckBoxTestActionPerformed(java.awt.event.ActionEvent evt) {
         this.jButton4.setEnabled(true);
    }  
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Screen().setVisible(true);
                
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JPanel AddScreen;
    private javax.swing.JPanel AppScreen;
    private javax.swing.JButton BackButton;
    private javax.swing.JPanel BodyPart;
    private javax.swing.JButton ExitProfile1;
    private javax.swing.JButton ExitProfile2;
    private javax.swing.JButton ExitProfile3;
    private javax.swing.JButton ExitProfile4;
    private javax.swing.JButton ExitProfile5;
    private javax.swing.JPanel GeneratedList;
    private javax.swing.JButton GroupButton;
    private javax.swing.JPanel GroupScreen;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel HeaderLabel;
    private javax.swing.JButton HomeButton;
    private javax.swing.JPanel HomeScreen;
    private javax.swing.JPanel InputScreen;
    private javax.swing.JPanel JessProfile;
    private javax.swing.JButton ListButton;
    private javax.swing.JPanel ListScreen;
    private javax.swing.JPanel NavBar;
    private javax.swing.JButton Notification;
    private javax.swing.JButton Notification1;
    private javax.swing.JButton Notification10;
    private javax.swing.JButton Notification11;
    private javax.swing.JButton Notification12;
    private javax.swing.JButton Notification13;
    private javax.swing.JButton Notification14;
    private javax.swing.JButton Notification3;
    private javax.swing.JButton Notification5;
    private javax.swing.JButton Notification6;
    private javax.swing.JButton Notification7;
    private javax.swing.JButton Notification8;
    private javax.swing.JButton Notification9;
    private javax.swing.JDialog NotificationDialog;
    private javax.swing.JPanel NotificationScreen;
    private javax.swing.JPanel Notifications;
    private javax.swing.JPanel PopupApple1;
    private javax.swing.JPanel PopupApple2;
    private javax.swing.JPanel PopupApple3;
    private javax.swing.JDialog PopupAppleDialog;
    private javax.swing.JDialog PopupEdit;
    private javax.swing.JDialog PopupItem;
    private javax.swing.JPanel PopupJess;
    private javax.swing.JDialog PopupJessDialog;
    private javax.swing.JButton PurchaseButton;
    private javax.swing.JPanel PurchaseScreen;
    private javax.swing.JPanel SummaryScreen;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
