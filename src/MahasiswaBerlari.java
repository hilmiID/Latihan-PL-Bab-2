
package tuga.pl.pkg2;

public class MahasiswaBerlari {
    int jumlahPutaran, waktu;
    String nama, nim;
    
    public void setDataLariMahasiswa(String nim, String nama, String putaran, String waktu){
        this.nim=nim;
        this.nama=nama;
        this.jumlahPutaran=Integer.parseInt(putaran);
        this.waktu=Integer.parseInt(waktu);
    }
    public String getNama(){
        return nama;
    }
    public int jarakTempuh(){
        Lapangan kel=new Lapangan(100, 20);
        return kel.kelLapangan()*jumlahPutaran;
    }
    public int cariPemenang(){
        return jarakTempuh()/waktu;
    }    
}
