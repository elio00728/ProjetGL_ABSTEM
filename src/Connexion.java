import javax.swing.*;

public class Connexion extends JFrame {


    private JButton button1;
    private JPanel panel1;
    private JButton button2;
    private JButton button3;

    public Connexion()
  {

      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setExtendedState(MAXIMIZED_BOTH);

      this.add(panel1);
      this.add(button1);

      this.add(button2);
      this.add(button3);
  }
}
