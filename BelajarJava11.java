package WEEK11;

import java.util.*;

public class BelajarJava11 {
    public static void main(String[] args) {
        ArrayList<Mahasiswa> mhs = new ArrayList<>();
        addd(mhs);
        //sortt(mhs);
        printt(mhs);
        printt(mhs);
        printt(mhs);
        printt(mhs);
    }
    public static void printt(ArrayList<Mahasiswa> mhs){

    }
    public static void shortt(ArrayList<Mahasiswa> mhs){

    }
    public static void addd(ArrayList<Mahasiswa> mhs){
        mhs.add(new Mahasiswa("001","Dani",5.5));
        mhs.add(new Mahasiswa("001","Dani",9.5));
        mhs.add(new Mahasiswa("001","Dani",2.5));
    }
}
class Mahasiswa{
    private String NIM,Nama;
    private double IPK;

    public Mahasiswa(String NIM, String Nama, double IPK){
        this.NIM = NIM;
        this.Nama = Nama;
        this.IPK = IPK;
    }
    public double getData(){
        return IPK;
    }
}
