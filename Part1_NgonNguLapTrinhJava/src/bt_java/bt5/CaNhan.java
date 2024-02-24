package bt_java.bt5;

public abstract class CaNhan {
    String hoTen;
    int tuoi;
    String diaChi;
    String sdt;

    public String HienThiTT() {
        return "Họ tên: " + hoTen + "\n" +
                "Tuổi: " + tuoi + "\n" +
                "Địa chỉ: " + diaChi + "\n" +
                "Số điện thoại: " + sdt + "\n";
    }
}
