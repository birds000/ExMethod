package exmethod;

import java.util.ArrayList;

public class Phone {
    
    public int sizesceen = 5;
    public int button = 4;
    public int battery = 100;
    public String name = "IPhone5";
    ArrayList<String> MyFriend = new ArrayList<>();
    ArrayList<String> NumberPhone = new ArrayList<>();
    
    public void PhoneDetail(){
        System.out.println("โทรศัพท์ : "+name);
        System.out.println("หน้าจอ : "+sizesceen+" นิ้ว");
        System.out.println("ปุ่มกดจำนวน : "+button+" ปุ่ม");
        System.out.println("แบตเตอร์รี่ : "+battery+" %");   
        
    }
    
    public int LowBattery(){
        battery = battery - 99;
        return battery;
    }
    
    public int VolumeBattery(){
        System.out.println("ระดับแบตเตอร์รี่ตอนนี้ : "+battery+" %");
        return battery;
    }
    
    public ArrayList<String> MyFriend(){
        for (int i = 0; i < MyFriend.size(); i++) {
            System.out.print(i+" "+MyFriend.get(i)+" : "+NumberPhone.get(i)+"  ");
        }
        System.out.println("");
        
        return MyFriend;
    }
    
    public void AddFriend(String text,String numphone){
        MyFriend.add(text);
        NumberPhone.add(numphone);
    }
    
    public void Tel(int number){
        if (number < MyFriend.size()) {
            System.out.println("Hello!! I'm "+MyFriend.get(number)+". How are you?");
        }else{
            System.out.println("ไม่มีลำดับรายชื่อผผู้ติดต่อ");
        }
        
        LowBattery();
    }
    
    public ArrayList<String> NumPhone(){
        System.out.print(" "+MyFriend.get(0)+" : "+NumberPhone.get(0)+"  ");
        return NumberPhone;
    }
    
    
}
