import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.intellijthemes.FlatVuesionIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatXcodeDarkIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CyScore extends javax.swing.JFrame {

    public CyScore() {
        initComponents();
        setLocationRelativeTo(null);
    }

    String[] question = {

            "Avez-vous un bloqueur de connexion à essais multiples ?",
            "Avez-vous une charte relative aux caractères des mots de passe ?",
            "Si vous avez un système de contact sur le site Web, y a-t-il un délai avant un autre envoi ?",
            "Le site contient-il une erreur xss ?",
            "Avez-vous une protection Ddos de type CloudFare ?",
            "Avez-vous une protection anti Download web ?",
            "Avez-vous une défaillance / Fail SQL ?",
            "Avez vous -2 port ouvert ou +2  (réponse attendue : +2 / -2 ) ?",
            "Le site ainsi que les services liés au site sont-ils à jour ?",
            "Utilisez vous la sous-couche Wordpress ?",
            "Le site est-il hébergé chez vous ou chez un hébergeur ?",
            "Le site est t'il hébergé chez ovh, ionos, autre ?",
            ""
    };
    int score = 0;
    int quest = 1;
    int quest2 = 1;

    private void initComponents() {

        jLabelTitre = new javax.swing.JLabel();
        jLabelQuestion = new javax.swing.JLabel();
        btnResultat = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnOui = new javax.swing.JButton();
        btnNon = new javax.swing.JButton();


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);
        setResizable(false);

        setTitle("©CyScore 2022                                                                               " +
                "Analytics Théorique de la sécurité de votre site.");

        jLabelTitre.setText("                               Bienvenue sur CyScore Analytics ");
        jLabelTitre.setFont(new java.awt.Font("Century Gothic", 3, 20));
        jLabelQuestion.setText(question[0]);
        jLabelQuestion.setFont(new java.awt.Font("Century Gothic", 1, 15));

        btnResultat.setText("Resultat");
        btnResultat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ///System.out.println(score + " % / 100 %");

                if(score > 100) {
                    score = 100;
                }
                JOptionPane.showMessageDialog(null,"CyScore a déterminé votre site a recu la note de "
                        + score + " % Sécurisé ");
                btnResultatActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                quest = 0;
                quest2 = 0;
                score = 0;
                jLabelQuestion.setText(question[0]);

            }
        });

        btnOui.setText("Oui");
        btnOui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quest = quest +1;
                score = score +8;
                System.out.println(score);
                for (int i = 1; i < quest; i++)
                {
                    jLabelQuestion.setText(question[i]);
                }
                btnOuiActionPerformed(evt);
            }
        });

        btnNon.setText("Non");
        btnNon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quest2 = quest2 +1;
                score = score -8;
                System.out.println(quest2);
                for (int i = 1; i < quest2; i++)
                {
                    jLabelQuestion.setText(question[i]);
                }
                btnNonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTitre, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnOui, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNon, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127)
                        .addComponent(btnResultat, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jLabelTitre, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabelQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnResultat, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNon, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOui, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        pack();

        jLabel1 = new javax.swing.JLabel();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo.png")));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(90, 10, 770, 480);

    }


    private void btnOuiActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void btnNonActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void btnResultatActionPerformed(java.awt.event.ActionEvent evt) {
    }


    public static void main(String args[]) {
        try {
            FlatVuesionIJTheme.setup();


        } catch (Exception e) {
            e.printStackTrace ();
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CyScore().setVisible(true);

            }
        });

    }

    private javax.swing.JButton btnNon;
    private javax.swing.JButton btnOui;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnResultat;
    private javax.swing.JLabel jLabelQuestion;
    private javax.swing.JLabel jLabelTitre;
    private javax.swing.JLabel jLabel1;
}
