package exmethod;

public class Car {
    
    public int wheel = 4;
    public int door = 4;
    public int energy = 10;
    public String name = "Honda";
    public String brand = "Jazz";
    public int km = 10;
    
    public void Car1(){
        System.out.println("รถ "+name+" รุ่น "+brand+" มีส่วนประกอบ คือ");
        System.out.println("ประตู : "+door);
        System.out.println("ล้อ : "+wheel);
        System.out.println("พลังงานตอนนี้อยู่ในระดับ : "+energy);     
        
    }
    
    public void StartOn(){
        for (int i = 0; i < 10; i++) {
         System.out.println("รถคุณวิ้งได้ : "+km+" km");
           km--;
        }      
    }
    
    public void StartOff(){
        km = 0;
        System.out.println("รถคุณวิ้งได้ : "+km+" km");
    }
    
    public void Energy(){
        for (int i = energy; i < 10; i++) {
         System.out.println("รถคุณพลังงานอยู่ในระดับ : "+energy);
           energy++;
        }   
    }
    public int energy(){
                 System.out.println("รถคุณพลังงานอยู่ในระดับ : "+energy);
        return energy * 1000;
    }
    
    public void ChangeCar(String n, String b, int d, int w){
        
        name = n;
        brand = b;
        door = d;
        wheel = w;
       
    }
    
    public int km(){
        System.out.println("รถคุณวิ้งได้ : "+km+" km");
        return km;
    }
    
}
