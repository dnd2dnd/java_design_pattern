package DPP_Order;

import DPP_Cal.PaymentJFrame;
import DPP_Login.LoginLog;
import javax.swing.JOptionPane;
import java.io.*;

/**
 *
 * @author Eun Ji Kim
 */
public class Order extends javax.swing.JFrame {
    LoginLog loginlog = new LoginLog();
    
    static int friedricenum = 0;
    static int tteokbokkinum = 0;
    static int ramennum = 0;
    static int addegg = 0;
    static int addcheese = 0;
    static int addrice = 0;
    
    int RowCount = 0;
    int TotalPrice = 0;
    String UserName = "";
 
    
    public Order() {
        initComponents();
        setLocationRelativeTo(null);// 화면 가운데서 창이 나옴
        
        resetCategories();
        NoCategories.setVisible(true);
        NoCategories.setEnabled(true);
                
        UserName = loginlog.getName();
        TotalPriceTextField.setText(Integer.toString(TotalPrice));
        
        UserNameField.setText(UserName + " 님");   // 고객 객체 정보 받아와서 고객이름 지정
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        foodDeco = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        addEgg = new javax.swing.JButton();
        addCheeze = new javax.swing.JButton();
        addRice = new javax.swing.JButton();
        foodOK = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        MenuTable = new javax.swing.JTable();
        TotalPriceTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        NoCategories = new javax.swing.JPanel();
        DRINKPanel = new javax.swing.JPanel();
        coke = new javax.swing.JButton();
        cyder = new javax.swing.JButton();
        fanta = new javax.swing.JButton();
        FOODPanel = new javax.swing.JPanel();
        dduckbboki = new javax.swing.JButton();
        friedRice = new javax.swing.JButton();
        ramen = new javax.swing.JButton();
        SetMenuPanel = new javax.swing.JPanel();
        Set_3 = new javax.swing.JButton();
        Set_1 = new javax.swing.JButton();
        Set_2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        UserNameField = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        refresh = new javax.swing.JButton();
        order = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        drinkCategory = new javax.swing.JLabel();
        foodCategory = new javax.swing.JLabel();
        snackCategory = new javax.swing.JLabel();

        foodDeco.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        foodDeco.setMinimumSize(new java.awt.Dimension(500, 270));

        jPanel1.setBackground(new java.awt.Color(106, 116, 145));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addEgg.setFont(new java.awt.Font("맑은 고딕", 1, 24)); // NOI18N
        addEgg.setText("<html>\n<center>\n계란 추가<br>\n(500원)\n</html>");
        addEgg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addEgg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addEggMouseClicked(evt);
            }
        });
        jPanel1.add(addEgg, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 140, 102));

        addCheeze.setFont(new java.awt.Font("맑은 고딕", 1, 24)); // NOI18N
        addCheeze.setText("<html>\n<center>\n치즈 추가<br>\n(600원)\n</html>");
        addCheeze.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addCheeze.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addCheezeMouseClicked(evt);
            }
        });
        jPanel1.add(addCheeze, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 140, 102));

        addRice.setFont(new java.awt.Font("맑은 고딕", 1, 24)); // NOI18N
        addRice.setText("<html>\n<center>\n밥 추가<br>\n(1000원)\n</html>");
        addRice.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addRice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addRiceMouseClicked(evt);
            }
        });
        jPanel1.add(addRice, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 140, 102));

        foodOK.setFont(new java.awt.Font("맑은 고딕", 1, 24)); // NOI18N
        foodOK.setText("선택 완료");
        foodOK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        foodOK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                foodOKMouseClicked(evt);
            }
        });
        jPanel1.add(foodOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 160, 50));

        javax.swing.GroupLayout foodDecoLayout = new javax.swing.GroupLayout(foodDeco.getContentPane());
        foodDeco.getContentPane().setLayout(foodDecoLayout);
        foodDecoLayout.setHorizontalGroup(
            foodDecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        foodDecoLayout.setVerticalGroup(
            foodDecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 15, 80));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("맑은 고딕", 1, 22)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("담은 메뉴");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

        MenuTable.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        MenuTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "메뉴", "가격"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        MenuTable.setRowHeight(20);
        MenuTable.setShowVerticalLines(false);
        jScrollPane2.setViewportView(MenuTable);
        if (MenuTable.getColumnModel().getColumnCount() > 0) {
            MenuTable.getColumnModel().getColumn(0).setResizable(false);
            MenuTable.getColumnModel().getColumn(1).setResizable(false);
        }

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 230, 310));

        TotalPriceTextField.setBackground(new java.awt.Color(0, 15, 80));
        TotalPriceTextField.setFont(new java.awt.Font("맑은 고딕", 1, 24)); // NOI18N
        TotalPriceTextField.setForeground(new java.awt.Color(204, 204, 204));
        TotalPriceTextField.setToolTipText("");
        TotalPriceTextField.setBorder(null);
        jPanel2.add(TotalPriceTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, 110, 60));

        jLabel1.setFont(new java.awt.Font("맑은 고딕", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("총 가격 : ");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, 60));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 500));

        NoCategories.setBackground(new java.awt.Color(32, 47, 90));

        javax.swing.GroupLayout NoCategoriesLayout = new javax.swing.GroupLayout(NoCategories);
        NoCategories.setLayout(NoCategoriesLayout);
        NoCategoriesLayout.setHorizontalGroup(
            NoCategoriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        NoCategoriesLayout.setVerticalGroup(
            NoCategoriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );

        getContentPane().add(NoCategories, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 600, 270));

        DRINKPanel.setBackground(new java.awt.Color(32, 47, 90));
        DRINKPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        coke.setFont(new java.awt.Font("맑은 고딕", 1, 24)); // NOI18N
        coke.setText("<html>\n<center>\n콜라<br>\n(1500원)\n</html>");
        coke.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        coke.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cokeMouseClicked(evt);
            }
        });
        DRINKPanel.add(coke, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 160, 110));

        cyder.setFont(new java.awt.Font("맑은 고딕", 1, 24)); // NOI18N
        cyder.setText("<html> <center> 사이다<br> (1400원) </html>");
        cyder.setActionCommand("<html>\n<center>\n사이다<br>\n(1400원)\n</html>");
        cyder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cyder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cyderMouseClicked(evt);
            }
        });
        DRINKPanel.add(cyder, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 160, 110));

        fanta.setFont(new java.awt.Font("맑은 고딕", 1, 24)); // NOI18N
        fanta.setText("<html>\n<center>\n환타<br>\n(1600원)\n</html>");
        fanta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fanta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fantaMouseClicked(evt);
            }
        });
        DRINKPanel.add(fanta, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 160, 110));

        getContentPane().add(DRINKPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 600, 270));

        FOODPanel.setBackground(new java.awt.Color(32, 47, 90));
        FOODPanel.setMinimumSize(new java.awt.Dimension(650, 240));
        FOODPanel.setPreferredSize(new java.awt.Dimension(650, 240));
        FOODPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dduckbboki.setFont(new java.awt.Font("맑은 고딕", 1, 24)); // NOI18N
        dduckbboki.setText("<html>\n<center>\n떡볶이<br>\n(4000원)\n</html>");
        dduckbboki.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dduckbbokiMouseClicked(evt);
            }
        });
        FOODPanel.add(dduckbboki, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 160, 110));

        friedRice.setFont(new java.awt.Font("맑은 고딕", 1, 24)); // NOI18N
        friedRice.setText("<html>\n<center>\n볶음밥<br>\n(3500원)\n</html>");
        friedRice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                friedRiceMouseClicked(evt);
            }
        });
        FOODPanel.add(friedRice, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 160, 110));

        ramen.setFont(new java.awt.Font("맑은 고딕", 1, 24)); // NOI18N
        ramen.setText("<html>\n<center>\n라면<br>\n(3000원)\n</html>");
        ramen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ramenMouseClicked(evt);
            }
        });
        FOODPanel.add(ramen, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 160, 110));

        getContentPane().add(FOODPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 600, 270));
        FOODPanel.getAccessibleContext().setAccessibleParent(this);

        SetMenuPanel.setBackground(new java.awt.Color(32, 47, 90));
        SetMenuPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Set_3.setFont(new java.awt.Font("맑은 고딕", 1, 24)); // NOI18N
        Set_3.setText("<html>\n<center>\n세트 3번<br>\n(6200원)<br>\n<br>\n환타<br>\n떡볶이<br>\n+치즈추가<br>\n</html>");
        Set_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Set_3MouseClicked(evt);
            }
        });
        SetMenuPanel.add(Set_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 160, 230));

        Set_1.setFont(new java.awt.Font("맑은 고딕", 1, 24)); // NOI18N
        Set_1.setText("<html>\n<center>\n세트 1번<br>\n(5000원)<br>\n<br>\n콜라<br>\n라면<br>\n+계란추가<br>\n</html>");
        Set_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Set_1MouseClicked(evt);
            }
        });
        SetMenuPanel.add(Set_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 160, 230));

        Set_2.setFont(new java.awt.Font("맑은 고딕", 1, 24)); // NOI18N
        Set_2.setText("<html>\n<center>\n세트 2번<br>\n(5900원)<br>\n<br>\n사이다<br>\n볶음밥<br>\n+밥추가<br>\n</html>");
        Set_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Set_2MouseClicked(evt);
            }
        });
        SetMenuPanel.add(Set_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 160, 230));

        getContentPane().add(SetMenuPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 600, 270));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UserNameField.setEditable(false);
        UserNameField.setBackground(new java.awt.Color(255, 255, 255));
        UserNameField.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        UserNameField.setBorder(null);
        UserNameField.setFocusable(false);
        jPanel4.add(UserNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 90, 30));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 690, 50));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("맑은 고딕", 1, 36)); // NOI18N
        jLabel4.setText("음식 주문");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        jLabel5.setFont(new java.awt.Font("맑은 고딕", 0, 15)); // NOI18N
        jLabel5.setText("메뉴를 담아서 주문해주세요.");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, -1, -1));

        refresh.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        refresh.setText("초기화");
        refresh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshMouseClicked(evt);
            }
        });
        jPanel5.add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 110, 50));

        order.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        order.setText("주문하기");
        order.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        order.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderMouseClicked(evt);
            }
        });
        order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderActionPerformed(evt);
            }
        });
        jPanel5.add(order, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, 110, 50));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 690, 110));

        jPanel7.setBackground(new java.awt.Color(32, 47, 90));

        jPanel6.setBackground(new java.awt.Color(106, 116, 145));

        jLabel7.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Categories");

        drinkCategory.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        drinkCategory.setForeground(new java.awt.Color(204, 204, 204));
        drinkCategory.setText("Drink");
        drinkCategory.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        drinkCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                drinkCategoryMouseClicked(evt);
            }
        });

        foodCategory.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        foodCategory.setForeground(new java.awt.Color(204, 204, 204));
        foodCategory.setText("Food");
        foodCategory.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        foodCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                foodCategoryMouseClicked(evt);
            }
        });

        snackCategory.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        snackCategory.setForeground(new java.awt.Color(204, 204, 204));
        snackCategory.setText("Quick Set Menu");
        snackCategory.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        snackCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                snackCategoryMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel7)
                .addGap(103, 103, 103)
                .addComponent(drinkCategory)
                .addGap(41, 41, 41)
                .addComponent(foodCategory)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(snackCategory)
                .addGap(31, 31, 31))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(drinkCategory)
                    .addComponent(foodCategory)
                    .addComponent(snackCategory))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 600, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void resetCategories() {     // 카테고리 패널 초기화
        DRINKPanel.setVisible(false);
        FOODPanel.setVisible(false);
        SetMenuPanel.setVisible(false);
        NoCategories.setVisible(false);
        
        DRINKPanel.setEnabled(false);
        FOODPanel.setEnabled(false);
        SetMenuPanel.setEnabled(false);
        NoCategories.setEnabled(false);
    }
    
    public void resetMenu() {        // 선택 메뉴 초기화
        for(int i=0; i<14; i++) {
            MenuTable.setValueAt("", i, 0);
            MenuTable.setValueAt("", i, 1);
        }
        RowCount = 0;
        TotalPrice = 0;
        
        TotalPriceTextField.setText(Integer.toString(TotalPrice));
    }
    
    public void selectMenu(String name, int price) {    // 메뉴 선택
        if (RowCount < 14) {
            MenuTable.setValueAt(name, RowCount, 0);
            MenuTable.setValueAt(price, RowCount, 1);
            
            TotalPrice += price;
            TotalPriceTextField.setText(Integer.toString(TotalPrice));
            
            RowCount++;
        } else {
            JOptionPane.showInternalMessageDialog(null, "더 이상 주문할 수 없습니다.");
        }
    }
    
    public class Drink_Menu {
        
        private String name = "";
        private int price = 0;
        
        public Drink_Menu (String name, int price) {
            this.name = name;
            this.price = price;
        }
        
        public void Select_Drink () {
            selectMenu(name, price);
        }
    }
    
    public void selectFoodMenu(String name, int price) {    // food(데코기능) 메뉴 선택
        if (RowCount < 14) {
            MenuTable.setValueAt(name, RowCount, 0);
            MenuTable.setValueAt(price, RowCount, 1);
            
            foodDeco.setVisible(true);
            foodDeco.setLocationRelativeTo(null);// 화면 가운데서 창이 나옴
            foodDeco.setSize(510, 300);
            
            TotalPrice += price;
            TotalPriceTextField.setText(Integer.toString(TotalPrice));

            RowCount++;
        } else {
            JOptionPane.showInternalMessageDialog(null, "더 이상 주문할 수 없습니다.");
        }
    }
    
    public class Food_Menu {
        
        private String name = "";
        private int price = 0;
        
        public Food_Menu (String name, int price) {
            this.name = name;
            this.price = price;
        }
        
        public void Select_Food () {
            selectFoodMenu(name, price);
        }
    }
    
    public void selectAddMenu(String name, String price, int price2) {      // 데코 메뉴 추가
        MenuTable.setValueAt(name, RowCount, 0);
        MenuTable.setValueAt(price, RowCount, 1);
        
        TotalPrice += price2;
        TotalPriceTextField.setText(Integer.toString(TotalPrice));
        
        RowCount++;
    }
    
    public class Food_Deco_Menu {
        
        private String name = "";
        private String price = "";
        private int price2 = 0;
        
        public Food_Deco_Menu (String name, String price, int price2) {
            this.name = name;
            this.price = price;
            this.price2 = price2;
        }
        
        public void Select_Deco () {
            selectAddMenu(name, price, price2);
        }
    }
    
    public class Facade {
        private String Beverage_Name = "";
        private int Beverage_Price = 0;
        private String Food_Name = "";
        private int Food_Price = 0;
        private String Food_Deco_Name = "";
        private String Deco_Price = "";
        private int Deco_Price2 = 0;
        
        public Facade(String beverage, int b_price, String food, int f_pirce, String deco, String d_price, int d_price2) {
            this.Beverage_Name = beverage;
            this.Beverage_Price = b_price;
            this.Food_Name = food;
            this.Food_Price = f_pirce;
            this.Food_Deco_Name = deco;
            this.Deco_Price = d_price;
            this.Deco_Price2 = d_price2;
        }
        
        public void Order_Set() {
            Drink_Menu beverage = new Drink_Menu(Beverage_Name, Beverage_Price);
            beverage.Select_Drink();
            Food_Menu food = new Food_Menu(Food_Name, Food_Price);
            food.Select_Food();
            Food_Deco_Menu deco = new Food_Deco_Menu(Food_Deco_Name, Deco_Price, Deco_Price2);
            deco.Select_Deco();
            
            goOrder();
        }
    }
    
    public void goOrder() {
        if(RowCount == 0) { // 메뉴를 아무것도 고르지 않았을 경우
            JOptionPane.showInternalMessageDialog(null, "메뉴를 골라주세요.");
            
        } else {        // 정상적으로 주문이 되었을 경우
                        
            String filePath = "c:\\Temp\\test.txt";           // 저장할 임시 파일 경로
            //int cost = 0;       // 총 주문 금액
            String orderText = "";      // 주문 내역
            
            for(int i=0; i<RowCount; i++) {
                orderText += (String) MenuTable.getValueAt(i,0);
                if(i != RowCount-1) {
                    orderText += ", ";
                }
            }
            
            try {
                FileWriter fileWriter = new FileWriter(filePath, true);
                fileWriter.write(UserName + "님의 주문 : " + orderText + "\n" + UserName + "님의 총 주문 금액 = " + TotalPrice + " 원\n\n");
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            JOptionPane.showInternalMessageDialog(null, "주문이 접수되었습니다.");
            
             // (DPP_Cal) 결제창 띄움
            PaymentJFrame f = new PaymentJFrame(); 
            f.setVisible(true);
            f.setLocationRelativeTo(null);
            f.setResizable(false); // 사이즈 고정 
            f.bringorder(orderText, TotalPrice);
            
            
            
            resetMenu();
            
            
        }
    }
    
        public void Food_Deco_OK () {
        if(ramennum > 0){
            
            Food ramen = new Ramen();
            
            for(int i=0;i<addegg;i++){
                ramen = new AddEgg(ramen);
            }
            for(int i=0;i<addcheese;i++){
                ramen = new AddCheese(ramen);
            }
            for(int i=0;i<addrice;i++){
                ramen = new AddRice(ramen);
            }
            
            JOptionPane.showMessageDialog(null, ramen.getFoodName()+"하셨습니다.\n총 가격은"+ramen.cost()+"입니다.");
               
            ramennum = 0;
            addegg = 0;
            addcheese = 0;
            addrice = 0;
            
            foodDeco.setVisible(false);
            
        }else if(tteokbokkinum > 0){
            
            Food teokbokki = new Tteokbokki();
            
            for(int i=0;i<addegg;i++){
                teokbokki = new AddEgg(teokbokki);
            }
            for(int i=0;i<addcheese;i++){
                teokbokki = new AddCheese(teokbokki);
            }
            for(int i=0;i<addrice;i++){
                teokbokki = new AddRice(teokbokki);
            }
            JOptionPane.showMessageDialog(null, teokbokki.getFoodName()+"하셨습니다.\n총 가격은"+teokbokki.cost()+"입니다.");
    
            tteokbokkinum = 0;
            addegg = 0;
            addcheese = 0;
            addrice = 0;
            
            foodDeco.setVisible(false);
            
        }else if(friedricenum > 0){
            
            Food friedrice = new FriedRice();
            
            for(int i=0;i<addegg;i++){
                friedrice = new AddEgg(friedrice);
            }
            for(int i=0;i<addcheese;i++){
                friedrice = new AddCheese(friedrice);
            }
            for(int i=0;i<addrice;i++){
                friedrice = new AddRice(friedrice);
            }
            JOptionPane.showMessageDialog(null, friedrice.getFoodName()+"하셨습니다.\n총 가격은"+friedrice.cost()+"입니다.");

            friedricenum = 0;
            addegg = 0;
            addcheese = 0;
            addrice = 0;
            
            foodDeco.setVisible(false);
        }
    }
    
    private void drinkCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drinkCategoryMouseClicked
        resetCategories();      // drink 카테고리 선택
        DRINKPanel.setVisible(true);
        DRINKPanel.setEnabled(true);
    }//GEN-LAST:event_drinkCategoryMouseClicked

    private void foodCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foodCategoryMouseClicked
        resetCategories();      // food 카테고리 선택
        FOODPanel.setVisible(true);
        FOODPanel.setEnabled(true);
    }//GEN-LAST:event_foodCategoryMouseClicked

    private void snackCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_snackCategoryMouseClicked
        resetCategories();      // snack 카테고리 선택
        SetMenuPanel.setVisible(true);
        SetMenuPanel.setEnabled(true);
    }//GEN-LAST:event_snackCategoryMouseClicked

    private void refreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseClicked
        resetMenu();    // 초기화 버튼 클릭
    }//GEN-LAST:event_refreshMouseClicked

    private void orderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderMouseClicked
        goOrder();      // 주문 버튼 클릭
    }//GEN-LAST:event_orderMouseClicked
 
    private void cokeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cokeMouseClicked
        Drink_Menu Drink = new Drink_Menu("콜라", 1500);
        Drink.Select_Drink();
    }//GEN-LAST:event_cokeMouseClicked

    private void cyderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cyderMouseClicked
        Drink_Menu Drink = new Drink_Menu("사이다", 1400);
        Drink.Select_Drink();
    }//GEN-LAST:event_cyderMouseClicked

    private void fantaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fantaMouseClicked
        Drink_Menu Drink = new Drink_Menu("환타", 1600);
        Drink.Select_Drink();
    }//GEN-LAST:event_fantaMouseClicked

    private void ramenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ramenMouseClicked
        Food_Menu Food = new Food_Menu ("라면", 3000);
        Food.Select_Food();
        ramennum = 1;
    }//GEN-LAST:event_ramenMouseClicked

    private void friedRiceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_friedRiceMouseClicked
        Food_Menu Food = new Food_Menu ("볶음밥", 3500);
        Food.Select_Food();
        friedricenum = 1;
    }//GEN-LAST:event_friedRiceMouseClicked

    private void dduckbbokiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dduckbbokiMouseClicked
        Food_Menu Food = new Food_Menu ("떡볶이", 4000);
        Food.Select_Food();
        tteokbokkinum = 1;
    }//GEN-LAST:event_dduckbbokiMouseClicked

    private void Set_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Set_1MouseClicked
        Facade Facade = new Facade("콜라", 1500, "라면", 3000, "+ 계란추가", "+ 500", 500);
        Facade.Order_Set();
    }//GEN-LAST:event_Set_1MouseClicked

    private void Set_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Set_2MouseClicked
        Facade Facade = new Facade("사이다", 1400, "볶음밥", 3500, "+ 밥추가", "+ 1000", 1000);
        Facade.Order_Set();
    }//GEN-LAST:event_Set_2MouseClicked

    private void Set_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Set_3MouseClicked
        Facade Facade = new Facade("환타", 1600, "떡볶이", 4000, "+ 치즈추가", "+ 600", 600);
        Facade.Order_Set();
    }//GEN-LAST:event_Set_3MouseClicked

    private void addEggMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addEggMouseClicked
        Food_Deco_Menu Deco = new Food_Deco_Menu(" + 계란 추가", " + 500", 500);
        Deco.Select_Deco();
        addegg++;
    }//GEN-LAST:event_addEggMouseClicked

    private void addCheezeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCheezeMouseClicked
        Food_Deco_Menu Deco = new Food_Deco_Menu(" + 치즈 추가", " + 600", 600);
        Deco.Select_Deco();
        addcheese++;
    }//GEN-LAST:event_addCheezeMouseClicked

    private void addRiceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addRiceMouseClicked
        Food_Deco_Menu Deco = new Food_Deco_Menu(" + 밥 추가", " + 1000", 1000);
        Deco.Select_Deco();
        addrice++;
    }//GEN-LAST:event_addRiceMouseClicked

    private void foodOKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foodOKMouseClicked
        Food_Deco_OK ();     // 음식 선택 완료 클릭  (데코 패턴 사용)
    }//GEN-LAST:event_foodOKMouseClicked

    private void orderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orderActionPerformed

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
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Order().setVisible(true);
            }
        });
                
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DRINKPanel;
    private javax.swing.JPanel FOODPanel;
    private javax.swing.JTable MenuTable;
    private javax.swing.JPanel NoCategories;
    private javax.swing.JPanel SetMenuPanel;
    private javax.swing.JButton Set_1;
    private javax.swing.JButton Set_2;
    private javax.swing.JButton Set_3;
    private javax.swing.JTextField TotalPriceTextField;
    private javax.swing.JTextField UserNameField;
    private javax.swing.JButton addCheeze;
    private javax.swing.JButton addEgg;
    private javax.swing.JButton addRice;
    private javax.swing.JButton coke;
    private javax.swing.JButton cyder;
    private javax.swing.JButton dduckbboki;
    private javax.swing.JLabel drinkCategory;
    private javax.swing.JButton fanta;
    private javax.swing.JLabel foodCategory;
    private javax.swing.JFrame foodDeco;
    private javax.swing.JButton foodOK;
    private javax.swing.JButton friedRice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton order;
    private javax.swing.JButton ramen;
    private javax.swing.JButton refresh;
    private javax.swing.JLabel snackCategory;
    // End of variables declaration//GEN-END:variables
}
