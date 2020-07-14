package intellect;

class A{  
private int data=40; 
public void msg3(){System.out.println("Hello");}
private void msg(){System.out.println("Hello java");
}
protected void msg1(){System.out.println("Hello");
}  
  


public static class P27c
{  
 public static void main(String args[])
 {  
   A obj=new A();  
   System.out.println(obj.data);//Compile Time Error  
   obj.msg();//Compile Time Error  
   obj.msg1();
   obj.msg3();
   }  
}
}