package employee0;

public class Employee0 {

    public String nama;
    public int nip, potongan = 350, jamKerja, bossGaji, managerGaji, cleaningGaji, internshipGaji;

    void nama(String nama) {
        this.nama = nama;
    }

    void nip(int nip) {
        this.nip = nip;
    }

    void jamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }

    void boss() {
        System.out.println("Nama              :   " + this.nama);
        System.out.println("NIP               :   " + this.nip);
        System.out.println("Potongan          :   " + this.potongan);
        System.out.println("Total Jam Kerja   :   " + this.jamKerja + " Jam");

        if (this.jamKerja < 10) {
            System.out.println("Potongan Gaji     :   " + this.potongan);
            this.bossGaji -= this.potongan;
        } else {
            System.out.println("Potongan          :   0");
        }
        System.out.println("Gaji              :   " + this.bossGaji);
    }

    void manager() {
        System.out.println("Nama              :   " + this.nama);
        System.out.println("NIP               :   " + this.nip);
        System.out.println("Potongan          :   " + this.potongan);
        System.out.println("Total Jam Kerja   :   " + this.jamKerja + " Jam");

        if (this.jamKerja < 8) {
            System.out.println("Potongan Gaji     :   " + this.potongan);
            this.managerGaji -= this.potongan;
        } else {
            System.out.println("Potongan          :   0");
        }
        System.out.println("Gaji              :   " + this.managerGaji);
    }

    void cleaningService() {
        System.out.println("Nama              :   " + this.nama);
        System.out.println("NIP               :   " + this.nip);
        System.out.println("Potongan          :   " + this.potongan);
        System.out.println("Total Jam Kerja   :   " + this.jamKerja + " Jam");

        if (this.jamKerja < 6) {
            System.out.println("Potongan Gaji     :   " + this.potongan);
            this.bossGaji -= this.potongan;
        } else {
            System.out.println("Potongan          :   0");
        }
        System.out.println("Gaji              :   " + this.cleaningGaji);
    }

    void internship() {
        System.out.println("Nama              :   " + this.nama);
        System.out.println("NIP               :   " + this.nip);
        System.out.println("Potongan          :   " + this.potongan);
        System.out.println("Total Jam Kerja   :   " + this.jamKerja + " Jam");

        if (this.jamKerja < 3) {
            System.out.println("Potongan Gaji     :   " + this.potongan);
            this.internshipGaji -= this.potongan;
        } else {
            System.out.println("Potongan          :   0");
        }
        System.out.println("Gaji              :   " + this.internshipGaji);
    }
}
