package demo;

public class main {
    public static void Main (String[] args){
        // Car c = new Car();// tao doi tuong tu lap Car
        Car c; // khai bao 1 bien c co kieu du lieu Car---> chua co o nho
        c = new Car();// tao 1 o nho kich thuoc bang lop Car cho c ---> tao doi tuonh
        c.brand = "Toyota";
        c.run();
        //tao 1 doi tuong Car Khac
        Car c2 = new Car();
        c2.brand ="Honda";
    }

}
