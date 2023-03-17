package employee0;

public class manager extends Employee0 {
   
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
    void managerGaji(int managerGaji) {
       this.managerGaji = managerGaji; 
    }
    
}
