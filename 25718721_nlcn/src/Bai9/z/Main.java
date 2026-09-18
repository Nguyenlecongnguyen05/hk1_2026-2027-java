package Bai9.z;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap kich thuoc toi da cua danh sach: ");
        int n = scanner.nextInt();
        DanhSachCongNhan ds = new DanhSachCongNhan(n);
        int luaChon;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Them cong nhan");
            System.out.println("2. Xuat toan bo thong tin cong nhan vien");
            System.out.println("3. Tinh so luong cong nhan vien co trong danh sach");
            System.out.println("4. Xuat thong tin cac cong nhan lam tren 200 san pham");
            System.out.println("5. Sap xep cong nhan theo so san pham giam dan");
            System.out.println("0. Thoat");
            System.out.print(" chon chuc nang: ");
            luaChon = scanner.nextInt();
            scanner.nextLine();

            switch (luaChon) {
                case 1:
                    System.out.print("Nhap ma cong nhan: ");
                    String maCN = scanner.nextLine();
                    System.out.print("Nhap ho: ");
                    String ho = scanner.nextLine();
                    System.out.print("Nhap ten: ");
                    String ten = scanner.nextLine();
                    System.out.print("Nhap so san pham: ");
                    int soSP = scanner.nextInt();
                    
                    CongNhan cn =new CongNhan(maCN,ho,ten,soSP);
                    if (ds.themCongNhan(cn)) {
                        System.out.println("Them thanh cong.");
                    } else {
                        System.out.println("Them that bai, danh sach da day.");
                    }
                    break;
                case 2: 
                    ds.xuatThongTin();
                    break;
                case 3:
                    System.out.println("So luong cong nhan: " + ds.tinhSoLuong());
                    break;
                case 4:
                    ds.xuatCongNhanTren200SP();
                    break;
                case 5:
                    ds.sapXepGiamDanTheoSP();
                    System.out.println("Danh sach sau khi sap xep:");
                    ds.xuatThongTin();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Lua chon khong hop le.");
            }
        } while (luaChon!=0);

        scanner.close();
    }
}