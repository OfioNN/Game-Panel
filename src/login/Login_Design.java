package login;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author dawid
 */

public class Login_Design extends javax.swing.JFrame 
{
    

    public Login_Design() 
    {

        initComponents();
        this.setTitle("SmartApp");
        this.setResizable(false);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\dawid\\OneDrive\\Dokumenty\\NetBeansProjects\\Login\\src\\images\\Icon.jpg"));
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGlowny = new javax.swing.JPanel();
        panel2 = new javax.swing.JPanel();
        logowanie = new javax.swing.JPanel();
        NazwaUzytkownika = new javax.swing.JTextField();
        nazwaUzytkownikaText = new javax.swing.JLabel();
        Haslo = new javax.swing.JPasswordField();
        hasloText = new javax.swing.JLabel();
        zaloguj = new javax.swing.JButton();
        wyjdz = new javax.swing.JButton();
        Autoryzacja = new javax.swing.JRadioButton();
        loginObrazek = new javax.swing.JLabel();
        hasloObrazek = new javax.swing.JLabel();
        zarejestruj = new javax.swing.JButton();
        nazwaPusta = new javax.swing.JLabel();
        hasloPuste = new javax.swing.JLabel();
        pokazHaslo = new javax.swing.JCheckBox();
        Witaj = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelGlowny.setBackground(new java.awt.Color(102, 102, 102));

        panel2.setBackground(new java.awt.Color(51, 51, 51));

        logowanie.setBackground(new java.awt.Color(0, 0, 0));

        NazwaUzytkownika.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                NazwaUzytkownikaFocusGained(evt);
            }
        });
        NazwaUzytkownika.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                NazwaUzytkownikaKeyPressed(evt);
            }
        });

        nazwaUzytkownikaText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nazwaUzytkownikaText.setForeground(new java.awt.Color(255, 255, 255));
        nazwaUzytkownikaText.setText("Nazwa Użytkownika: ");

        Haslo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                HasloFocusGained(evt);
            }
        });
        Haslo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HasloActionPerformed(evt);
            }
        });

        hasloText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        hasloText.setForeground(new java.awt.Color(255, 255, 255));
        hasloText.setText("Hasło:");

        zaloguj.setBackground(new java.awt.Color(102, 102, 102));
        zaloguj.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        zaloguj.setForeground(new java.awt.Color(255, 255, 255));
        zaloguj.setText("Zaloguj się");
        zaloguj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zalogujActionPerformed(evt);
            }
        });
        zaloguj.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                zalogujKeyPressed(evt);
            }
        });

        wyjdz.setBackground(new java.awt.Color(102, 102, 102));
        wyjdz.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        wyjdz.setForeground(new java.awt.Color(255, 255, 255));
        wyjdz.setText("Wyjdź");
        wyjdz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wyjdzActionPerformed(evt);
            }
        });
        wyjdz.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                wyjdzKeyPressed(evt);
            }
        });

        Autoryzacja.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Autoryzacja.setForeground(new java.awt.Color(255, 255, 255));
        Autoryzacja.setText("Nie jestem robotem");
        Autoryzacja.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                AutoryzacjaFocusGained(evt);
            }
        });
        Autoryzacja.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AutoryzacjaKeyPressed(evt);
            }
        });

        zarejestruj.setBackground(new java.awt.Color(102, 102, 102));
        zarejestruj.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        zarejestruj.setForeground(new java.awt.Color(255, 255, 255));
        zarejestruj.setText("Zarejestruj się");
        zarejestruj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zarejestrujActionPerformed(evt);
            }
        });
        zarejestruj.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                zarejestrujKeyPressed(evt);
            }
        });

        nazwaPusta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        hasloPuste.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        pokazHaslo.setBackground(new java.awt.Color(102, 102, 102));
        pokazHaslo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pokazHaslo.setForeground(new java.awt.Color(255, 255, 255));
        pokazHaslo.setText("Pokaż Hasło");
        pokazHaslo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pokazHasloActionPerformed(evt);
            }
        });
        pokazHaslo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pokazHasloKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout logowanieLayout = new javax.swing.GroupLayout(logowanie);
        logowanie.setLayout(logowanieLayout);
        logowanieLayout.setHorizontalGroup(
            logowanieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logowanieLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(logowanieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(loginObrazek, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hasloObrazek, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(logowanieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Autoryzacja)
                    .addComponent(Haslo, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pokazHaslo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hasloPuste, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(logowanieLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(wyjdz, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(zarejestruj)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(zaloguj))
            .addGroup(logowanieLayout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addGroup(logowanieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nazwaUzytkownikaText)
                    .addGroup(logowanieLayout.createSequentialGroup()
                        .addComponent(NazwaUzytkownika, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nazwaPusta, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(hasloText))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        logowanieLayout.setVerticalGroup(
            logowanieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logowanieLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(logowanieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(logowanieLayout.createSequentialGroup()
                        .addComponent(nazwaUzytkownikaText)
                        .addGap(7, 7, 7)
                        .addGroup(logowanieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NazwaUzytkownika)
                            .addComponent(nazwaPusta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(logowanieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(logowanieLayout.createSequentialGroup()
                                .addComponent(hasloText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(logowanieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Haslo)
                                    .addComponent(hasloPuste, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(hasloObrazek, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pokazHaslo)
                        .addGap(18, 18, Short.MAX_VALUE))
                    .addGroup(logowanieLayout.createSequentialGroup()
                        .addComponent(loginObrazek, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(Autoryzacja)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(logowanieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zaloguj)
                    .addComponent(wyjdz)
                    .addComponent(zarejestruj))
                .addContainerGap())
        );

        loginObrazek.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Login.png")));
        hasloObrazek.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Password.png")));

        Witaj.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Witaj.setForeground(new java.awt.Color(255, 255, 255));
        Witaj.setText("Witaj użytkowniku!");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logowanie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Witaj)
                .addGap(115, 115, 115))
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(Witaj)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(logowanie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo.png")));

        javax.swing.GroupLayout panelGlownyLayout = new javax.swing.GroupLayout(panelGlowny);
        panelGlowny.setLayout(panelGlownyLayout);
        panelGlownyLayout.setHorizontalGroup(
            panelGlownyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlownyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelGlownyLayout.setVerticalGroup(
            panelGlownyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlownyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGlowny, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGlowny, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NazwaUzytkownikaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NazwaUzytkownikaKeyPressed
               
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            if (evt.getModifiers() > 0) 
            {
                NazwaUzytkownika.transferFocusBackward();
            } 
            else 
            {
                NazwaUzytkownika.transferFocus();
            }
                evt.consume();
        }  
    }//GEN-LAST:event_NazwaUzytkownikaKeyPressed

    private void zalogujActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zalogujActionPerformed

        boolean Selected = Autoryzacja.isSelected();
            if(Selected)
                {
                    Autoryzacja.setForeground(Color.white);
                }
            else
                {
                    Autoryzacja.setForeground(Color.red);
                }   
        
            if(NazwaUzytkownika.getText().trim().isEmpty() && Haslo.getText().trim().isEmpty())
                {
                    nazwaPusta.setText("Uzupełnij");
                    hasloPuste.setText("Uzupełnij");
                    hasloPuste.setForeground(Color.red);
                    nazwaPusta.setForeground(Color.red);
                }
            else if(Haslo.getText().trim().isEmpty())
                {
                    hasloPuste.setText("Uzupełnij");
                    hasloPuste.setForeground(Color.red);
                }
            else if(NazwaUzytkownika.getText().trim().isEmpty())
                {
                    nazwaPusta.setText("Uzupełnij");
                    nazwaPusta.setForeground(Color.red);
                }

            else if(Autoryzacja.isSelected());
                {

                        PreparedStatement st;
                        ResultSet rs;

                        String NazwaUżytkownika = NazwaUzytkownika.getText();
                        String Hasło = String.valueOf(Haslo.getPassword());

                        String query = "SELECT * FROM `users` WHERE `Nazwa Użytkownika` = ? AND `Hasło` = ?";

                    try 
                    {
                        st = Connector.getConnection().prepareStatement(query);

                        st.setString(1, NazwaUżytkownika);
                        st.setString(2, Hasło);

                        rs = st.executeQuery();

                        if(rs.next())
                        {
                            Login_acess form = new Login_acess();
                            form.setVisible(true);
                            form.pack();
                            form.setLocationRelativeTo(null);
                            this.dispose();
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Nieprawidłowy Login / Hasło", "Błąd Logowania", 2);
                        }


                    }
                    catch (SQLException ex) 
                    {
                        Logger.getLogger(Login_Design.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }   
    }//GEN-LAST:event_zalogujActionPerformed

    private void zalogujKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_zalogujKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
        boolean Selected = Autoryzacja.isSelected();
            if(Selected)
                {
                    Autoryzacja.setForeground(Color.white);
                }
            else
                {
                    Autoryzacja.setForeground(Color.red);
                }
        
            if(NazwaUzytkownika.getText().trim().isEmpty() && Haslo.getText().trim().isEmpty())
                {
                    nazwaPusta.setText("Uzupełnij");
                    hasloPuste.setText("Uzupełnij");
                    hasloPuste.setForeground(Color.red);
                    nazwaPusta.setForeground(Color.red);
                }
            else if(Haslo.getText().trim().isEmpty())
                {
                    hasloPuste.setText("Uzupełnij");
                    hasloPuste.setForeground(Color.red);
                }
            else if(NazwaUzytkownika.getText().trim().isEmpty())
                {
                    nazwaPusta.setText("Uzupełnij");
                    nazwaPusta.setForeground(Color.red);
                }

            else if(Autoryzacja.isSelected()) 
                {     
                    new Login_acess().setVisible(true);
                    this.dispose();
                }
       }
    }//GEN-LAST:event_zalogujKeyPressed

    private void wyjdzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wyjdzActionPerformed
         this.dispose();
    }//GEN-LAST:event_wyjdzActionPerformed

    private void wyjdzKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_wyjdzKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            this.dispose();
        }
    }//GEN-LAST:event_wyjdzKeyPressed

    private void HasloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HasloActionPerformed
                
        if(NazwaUzytkownika.getText().trim().isEmpty() && Haslo.getText().trim().isEmpty())
            {
                nazwaPusta.setText("Uzupełnij");
                hasloPuste.setText("Uzupełnij");
                hasloPuste.setForeground(Color.red);
                nazwaPusta.setForeground(Color.red);
            }
                else if(NazwaUzytkownika.getText().trim().isEmpty())
                {
                    nazwaPusta.setText("Uzupełnij");
                    nazwaPusta.setForeground(Color.red);
                }
                else if(Haslo.getText().trim().isEmpty())
                {
                    hasloPuste.setText("Uzupełnij");
                    hasloPuste.setForeground(Color.red);
                }    
                else
                {     
                    new Login_acess().setVisible(true);
                    this.dispose();
                }
    }//GEN-LAST:event_HasloActionPerformed

    private void NazwaUzytkownikaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NazwaUzytkownikaFocusGained
        nazwaPusta.setText("");
    }//GEN-LAST:event_NazwaUzytkownikaFocusGained

    private void HasloFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_HasloFocusGained
        hasloPuste.setText("");
    }//GEN-LAST:event_HasloFocusGained

    private void zarejestrujActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zarejestrujActionPerformed
        new Register_Design().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_zarejestrujActionPerformed

    private void zarejestrujKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_zarejestrujKeyPressed
       if(evt.getKeyCode() == KeyEvent.VK_ENTER)
       {
            new Register_Design().setVisible(true);
            this.dispose();
       }
    }//GEN-LAST:event_zarejestrujKeyPressed

    private void AutoryzacjaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AutoryzacjaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            Autoryzacja.doClick();
        }
    }//GEN-LAST:event_AutoryzacjaKeyPressed

    private void AutoryzacjaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AutoryzacjaFocusGained
        Autoryzacja.setForeground(Color.white);
    }//GEN-LAST:event_AutoryzacjaFocusGained

    private void pokazHasloKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pokazHasloKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            pokazHaslo.doClick();
        }
    }//GEN-LAST:event_pokazHasloKeyPressed

    private void pokazHasloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pokazHasloActionPerformed
        if(pokazHaslo.isSelected())
        {
            Haslo.setEchoChar((char)0);
        }
        else
        {
            Haslo.setEchoChar('*');
        }
    }//GEN-LAST:event_pokazHasloActionPerformed

    public static void main(String args[]) {

        
//        try
//        {
//        
//        File plik = new File("Program.bat");
//        
//        if(!plik.exists())
//        {
//        plik.createNewFile();
//        }
//        }
//        catch(IOException e)
//        {
//            System.out.println(e.getMessage());
//        }
        
        
        
        
        try 
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) 
            {
                if ("Nimbus".equals(info.getName())) 
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) 
        {
            java.util.logging.Logger.getLogger(Login_Design.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        java.awt.EventQueue.invokeLater(() -> 
            {
                new Login_Design().setVisible(true);
            }
        );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Autoryzacja;
    private javax.swing.JPasswordField Haslo;
    private javax.swing.JLabel Logo;
    public static javax.swing.JTextField NazwaUzytkownika;
    private javax.swing.JLabel Witaj;
    private javax.swing.JLabel hasloObrazek;
    private javax.swing.JLabel hasloPuste;
    private javax.swing.JLabel hasloText;
    private javax.swing.JLabel loginObrazek;
    private javax.swing.JPanel logowanie;
    private javax.swing.JLabel nazwaPusta;
    private javax.swing.JLabel nazwaUzytkownikaText;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panelGlowny;
    private javax.swing.JCheckBox pokazHaslo;
    private javax.swing.JButton wyjdz;
    private javax.swing.JButton zaloguj;
    private javax.swing.JButton zarejestruj;
    // End of variables declaration//GEN-END:variables

}