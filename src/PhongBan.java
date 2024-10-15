import java.util.ArrayList;

public class PhongBan {
    private String tenPhongBan;
    private byte soNhanVien;
    private final byte SO_NV_MAX = 100;
    private ArrayList<NhanVien> dsnv = new ArrayList<>();

    public PhongBan(String tenPhongBan, byte soNhanVien) {
        this.tenPhongBan = tenPhongBan;
        this.soNhanVien = soNhanVien;
    }

    public boolean themNV(NhanVien nv){
        if(dsnv.size()+1<=SO_NV_MAX){
            dsnv.add(nv);
            return true;
        }
        return false;

    }
    public void xoaNV(){
        dsnv.remove(dsnv.size()-1);
    }

    public double tongLuong(){
        double sum = 0;
        for(NhanVien nv:dsnv){
            sum=sum+nv.tinhLuong();
        }
        return sum;
    }
    public void inTTin(){
        System.out.println("Ten phong ban:"+tenPhongBan);
        System.out.println("So nhan vien:"+dsnv.size());
        for(NhanVien nv:dsnv){
            nv.inTTin();
        }
    }






}
