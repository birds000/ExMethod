package exmethod;

import java.util.ArrayList;

public class Book {
    
    public int sumpage;
    public int numpage;
    public String newname;
    public String name;
    public String text;
    public ArrayList<String> detail = new ArrayList<>();
    
    public static void main(String[] ange){

    }
    
    public void Book1(String name, int page){    
        System.out.println("หนังสือเล่มนี้มีชื่อว่า : "+name);
        System.out.println("มีหน้ากระดาษทั้งหมด : "+page);
            for (int i = 0; i < page; i++) {
            detail.add("---LOVE--BEE---");
        }
            
    }
    
    public int Read(int numpage){
        System.out.println(detail.get(numpage));
        return numpage;
    }
    
    public void Write(String text){
        detail.add(text);
    }
    
    public void EditPage(int numpage, String text){
        detail.set(numpage,text);
    }
    
    public void NewBook(String newname,int numpage){        
        System.out.println("นังสือเล่มนี้มีชื่อว่า "+newname+" มีส่วนประกอบ คือ");
        System.out.println("มีหน้ากระดาษทั้งหมด : "+numpage);
       
    }
    public String Name(){
        return name;
    }
    
    public int numpage(){
        System.out.println("ล่าสุดคุณอ่านหน้า "+numpage);
        return numpage;
    }
    
}
