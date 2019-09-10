import java.io.*;
import java.util.*; 

public class Dog extends Animal{
	public Dog(String n, Integer l){
		super(n, l);
	}
	public String toString(){
		return(name + ": " + legs);
	}

}
