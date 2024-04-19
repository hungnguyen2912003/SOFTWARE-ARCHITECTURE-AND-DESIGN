package Part2_DesignPattern.Behavioral.Chain_Of_Responsibility.cb1;

public abstract class ATM {
    int menhGia;
    int Max_MenhGia;

    public ATM(int menhGia) {
        this.menhGia = menhGia;
    }

    abstract ATM thietlapMenhGiaThapHon(ATM atm);

    void rutTien(int soTien, int Max){
        Max_MenhGia = Max;
    }
}
