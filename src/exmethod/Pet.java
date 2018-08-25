package exmethod;

public class Pet {
    
    public int leg = 4;
    public int eat = 30;
    public String color = "ดำ";
    public String name = "สุนัข";
    
    public void PetDetail(){
        System.out.println(name);
        System.out.println("มีขา : "+leg);
        System.out.println("มีขนสี : "+color);
        
        VolumeEat();
    }
    
    public int VolumeEatUp(){
        eat = eat + 10;
        return eat;
    }
    
    public int VolumeEatDown(){
        eat = eat - 10;
        return eat;
    }
    
    public void VolumeEat(){
        System.out.println(name+" ตัวนี้มีความหิวในระดับ : "+eat+" %");
        
    }
    
    public void Walk(int m){
        for (int i = 0; i < m; i++) {
            VolumeEatDown();
        }
    }
    
}
