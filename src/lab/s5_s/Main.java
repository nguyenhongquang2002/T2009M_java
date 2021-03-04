package lab.s5_s;

public class Main {
    public static void main(String[] args) {
        Person a = new Person();
        a.ten = "Nguyen Hong Quang";
        a.ngaysinh ="30/05/2002";
        a.gioitinh ="Nam";
        a.diachi ="Yen So";
        a.run();

        Student b = new Student ();
        b.masv = "666";
        b.email ="nguyenhongquang2002@gmail.com";
        b.diemthi="8";
        b.weeding();
    }
    public void getter(int diemthi){
        if(diemthi>8){

        }else{
            System.out.println("sinh viên có được học bổng");
        }
    }

    public void setter(int diemthi){
        if(diemthi<8){
        }else {
            System.out.println("sinh viên không được học bổng");
        }
    }
}
