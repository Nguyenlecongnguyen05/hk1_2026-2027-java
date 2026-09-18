package Bai9.z;

import Bai9.z.CongNhan;

public class DanhSachCongNhan {
    private CongNhan[] ds;
    private int soLuong;

    public DanhSachCongNhan(int n) {
        ds = new CongNhan[n];
        soLuong =0;
    }

    public boolean themCongNhan(CongNhan cn) {
        if (soLuong < ds.length) {
            ds[soLuong] = cn;
            soLuong++;
            return true;
        }
        return false;
    }

    public void xuatThongTin() {
        for (int i =0;i<soLuong;i++) {
            System.out.println(ds[i].toString());
        }
    }

    public int tinhSoLuong() {
        return soLuong;
    }

    public void xuatCongNhanTren200SP() {
        for (int i =0;i<soLuong;i++) {
            if (ds[i].getMSoSP()>200) {
                System.out.println(ds[i].toString());
            }
        }
    }

    public void sapXepGiamDanTheoSP() {
        for (int i =0;i<soLuong-1;i++) {
            for (int j = i+ 1;j<soLuong;j++) {
                if (ds[i].getMSoSP() < ds[j].getMSoSP()) {
                    CongNhan temp = ds[i];
                    ds[i] = ds[j];
                    ds[j] = temp;
                }
            }
        }
    }
}
