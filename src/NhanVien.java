public class NhanVien {
    private String tenNhanVien;
    private double heSoLuong;
    private final double LUONG_CO_BAN=750000;
    private final double LUONG_MAX=20000000;
    private double luong;
    public NhanVien(String tenNhanVien, double heSoLuong) {
        this.tenNhanVien = tenNhanVien;
        this.heSoLuong = heSoLuong;
        luong=heSoLuong*LUONG_CO_BAN;
    }



    public double tinhLuong(){
        return luong;
    }

    public boolean tangLuong(double k){
        if(k*LUONG_CO_BAN<=LUONG_MAX) {
            heSoLuong = k;
          return true;
        }
        else{
            return false;
        }
    }
    public void inTTin(){
        System.out.println("Ten nhan vien:"+tenNhanVien+"| Luong:"+luong);

    }






}
