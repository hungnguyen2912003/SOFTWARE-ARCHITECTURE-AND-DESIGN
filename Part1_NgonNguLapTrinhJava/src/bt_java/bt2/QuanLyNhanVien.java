package bt_java.bt2;

import bt_java.bt1.NhanVien;
import bt_java.bt2.IQuanLy;

import java.util.ArrayList;
import java.util.List;

public class QuanLyNhanVien implements IQuanLy {
    private List<NhanVien> ds = new ArrayList<>();

    @Override
    public void them(NhanVien nv) {
        ds.add(nv);
    }

    @Override
    public void inDS() {
        for(NhanVien nv : ds){
            System.out.println(nv.ToString());
        }
    }
}
