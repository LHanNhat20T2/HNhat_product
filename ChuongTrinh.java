package th.javanangcao;

import java.sql.SQLException;

public class ChuongTrinh {

    public static void main(String[] args) throws SQLException {
        KetNoiSQL kn = new KetNoiSQL();
        System.out.println("NGÂN HÀNG NHÀ NƯỚC VIỆT NAM");
        System.out.println("1. Tra cứu tài khoản");
        System.out.println("2. Hiển thị tất cả tài khoản");
        System.out.println("3. Thêm tài khoản");
        int n = ThuVien.getInt("Mời chọn giá trị: ");
        switch (n) {
            case 1:
                int soTK = ThuVien.getInt("Mời bạn nhập số tài khoản: ");
                
                break;
            case 2:
                kn.infoAll();
                break;
            case 3:
               
                break;
            default:
                System.out.println("Chọn giá trị sai !!!");
                break;

        }

    }
}
