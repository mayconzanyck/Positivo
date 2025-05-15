import javax.swing.*; // Importa todos os componentes do Swing
import java.awt.event.*; // Importa eventos

public class JanelaSimples{
    public static void main(String args[]){
        // Criar uma janela (JFrame)
        JFrame frame = new JFrame("Minha Primeira Janela");
        frame.setSize(300,200); // Largura x Altura
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fecha ao clicar no x
        frame.setLayout(null); // Layout livre (sem gerenciador de layout)

        // Criar uma label
        JLabel labelNome = new JLabel("Digite seu nome: ");
        labelNome.setBounds(50, 10, 200, 20); // Posição e tamanho
        frame.add(labelNome);

        // Criar um campo de texto
        JTextField campoTexto = new JTextField();
        campoTexto.setBounds(50, 30, 200, 30);
        frame.add(campoTexto);

        // Criar um botão
        JButton botao = new JButton("Clique aqui");
        botao.setBounds(90, 70, 120, 30);
        frame.add(botao);

        // Criar um rótulo para exibir a mensagem
        JLabel rotulo = new JLabel("");
        rotulo.setBounds(50, 110, 200, 30);
        frame.add(rotulo);

        // Adiciona ação ao botão
        botao.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String texto = campoTexto.getText(); // Pega o texto digitado
                rotulo.setText("Olá " + texto + "!");
            }
        });

        // Exibir a janela
        frame.getRootPane().setDefaultButton(botao); // Faz o botão funcionar com o ENTER
        frame.setLocationRelativeTo(null); // Exibe a janela no meio da tela
        frame.setVisible(true);
    }
}