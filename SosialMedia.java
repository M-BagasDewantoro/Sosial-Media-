
package sosialmedia;

public class SosialMedia {

    private String Nama;
    private String Kota;
    private String Sekolah;
    private String Setatus;
    public SosialMedia(String sNama,String sKota, String sSekolah, String sSetatus){
        setNama(sNama);
        setKota(sKota);
        setSekolah(sSekolah);
        SetSetatus(sSetatus); 
    }
    public void setNama(String sNama) {
        this. Nama = sNama;
    }
    public String getNama(){
        return Nama;
    }
    public void setKota(String sKota) {
        this. Kota = sKota;
    }
    public String getKota(){
        return Kota;
    }
    public void setSekolah(String sSekolah) {
        this. Sekolah = sSekolah;
    }
    public String getSekolah(){
        return Sekolah;
    }
    public void SetSetatus(String sSetatus) {
        this. Setatus = sSetatus;
    }
    public String getSetatus(){
        return Setatus;
    
}
}