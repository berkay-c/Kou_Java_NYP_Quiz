// 190202056 Berkay Yasin Çiftçi
package lab_7;

/**
 *
 * @author asayar
 */
public class Daire {
    
    // Class parametreleri
    public double PI=3.14;
    public int yaricap;
    Islemlerim i2 = new Islemlerim(yaricap);
   
    
    /**
     * Constructor
     * @param yaricap Dairenin yarıçapı
     */
    public Daire(int yaricap){
        this.yaricap=yaricap;
    }
    
    /**
     * Dairenin alanını Islemlerim class ındaki 
     * methodları kullanarak hesaplar
     * @return alanı double cinsinden dondurur
     */
    public double  alanHesapla(){
       double dairealan= new Islemlerim(PI).carp(new Islemlerim(yaricap).carp(yaricap));
       
        return dairealan;
    }
    
    /**
     * Dairenin çevresini Islemlerim class ındaki 
     * methodları kullanarak hesaplar
     * @return cevreyi double cinsinden dondurur
     */
    public double cevreHesapla(){
        double dairecevre=new Islemlerim(PI).carp(new Islemlerim(yaricap).carp(2));
        return dairecevre;
    }
    
    /**
     * Bir dairenin cevresinin alanından büyüyk
     * olup olmadığını Islemlerim class ındaki 
     * methodları kullanarak belirler
     * @return boolean değer dönderir
     */
    public boolean cevreAlandanBuyuktur(){
        boolean result = cevreHesapla()>alanHesapla();
        return result;
    }
    
    /**
     * Bir dairenin cevresinin alanından küçük
     * olup olmadığını ıslemlerim class ındaki 
     * methodları kullanarak belirler
     * @return boolean değer dönderir
     */
    public boolean cevreAlandanKucuktur(){
        boolean result=alanHesapla()>cevreHesapla();
        
        return result;
    }
    
    /**
     * Dairenin alanını ve çevresini ekrana yazdırır.
     */
    public void ekranaYazdir(){
        System.out.println("Alanı="+alanHesapla());
        System.out.println("Çevresi="+cevreHesapla());
        
    }
    
    

}
