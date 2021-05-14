package DPP_Time;

import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class Time extends javax.swing.JFrame implements Subject {
    TimeSave timesave = TimeSave.getInstance();
    
    public int hour;
    public int min;
    public int sec;
    public ArrayList<TimeObserver> observer = new ArrayList();
    public boolean stopbutton = false;    
    
    public Time() {
        initComponents();
        setLocationRelativeTo(null);// 화면 가운데서 창이 나옴
        
        TimeSet T = new TimeSet();
        new Thread(T).start();
    }
    
    @Override
    public void registerObserver(TimeObserver timeobserver) {
        observer.add(timeobserver);
    }

    @Override
    public void unregisterObserver(TimeObserver timeobserver) {
        observer.remove(timeobserver);
    }

    @Override
    public void updateObserver() {
        for(TimeObserver timeobserver:observer){
            timeobserver.update();
        }
    }
    
    public void setTime(int hour,int min, int sec){
        this.hour=hour;
        this.min=min;
        this.sec=sec;
        updateObserver();
    }
    
    class TimeSet implements Runnable {
        private String dday = "";
        private String time = "";

        @Override
        public void run() {
            while(true) {
                try { //트라이 
                if(stopbutton==true){ 
                    setVisible(false);
                    break;
                }
                Calendar t = Calendar.getInstance();
                String sday = "";//정수형으로 받은 요일을 문자로 변경

                int year = t.get(Calendar.YEAR); //연도를 받아온다
                int month = t.get(Calendar.MONTH);//월을 받아온다
                int date = t.get(Calendar.DATE);//일을 받아온다
                int amPm = t.get(Calendar.AM_PM);//오전/오후를 받아온다
                int hour = timesave.getTimeHour();//시를 받아온다
                int min = timesave.getTimeMin();//분을 받아온다
                int sec = timesave.getTimeSec();//초를 받아온다
                int day= t.get(Calendar.DAY_OF_WEEK);//요일을 정수형으로 리턴1=일~7은토
                String ampm=amPm==Calendar.AM? "PM":"AM";//비교해서 pm이나 am을 ampm에 저장
             
                switch(day) {//스위치문 정수형 day를 받는다.
                     case 1:             sday="Sun";//sun으로 설정(일요일)
                         break;//break;
                    case 2:            sday="Mon"; //Mon으로 설정(월)
                         break;//break;
                    case 3:            sday="Tus";//화요일
                        break;//break;
                    case 4:            sday="Wed";//수요일
                        break;//break;
                    case 5:            sday="Thu";//목요일
                        break;//break;
                    case 6:            sday="Fri";//금요일
                        break;//break;
                    case 7:            sday="Sat";//토요일
                        break;//break;
                }
        
                dday = (year+"."+month+"."+date+"."+sday+" day");//one이라는 문자열에 저장
                time = (hour+":"+min+":"+sec+" sec");//two라는 문자열에 저장

                useTime.setText(dday);//first의 내용을 one(string)으로 설정한다
                remainTime.setText(time);//second의 내용을 two(string)으로 설정한다.
                if(timesave.getTimeSec()-1<0){
                    if(timesave.getTimeMin()-1<0){
                        if(timesave.getTimeHour()-1<0){
                            if(timesave.getTimeHour()==0 && timesave.getTimeMin()==0 && timesave.getTimeSec()==0){
                                JOptionPane.showMessageDialog(null,"사용시간을 모두 사용하여 프로그램을 종료합니다.");
                                stopbutton=true;
                            }
                        }else{
                            timesave.setTimeHour(hour-1);
                            timesave.setTimeMin(60);
                        }
                    }else{
                        timesave.setTimeMin(min-1);
                        timesave.setTimeSec(60);
                    }
                }else{
                    timesave.setTimeSec(sec-1);
                }
                if(timesave.update()!=0){
                    timeState.setText(Integer.toString(timesave.update())+"분 남았습니다.");
                    JOptionPane.showMessageDialog(null, "사용시간이 " + Integer.toString(timesave.update())+"분 남았습니다.");
                }
                
                Thread.sleep(100);//0.1초
                first.setText(dday);//first의 내용을 one(string)으로 설정한다
                second.setText(time);//second의 내용을 two(string)으로 설정한다.
                repaint();
            } catch(Exception e) {
                 System.out.println("오류 발생");    
            } //예외처리
        }
    }     
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        timeplus = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        CASH = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        CARD = new javax.swing.JFrame();
        jPanel4 = new javax.swing.JPanel();
        c1hour = new javax.swing.JButton();
        c2hour = new javax.swing.JButton();
        c4hour = new javax.swing.JButton();
        c30hour = new javax.swing.JButton();
        c5hour = new javax.swing.JButton();
        c10hour = new javax.swing.JButton();
        c3hour = new javax.swing.JButton();
        c20hour = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        NOTICE = new javax.swing.JFrame();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        test = new javax.swing.JFrame();
        first = new javax.swing.JLabel();
        second = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        timeCharge = new javax.swing.JButton();
        timeExeit = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        remainTime = new javax.swing.JLabel();
        useTime = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        timeState = new javax.swing.JLabel();

        timeplus.setSize(new java.awt.Dimension(0, 0));

        jPanel2.setBackground(new java.awt.Color(106, 116, 145));
        jPanel2.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jPanel2.setMinimumSize(new java.awt.Dimension(300, 160));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        jButton3.setText("현금 결제");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 120, 50));

        jButton4.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        jButton4.setText("카드 결제");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 120, 50));

        jPanel8.setBackground(new java.awt.Color(32, 47, 90));

        jLabel9.setFont(new java.awt.Font("맑은 고딕", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("결제");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jLabel9)
                .addContainerGap(127, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 50));

        jLabel10.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("결제 방법을 선택해주세요.");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        javax.swing.GroupLayout timeplusLayout = new javax.swing.GroupLayout(timeplus.getContentPane());
        timeplus.getContentPane().setLayout(timeplusLayout);
        timeplusLayout.setHorizontalGroup(
            timeplusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        timeplusLayout.setVerticalGroup(
            timeplusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
        );

        CASH.setPreferredSize(new java.awt.Dimension(240, 160));

        jPanel3.setMinimumSize(new java.awt.Dimension(150, 143));
        jPanel3.setPreferredSize(new java.awt.Dimension(220, 160));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(32, 47, 90));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("맑은 고딕", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("현금 결제");
        jPanel9.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, -1, 40));

        jPanel3.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 40));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton5.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        jButton5.setText("확 인");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 90, -1));

        jLabel11.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        jLabel11.setText("카운터에 문의해주세요!");
        jPanel10.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jPanel3.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 160));

        javax.swing.GroupLayout CASHLayout = new javax.swing.GroupLayout(CASH.getContentPane());
        CASH.getContentPane().setLayout(CASHLayout);
        CASHLayout.setHorizontalGroup(
            CASHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CASHLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        CASHLayout.setVerticalGroup(
            CASHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        CARD.setMinimumSize(new java.awt.Dimension(400, 300));
        CARD.setPreferredSize(new java.awt.Dimension(400, 300));

        jPanel4.setBackground(new java.awt.Color(106, 116, 145));
        jPanel4.setMinimumSize(new java.awt.Dimension(400, 288));
        jPanel4.setPreferredSize(new java.awt.Dimension(400, 288));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        c1hour.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        c1hour.setText("1시간 충전");
        c1hour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1hourActionPerformed(evt);
            }
        });
        jPanel4.add(c1hour, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 130, 40));

        c2hour.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        c2hour.setText("2시간 충전");
        c2hour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c2hourActionPerformed(evt);
            }
        });
        jPanel4.add(c2hour, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 130, 40));

        c4hour.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        c4hour.setText("4시간 충전");
        c4hour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c4hourActionPerformed(evt);
            }
        });
        jPanel4.add(c4hour, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 130, 40));

        c30hour.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        c30hour.setText("30시간 충전");
        c30hour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c30hourActionPerformed(evt);
            }
        });
        jPanel4.add(c30hour, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 130, 40));

        c5hour.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        c5hour.setText("5시간 충전");
        c5hour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c5hourActionPerformed(evt);
            }
        });
        jPanel4.add(c5hour, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 130, 40));

        c10hour.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        c10hour.setText("10시간 충전");
        c10hour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c10hourActionPerformed(evt);
            }
        });
        jPanel4.add(c10hour, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 130, 40));

        c3hour.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        c3hour.setText("3시간 충전");
        c3hour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c3hourActionPerformed(evt);
            }
        });
        jPanel4.add(c3hour, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 130, 40));

        c20hour.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        c20hour.setText("20시간 충전");
        c20hour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c20hourActionPerformed(evt);
            }
        });
        jPanel4.add(c20hour, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 130, 40));

        jLabel5.setFont(new java.awt.Font("맑은 고딕", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("충전 시간 선택");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 10, -1, 31));

        jPanel11.setBackground(new java.awt.Color(32, 47, 90));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 50));

        javax.swing.GroupLayout CARDLayout = new javax.swing.GroupLayout(CARD.getContentPane());
        CARD.getContentPane().setLayout(CARDLayout);
        CARDLayout.setHorizontalGroup(
            CARDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        CARDLayout.setVerticalGroup(
            CARDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        NOTICE.setMinimumSize(new java.awt.Dimension(440, 210));

        jLabel6.setFont(new java.awt.Font("굴림", 1, 24)); // NOI18N
        jLabel6.setText("소설공 피시방");

        jLabel7.setFont(new java.awt.Font("굴림", 0, 14)); // NOI18N
        jLabel7.setText("충전이 완료되었습니다. 이용해주셔서 감사합니다.");

        jButton7.setFont(new java.awt.Font("맑은 고딕", 1, 20)); // NOI18N
        jButton7.setText("확 인");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLabel6))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 46, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(36, 36, 36))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout NOTICELayout = new javax.swing.GroupLayout(NOTICE.getContentPane());
        NOTICE.getContentPane().setLayout(NOTICELayout);
        NOTICELayout.setHorizontalGroup(
            NOTICELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NOTICELayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        NOTICELayout.setVerticalGroup(
            NOTICELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NOTICELayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        first.setText("날짜");

        second.setText("시간");

        javax.swing.GroupLayout testLayout = new javax.swing.GroupLayout(test.getContentPane());
        test.getContentPane().setLayout(testLayout);
        testLayout.setHorizontalGroup(
            testLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(testLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(testLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(second, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(first, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(166, Short.MAX_VALUE))
        );
        testLayout.setVerticalGroup(
            testLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(testLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(first, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(second)
                .addContainerGap(163, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(32, 47, 90));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("맑은 고딕", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("소설공 피시방");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 210, 60));

        jPanel6.setBackground(new java.awt.Color(106, 116, 145));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        timeCharge.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        timeCharge.setText("시간 충전");
        timeCharge.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                timeChargeMouseClicked(evt);
            }
        });
        jPanel6.add(timeCharge, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 160, 50));

        timeExeit.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        timeExeit.setText("종 료");
        timeExeit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                timeExeitMouseClicked(evt);
            }
        });
        jPanel6.add(timeExeit, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 160, 50));

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("맑은 고딕", 1, 24)); // NOI18N
        jLabel2.setText("날      짜");
        jPanel7.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 120, 40));

        jLabel3.setFont(new java.awt.Font("맑은 고딕", 1, 24)); // NOI18N
        jLabel3.setText("상      태");
        jPanel7.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 110, -1));

        remainTime.setFont(new java.awt.Font("맑은 고딕", 0, 24)); // NOI18N
        remainTime.setText("남은 시간");
        jPanel7.add(remainTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 270, -1));

        useTime.setFont(new java.awt.Font("맑은 고딕", 0, 24)); // NOI18N
        useTime.setText("날짜");
        jPanel7.add(useTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 270, 40));

        jLabel8.setFont(new java.awt.Font("맑은 고딕", 1, 24)); // NOI18N
        jLabel8.setText("남은 시간");
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 110, -1));

        timeState.setFont(new java.awt.Font("맑은 고딕", 0, 24)); // NOI18N
        jPanel7.add(timeState, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 270, -1));

        jPanel6.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 440, 150));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 500, 280));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void timeChargeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeChargeMouseClicked
        timeplus.setSize(310, 220);
        timeplus.setLocationRelativeTo(null);// 화면 가운데서 창이 나옴
        timeplus.setVisible(true);
    }//GEN-LAST:event_timeChargeMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        CASH.setSize(250, 200);
        CASH.setLocationRelativeTo(null);// 화면 가운데서 창이 나옴
        CASH.setVisible(true); 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        CARD.setSize(400, 300);
        CARD.setLocationRelativeTo(null);// 화면 가운데서 창이 나옴
        CARD.setVisible(true); 
    }//GEN-LAST:event_jButton4ActionPerformed

    private void c1hourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1hourActionPerformed
        NOTICE.setVisible(true);
        NOTICE.setLocationRelativeTo(null);// 화면 가운데서 창이 나옴
        timesave.setTimeHour(1);
    }//GEN-LAST:event_c1hourActionPerformed

    private void c2hourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c2hourActionPerformed
        NOTICE.setVisible(true);
        NOTICE.setLocationRelativeTo(null);// 화면 가운데서 창이 나옴
        timesave.setTimeHour(2);
    }//GEN-LAST:event_c2hourActionPerformed

    private void c4hourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c4hourActionPerformed
        NOTICE.setVisible(true);
        NOTICE.setLocationRelativeTo(null);// 화면 가운데서 창이 나옴
        timesave.setTimeHour(4);
    }//GEN-LAST:event_c4hourActionPerformed

    private void c30hourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c30hourActionPerformed
        NOTICE.setVisible(true);
        NOTICE.setLocationRelativeTo(null);// 화면 가운데서 창이 나옴        
        timesave.setTimeHour(30);
    }//GEN-LAST:event_c30hourActionPerformed

    private void c5hourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c5hourActionPerformed
        NOTICE.setVisible(true);
        NOTICE.setLocationRelativeTo(null);// 화면 가운데서 창이 나옴        
        timesave.setTimeHour(5);
    }//GEN-LAST:event_c5hourActionPerformed

    private void c10hourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c10hourActionPerformed
        NOTICE.setVisible(true);
        NOTICE.setLocationRelativeTo(null);// 화면 가운데서 창이 나옴
        timesave.setTimeHour(10);
    }//GEN-LAST:event_c10hourActionPerformed

    private void c3hourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c3hourActionPerformed
        NOTICE.setVisible(true);
        NOTICE.setLocationRelativeTo(null);// 화면 가운데서 창이 나옴
        timesave.setTimeHour(3);
    }//GEN-LAST:event_c3hourActionPerformed

    private void c20hourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c20hourActionPerformed
        NOTICE.setVisible(true);
        NOTICE.setLocationRelativeTo(null);// 화면 가운데서 창이 나옴
        timesave.setTimeHour(20);
    }//GEN-LAST:event_c20hourActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        NOTICE.setVisible(false);
        CARD.setVisible(false); 
        CASH.setVisible(false); 
        timeplus.setVisible(false);
        //Test test = new Test();
        //test.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void timeExeitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeExeitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_timeExeitMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        CASH.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(Time.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Time.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Time.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Time.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Time().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame CARD;
    private javax.swing.JFrame CASH;
    private javax.swing.JFrame NOTICE;
    private javax.swing.JButton c10hour;
    private javax.swing.JButton c1hour;
    private javax.swing.JButton c20hour;
    private javax.swing.JButton c2hour;
    private javax.swing.JButton c30hour;
    private javax.swing.JButton c3hour;
    private javax.swing.JButton c4hour;
    private javax.swing.JButton c5hour;
    private javax.swing.JLabel first;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
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
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel remainTime;
    private javax.swing.JLabel second;
    private javax.swing.JFrame test;
    private javax.swing.JButton timeCharge;
    private javax.swing.JButton timeExeit;
    private javax.swing.JLabel timeState;
    private javax.swing.JFrame timeplus;
    private javax.swing.JLabel useTime;
    // End of variables declaration//GEN-END:variables
}
