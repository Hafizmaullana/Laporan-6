package bab5;


public class Employeee {

    private String nama, id, jabatan;
    boolean istri, anak;
    public int tahun, gaji, jumlahAnak;

    public Employeee() {
        gaji = 2000000;
    }

    public int getJumlahAnak() {
        return jumlahAnak;
    }

    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    public int getGaji() {
        return gaji;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public boolean getIstri() {
        return istri;
    }

    public void setIstri(boolean istri) {
        this.istri = istri;
    }

    public boolean getAnak() {
        return anak;
    }

    public void setAnak(boolean anak) {
        this.anak = anak;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }
}
    

