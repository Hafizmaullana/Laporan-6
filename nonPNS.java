
package bab5;



    public class nonPNS extends Employeee {
    private int lembur, jam, total;

    public int getLembur() {
        if(jam > 10){
            lembur = (jam - 10) * 10000;
        }
        return lembur;
    }

    public int getJam() {
        return jam;
    }

    public void setJam(int jam) {
        this.jam = jam;
    }

    public int getTotal() {
        total = gaji + getLembur();
        return total;
    }
    
}


