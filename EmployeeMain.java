import java.util.*;
import java.util.Scanner;

class EmployeeMain{  
public static void main(String[] args){
	Employee E = new Employee();
    E.setName("Manisha");
	E.setAddress("Mysore");
	E.setMobile("6394315387");
	
	System.out.println(E.getName()+" "+E.getAddress()+" "+E.getMobile());
}}