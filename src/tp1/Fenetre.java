/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author maxen
 */
public class Fenetre extends JFrame implements ActionListener
{
   private UnTexteFieldTresInspirant TextNom;
   private UnTexteFieldTresInspirant TextPrenom;
   private ArrayList<JTextField> NumeroTelephone;
   private UnTexteFieldTresInspirant Adresse;
   private UnTexteFieldTresInspirant AdresseCourriel;
   private UnTexteFieldTresInspirant DateFeteJour;
   private UnTexteFieldTresInspirant DateFeteMois;
   private UnTexteFieldTresInspirant DateFeteAnnee;
   private JRadioButton SexeM;
   private JRadioButton SexeF;
   private JRadioButton SexeTilt;
   private JButton boutonNext;

    public JTextField getTextNom() {
        return TextNom;
    }

    public void setTextNom(UnTexteFieldTresInspirant TextNom) {
        this.TextNom = TextNom;
    }

    public JTextField getTextPrenom() {
        return TextPrenom;
    }

    public void setTextPrenom(UnTexteFieldTresInspirant TextPrenom) {
        this.TextPrenom = TextPrenom;
    }

    public ArrayList<JTextField> getNumeroTelephone() {
        return NumeroTelephone;
    }

    public void setNumeroTelephone(ArrayList<JTextField> NumeroTelephone) {
        this.NumeroTelephone = NumeroTelephone;
    }

    public JTextField getAdresse() {
        return Adresse;
    }

    public void setAdresse(UnTexteFieldTresInspirant Adresse) {
        this.Adresse = Adresse;
    }

    public JTextField getAdresseCourriel() {
        return AdresseCourriel;
    }

    public void setAdresseCourriel(UnTexteFieldTresInspirant AdresseCourriel) {
        this.AdresseCourriel = AdresseCourriel;
    }

    public JTextField getDateFeteJour() {
        return DateFeteJour;
    }

    public void setDateFeteJour(UnTexteFieldTresInspirant DateFeteJour) {
        this.DateFeteJour = DateFeteJour;
    }

    public JTextField getDateFeteMois() {
        return DateFeteMois;
    }

    public void setDateFeteMois(UnTexteFieldTresInspirant DateFeteMois) {
        this.DateFeteMois = DateFeteMois;
    }

    public JTextField getDateFeteAnnee() {
        return DateFeteAnnee;
    }

    public void setDateFeteAnnee(UnTexteFieldTresInspirant DateFeteAnnee) {
        this.DateFeteAnnee = DateFeteAnnee;
    }

    public JRadioButton getSexeM() {
        return SexeM;
    }

    public void setSexeM(JRadioButton SexeM) {
        this.SexeM = SexeM;
    }

    public JRadioButton getSexeF() {
        return SexeF;
    }

    public void setSexeF(JRadioButton SexeF) {
        this.SexeF = SexeF;
    }

    public JRadioButton getSexeTilt() {
        return SexeTilt;
    }

    public void setSexeTilt(JRadioButton SexeTilt) {
        this.SexeTilt = SexeTilt;
    }

    public Fenetre(UnTexteFieldTresInspirant TextNom, UnTexteFieldTresInspirant TextPrenom, ArrayList<JTextField> NumeroTelephone, UnTexteFieldTresInspirant Adresse, UnTexteFieldTresInspirant AdresseCourriel, UnTexteFieldTresInspirant DateFeteJour, UnTexteFieldTresInspirant DateFeteMois, UnTexteFieldTresInspirant DateFeteAnnee, JRadioButton SexeM, JRadioButton SexeF, JRadioButton SexeTilt) {
        this.TextNom = TextNom;
        this.TextPrenom = TextPrenom;
        this.NumeroTelephone = NumeroTelephone;
        this.Adresse = Adresse;
        this.AdresseCourriel = AdresseCourriel;
        this.DateFeteJour = DateFeteJour;
        this.DateFeteMois = DateFeteMois;
        this.DateFeteAnnee = DateFeteAnnee;
        this.SexeM = SexeM;
        this.SexeF = SexeF;
        this.SexeTilt = SexeTilt;
    }

    public Fenetre() 
    {
        this.TextNom = new UnTexteFieldTresInspirant("Nom");
        this.TextNom.setForeground(Color.GRAY);
        this.TextNom.addActionListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent e){
                if(TextNom.getText().equals("Nom"))
                {
                    TextNom.changementDeTexteDansLeTexteFieldTresInspirant();
                    TextNom.setForeground(Color.BLACK);
                }
            }
            @Override
            public void focusLost(FocusEvent e){
                if(TextNom.getText().isEmpty()){
                    TextNom.setForeground(Color.GRAY);
                    TextNom.changementDeTexteDansLeTexteFieldTresInspirant();
                }
            }
        });
        
        this.TextPrenom = new UnTexteFieldTresInspirant("Prenom"); 
        this.NumeroTelephone = new ArrayList<JTextField>();
        this.Adresse = new UnTexteFieldTresInspirant("Adresse");
        this.AdresseCourriel = new UnTexteFieldTresInspirant("Adresse Courriel"); 
        this.DateFeteJour = new UnTexteFieldTresInspirant("dd");
        this.DateFeteMois = new UnTexteFieldTresInspirant("mm");
        this.DateFeteAnnee = new UnTexteFieldTresInspirant("aaaa");
        this.SexeM = new JRadioButton("Mâle");
        SexeM.setEnabled(true);
        this.SexeF = new JRadioButton("Femme");
        this.SexeTilt = new JRadioButton("Retard mental");
        this.boutonNext = new JButton("Next");
        
        ButtonGroup regroupementBoutton = new ButtonGroup();
        regroupementBoutton.add(SexeM);
        regroupementBoutton.add(SexeF);
        regroupementBoutton.add(SexeTilt);
        
        JPanel panelFenetre1 = new JPanel();
        GridLayout gridFenetre1 = new GridLayout(4,2);
        panelFenetre1.setLayout(gridFenetre1);
        
        JPanel panelSexes = new JPanel();
        GridLayout gridSexes = new GridLayout(1,4);
        panelSexes.setLayout(gridSexes);
        JLabel labelSexes = new JLabel("Sexe : ");
        panelSexes.add(labelSexes);
        panelSexes.add(this.SexeM);
        panelSexes.add(this.SexeF);
        panelSexes.add(this.SexeTilt);
        
        JPanel panelDateFete = new JPanel();
        GridLayout gridDateFete = new GridLayout(1,4);
        panelSexes.setLayout(gridDateFete);
        JLabel labelDateFete = new JLabel("Date de naissance: ");
        panelDateFete.add(labelDateFete);
        panelDateFete.add(this.DateFeteJour);
        panelDateFete.add(this.DateFeteMois);
        panelDateFete.add(this.DateFeteAnnee);
        
        this.boutonNext.addActionListener(this);
        
        panelFenetre1.add(this.TextNom);
        panelFenetre1.add(this.TextPrenom);
        panelFenetre1.add(panelSexes);
        panelFenetre1.add(panelDateFete);
        panelFenetre1.add(this.AdresseCourriel);
        panelFenetre1.add(this.Adresse);
        panelFenetre1.add(this.boutonNext, 3,6);
        
        panelFenetre1.setVisible(true);
        this.setBounds(500,100,1000,600);
        this.setSize(1000,1000);
        this.add(panelFenetre1);
        this.setTitle("Formulaire page1");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
   
    public void actionPerformed(ActionEvent e) {
        Fenetre2 fenetre2 = new Fenetre2();
    }
    
    public void mouseClicked(){
            this.TextNom.changementDeTexteDansLeTexteFieldTresInspirant();
    }
}
