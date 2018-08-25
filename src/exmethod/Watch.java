package exmethod;

import java.util.Date;

public class Watch {

    public int button = 4;
    public String name = "Casio"; 
    public String type = "Digital";
    public int hour = 10;
    public int minute = 30;
    public int sec = 40;
    
    public void DeatilWatch(){
        System.out.println("นาฬิกา : "+name);
        System.out.println("รูปแบบ : "+type);
        System.out.println("ปุ่มกดจำนวน "+button+" ปุ่ม");
        System.out.println();
    
    }
    
    public int Hour(){
        return hour;
    }
    
    public int Minute(){
        return minute;
    }
    
    public int Sec(){
        return sec;
    }
    
    public void Time(){
        System.out.println("ตอนนี้เวลา"+ hour+"."+minute+"."+sec);
        
    }
    
    public void EditTime(int h, int m, int s){
        System.out.println("ตอนนี้เวลา"+ h+"."+m+"."+s);
    }
    
    public void Wake(int h, int m, int s){
        System.out.println("เวลาปลุก : "+ h+"."+m+"."+s);
    }
    
    
}
