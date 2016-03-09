
package tuga.pl.pkg2;
import java.util.Scanner;
public class MainClass {
    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        Scanner inStr=new Scanner(System.in);
        System.out.println("##INPUT##");
        int mhs=in.nextInt();
        MahasiswaBerlari []lari=new MahasiswaBerlari[mhs];
        int p=in.nextInt(); int l=in.nextInt();
        Lapangan keliling=new Lapangan(p, l);
        for(int a=0; a<mhs; a++){
            lari[a]=new MahasiswaBerlari();
            String dataMentah=inStr.nextLine();
            String[] data=dataMentah.split(", ");
            lari[a].setDataLariMahasiswa(data[0], data[1], data[2], data[3]);
        }
        System.out.println("##OUTPUT##");
        for(int a=0;a<mhs;a++){
            System.out.println(lari[a].getNama()+" "+lari[a].jarakTempuh());
        }
        int juara=lari[0].cariPemenang();
        for(int a=1;a<mhs;a++){
            if(juara<lari[a].cariPemenang()){
                juara=lari[a].cariPemenang();
            }
        }
        if(juara==lari[0].cariPemenang()) System.out.println(lari[0].getNama());
        else if(juara==lari[1].cariPemenang()) System.out.println(lari[1].getNama());
        else System.out.println(lari[2].getNama());
    }
}        
        
    
