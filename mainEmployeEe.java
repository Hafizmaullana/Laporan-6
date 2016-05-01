package bab5;


import java.util.Scanner;
public class mainEmployeEe {

    public static void main(String[] args) {
        Maanager m = new Maanager();
        PNS p = new PNS();
        nonPNS n = new nonPNS();
        int thn = 0;

        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);

        System.out.print("Nama \t: ");
        String nama = in2.nextLine();
        System.out.print("ID \t: ");
        String ID = in2.nextLine();
        System.out.println("\n\tJabatan \n1.Manager \n2.Pegawai Tetap \n3.Pegawai Tidak Tetap");
        System.out.print("Pilih Jabatan \t: ");
        int pilih = in.nextInt();
        if (pilih == 1 || pilih == 2) {
            System.out.print("Tahun Kerja \t: ");
            thn = in.nextInt();
        }
        switch (pilih) {
            case 1:
                m.setNama(nama);
                m.setId(ID);
                m.setJabatan("MANAGER");
                m.setTahun(thn);
                System.out.print("Apakah anda mempunyai istri? (y/n) : ");
                String is = in2.nextLine();
                if (is.equals("y")) {
                    m.setIstri(true);
                }
                System.out.print("Apakah anda mempunyai anak? (y/n) : ");
                String an = in2.nextLine();
                if (an.equals("y")) {
                    m.setAnak(true);
                    System.out.print("Jumlah anak \t: ");
                    int ana = in.nextInt();
                    m.setJumlahAnak(ana);
                }
                System.out.println("\t\n\tDATA EMPLOYEE");
                System.out.println("============================================");
                System.out.println("Nama           : " + m.getNama());
                System.out.println("ID             : " + m.getId());
                System.out.println("Jabatan        : " + m.getJabatan());
                System.out.println("Tahun          : " + m.getTahun());
                System.out.println("Gaji Pokok     : " + m.getGaji());
                System.out.println("Gaji Total     : " + (int) m.getGajiManager());
                break;

            case 2:
                p.setNama(nama);
                p.setId(ID);
                p.setJabatan("PEGAWAI TETAP");
                p.setTahun(thn);
                System.out.print("Apakah anda mempunyai istri? (y/n) : ");
                String is1 = in2.nextLine();
                if (is1.equals("y")) {
                    p.setIstri(true);
                }
                System.out.print("Apakah anda mempunyai anak? (y/n)  : ");
                String an1 = in2.nextLine();
                if (an1.equals("y")) {
                    p.setAnak(true);
                    System.out.print("Jumlah anak \t: ");
                    int ana = in.nextInt();
                    p.setJumlahAnak(ana);
                }
                System.out.println("\t\n\tDATA EMPLOYEE");
                System.out.println("============================================");
                System.out.println("Nama           : " + p.getNama());
                System.out.println("ID             : " + p.getId());
                System.out.println("Jabatan        : " + p.getJabatan());
                System.out.println("Tahun          : " + p.getTahun());
                System.out.println("Gaji Pokok     : " + p.getGaji());
                System.out.println("Gaji Total     : " + (int) p.getSemua());
                break;

            case 3:
                n.setNama(nama);
                n.setId(ID);
                n.setJabatan("PEGAWAI TIDAK TETAP");
                System.out.print("Jumlah jam kerja \t: ");
                int jam = in.nextInt();
                n.setJam(jam);
                System.out.println("\t\n\tDATA EMPLOYEE");
                System.out.println("============================================");
                System.out.println("Nama           : " + n.getNama());
                System.out.println("ID             : " + n.getId());
                System.out.println("Jabatan        : " + n.getJabatan());
                System.out.println("Gaji Pokok     : " + n.getGaji());
                System.out.println("Gaji Total     : " + (int) n.getTotal());
                break;

            default:
                System.out.println("INPUT SALAH");
        }
    }
}        
    

