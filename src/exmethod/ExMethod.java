package exmethod;

import java.util.Scanner;

public class ExMethod {

    public static void main(String[] args) {
//        DBConnect connect = new DBConnect();
//        connect.getData();    
    String select = "book";
    String check;
    String name = "JavaBook";

    Scanner scan = new Scanner(System.in);

        switch(select){

        case "book" :
            int numpage = 10;         

            Book book1 = new Book();
            book1.Book1(name,numpage);

            System.out.println("คุณต้องการเปิดอ่านหนังสือมั้ย?? y/n");
            check = scan.next();
            if (check.equals("y")){

                System.out.print("คุณต้องการอ่านหน้าใด 0 ถึง "+book1.detail.size()+" --> ");
                book1.numpage = scan.nextInt();
                int r; 
                r = book1.Read(book1.numpage);
            }

            System.out.println("คุณต้องการเพิ่มหน้าหนังสือมั้ย?? y/n");
            check = scan.next();
            if (check.equals("y")){
                System.out.println("คุณสามารถเขียนข้อความลงในหน้านี้ได้ ");
                check = scan.next();
                book1.Write(check);
            }

            System.out.println("คุณต้องการแก้ไขหน้ากระดาษมั้ย?? y/n");
            check = scan.next();
            if (check.equals("y")){

                System.out.print("คุณต้องการแก้ไขหน้าใด 0 ถึง "+book1.detail.size()+" --> ");
                book1.numpage = scan.nextInt();
                System.out.println("กรุณาใส่ข้อความที่คุณต้องการ");
                book1.text = scan.next();

                book1.EditPage(book1.numpage, book1.text);
            }

            System.out.println("คุณต้องการสร้างหนังสือใหม่มั้ย?? y/n");
            check = scan.next();
            if (check.equals("y")){

                System.out.print("คุณอยากให้หนังสือนี้ชื่ออะไร --> ");
                book1.newname = scan.next();
                System.out.println("มีจำนวนกี่หน้า ");
                book1.numpage = scan.nextInt();
                book1.NewBook(book1.newname,book1.numpage);

            }
            break;


        case "car" :
            Car car1 = new Car();           
            car1.Car1();

            System.out.println("คุณต้องการเดินทางหรือไม่ ?? y/n");
            check = scan.next();
            if (check.equals("y")){
                car1.StartOn();
            }else{
                car1.StartOff();
            }
            System.out.println("พลังงานหมดคุณต้องการเติมหรือไม่?? y/n");
            check = scan.next();
            if (check.equals("y")){
                car1.Energy();
            }else{
                car1.Car1();
            }

            System.out.println("คุณต้องการเปลี่ยนรถหรือไม่?? y/n");
            check = scan.next();
            if (check.equals("y")){
                System.out.println("คุณต้องการเปลี่ยนรถเป็นยี่ห้อใด");
                String ChName = "Yamaha";
                System.out.println("คุณต้องการเปลี่ยนรถเป็นรุ่นใด");
                String ChBrand = "R1";
                System.out.println("ประตูมีเท่าใด");
                int ChDoor = 0;
                System.out.println("ล้อมีเท่าใด");
                int ChWheel = 2;

                car1.ChangeCar(ChName,ChBrand,ChDoor,ChWheel);
            }else{
                System.out.println("เหนื่อยแล้วกลับบ้าน");
            }

            break;


        case "phone" :

            Phone phone1 = new Phone();
            phone1.PhoneDetail();

            System.out.println("คุณสามารถเพิ่มรายชื่อติดต่อในโทรศัพคุณได้ ");
            System.out.print("คุณสามารถเพิ่มจำนวนทั้งหมดกี่รายชื่อ --> ");
            int num = scan.nextInt();

            for (int i = 0; i < num; i++) {
                System.out.println("");
                System.out.print("กรุณาใส่ชื่อผู้ติดต่อที่คุณต้องการ : ");
                name = scan.next();
                System.out.print("กรุณาใส่เบอร์ติดต่อ : ");
                String numberpone = scan.next();
                phone1.AddFriend(name,numberpone);
            }
            
            
            System.out.println("เพื่อนที่อยู่ในโทรศัพคุณ ");
            phone1.MyFriend();

            System.out.println("คุณต้องการติดต่อกับเพื่อนหรือไม่?? y/n");
            check = scan.next();
            
            if (check.equals("y")){
                System.out.println("คุณต้องการโทรหาใคร ");
                System.out.println("กรุณาใส่เบอร์ติดต่อ");
                int numphone = scan.nextInt();
                phone1.Tel(numphone);
            }          
            
            phone1.VolumeBattery();
            System.out.println("ปิดเครื่อง------");
            
            break;
            
            
        case "Watch" :
            Watch watch1 = new Watch();
            watch1.DeatilWatch();
            watch1.Time();
            
            System.out.println("คุณต้องการแก้ไขเวลาหรือไม่?? y/n");
            check = scan.next();
            
            if (check.equals("y")){
                System.out.print("คุณต้องการให้ขณะนี้เป็นเวลากี่โมง : ");
                watch1.hour = scan.nextInt();
                System.out.print("คุณต้องการให้ขณะนี้เวลากี่นาที : ");
                watch1.minute = scan.nextInt();
                System.out.print("คุณต้องการให้ขณะนี้เวลากี่วินาที : ");
                watch1.sec = scan.nextInt();
                
                watch1.EditTime(watch1.hour,watch1.minute,watch1.sec);
            }       

            System.out.println("คุณต้องการตั้งวลาปลุกหรือไม่?? y/n");
            check = scan.next();
            
            if (check.equals("y")){
                System.out.print("คุณต้องการให้ปลุกเวลากี่โมง : ");
                watch1.hour = scan.nextInt();
                System.out.print("คุณต้องการให้ปลุกเวลากี่นาที : ");
                watch1.minute = scan.nextInt();
                System.out.print("คุณต้องการให้ปลุกเวลากี่วินาที : ");
                watch1.sec = scan.nextInt();
                
                watch1.Wake(watch1.hour,watch1.minute,watch1.sec);
            }       
            
            break;
            
            
        case "pet" :
            Pet dog = new Pet();
            dog.PetDetail();
            
            System.out.println("คุณต้องการให้อาหารหรือไม่??  y/n");
            check = scan.next();
            if (check.equals("y")){
                System.out.println("คุณต้องการให้อาหารกี่ครั้ง");
                int n = scan.nextInt();
                for (int i = 0; i < n; i++) {
                    dog.VolumeEatUp();
                }
            }
            
            dog.VolumeEat();
            
            System.out.println("คุณต้องการพาสัตว์เลี้ยงไปเดินเล่นมั้ย  y/n");
            check = scan.next();
            if (check.equals("y")){
                System.out.println("คุณต้องการพาหมาไปเดินเล่นกี่นาที??");
                int n = scan.nextInt();
                dog.Walk(n);
            }
            
            dog.VolumeEat();
            
            break;
        
            
        case "tree" :
            Tree leravade = new Tree();
            leravade.TreeDetail();          
            boolean t = true;
            
            while (t) {
                System.out.println("คุณต้องการเปลี่ยนที่ปลูกให้ต้นไม้ต้นนี้หรือไม่  y/n");
                check = scan.next();
                
                if (check.equals("y")){
                System.out.println("คุณต้องการให้ต้นไม้ต้นนี้ปลูกอยู่ในระบบนอเวศแบบใด (hot , rain)");
                String n = scan.next();
                
                    if (n.equals("hot")) {
                        leravade.EditPlace(n);
                        leravade.EnergyDown();
                        t = false;
                    }
                    
                    else if (n.equals("rain")) {
                        leravade.EditPlace(n);
                        leravade.EnergyUp();
                        t = false;
                    }
                
                    else{
                        System.out.println("กรุณาใส่ระบบนิเวศ (hot, rain)");
                    }
                }
                
                leravade.Place();
                leravade.Energy();
                
            }

        }
           
    }
    
}