package com.example.luckyboy.application_imvoice;

import java.util.ArrayList;

public class DanhSachKhachHang {
    ArrayList<KhachHang> listKH = new ArrayList<KhachHang>();
    public void addKhachHang(KhachHang kh) {
        listKH.add(kh);
    }
    public double TongDoanhThu() {
        double tien = 0.0;
        for (KhachHang kh:listKH) {
            tien += kh.TinhThanhTien();
        }
        return tien;
    }
    public int TongKhachHang() {
        return listKH.size();
    }
    public int TongKhachHangVIP() {
        int vip = 0;
        for (KhachHang kh:listKH) {
            if (kh.isVip()) {
                vip++;
            }
        }
        return vip;
    }

}
