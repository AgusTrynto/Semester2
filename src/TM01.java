import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TM01 extends JFrame {
    private JTextField tfNama;
    private JTextField tfHarga;
    private JButton keluarButton;
    private JButton submitButton;
    private JPanel mainpanel;

    public TM01() {
        setContentPane(mainpanel);
        setTitle("Selamat Datang");
        setSize(450, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        keluarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
    }

    public static void main(String[] args) {
        TM01 myFrame = new TM01();
    }
}
