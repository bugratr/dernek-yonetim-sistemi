import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Main extends JFrame implements ActionListener {
    // Arayüz elemanları
    private JButton addButton, listButton;
    private JLabel titleLabel;
    private JPanel panel;

    // Üye listesi
    private ArrayList<Uye> uyeListesi = new ArrayList<>();

    public Main() {
        // Başlık
        super("Dernek Üye Yönetim Sistemi");

        // Arayüz elemanları
        titleLabel = new JLabel("Dernek Üye Yönetim Sistemi", JLabel.CENTER);
        addButton = new JButton("Yeni Üye Ekle");
        listButton = new JButton("Üye Listesi");

        // Arayüz düzeni
        panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));
        panel.add(titleLabel);
        panel.add(addButton);
        panel.add(listButton);

        // Arayüz özellikleri
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setContentPane(panel);
        pack();

        // Olay dinleyicileri
        addButton.addActionListener(this);
        listButton.addActionListener(this);
    }

    public static void main(String[] args) {
        // Arayüzü başlat
        Main frame = new Main();
        frame.setVisible(true);
    }

    // Olay dinleyicisi
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            // Yeni üye eklemek için üye formunu aç
            UyeForm uyeForm = new UyeForm(this);
            uyeForm.setVisible(true);
        } else if (e.getSource() == listButton) {
            // Üye listesini görüntüle
            String uyeListesiMetni = "";
            for (Uye uye : uyeListesi) {
                uyeListesiMetni += "Ad: " + uye.getAd() + ", Soyad: " + uye.getSoyad() + ", Adres: " + uye.getAdres() + ", Eposta: " + uye.getEposta() + ", Telefon: " + uye.getTelefon() + ", Üye Tarihi: " + uye.getUyeTarihi() + "\n";
            }
            JOptionPane.showMessageDialog(this, uyeListesiMetni, "Üye Listesi", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    // Yeni üye ekleme
    public void uyeEkle(Uye uye) {
        uyeListesi.add(uye);
    }
}
