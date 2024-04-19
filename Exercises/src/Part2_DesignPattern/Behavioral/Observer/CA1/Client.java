package Part2_DesignPattern.Behavioral.Observer.CA1;

public class Client implements Listener<MonHoc>{
    @Override
    public void Update(MonHoc monHoc) {
        System.out.println("Đã thêm mới môn học: " + monHoc.tenMonHoc);
    }
}
