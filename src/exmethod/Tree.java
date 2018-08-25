package exmethod;

public class Tree {

    public int body = 1;
    public int leaves = 100;
    public int woody = 20;
    public int energy = 80;
    public String place = "rain";
    public String name = "lelavade";
    
    public void TreeDetail(){
        System.out.println("ต้น "+name +" มีส่วนประกอบ คือ");
        System.out.println("ลำต้น : "+body);
        System.out.println("กล้าน : "+woody);
        System.out.println("ใบ : "+leaves);
      
        Place();
        Energy();
    }
    
    public String Place(){
        System.out.println("ต้นไม้ต้นนี้ปลูกอยู่ในระบบนิเวศแบบ : "+place);
        return place;
    }
    
    public int Energy(){
        System.out.println("ต้นไม้ต้นนี้ได้รับพลีงงานจากแสงอาทิต : "+energy+" %");
        return energy;
    }
    
    public void EditPlace(String p){
        place = p;
    }
    
    
    public int EnergyDown(){
        energy = energy - 20;
        
        return energy;
    }
    
    public int EnergyUp(){
        energy = energy + 20;
        
        return energy;
    }
    
}
