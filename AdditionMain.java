class Addition{
    int add(int x,int y){
        return x+y;
    }
    int add(int x,int y,int z){
        return x+y+z;
    }
    
    float add(float x,float y){
        return x+y;
    }
    
    double add(double x,double y){
        return x+y;
    }
}
public class AdditionMain{
    public static void main(String args[]){
        Addition a=new Addition();
        System.out.println("Sum of 5,10 is "+a.add(5,10));
        System.out.println("Sum of 20,30,50 is "+a.add(20,30,50));
        System.out.println("Sum of 5.5,7.7 is "+a.add(5.5,7.7));
    }
}