package hangthucpham;
import java.time.LocalDate;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // Tạo 3 đối tượng
        ThucPham hang1 = new ThucPham(
                "001",
                "Gạo",
                100000,
                LocalDate.of(2018, 10, 7),
                LocalDate.of(2018, 10, 7)
        );

        ThucPham hang2 = new ThucPham(
                "002",
                "Mì",
                5000,
                LocalDate.of(2017, 3, 1),
                LocalDate.of(2019, 3, 1)
        );

        ThucPham hang3 = new ThucPham(
                "003",
                "Nước",
                10000,
                LocalDate.of(2017, 3, 1),
                LocalDate.of(2019, 3, 1)
        );

        // In danh sách
        System.out.println(
                "Mã_Hàng Tên_Hàng        Đơn_Giá          Ngày_Sản_Xuất   Ngày_Hết_Hạn    Ghi_Chú"
        );

        System.out.println(hang1);
        System.out.println(hang2);
        System.out.println(hang3);

        // Kiểm thử getter
        System.out.println("\n--- KIỂM THỬ GETTER ---");
        System.out.println("Mã hàng: " + hang1.getMaHang());
        System.out.println("Tên hàng: " + hang1.getTenHang());
        System.out.println("Đơn giá: " + hang1.getDonGia());
        System.out.println("Ngày sản xuất: " + hang1.getNgaySanXuat());
        System.out.println("Ngày hết hạn: " + hang1.getNgayHetHan());

        // Kiểm thử setter
        System.out.println("\n--- KIỂM THỬ SETTER ---");

        hang1.setTenHang("Gạo ST25");
        hang1.setDonGia(120000);

        System.out.println("Tên mới: " + hang1.getTenHang());
        System.out.println("Đơn giá mới: " + hang1.getDonGia());

        // Kiểm tra hết hạn
        System.out.println("\n--- KIỂM TRA HẾT HẠN ---");
        System.out.println("Hàng 001 hết hạn: " + hang1.daHetHan());
        System.out.println("Hàng 002 hết hạn: " + hang2.daHetHan());
        System.out.println("Hàng 003 hết hạn: " + hang3.daHetHan());
	}

}
