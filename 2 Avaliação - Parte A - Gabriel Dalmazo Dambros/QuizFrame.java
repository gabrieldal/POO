// interface gráfica para o quiz
//como o sr. pode ver, deixei várias tentativas comentadas e fui melhorando o código aos poucos

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class QuizFrame extends JFrame implements ActionListener {

    private static final int LARGURA = 500;
    private static final int ALTURA = 500;

    private JButton responder, perguntar, perguntar2;
    private JPanel panel;
    private JTextField digitarResposta;
    private JLabel resultado, pergunta;
    // private String resposta;
    PerguntaTxT perguntaTxT;

    public QuizFrame() {
        Container contentPane = getContentPane();
        setSize(LARGURA, ALTURA);
        setTitle("Quiz");
        setResizable(true);

        pergunta = new JLabel("Pergunta");
        resultado = new JLabel("Resultado");
        responder = new JButton("Responder");
        perguntar = new JButton("Perguntar");
        //perguntar2 = new JButton("Perguntar a próxima pergunta");
        digitarResposta = new JTextField(10);
        perguntar.addActionListener(this);
        responder.addActionListener(this);
        responder.setActionCommand("Responder");
        //perguntar2.addActionListener(this);

        panel = new JPanel(new GridLayout(5, 2, 10, 10));
        panel.setBorder(BorderFactory.createLineBorder(Color.RED));
        //contentPane.setLayout(new FlowLayout());
        //setBackground(Color.BLUE);
        panel.add(perguntar);
        //panel.add(perguntar2);
        panel.add(pergunta);
        panel.add(digitarResposta);
        panel.add(responder);
        panel.add(resultado);
        contentPane.add(panel);
        

        
        //perguntar();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void perguntar1() {

        try {
            File quest = new File("questionario.txt");
            Scanner myReader = new Scanner(quest);
            // Scanner usuario = new Scanner(digitarResposta.getText());

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                if (data.compareTo("T") == 0) {
                    perguntaTxT = new PerguntaTxT(myReader.nextLine(), myReader.nextLine());
                    // System.out.println(perguntaTxT.getPergunta());
                    pergunta.setText(perguntaTxT.getPergunta());

                    /*
                     * System.out.print("R: ");
                     * String resp = digitarResposta.getText();
                     * System.out.println(digitarResposta.getText());
                     * if (resp.compareTo(perguntaTxT.getResposta()) == 0) {
                     * System.out.println("Acertou");
                     * resultado.setText(perguntaTxT.getResposta());
                     * } else {
                     * System.out.println("Errou");
                     * System.out.println("a certa é: " + perguntaTxT.getResposta());
                     * }
                     */
                }

            }

            myReader.close();
            // usuario.close();
        } catch (FileNotFoundException e) {
            System.out.println("Algo de errado não está certo.");
            e.printStackTrace();
        }

    }

    private void perguntar2() {

        try {
            File quest = new File("questionario.txt");
            Scanner myReader = new Scanner(quest);
            // Scanner usuario = new Scanner(digitarResposta.getText());

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                if (data.compareTo("N") == 0) {
                    perguntaTxT = new PerguntaTxT(myReader.nextLine(), myReader.nextLine());
                    // System.out.println(perguntaTxT.getPergunta());
                    pergunta.setText(perguntaTxT.getPergunta());

                    /*
                     * System.out.print("R: ");
                     * String resp = digitarResposta.getText();
                     * System.out.println(digitarResposta.getText());
                     * if (resp.compareTo(perguntaTxT.getResposta()) == 0) {
                     * System.out.println("Acertou");
                     * resultado.setText(perguntaTxT.getResposta());
                     * } else {
                     * System.out.println("Errou");
                     * System.out.println("a certa é: " + perguntaTxT.getResposta());
                     * }
                     */
                }

            }

            myReader.close();
            // usuario.close();
        } catch (FileNotFoundException e) {
            System.out.println("Algo de errado não está certo.");
            e.printStackTrace();
        }

    }

    public void actionPerformed(ActionEvent e) {
        perguntar1();
        /*if(??????){    não sei como fazer para trocar o botão
            perguntar1();}
             else perguntar2();*/

        if ("Responder".equals(e.getActionCommand())) {

            if (digitarResposta.getText().compareTo(perguntaTxT.getResposta()) == 0) {
                resultado.setText("Resposta Correta!");

            } else {
                resultado.setText("Errou, na verdade a resposta é " + perguntaTxT.getResposta());
            }

        }
    };

    
    /*public void actionPerformed(ActionEvent e){

        perguntar2();

        if ("Responder".equals(e.getActionCommand())) {

            if (digitarResposta.getText().compareTo(perguntaTxT.getResposta()) == 0) {
                resultado.setText("Resposta Correta!");

            } else {
                resultado.setText("Errou, na verdade a resposta é " + perguntaTxT.getResposta());
            }
    };*/
    

}
