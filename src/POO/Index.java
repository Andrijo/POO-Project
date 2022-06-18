package POO;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/*
Programa que consiste en la creación de una app que registra las series que se
hayan visto, las series en tendencia y da información de cada serie.
 */
 /*
/**
 *
 * @author Program made by: Andy Espino Cabrales and Daniel Balderrama Salgado.
 *
 *
 */
public class Index extends JFrame {

    public static void main(String[] args) {
        try {
            Index ind = new Index(); //Objeto / Object
            ind.setVisible(true); //Hacer visible / Do visible 
        } catch (Exception e) {

        }

    }
    //BackgroundPanel bgP = new BackgroundPanel();
    //Declaraciones
    private JPanel indexPanel;
    private JLabel appTitleImg;
    private JLabel appStrangerImg;
    private JLabel appBettyImg;
    private JLabel appTheBoysImg;
    private JLabel appMsMarvelImg;
    private JLabel appPeakyImg;
    private JLabel appDescriptionText;
    private JLabel trendingTitleText;
    private JButton appButtonTitleText;
    private JButton signInButton;
    private JButton createAccountButton;
    private JButton trendingButton;
    private JButton membersButton;

    public Index() throws IconImageException, NotFoundImageException { //Constructor
        this.setSize(1000, 600); //Le damos el aspect ratio a la ventana / we assign the aspect ratio to the window
        this.setResizable(false); // Bloquear el tamaño / block aspect ratio
        ImageIcon imgIndex;
        try {
            imgIndex = new ImageIcon(getClass().getResource("/IMG/text.png").getFile());
            this.setIconImage(imgIndex.getImage()); //Icono de la ventana / icon window
        } catch (Exception e) {
            throw new IconImageException("No se encontró el archivo.");
        }
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); //Cerrar ventana  = cerrar programa / close window = close program
        this.setTitle("Tyzer"); //Titulo de la ventana / title of the window
        this.setLocationRelativeTo(null); //Centramos la ventana / we center the window
        //this.setContentPane(bgP);
        InitialComponents();
    }

    private void InitialComponents() throws NotFoundImageException {
        Paneles();
        Labels();
        Buttons();
    }

    private void Paneles() {
        indexPanel = new JPanel();
        indexPanel.setBackground(Color.DARK_GRAY); //Color de fondo
        indexPanel.setLayout(null); //Habilitar el libre movimiento
        this.getContentPane().add(indexPanel); //Añadir el panel   
    }

    private void Labels() throws NotFoundImageException {
        //Etiqueta de imagen | Brang image
        appTitleImg = new JLabel();
        ImageIcon titleImg = new ImageIcon(getClass().getResource("/IMG/text.png").getFile());
        appTitleImg.setBounds(40, 20, 100, 100); // X | Y | Ancho | Alto
        appTitleImg.setIcon(new ImageIcon(titleImg.getImage().getScaledInstance(appTitleImg.getWidth(), appTitleImg.getHeight(), Image.SCALE_SMOOTH)));
        //appTitleImg.setOpaque(true);
        //appTitleImg.setBackground(Color.GREEN);
        indexPanel.add(appTitleImg);

        //Etiqueta de texto | Description
        appDescriptionText = new JLabel();
        appDescriptionText.setText("TRACK YOUR SERIES: ANYTIME, ANYWHERE...");
        appDescriptionText.setHorizontalAlignment(SwingConstants.CENTER);
        appDescriptionText.setFont(new Font("Poppins", Font.BOLD, 20));
        appDescriptionText.setForeground(Color.CYAN);
        //appDescriptionText.setOpaque(true);
        //appDescriptionText.setBackground(Color.yellow);
        appDescriptionText.setBounds(250, 200, 500, 200);
        indexPanel.add(appDescriptionText);

        //TrendingButtonLabels | Posters and title
        trendingTitleText = new JLabel();
        trendingTitleText.setText("CURRENTLY TRENDING:");
        trendingTitleText.setHorizontalAlignment(SwingConstants.CENTER);
        trendingTitleText.setFont(new Font("Poppins", Font.BOLD, 15)); //Fuente, estilo, tamaño
        trendingTitleText.setForeground(Color.CYAN);
        //trendingTitleText.setOpaque(true);
        //trendingTitleText.setBackground(Color.YELLOW);
        trendingTitleText.setBounds(10, 170, 220, 20); //X|Y|Ancho|Alto
        trendingTitleText.setVisible(false);
        indexPanel.add(trendingTitleText);

        //Declaraciones de imagenes
        appStrangerImg = new JLabel();
        appPeakyImg = new JLabel();
        appBettyImg = new JLabel();
        appMsMarvelImg = new JLabel();
        appTheBoysImg = new JLabel();

        try {
            //Stranger Things | Poster
            ImageIcon strangerImg;
            strangerImg = new ImageIcon(getClass().getResource("/IMG/StrangerThingsPoster.jpeg").getFile());
            appStrangerImg.setBounds(10, 200, 186, 240); // X | Y | Ancho | Alto
            appStrangerImg.setIcon(new ImageIcon(strangerImg.getImage().getScaledInstance(appStrangerImg.getWidth(), appStrangerImg.getHeight(), Image.SCALE_SMOOTH)));
            //appStrangerImg.setOpaque(true);
            //appStrangerImg.setBackground(Color.GREEN);
            appStrangerImg.setVisible(false);
            indexPanel.add(appStrangerImg);

            //Peaky Blinders | Poster
            ImageIcon peakyImg;
            peakyImg = new ImageIcon(getClass().getResource("/IMG/PeakyBlindersPoster.jpg").getFile());
            appPeakyImg.setBounds(206, 200, 186, 240); // X | Y | Ancho | Alto
            appPeakyImg.setIcon(new ImageIcon(peakyImg.getImage().getScaledInstance(appPeakyImg.getWidth(), appPeakyImg.getHeight(), Image.SCALE_SMOOTH)));
            //appPeakyImg.setOpaque(true);
            //appPeakyImg.setBackground(Color.GREEN);
            appPeakyImg.setVisible(false);
            indexPanel.add(appPeakyImg);

            //Betty la fea | Poster
            ImageIcon bettyImg;
            bettyImg = new ImageIcon(getClass().getResource("/IMG/BettyPoster.jpg").getFile());
            appBettyImg.setBounds(402, 200, 186, 240); // X | Y | Ancho | Alto
            appBettyImg.setIcon(new ImageIcon(bettyImg.getImage().getScaledInstance(appBettyImg.getWidth(), appBettyImg.getHeight(), Image.SCALE_SMOOTH)));
            //appBettyImg.setOpaque(true);
            //appBettyImg.setBackground(Color.GREEN);
            appBettyImg.setVisible(false);
            indexPanel.add(appBettyImg);

            //Ms. Marvel | Poster
            ImageIcon marvelImg;
            marvelImg = new ImageIcon(getClass().getResource("/IMG/MsMarvelPoster.jpg").getFile());
            appMsMarvelImg.setBounds(598, 200, 186, 240); // X | Y | Ancho | Alto
            appMsMarvelImg.setIcon(new ImageIcon(marvelImg.getImage().getScaledInstance(appMsMarvelImg.getWidth(), appMsMarvelImg.getHeight(), Image.SCALE_SMOOTH)));
            //appMsMarvelImg.setOpaque(true);
            //appMsMarvelImg.setBackground(Color.GREEN);
            appMsMarvelImg.setVisible(false);
            indexPanel.add(appMsMarvelImg);

            //The Boys | Poster
            ImageIcon theboysImg;
            theboysImg = new ImageIcon(getClass().getResource("/IMG/TheBoys.jpg").getFile());
            appTheBoysImg.setBounds(794, 200, 186, 240); // X | Y | Ancho | Alto
            appTheBoysImg.setIcon(new ImageIcon(theboysImg.getImage().getScaledInstance(appTheBoysImg.getWidth(), appTheBoysImg.getHeight(), Image.SCALE_SMOOTH)));
            //appTheBoysImg.setOpaque(true);
            //appTheBoysImg.setBackground(Color.GREEN);
            appTheBoysImg.setVisible(false);
            indexPanel.add(appTheBoysImg);

        } catch (Exception e) {
            throw new NotFoundImageException("No se ha encontrado la imagen especificada");
        }
    }

    private void Buttons() {
        //Brand - Button
        appButtonTitleText = new JButton();
        appButtonTitleText.setText("Tyzer");
        appButtonTitleText.setHorizontalAlignment(SwingConstants.CENTER);
        appButtonTitleText.setFont(new Font("Poppins", Font.BOLD, 30));
        appButtonTitleText.setForeground(Color.WHITE); //Color de la fuente
        appButtonTitleText.setBounds(150, 30, 100, 70); //X | Y | Ancho | Alto
        //appButtonTitleText.setOpaque(true); //Pintar el fondo
        appButtonTitleText.setBackground(null); //Color del fondo
        appButtonTitleText.setBorder(null);
        appButtonTitleText.setFocusable(false);
        indexPanel.add(appButtonTitleText);

        //Clase anonima
        ActionListener appButtonTitleTextAction = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                trendingTitleText.setVisible(false);
                appStrangerImg.setVisible(false);
                appPeakyImg.setVisible(false);
                appBettyImg.setVisible(false);
                appMsMarvelImg.setVisible(false);
                appTheBoysImg.setVisible(false);
                appDescriptionText.setVisible(true);
            }

        };
        appButtonTitleText.addActionListener(appButtonTitleTextAction);

        //SIGN IN - Button
        signInButton = new JButton();
        signInButton.setText("SIGN IN");
        signInButton.setFont(new Font("Helvetica", Font.BOLD, 15));
        signInButton.setForeground(Color.CYAN);
        signInButton.setBounds(385, 30, 90, 70); //X | Y | Ancho | Alto
        //signInButton.setOpaque(true);
        signInButton.setBackground(null);
        signInButton.setBorder(null);
        signInButton.setFocusable(false);
        indexPanel.add(signInButton);

        //CREATE ACCOUNT - Button
        createAccountButton = new JButton();
        createAccountButton.setText("CREATE ACCOUNT");
        createAccountButton.setFont(new Font("Helvetica", Font.BOLD, 15));
        createAccountButton.setForeground(Color.CYAN);
        createAccountButton.setBounds(485, 30, 175, 70); //X | Y | Ancho | Alto
        //createAccountButton.setOpaque(true);
        createAccountButton.setBackground(null);
        createAccountButton.setBorder(null);
        createAccountButton.setFocusable(false);
        indexPanel.add(createAccountButton);

        //TRENDING - Button
        trendingButton = new JButton();
        trendingButton.setText("TRENDING");
        trendingButton.setFont(new Font("Helvetica", Font.BOLD, 15));
        trendingButton.setForeground(Color.CYAN);
        trendingButton.setBounds(670, 30, 100, 70); //X | Y | Ancho | Alto
        //trendingButton.setOpaque(true);
        trendingButton.setBackground(null);
        trendingButton.setBorder(null);
        trendingButton.setFocusable(false);
        indexPanel.add(trendingButton);

        //Clases anónimas
        ActionListener trendingAction = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    appDescriptionText.setVisible(false);
                    trendingTitleText.setVisible(true);
                    appStrangerImg.setVisible(true);
                    appPeakyImg.setVisible(true);
                    appBettyImg.setVisible(true);
                    appMsMarvelImg.setVisible(true);
                    appTheBoysImg.setVisible(true);
                } catch (NullPointerException e) {
                    System.out.println("Something wrong it's happening here");
                }
            }
        };
        trendingButton.addActionListener(trendingAction);

        //MEMBERS - Button
        membersButton = new JButton();
        membersButton.setText("MEMBERS");
        membersButton.setFont(new Font("Helvetica", Font.BOLD, 15));
        membersButton.setFocusable(false);
        membersButton.setForeground(Color.CYAN);
        membersButton.setBounds(780, 30, 100, 70); //X | Y | Ancho | Alto
        //membersButton.setOpaque(true);
        membersButton.setBackground(null);
        membersButton.setBorder(null);
        indexPanel.add(membersButton);
    }

}
