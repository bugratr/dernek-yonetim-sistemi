import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class UyeKayitArayuzu extends JFrame implements ActionListener {
    private JTextField adField, soyadField, adresField, epostaField, telefonField, uyeTarihiField;
    private JButton kaydetButton, listeleButton;
    private JTextArea uyeListesiArea;

    private ArrayList<Uye> uyeListesi = new ArrayList<>();

    public UyeKayitArayuzu() {
        // Arayüz öğelerinin oluşturulması
        JLabel adLabel = new JLabel("Ad:");
        JLabel soyadLabel = new JLabel("Soyad:");
        JLabel adresLabel = new JLabel("Adres:");
        JLabel epostaLabel = new JLabel("E-posta:");
        JLabel telefonLabel = new JLabel("Telefon:");
        JLabel uyeTarihiLabel = new JLabel("Üyelik Tarihi:");

        adField = new JTextField(20);
        soyadField = new JTextField(20);
        adresField = new JTextField(20);
        epostaField = new JTextField(20);
        telefonField = new JTextField(20);
        uyeTarihiField = new JTextField(20);

        kaydetButton = new JButton("Kaydet");
        listeleButton = new JButton("Üye Listesi");

        uyeListesiArea = new JTextArea(10, 40);
        JScrollPane scrollPane = new JScrollPane(uyeListesiArea);

        // Arayüz düzenlemelerinin yapılması
        setLayout(new BorderLayout());

        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(6, 2));
        formPanel.add(adLabel);
        formPanel.add(adField);
        formPanel.add(soyadLabel);
        formPanel.add(soyadField);
        formPanel.add(adresLabel);
        formPanel.add(adresField);
        formPanel.add(epostaLabel);
        formPanel.add(epostaField);
        formPanel.add(telefonLabel);
        formPanel.add(telefonField);
        formPanel.add(uyeTarihiLabel);
        formPanel.add(uyeTarihiField);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.add(kaydetButton);
        buttonPanel.add(listeleButton);

        add(formPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
        add(scrollPane, BorderLayout.NORTH);

        // Olay dinleyicilerinin eklenmesi
        kaydetButton.addActionListener(this);
        listeleButton.addActionListener(this);

        // Arayüz ayarlarının yapılması
        setTitle("Üye Kayıt Arayüzü");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == kaydetButton) {
            // Yeni üye kaydetme işlemi
            String ad = adField.getText();
            String soyad = soyadField.getText();
            String adres = adresField.getText();
            String eposta = epostaField.getText();
            String telefon = telefonField.getText();
            String uyeTarihi = uyeTarihiField.getText();

            Uye uye = new Uye(ad, soyad, adres, eposta, telefon, uyeTarihi);
            uyeListesi.add(uye);
            JOptionPane.showMessageDialog(this,
            "Üye kaydedildi:\n" + "Ad: " + ad + "\nSoyad: " + soyad + "\nAdres: " + adres + "\nE-posta: "
                    + eposta + "\nTelefon: " + telefon + "\nÜyelik Tarihi: " + uyeTarihi);
} else if (e.getSource() == listeleButton) {
    // Kaydedilmiş üyeleri listeleme işlemi
    StringBuilder uyeListesiStr = new StringBuilder();

    for (Uye uye : uyeListesi) {
        uyeListesiStr.append("Ad: ").append(uye.getAd()).append("\n");
        uyeListesiStr.append("Soyad: ").append(uye.getSoyad()).append("\n");
        uyeListesiStr.append("Adres: ").append(uye.getAdres()).append("\n");
        uyeListesiStr.append("E-posta: ").append(uye.getEposta()).append("\n");
        uyeListesiStr.append("Telefon: ").append(uye.getTelefon()).append("\n");
        uyeListesiStr.append("Üyelik Tarihi: ").append(uye.getUyeTarihi()).append("\n\n");
    }

    uyeListesiArea.setText(uyeListesiStr.toString());
}
}

public static void main(String[] args) {
UyeKayitArayuzu uyeKayitArayuzu = new UyeKayitArayuzu();
}
}