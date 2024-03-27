package jdbc;
import java.sql.*;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import jdbc.*;
public class hi extends javax.swing.JFrame {
    String name,password;
        public hi() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jLabel1.setText("PSG COLLEGE OF TECHNOLOGY");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 30, -1, 30));

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel2.setText("    Department of Information Technology");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setInheritsPopupMenu(false);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 80, 510, 40));

        jLabel3.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        jLabel3.setText("Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 280, 100, 30));

        jLabel4.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        jLabel4.setText(" Password");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 350, 100, -1));

        jTextField1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 270, 260, 40));

        jButton1.setBackground(new java.awt.Color(0, 102, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Login");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 470, 110, 50));

        jButton2.setBackground(new java.awt.Color(0, 102, 255));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Sign up");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 153), 1, true));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1007, 470, 120, 50));

        jLabel5.setFont(new java.awt.Font("Mistral", 0, 36)); // NOI18N
        jLabel5.setText("Login to ask us anything!");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 130, 310, 40));

        jPasswordField1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 340, 260, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai.jpeg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, -80, 1700, 910));

        jLabel6.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        jLabel6.setText("Name");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 270, 100, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
       
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/arch1", "root", "achusuguna16");
            Statement st=con.createStatement(); 
            
            String uname=jTextField1.getText();
            char[] pw=jPasswordField1.getPassword();
            String pass=new String(pw);
            String que="select * from users";
            ResultSet rs=st.executeQuery(que);
            
            int count=0;
            while(rs.next())
            {
                if(rs.getString("username").equals(uname) && rs.getString("password").equals(pass))
                {
                    count=1;
                    break;
                }
                else
                {
                    continue;
                }
            }
            if(count==1)
            {
                java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                new hello().setVisible(true);
            }
        });
            }
            else{
                JOptionPane.showMessageDialog(jTextField1,"your username or password is invalid");
            }
        }
        catch(Exception ex){}
 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
          try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/arch1", "root", "achusuguna16");
                Statement st=con.createStatement(); 
            
                String uname=jTextField1.getText();
                char[] pw=jPasswordField1.getPassword();
                String pass=new String(pw);
                String reg="^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
            
                if(Pattern.matches(reg,pass))
                {
                    String q="Select username from users";
                    ResultSet rs=st.executeQuery(q);
                    int found=0;
           
                
                    while(rs.next())
                    {
                        if(rs.getString("username").equals(uname))
                        {
                            found=1;
      
                        }
                        else continue;
                      
                    }
                    if(found==1)
                        JOptionPane.showMessageDialog(jTextField1,"The username is already taken");
           
                
                    else{
                        PreparedStatement ps=con.prepareStatement("insert into users values(?,?)");
                        ps.setString(1, uname);
                        ps.setString(2, pass);
                        ps.executeUpdate();
                
                        JOptionPane.showMessageDialog(jTextField1,"you successfully created the account");
            
            
                        java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                        new hello().setVisible(true);
                        }
                        });
                      }
                }
                else JOptionPane.showMessageDialog(jTextField1,"Password must contain 8 characters along with alteast 1 alpha 1 digit and 1 special character");
                 
          }
                    
          catch(Exception ex){}
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
