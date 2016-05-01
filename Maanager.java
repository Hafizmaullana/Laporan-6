
package bab5;



    public class Maanager extends Employeee {

    public int jam, lembur;
    private double bonus, total, total1, total2, semua, tunjangan;
    private double gajiManager;
    private double bonusManager;

    public Maanager() {
        super();
    }

    public double getTotal() {
        if (tahun < 5) {
            bonus = 0;
            total = super.getGaji() + bonus;
        } else if (tahun >= 5 && tahun <= 10) {
            bonus = 0.05 * super.getGaji();
            total = super.getGaji() + bonus;
        } else if (tahun > 10) {
            bonus = 0.1 * super.getGaji();
            tunjangan = 0.1 * super.getGaji();
            total = super.getGaji() + bonus + tunjangan;
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
            total2 = super.getJumlahAnak() * 0.15 * getTotal();
        } else {
            total2 = 3 * 0.15 * getTotal();
        }
        return total2;
    }

    public double getSemua() {
        semua = getTotal() + getAnak1() + getIstri1();
        return semua;
    }

    public double getGajiManager() {
        bonusManager = 0.1 * getSemua();
        gajiManager = getSemua() + bonusManager;
        return gajiManager;
    }

}


