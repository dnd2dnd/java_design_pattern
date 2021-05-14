package DPP_Login;

import DPP_Order.Order;
import DPP_Seat.Seat_Single;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    static int IDS=0; // 총 아이디 갯수
    LoginLog loginlog = new LoginLog();
    UserIdInfo[] result = new UserIdInfo[100];
    public Login() {
        initComponents();
        setLocationRelativeTo(null);// 화면 가운데서 창이 나옴
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SignUp = new javax.swing.JFrame();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        asdf = new javax.swing.JPanel();
        NameField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        asdfdf = new javax.swing.JPanel();
        IdField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        asdfdsfa = new javax.swing.JPanel();
        PwField = new javax.swing.JTextField();
        asdfd = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        signButton = new javax.swing.JButton();
        EmailField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        asdfd1 = new javax.swing.JPanel();
        AgeField = new javax.swing.JTextField();
        pwState = new javax.swing.JLabel();
        nameState = new javax.swing.JLabel();
        idState = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        SignUpButton = new javax.swing.JButton();
        LoginButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        IdText = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        PwText = new javax.swing.JPasswordField();
        LoginStatusField = new javax.swing.JLabel();

        SignUp.setMinimumSize(new java.awt.Dimension(300, 400));

        jPanel7.setBackground(new java.awt.Color(40, 50, 100));
        jPanel7.setMinimumSize(new java.awt.Dimension(300, 400));
        jPanel7.setPreferredSize(new java.awt.Dimension(300, 400));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Email");
        jPanel7.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, 30));

        asdf.setBackground(new java.awt.Color(106, 116, 145));

        NameField.setBackground(new java.awt.Color(106, 116, 145));
        NameField.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        NameField.setForeground(new java.awt.Color(204, 204, 204));
        NameField.setBorder(null);

        javax.swing.GroupLayout asdfLayout = new javax.swing.GroupLayout(asdf);
        asdf.setLayout(asdfLayout);
        asdfLayout.setHorizontalGroup(
            asdfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(asdfLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        asdfLayout.setVerticalGroup(
            asdfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, asdfLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel7.add(asdf, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 170, 30));

        jLabel5.setFont(new java.awt.Font("맑은 고딕", 1, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("회원가입");
        jPanel7.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 130, 50));

        asdfdf.setBackground(new java.awt.Color(106, 116, 145));

        IdField.setBackground(new java.awt.Color(106, 116, 145));
        IdField.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        IdField.setForeground(new java.awt.Color(204, 204, 204));
        IdField.setBorder(null);

        javax.swing.GroupLayout asdfdfLayout = new javax.swing.GroupLayout(asdfdf);
        asdfdf.setLayout(asdfdfLayout);
        asdfdfLayout.setHorizontalGroup(
            asdfdfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(asdfdfLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IdField, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        asdfdfLayout.setVerticalGroup(
            asdfdfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(asdfdfLayout.createSequentialGroup()
                .addComponent(IdField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel7.add(asdfdf, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 170, 30));

        jLabel6.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("I D");
        jPanel7.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, 30));

        jLabel7.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("나이");
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, 30));

        asdfdsfa.setBackground(new java.awt.Color(106, 116, 145));

        PwField.setBackground(new java.awt.Color(106, 116, 145));
        PwField.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        PwField.setForeground(new java.awt.Color(204, 204, 204));
        PwField.setBorder(null);

        javax.swing.GroupLayout asdfdsfaLayout = new javax.swing.GroupLayout(asdfdsfa);
        asdfdsfa.setLayout(asdfdsfaLayout);
        asdfdsfaLayout.setHorizontalGroup(
            asdfdsfaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, asdfdsfaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PwField, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );
        asdfdsfaLayout.setVerticalGroup(
            asdfdsfaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(asdfdsfaLayout.createSequentialGroup()
                .addComponent(PwField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel7.add(asdfdsfa, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 170, 30));

        asdfd.setBackground(new java.awt.Color(106, 116, 145));

        javax.swing.GroupLayout asdfdLayout = new javax.swing.GroupLayout(asdfd);
        asdfd.setLayout(asdfdLayout);
        asdfdLayout.setHorizontalGroup(
            asdfdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );
        asdfdLayout.setVerticalGroup(
            asdfdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel7.add(asdfd, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 170, 30));

        jLabel8.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("이름");
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, 30));

        signButton.setFont(new java.awt.Font("맑은 고딕", 1, 20)); // NOI18N
        signButton.setText("회원가입");
        signButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signButtonMouseClicked(evt);
            }
        });
        jPanel7.add(signButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 130, 40));

        EmailField.setBackground(new java.awt.Color(106, 116, 145));
        EmailField.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        EmailField.setForeground(new java.awt.Color(204, 204, 204));
        EmailField.setBorder(null);
        jPanel7.add(EmailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 158, 30));

        jLabel11.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText(" PW");
        jPanel7.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, 30));

        asdfd1.setBackground(new java.awt.Color(106, 116, 145));

        AgeField.setBackground(new java.awt.Color(106, 116, 145));
        AgeField.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        AgeField.setForeground(new java.awt.Color(204, 204, 204));
        AgeField.setBorder(null);

        javax.swing.GroupLayout asdfd1Layout = new javax.swing.GroupLayout(asdfd1);
        asdfd1.setLayout(asdfd1Layout);
        asdfd1Layout.setHorizontalGroup(
            asdfd1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(asdfd1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AgeField, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        asdfd1Layout.setVerticalGroup(
            asdfd1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, asdfd1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(AgeField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel7.add(asdfd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 170, 30));

        pwState.setFont(new java.awt.Font("맑은 고딕", 0, 12)); // NOI18N
        pwState.setForeground(new java.awt.Color(255, 0, 51));
        pwState.setText(" ");
        pwState.setToolTipText("");
        jPanel7.add(pwState, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 170, -1));

        nameState.setFont(new java.awt.Font("맑은 고딕", 0, 12)); // NOI18N
        nameState.setForeground(new java.awt.Color(255, 0, 51));
        nameState.setText(" ");
        nameState.setToolTipText("");
        jPanel7.add(nameState, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 170, -1));

        idState.setFont(new java.awt.Font("맑은 고딕", 0, 12)); // NOI18N
        idState.setForeground(new java.awt.Color(255, 0, 51));
        idState.setText(" ");
        idState.setToolTipText("");
        jPanel7.add(idState, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 170, -1));

        javax.swing.GroupLayout SignUpLayout = new javax.swing.GroupLayout(SignUp.getContentPane());
        SignUp.getContentPane().setLayout(SignUpLayout);
        SignUpLayout.setHorizontalGroup(
            SignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        SignUpLayout.setVerticalGroup(
            SignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(32, 47, 90));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(32, 47, 90));
        jLabel9.setText("소설공 PC방에 오신 것을 환영합니다.");

        jLabel10.setFont(new java.awt.Font("맑은 고딕", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(32, 47, 90));
        jLabel10.setText("소설공 PC방");

        jPanel3.setBackground(new java.awt.Color(32, 47, 90));

        jLabel1.setFont(new java.awt.Font("맑은 고딕", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("LOGIN PAGE");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel9))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel10)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addGap(40, 40, 40)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(199, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 500));

        SignUpButton.setFont(new java.awt.Font("맑은 고딕", 1, 24)); // NOI18N
        SignUpButton.setText("회원가입");
        SignUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpButtonActionPerformed(evt);
            }
        });
        jPanel1.add(SignUpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 400, -1, 50));

        LoginButton.setFont(new java.awt.Font("맑은 고딕", 1, 24)); // NOI18N
        LoginButton.setText("로그인");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });
        jPanel1.add(LoginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 400, 130, 50));

        jLabel2.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("User ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Password");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, -1, -1));

        IdText.setBackground(new java.awt.Color(106, 116, 145));
        IdText.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        IdText.setForeground(new java.awt.Color(204, 204, 204));
        IdText.setBorder(null);
        jPanel1.add(IdText, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 150, 270, 40));

        jPanel4.setBackground(new java.awt.Color(106, 116, 145));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, 290, 40));

        jPanel5.setBackground(new java.awt.Color(106, 116, 145));

        PwText.setBackground(new java.awt.Color(106, 116, 145));
        PwText.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        PwText.setForeground(new java.awt.Color(204, 204, 204));
        PwText.setBorder(null);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(PwText, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(PwText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, 290, -1));

        LoginStatusField.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        LoginStatusField.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(LoginStatusField, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 190, 270, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SignUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpButtonActionPerformed
        SignUp.setVisible(true);
        SignUp.setSize(290, 445);
        SignUp.setLocationRelativeTo(null);// 화면 가운데서 창이 나옴
    }//GEN-LAST:event_SignUpButtonActionPerformed

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        Seat_Single seat = Seat_Single.getInstance();
        String id=IdText.getText();
        String pw=PwText.getText();
        String name="";
        boolean login=false;
        if(id.isEmpty() || pw.isEmpty()){
            //LoginStatusField.setText("WRONG ID or PASSWORD");
            LoginStatusField.setText("빈칸을 모두 채워주세요.");
            //JOptionPane.showMessageDialog(null,"빈칸이 있습니다.");
        }else{
            for(int i=0; i<IDS; i++){
                if(result[i].getId().equals(id)){
                    login=true;
                    name=result[i].getName();
                }
            }            
        }
        if(login){
            loginlog.setName(name);
            JOptionPane.showMessageDialog(null, name+"님 반갑습니다.\n고객님의 자리는 "+seat.getNum()+1+" 번 입니다.");
            Order next = new Order();
            next.setVisible(true);
            next.setLocationRelativeTo(null);// 화면 가운데서 창이 나옴
            dispose();
        }else{
            LoginStatusField.setText("WRONG ID or PASSWORD");
            //JOptionPane.showMessageDialog(null,"로그인 실패.");
        }

    }//GEN-LAST:event_LoginButtonActionPerformed

    private void signButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signButtonMouseClicked
        String name=NameField.getText();    //이름
        String id=IdField.getText();        //아이디
        String pw=PwField.getText();        //비밀번호
        String email=EmailField.getText();  //이메일
        String age=AgeField.getText();      //나이
        
        boolean ok = true;                 //문제가 없는지 확인
        if(id.isEmpty() || pw.isEmpty() || name.isEmpty()){
            if(name.isEmpty()){
                nameState.setText("이름을 입력해주세요.");
            } else if(!name.isEmpty()){
                nameState.setText("");
            }
            if(id.isEmpty()){
                idState.setText("ID를 입력해주세요.");
            } else if(!id.isEmpty()){
                idState.setText("");
            }
            if(pw.isEmpty()){
                pwState.setText("PW를 입력해주세요.");
            } else if(!pw.isEmpty()){
                pwState.setText("");
            }
            //JOptionPane.showMessageDialog(null,"이름, ID, PW를 모두 입력해주세요.");
            
        }else{
            for(int i=0; i<IDS; i++){
                if(result[i].getId().equals(id)){
                    ok=false;
                    JOptionPane.showMessageDialog(null,"중복된 ID가 존재합니다.");
                    break;
                }
            }
            if(ok==true){
                JOptionPane.showMessageDialog(null,"회원가입이 되었습니다.");
                System.out.println(name+" "+email+" "+id+" "+pw+" "+age);
                nameState.setText("");
                idState.setText("");
                pwState.setText("");
                                
                result[IDS] = new UserIdBuilder(name,id,pw) //빌더 패턴 사용 name,id,pw는 필수 요소 email,age는 필수 요소가 아니다.
                        .setEmail(email)
                        .setAge(age)
                        .build();
                System.out.println(result[IDS].UserPrint());
                IDS++;
                SignUp.setVisible(false);
            }
        }
    }//GEN-LAST:event_signButtonMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AgeField;
    private javax.swing.JTextField EmailField;
    private javax.swing.JTextField IdField;
    private javax.swing.JTextField IdText;
    private javax.swing.JButton LoginButton;
    private javax.swing.JLabel LoginStatusField;
    private javax.swing.JTextField NameField;
    private javax.swing.JTextField PwField;
    private javax.swing.JPasswordField PwText;
    private javax.swing.JFrame SignUp;
    private javax.swing.JButton SignUpButton;
    private javax.swing.JPanel asdf;
    private javax.swing.JPanel asdfd;
    private javax.swing.JPanel asdfd1;
    private javax.swing.JPanel asdfdf;
    private javax.swing.JPanel asdfdsfa;
    private javax.swing.JLabel idState;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel nameState;
    private javax.swing.JLabel pwState;
    private javax.swing.JButton signButton;
    // End of variables declaration//GEN-END:variables
}
