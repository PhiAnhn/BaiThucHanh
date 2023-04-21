package Hinhhoc;

public class Hinhhoc {
    private final float Pi = 3.14f;
    private String ten;
    private float chuvi;
    private float dientich;
    private float thetich;
    
    public float getPi(){
        return Pi;
    }
    public String getTen(){
        return ten;
    }
    public void setTen(String ten){
        this.ten = ten ;
    }
    public float getChuVi(){
        return chuvi;
    }
    public void setChuVi(float chuvi){
        this.chuvi = chuvi;
    }
    public float getDienTich(){
        return dientich;
    }
    public void setDienTich(float dientich){
        this.dientich = dientich;
    }
    public float getTheTich(){
        return thetich;
    }
    public void setTheTich(float thetich){
        this.thetich = thetich;
    }
    public void xuatTen(){
        System.out.println("\n\n=====:" + this.ten + "=====");
    }
    public void inChuvi(){
        System.out.println("Chu vi = " + this.chuvi );
    }
    public void inDienTich(){
        System.out.println("Dien tich = " + this.dientich );
    }
    public void inTheTich(){
        System.out.println("The tich = " + this.thetich );
    }    
}
