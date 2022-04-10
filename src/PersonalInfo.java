
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author MD JAHID HASAH
 */
public class PersonalInfo extends javax.swing.JFrame {

    /** Creates new form PersonalInfo */
    public PersonalInfo() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("iShop.png")).getImage());
        //this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        showdata();
    }
    private int flag = 0,flag2=0;
    public void showdata(){
        String  filepath = "C:\\Users\\MD JAHID HASAH\\Documents\\NetBeansProjects\\Smart Shop\\src\\personal.txt";
        File file = new File(filepath); 
            try {
                BufferedReader br = new BufferedReader(new FileReader(file));
                String firstLine = br.readLine().trim();
              
                DefaultTableModel model = (DefaultTableModel)jTable1.getModel();

                Object[] tableLines = br.lines().toArray();

                for(int i=0; i<tableLines.length; i++){
                    String line = tableLines[i].toString().trim();
                    String[] dataRow = line.split("/");
                    model.addRow(dataRow);
                }
            } catch (Exception ex) {
                Logger.getLogger(Shopkeeper_Window.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabelclose = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_search = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        user_name = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        user_name1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        user_name2 = new javax.swing.JLabel();
        user_name3 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        btn_Refresh = new javax.swing.JButton();
        total_sold = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        user_name4 = new javax.swing.JLabel();
        user_name6 = new javax.swing.JLabel();
        user_name7 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        quantity = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        btn_add = new javax.swing.JButton();
        btn_import = new javax.swing.JButton();
        btn_export = new javax.swing.JButton();
        btn_add1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        additem = new javax.swing.JTable();
        user_name8 = new javax.swing.JLabel();
        user_name9 = new javax.swing.JLabel();
        marks = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(153, 0, 0));

        jLabelclose.setFont(new java.awt.Font("Ravie", 1, 24)); // NOI18N
        jLabelclose.setForeground(new java.awt.Color(255, 255, 255));
        jLabelclose.setText("X");
        jLabelclose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelclose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelcloseMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Personal Information");

        jLabelMin.setFont(new java.awt.Font("Ravie", 1, 24)); // NOI18N
        jLabelMin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMin.setText("_");
        jLabelMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelMin)
                .addGap(18, 18, 18)
                .addComponent(jLabelclose)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelclose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelMin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(244, 244, 244))
        );

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 153));
        jLabel1.setText("Looking For What? ");

        txt_search.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        txt_search.setText("Type Here");
        txt_search.setToolTipText("Type Here");
        txt_search.setPreferredSize(new java.awt.Dimension(70, 40));
        txt_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_searchActionPerformed(evt);
            }
        });
        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchKeyReleased(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 0, 204));
        jButton1.setText("Search");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setPreferredSize(new java.awt.Dimension(79, 40));

        user_name.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        user_name.setForeground(new java.awt.Color(255, 255, 153));
        user_name.setText("Jahid Hasan");
        user_name.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 153));
        jLabel4.setText("Log Out");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(51, 153, 0));
        jButton2.setFont(new java.awt.Font("Ravie", 1, 18)); // NOI18N
        jButton2.setText("Sell");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        user_name1.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        user_name1.setForeground(new java.awt.Color(255, 255, 153));
        user_name1.setText("Register For New Shopkeeper");
        user_name1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        user_name1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                user_name1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(user_name, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4))
                    .addComponent(user_name1))
                .addGap(26, 26, 26))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(user_name)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(user_name1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(1305, 1305, 1305))))
        );

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        user_name2.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        user_name2.setForeground(new java.awt.Color(255, 255, 153));
        user_name2.setText("Item List");
        user_name2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        user_name3.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        user_name3.setForeground(new java.awt.Color(255, 255, 153));
        user_name3.setText("        Sold History");
        user_name3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jList2.setBackground(new java.awt.Color(153, 0, 0));
        jList2.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jList2.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jList2.setForeground(new java.awt.Color(255, 204, 204));
        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "teem", "jahid*" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(jList2);

        btn_Refresh.setBackground(new java.awt.Color(153, 153, 255));
        btn_Refresh.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        btn_Refresh.setText("Refresh Table");
        btn_Refresh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RefreshActionPerformed(evt);
            }
        });

        total_sold.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        total_sold.setForeground(new java.awt.Color(255, 255, 153));
        total_sold.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jTable1.setBackground(new java.awt.Color(255, 204, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Time", "Name", "Mobile", "Sold"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable1);

        user_name4.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        user_name4.setForeground(new java.awt.Color(255, 255, 153));
        user_name4.setText("Name:");
        user_name4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        user_name6.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        user_name6.setForeground(new java.awt.Color(255, 255, 153));
        user_name6.setText("Price/pack:");
        user_name6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        user_name7.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        user_name7.setForeground(new java.awt.Color(255, 255, 153));
        user_name7.setText("Net Weight:");
        user_name7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        name.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        name.setToolTipText("Type Here");
        name.setPreferredSize(new java.awt.Dimension(70, 40));
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        quantity.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        quantity.setToolTipText("Type Here");
        quantity.setPreferredSize(new java.awt.Dimension(70, 40));
        quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityActionPerformed(evt);
            }
        });

        price.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        price.setToolTipText("Type Here");
        price.setPreferredSize(new java.awt.Dimension(70, 40));
        price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceActionPerformed(evt);
            }
        });

        btn_add.setBackground(new java.awt.Color(153, 153, 255));
        btn_add.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        btn_add.setText("Add To Table");
        btn_add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_import.setBackground(new java.awt.Color(153, 153, 255));
        btn_import.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        btn_import.setText("Import All");
        btn_import.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_import.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_importActionPerformed(evt);
            }
        });

        btn_export.setBackground(new java.awt.Color(153, 153, 255));
        btn_export.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        btn_export.setText("Export All");
        btn_export.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_export.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exportActionPerformed(evt);
            }
        });

        btn_add1.setBackground(new java.awt.Color(153, 153, 255));
        btn_add1.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        btn_add1.setText("Remove");
        btn_add1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_add1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add1ActionPerformed(evt);
            }
        });

        additem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Net Weight", "Price", "Marks"
            }
        ));
        jScrollPane1.setViewportView(additem);

        user_name8.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        user_name8.setForeground(new java.awt.Color(255, 255, 153));
        user_name8.setText("User List");
        user_name8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        user_name9.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        user_name9.setForeground(new java.awt.Color(255, 255, 153));
        user_name9.setText("Marks");
        user_name9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        marks.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        marks.setToolTipText("Type Here");
        marks.setPreferredSize(new java.awt.Dimension(70, 40));
        marks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marksActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(155, 155, 155)
                                        .addComponent(btn_import))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(user_name9)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(marks, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(user_name4)
                                                .addComponent(user_name7)
                                                .addComponent(user_name6))
                                            .addGap(29, 29, 29)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(35, 35, 35))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_add1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btn_add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_export, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(71, 71, 71)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_Refresh)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 863, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(310, 310, 310)
                                .addComponent(user_name3, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(449, 449, 449)
                                .addComponent(user_name8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(total_sold, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(203, 203, 203))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(545, 545, 545)
                .addComponent(user_name2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(total_sold, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(295, 295, 295))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(user_name3)
                            .addComponent(user_name8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Refresh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_import)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(user_name4)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(user_name7)
                            .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(user_name6)
                            .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(user_name9)
                            .addComponent(marks, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addComponent(btn_add)
                        .addGap(10, 10, 10)
                        .addComponent(btn_add1)
                        .addGap(18, 18, 18)
                        .addComponent(btn_export))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(user_name2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1211, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelcloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelcloseMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabelcloseMouseClicked

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked

        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinMouseClicked

    private void txt_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_searchActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked

        // TODO add your handling code here:
        LogInForm login_page = new LogInForm();
        login_page.setVisible(true);
        login_page.pack();
        login_page.setLocationRelativeTo(null);
        login_page.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        
            Owner_Window ownerwindow = new Owner_Window();
            ownerwindow.setVisible(true);
            ownerwindow.pack();
            ownerwindow.setLocationRelativeTo(null);
            ownerwindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
            
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
        
        int Xcor = evt.getXOnScreen();
        int Ycor = evt.getYOnScreen();
        
        this.setLocation(Xcor, Ycor);
    }//GEN-LAST:event_formMouseDragged

    private void btn_RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RefreshActionPerformed

        // TODO add your handling code here:
        jTable1.setModel(new DefaultTableModel (null, new String[] {"Date" , "Time", "Name", "Mobile", "Sold"}));
        showdata();
    }//GEN-LAST:event_btn_RefreshActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void quantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityActionPerformed

    private void priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceActionPerformed

    
    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        // TODO add your handling code here:
        
        if(flag == 1){
            
            String addName = name.getText();
            String addQuantity = quantity.getText();
            String addPrice = price.getText();
            String addMraks = marks.getText();
            if(addName.equals("") || addQuantity.equals("") || addPrice.equals("")){
                JOptionPane.showMessageDialog(null, "Some value is empty");
            }
            else
            {
                DefaultTableModel model = (DefaultTableModel) additem.getModel();
                model.addRow(new Object[] {addName, addQuantity, addPrice,addMraks});
                
                TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<DefaultTableModel>(model);
                additem.setRowSorter(sorter);
                
                
            }
            
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Import Data Please! ");
        }
        
        name.setText("");
        quantity.setText("");
        price.setText("");
        marks.setText("");
        
        
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_importActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_importActionPerformed
        // TODO add your handling code here:
        if(flag == 0){
        String filepath = "C:\\Users\\MD JAHID HASAH\\Documents\\NetBeansProjects\\Smart Shop\\src\\products.txt";
        File file = new File(filepath);
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            
            DefaultTableModel model = (DefaultTableModel)additem.getModel();
            
            Object[] lines = br.lines().toArray();
            
            for(int i=0; i<lines.length; i++){
                String[] row = lines[i].toString().split("-");
                model.addRow(row);
            }
            flag = 1;
            JOptionPane.showMessageDialog(null, "Successfully Imported");
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PersonalInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        }
        else{
            JOptionPane.showMessageDialog(null, "Imported Data");
        }
    }//GEN-LAST:event_btn_importActionPerformed

    private void btn_exportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exportActionPerformed
        // TODO add your handling code he re:
        String filepath = "C:\\Users\\MD JAHID HASAH\\Documents\\NetBeansProjects\\Smart Shop\\src\\products.txt";
        File file = new File(filepath);
        
        if(flag ==1){
        
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            
            for(int i=0; i<additem.getRowCount(); i++){
                for(int j=0; j<additem.getColumnCount(); j++){
                    bw.write(additem.getValueAt(i,j).toString()+"-");
                }
                bw.newLine();
            }
            JOptionPane.showMessageDialog(null, "Successfully Exported");
            bw.close();
            fw.close();
            flag = 0;
            additem.setModel(new DefaultTableModel (null, new String[] {"Name" , "Net Weight", "Price/packs", "Marks"}));
        } catch (IOException ex) {
            Logger.getLogger(PersonalInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        else{
            JOptionPane.showMessageDialog(null, "Add New Data first");
        }
        
    }//GEN-LAST:event_btn_exportActionPerformed

    private void btn_add1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add1ActionPerformed
        // TODO add your handling code here:
         
        DefaultTableModel model4= (DefaultTableModel)additem.getModel();
        //Get selected row index
        try{
            int SelectedRowIndex = additem.getSelectedRow();
            model4.removeRow(SelectedRowIndex);
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Table is empty");
        }
        
        
    }//GEN-LAST:event_btn_add1ActionPerformed

    private void marksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marksActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marksActionPerformed

    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased
        // TODO add your handling code here:
        DefaultTableModel table = (DefaultTableModel)jTable1.getModel();
        String search = txt_search.getText().toUpperCase();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(table);
        jTable1.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_txt_searchKeyReleased

    private void user_name1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_name1MouseClicked
        // TODO add your handling code here:
        
        JOptionPane.showMessageDialog(null, "This Option will come soon");
        
    }//GEN-LAST:event_user_name1MouseClicked

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
            java.util.logging.Logger.getLogger(PersonalInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonalInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonalInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonalInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonalInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable additem;
    private javax.swing.JButton btn_Refresh;
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_add1;
    private javax.swing.JButton btn_export;
    private javax.swing.JButton btn_import;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JLabel jLabelclose;
    private javax.swing.JList<String> jList2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField marks;
    private javax.swing.JTextField name;
    private javax.swing.JTextField price;
    private javax.swing.JTextField quantity;
    private javax.swing.JLabel total_sold;
    private javax.swing.JTextField txt_search;
    private javax.swing.JLabel user_name;
    private javax.swing.JLabel user_name1;
    private javax.swing.JLabel user_name2;
    private javax.swing.JLabel user_name3;
    private javax.swing.JLabel user_name4;
    private javax.swing.JLabel user_name6;
    private javax.swing.JLabel user_name7;
    private javax.swing.JLabel user_name8;
    private javax.swing.JLabel user_name9;
    // End of variables declaration//GEN-END:variables

}
