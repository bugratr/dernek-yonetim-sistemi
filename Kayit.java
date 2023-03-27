import java.util.Date;

public class Kayit {
    private Uye uye;
    private Date kayitTarihi;
    private Date sonKullanmaTarihi;

    public Kayit(Uye uye, Date kayitTarihi, Date sonKullanmaTarihi) {
        this.uye = uye;
        this.kayitTarihi = kayitTarihi;
        this.sonKullanmaTarihi = sonKullanmaTarihi;
    }

    // Getter ve Setter metodları
    public Uye getUye() {
        return uye;
    }

    public void setUye(Uye uye) {
        this.uye = uye;
    }

    public Date getKayitTarihi() {
        return kayitTarihi;
    }

    public void setKayitTarihi(Date kayitTarihi) {
        this.kayitTarihi = kayitTarihi;
    }

    public Date getSonKullanmaTarihi() {
        return sonKullanmaTarihi;
    }

    public void setSonKullanmaTarihi(Date sonKullanmaTarihi) {
        this.sonKullanmaTarihi = sonKullanmaTarihi;
    }
}
