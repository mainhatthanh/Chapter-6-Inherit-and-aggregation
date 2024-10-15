//<SSV:20235431
public class Main {
    public static void main(String[] args) {
        PhongBan pb = new PhongBan("phong tai chinh", (byte) 5);
        NhanVien nv1 = new NhanVien("Thanh",2);
        NhanVien nv2 = new NhanVien("Giang",1.5);
        NhanVien nv3 = new NhanVien("Tuan",1.75);
        pb.themNV(nv1);
        pb.themNV(nv2);
        pb.themNV(nv3);
        pb.inTTin();
        System.out.println("Tong luong:"+pb.tongLuong());
        pb.xoaNV();
        pb.inTTin();
        System.out.println("Tong luong:"+pb.tongLuong());

    }
}