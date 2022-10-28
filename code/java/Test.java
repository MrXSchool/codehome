package java;

public class Test {
    
    public void nhienlieu(){
        System.out.println("Nhien lieu");
    }

    public void tocdoxe(int tocdo){
        System.out.println("Toc do xe: " + tocdo);
    }
    
    public static void main(String[] args) {
        Test myObj = new Test();
        myObj.nhienlieu();
        myObj.tocdoxe(100);
    }
}

