package bab5;

public class PNS extends Employeee {

    private double bonus, total, total1, total2, semua, tunjangan;

    public double getTotal() {
        if (tahun < 5) {
            bonus = 0;
            total = gaji + bonus;
        } else if (tahun >= 5 && tahun <= 10) {
            bonus = 0.05 * gaji;
            total = gaji + bonus;
        } else if (tahun > 10) {
            bonus = 0.1 * gaji;
            tunjangan = 0.1 * gaji;
            total = gaji + bonus + tunjangan;
        }
        return total;
    }

    public double getIstri1() {
        if (istri == true) {
            total1 = 0.1 * getTotal();
        }
        return total1;
    }

    public double getAnak1() {
        if (anak == true) {
            if (jumlahAnak <= 3) {
                total2 = jumlahAnak * 0.15 * getTotal();
            } else {
                total2 = 3 * 0.15 * getTotal();
            }
        }
        return total2;
    }

    public int getSemua() {
        semua = getTotal() + getIstri1() + getAnak1();
        return (int) semua;
    }
}
    

