package employee0;

public class boss extends Employee0 {
   
    @Override
    void nama(String nama) {
        this.nama = nama;
    }

    @Override
    void nip(int nip) {
        this.nip = nip;
    }
    @Override
    void jamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }
    void bossGaji(int bossGaji) {
        this.bossGaji = bossGaji;
    }
}
