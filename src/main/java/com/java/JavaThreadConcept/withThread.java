package com.java.JavaThreadConcept;

// MyTask2 is-a Thread
class MyTask2 extends Thread{
	@Override
	public void run(){
		for(int doc=1;doc<=10;doc++){
			System.out.println("@@ Printing Document #"+doc+" - Printer2");
		}
	}
}


public class withThread 
{
	//main method represents main thread
    public static void main( String[] args )
    {
        // whatever we  write in here will be executed by main method
    	// main thread always executes the jobs in a sequence
    	
    	// Job1
    	System.out.println("==Application Started==");
    	
    	// Job2
    	MyTask2 task = new MyTask2();
    	task.start(); // -> start shall internally execute run method

    	// Now, main and MyTask2 are executing both parallely
    	
    	// Job3
    	// Some Code to print the documents
    	for(int doc=1;doc<=10;doc++){
			System.out.println("^^ Printing Document #"+doc+" - Printer1");
		}
    	
    	// Job4
    	System.out.println("==Application Finished==");
    }
}
