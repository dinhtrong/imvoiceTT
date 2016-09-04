package com.example.luckyboy.application_imvoice;
public class KhachHang {
    private String tenKH;
    private int slMua;
    private boolean isVip;
    public static final int GIA = 20000;

   /*public KhachHang(String tenKH,int slMua,boolean isVip) {
        this.tenKH = tenKH;
        this.slMua = slMua;
        this.isVip = isVip;
    }*/
    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }
    public String getTenKH() {
        return tenKH;
    }
    public void setSlMua(int slMua) {
        this.slMua = slMua;
    }
    public int getSlMua() {
        return slMua;
    }
    public void setVip(boolean isVip) {
        this.isVip = isVip;
    }
    public boolean isVip() {
        return isVip;
    }
    public double TinhThanhTien() {
        return (isVip?slMua*GIA*0.9:slMua*GIA);
    }
}
