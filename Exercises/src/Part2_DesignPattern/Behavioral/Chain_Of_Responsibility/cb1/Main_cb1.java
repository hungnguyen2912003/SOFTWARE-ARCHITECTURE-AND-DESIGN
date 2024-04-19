package Part2_DesignPattern.Behavioral.Chain_Of_Responsibility.cb1;

public class Main_cb1 {
    public static void main(String[] args) {
        ATM namTram = new MenhGiaATM(500);
        ATM motTram = new MenhGiaATM(100);
        ATM namChuc = new MenhGiaATM(50);
        ATM muoiNghin = new MenhGiaATM(10);
        ATM motNghin = new MenhGiaThapNhat(1);

        if(namTram.Max_MenhGia == 500){
            namTram.thietlapMenhGiaThapHon(motTram)
                    .thietlapMenhGiaThapHon(namChuc)
                    .thietlapMenhGiaThapHon(muoiNghin)
                    .thietlapMenhGiaThapHon(motNghin);
        }
        else if(namTram.Max_MenhGia == 100){
            motTram.thietlapMenhGiaThapHon(namChuc)
                    .thietlapMenhGiaThapHon(muoiNghin)
                    .thietlapMenhGiaThapHon(motNghin);
        }
        else if(namTram.Max_MenhGia == 50){
            namChuc.thietlapMenhGiaThapHon(muoiNghin)
                    .thietlapMenhGiaThapHon(motNghin);
        }
        else if(namTram.Max_MenhGia == 10){
            muoiNghin.thietlapMenhGiaThapHon(motNghin);
        }

        namTram.rutTien(293, 50);
    }
}
