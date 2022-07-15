package Abstaction;
/* its hiding the internal implementation
 * abstract class 							& Interface is both methods used for abstraction 
 * 0-100% can achieve(abstraction)  		& 100% in interface
 * we can't create OBJ 				  		& we can't create  OBJ
 * 
 * one class to Interface use Implements 
 * one class to other by Extends
 * one Interface to other by Extends
 * 
 * */

abstract public class Abstract { // use abstract while using abstract method
// not  necessary all method should be abstract
//abstract void start(); // without block called Abstract
//abstract void start1();
//abstract void start2();
//abstract void start3();	// called 100% abstract

//void test() {		//concrete method
//			with concrete its 50% abstract
//}

	abstract void start();

	abstract void seat();
	

	
}
