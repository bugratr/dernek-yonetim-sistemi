public class Uye {
    private String ad;
    private String soyad;
    private String adres;
    private String eposta;
    private String telefon;
    private String uyeTarihi;

    public Uye(String ad, String soyad, String adres, String eposta, String telefon, String uyeTarihi) {
        this.ad = ad;
        this.soyad = soyad;
        this.adres = adres;
        this.eposta = eposta;
        this.telefon = telefon;
        this.uyeTarihi = uyeTarihi;
    }

    // Getter ve Setter metodları
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getEposta() {
        return eposta;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getUyeTarihi() {
        return uyeTarihi;
    }

    public void setUyeTarihi(String uyeTarihi) {
        this.uyeTarihi = uyeTarihi;
    }
}
