package com.geeksforgeeks.gc;
/*
public class Test 
{ 
    public static void main(String[] args) throws InterruptedException 
    { 
        String str = new String("GeeksForGeeks"); 
        
       
              
        // making str eligible for gc 
        str = null;  
              
        // calling garbage collector 
        System.gc();  
              
        // waiting for gc to complete 
        Thread.sleep(1000);  
      
        System.out.println("end of main"); 
    } 
    
   
  
    @Override
    protected void finalize()  
    { 
       System.out.println("finalize method called"); 
    } 
} */


public class Test 
{ 
    public static void main(String[] args) throws InterruptedException 
    { 
        @SuppressWarnings("unused")
		Test t = new Test(); 
              
        // making t eligible for garbage collection 
        t = null;  
              
        // calling garbage collector 
        System.gc();  
              
        // waiting for gc to complete 
        //Thread.sleep(1000);  
      
        System.out.println("end main"); 
    } 
  
    @Override
    protected void finalize()  
    { 
        System.out.println("finalize method called"); 
        //System.out.println(10/0); 
    } 
      
} 


