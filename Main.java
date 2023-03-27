import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Üye oluşturma
        Uye uye = new Uye("Ahmet", "Yılmaz", "İstanbul", "ahmet.yilmaz@example.com", "0555 555 55 55", "2022-01-01");

        // Kayıt oluşturma
        Date bugun = new Date();
        Date sonKullanmaTarihi = new Date(bugun.getTime() + 1000 * 60 * 60 * 24 * 30); // 30 gün sonrası
        Kayit kayit = new Kayit(uye, bugun, sonKullanmaTarihi);

        // Kayıt bilgilerinin yazdırılması
        System.out.println("Üye Adı: " + kayit.getUye().getAd());
        System.out.println("Kayıt Tarihi: " + kayit.getKayitTarihi());
        System.out.println("Son Kullanma Tarihi: " + kayit.getSonKullanmaTarihi());
    }
}
