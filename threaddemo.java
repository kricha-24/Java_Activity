package com.ltts;

public class threaddemo{  
    public static void main(String[] args) {  
      
        Runnable r1=new Runnable(){  
            public void run(){  
                System.out.println("thread1");  
            }  
        };  
        Thread t1=new Thread(r1);  
        t1.start();  

        Runnable r2=()->{  
        	System.out.println("threead2.");
        };  
        Thread t2=new Thread(r2);  
        t2.start();  
    }  
}  