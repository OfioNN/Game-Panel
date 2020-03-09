package login;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author dawid
 */

public class Register_Design extends javax.swing.JFrame 
{

    public Register_Design() 
    {
        this.setResizable(false);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        mężczyzna = new javax.swing.JRadioButton();
        kobieta = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        dzień = new javax.swing.JComboBox<>();
        name = new javax.swing.JLabel();
        miesiąc = new javax.swing.JComboBox<>();
        surname = new javax.swing.JLabel();
        rok = new javax.swing.JComboBox<>();
        userName = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        confirmPassword = new javax.swing.JLabel();
        Phone = new javax.swing.JLabel();
        Imie = new javax.swing.JTextField();
        Nazwisko = new javax.swing.JTextField();
        NazwaUżytkownika = new javax.swing.JTextField();
        Haslo = new javax.swing.JPasswordField();
        PotwierdzHaslo = new javax.swing.JPasswordField();
        gender = new javax.swing.JLabel();
        Nr_Telefonu = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        zarejestrujSie = new javax.swing.JButton();
        wrocDoLogowania = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(120, 120, 120));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        buttonGroup1.add(mężczyzna);
        mężczyzna.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mężczyzna.setForeground(new java.awt.Color(255, 255, 255));
        mężczyzna.setText("Mężczyzna");

        buttonGroup1.add(kobieta);
        kobieta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        kobieta.setForeground(new java.awt.Color(255, 255, 255));
        kobieta.setSelected(true);
        kobieta.setText("Kobieta");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Data Urodzenia:");

        dzień.setBackground(new java.awt.Color(102, 102, 102));
        dzień.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        dzień.setForeground(new java.awt.Color(255, 255, 255));
        dzień.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04","05","06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));

        name.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setText("Imie:");

        miesiąc.setBackground(new java.awt.Color(102, 102, 102));
        miesiąc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        miesiąc.setForeground(new java.awt.Color(255, 255, 255));
        miesiąc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Styczeń", "Luty", "Marzec", "Kwiecień", "Maj", "Czerwiec", "Lipiec", "Sierpień", "Wrzesień", "Październik", "Listopad", "Grudzień" }));

        surname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        surname.setForeground(new java.awt.Color(255, 255, 255));
        surname.setText("Nazwisko:");

        rok.setBackground(new java.awt.Color(102, 102, 102));
        rok.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rok.setForeground(new java.awt.Color(255, 255, 255));
        rok.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930", "1929", "1928", "1927", "1926", "1925", "1924", "1923", "1922", "1921", "1920",  }));

        userName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        userName.setForeground(new java.awt.Color(255, 255, 255));
        userName.setText("Nazwa Użytkownika: ");

        password.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setText("Hasło:");

        confirmPassword.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        confirmPassword.setForeground(new java.awt.Color(255, 255, 255));
        confirmPassword.setText("Potwierdź Hasło:");

        Phone.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Phone.setForeground(new java.awt.Color(255, 255, 255));
        Phone.setText("Numer Telefonu:");

        Imie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ImieKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ImieKeyTyped(evt);
            }
        });

        Nazwisko.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                NazwiskoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NazwiskoKeyTyped(evt);
            }
        });

        NazwaUżytkownika.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                NazwaUżytkownikaKeyPressed(evt);
            }
        });

        Haslo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                HasloKeyPressed(evt);
            }
        });

        PotwierdzHaslo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PotwierdzHasloKeyPressed(evt);
            }
        });

        gender.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        gender.setForeground(new java.awt.Color(255, 255, 255));
        gender.setText("Płeć:");

        Nr_Telefonu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Nr_TelefonuKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Nr_TelefonuKeyTyped(evt);
            }
        });

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Pokaż Hasło");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jCheckBox1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCheckBox1KeyPressed(evt);
            }
        });

        jCheckBox2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setText("Pokaż Hasło");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        jCheckBox2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCheckBox2KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(surname, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(gender, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(userName, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(password, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(confirmPassword, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Phone, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(dzień, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(miesiąc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Nr_Telefonu, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PotwierdzHaslo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Haslo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NazwaUżytkownika, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nazwisko, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Imie, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(kobieta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mężczyzna)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name)
                    .addComponent(Imie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(surname, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nazwisko, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userName)
                    .addComponent(NazwaUżytkownika, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password)
                    .addComponent(Haslo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmPassword)
                    .addComponent(PotwierdzHaslo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Phone)
                    .addComponent(Nr_Telefonu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(dzień, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(miesiąc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gender)
                    .addComponent(kobieta)
                    .addComponent(mężczyzna))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        zarejestrujSie.setBackground(new java.awt.Color(102, 102, 102));
        zarejestrujSie.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        zarejestrujSie.setForeground(new java.awt.Color(255, 255, 255));
        zarejestrujSie.setText("Zarejestruj się");
        zarejestrujSie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zarejestrujSieActionPerformed(evt);
            }
        });

        wrocDoLogowania.setBackground(new java.awt.Color(102, 102, 120));
        wrocDoLogowania.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        wrocDoLogowania.setForeground(new java.awt.Color(255, 255, 255));
        wrocDoLogowania.setText("Wróć do logowania");
        wrocDoLogowania.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wrocDoLogowaniaActionPerformed(evt);
            }
        });

        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Zapoznałem się i akceptuję warunki umowy");

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setForeground(new java.awt.Color(0, 153, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Rejestracja");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(wrocDoLogowania)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(zarejestrujSie))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jRadioButton1)
                        .addGap(109, 109, 109)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zarejestrujSie)
                    .addComponent(wrocDoLogowania))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Register.png")));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ImieKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ImieKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
       {
            if (evt.getModifiers() > 0) 
            {
                Imie.transferFocusBackward();
            } 
            else 
            {
                Imie.transferFocus();
            }
            evt.consume();
       } 
    }//GEN-LAST:event_ImieKeyPressed

    private void NazwiskoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NazwiskoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
       {
            if (evt.getModifiers() > 0) 
            {
                Nazwisko.transferFocusBackward();
            } 
            else 
            {
                Nazwisko.transferFocus();
            }
            evt.consume();
       } 
    }//GEN-LAST:event_NazwiskoKeyPressed

    private void NazwaUżytkownikaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NazwaUżytkownikaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
       {
            if (evt.getModifiers() > 0) 
            {
                NazwaUżytkownika.transferFocusBackward();
            } 
            else 
            {
                NazwaUżytkownika.transferFocus();
            }
            evt.consume();
       } 
    }//GEN-LAST:event_NazwaUżytkownikaKeyPressed

    private void HasloKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_HasloKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
       {
            if (evt.getModifiers() > 0) 
            {
                Haslo.transferFocusBackward();
            } 
            else 
            {
                jCheckBox1.transferFocus();
            }
            evt.consume();
       } 
    }//GEN-LAST:event_HasloKeyPressed

    private void PotwierdzHasloKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PotwierdzHasloKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
       {
            if (evt.getModifiers() > 0) 
            {
                PotwierdzHaslo.transferFocusBackward();
            } 
            else 
            {
                jCheckBox2.transferFocus();
            }
            evt.consume();
       }     }//GEN-LAST:event_PotwierdzHasloKeyPressed

    private void jCheckBox1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCheckBox1KeyPressed
         if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            jCheckBox1.doClick();
        }
    }//GEN-LAST:event_jCheckBox1KeyPressed

    private void jCheckBox2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCheckBox2KeyPressed
         if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            jCheckBox2.doClick();
        }
    }//GEN-LAST:event_jCheckBox2KeyPressed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if(jCheckBox1.isSelected())
        {
            Haslo.setEchoChar((char)0);
        }
        else
        {
            Haslo.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        if(jCheckBox2.isSelected())
        {
            PotwierdzHaslo.setEchoChar((char)0);
        }
        else
        {
            PotwierdzHaslo.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

        public boolean verifyFields()
    {
    if(Imie.getText().trim().isEmpty() && Nazwisko.getText().trim().isEmpty() && NazwaUżytkownika.getText().trim().isEmpty() 
    && Haslo.getText().trim().isEmpty() && PotwierdzHaslo.getText().trim().isEmpty() && Nr_Telefonu.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Uzupełnij dane", "Błąd", 2);
            return false;

         }
            
    else if(Imie.getText().trim().isEmpty() || Nazwisko.getText().trim().isEmpty() || NazwaUżytkownika.getText().trim().isEmpty() 
    || Haslo.getText().trim().isEmpty() || PotwierdzHaslo.getText().trim().isEmpty() || Nr_Telefonu.getText().trim().isEmpty() )
        {
            JOptionPane.showMessageDialog(null, "Uzupełnij dane", "Błąd", 2);
            return false; 
        }
        
    else if(Nr_Telefonu.getText().length() > 0 && Nr_Telefonu.getText().length()< 9)
        {
            JOptionPane.showMessageDialog(null, "Numer składa się z 9 cyfr", "Błędny Numer Telefonu",0);
            return false;
        }

        boolean Selected = kobieta.isSelected() || mężczyzna.isSelected();
            if(Selected)
                {
                    kobieta.setForeground(Color.white);
                    mężczyzna.setForeground(Color.white);
                }
            else
                {
                    kobieta.setForeground(Color.red);
                    mężczyzna.setForeground(Color.red);
                }
        boolean akceptuje = jRadioButton1.isSelected();
            if(akceptuje)
                {
                   jRadioButton1.setForeground(Color.white);
                }
            else
                {
                    jRadioButton1.setForeground(Color.red);
                    return false;
                }
            if (!(new String(Haslo.getPassword()).equals(new String(PotwierdzHaslo.getPassword()))))
                {
                    JOptionPane.showMessageDialog(null,"Hasła muszą być takie same", "Potwierdź Hasło", 2);
                    return false;
                }     
                    return true;
    }
        
         public boolean sprawdźNazwaUżytkownika(String username)
            {
                PreparedStatement st;
                ResultSet rs;
                boolean username_exist = false;
            
                String query = "SELECT * FROM `users` WHERE `Nazwa Użytkownika` = ?";
            
                try
                    {
                
                        st = Connector.getConnection().prepareStatement(query);
                        st.setString(1, username);
                        rs = st.executeQuery();
            
            
                if(rs.next())
                        {
                            username_exist = true;
                            JOptionPane.showMessageDialog(null, "Ta Nazwa Użytkownika jest już zajęta", "Błędna Nazwa Użytkownika", 2);
                        }
                    }
                catch(SQLException ex)
                    {
                        Logger.getLogger(Register_Design.class.getName()).log(Level.SEVERE, null, ex);
                    }

                return username_exist;
            }

    private void zarejestrujSieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zarejestrujSieActionPerformed

        String imie = Imie.getText();
        String nazwisko = Nazwisko.getText();
        String nazwaUzytkownika = NazwaUżytkownika.getText();
        String haslo = String.valueOf(Haslo.getPassword());
        String telefon = Nr_Telefonu.getText();
        String dzien = dzień.getSelectedItem().toString();
        String miesiac = miesiąc.getSelectedItem().toString();
        String Rok = rok.getSelectedItem().toString();
        
        String plec = "Kobieta";
        
        if(mężczyzna.isSelected())
            {
                plec = "Mężczyzna";
            }
        
        if(verifyFields())
            {
                if(!sprawdźNazwaUżytkownika(nazwaUzytkownika))
                    {
                        PreparedStatement ps;
                        ResultSet rs;
                        String registerUserQuerty = "INSERT INTO `users`(`Imie`, `Nazwisko`, `Nazwa Użytkownika`, `Hasło`, "
                        + "`Numer Telefonu`, `Dzień`, `Miesiąc`,`Płeć`, `Rok`) VALUES (?,?,?,?,?,?,?,?,?)";
                
                try 
                    {
                
                        ps = Connector.getConnection().prepareStatement(registerUserQuerty);

                        ps.setString(1, imie);
                        ps.setString(2, nazwisko);
                        ps.setString(3, nazwaUzytkownika);
                        ps.setString(4, haslo);
                        ps.setString(5, telefon);
                        ps.setString(6, dzien);
                        ps.setString(7, miesiac);
                        ps.setString(8, plec);
                        ps.setString(9, Rok);

   
                    if(rok != null)
                        {
                            ps.setString(9, Rok);
                        }
                    else
                        {
                            ps.setNull(9, java.sql.Types.NULL);
                        }
                
                    if(ps.executeUpdate() != 0)
                        {
                            JOptionPane.showMessageDialog(null, "Twoje Konto zostało utworzone", "Sukces", 1);
                        }
                    else
                        {
                            JOptionPane.showMessageDialog(null, "Wystąpił problem", "Błąd", 0);
                        }
                
                    } 
                catch (SQLException ex) 
                    {
                        Logger.getLogger(Register_Design.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }    
    }//GEN-LAST:event_zarejestrujSieActionPerformed



    private void wrocDoLogowaniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wrocDoLogowaniaActionPerformed
        new Login_Design().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_wrocDoLogowaniaActionPerformed

    private void Nr_TelefonuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Nr_TelefonuKeyTyped
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE))
            {
                evt.consume();
            }
        if(Nr_Telefonu.getText().length() >= 9)
            {
                evt.consume();
            }
    }//GEN-LAST:event_Nr_TelefonuKeyTyped

    private void ImieKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ImieKeyTyped
        char c = evt.getKeyChar();
        if(Character.isDigit(c))
            {
                evt.consume();
            }
    }//GEN-LAST:event_ImieKeyTyped

    private void NazwiskoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NazwiskoKeyTyped
        char c = evt.getKeyChar();
        if(Character.isDigit(c))
            {
                evt.consume();
            }
    }//GEN-LAST:event_NazwiskoKeyTyped

    private void Nr_TelefonuKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Nr_TelefonuKeyPressed

        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
            {

            }
    }//GEN-LAST:event_Nr_TelefonuKeyPressed

    public static void main(String args[]) 
        {
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
                        java.util.logging.Logger.getLogger(Register_Design.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    }

            java.awt.EventQueue.invokeLater(new Runnable() 
                {
                    public void run() 
                        {
                            new Register_Design().setVisible(true);
                        }
                }   
            );
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Haslo;
    private javax.swing.JTextField Imie;
    private javax.swing.JTextField NazwaUżytkownika;
    private javax.swing.JTextField Nazwisko;
    private javax.swing.JTextField Nr_Telefonu;
    private javax.swing.JLabel Phone;
    private javax.swing.JPasswordField PotwierdzHaslo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel confirmPassword;
    private javax.swing.JComboBox<String> dzień;
    private javax.swing.JLabel gender;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton kobieta;
    private javax.swing.JComboBox<String> miesiąc;
    private javax.swing.JRadioButton mężczyzna;
    private javax.swing.JLabel name;
    private javax.swing.JLabel password;
    private javax.swing.JComboBox<String> rok;
    private javax.swing.JLabel surname;
    private javax.swing.JLabel userName;
    private javax.swing.JButton wrocDoLogowania;
    private javax.swing.JButton zarejestrujSie;
    // End of variables declaration//GEN-END:variables
}
