package com.java.JavaThreadConcept;


class MyTask1{
	void executeTask(){
		for(int doc=1;doc<=10;doc++){
			System.out.println("@@ Printing Document #"+doc+" - Printer2");
		}
	}
}


public class withOutThread 
{
	//main method represents main thread
    public static void main( String[] args )
    {
        // whatever we  write in here will be executed by main method
    	// main thread always executes the jobs in a sequence
    	
    	// Job1
    	System.out.println("==Application Started==");
    	
    	// Job2
    	MyTask1 task = new MyTask1();
    	task.executeTask();
    	
    	// Till Job2 is not finished, below written jobs are waiting and are not executed
    	// In case Job2 is a long running operation, i.e several documents are suppose to be printed
    	// In such a case OS/JVM shall give a message that app is not responding
    	// Some sluggish behaviour in app can be observed  -> App seems to hang
    	
    	// Job3
    	// Some Code to print the documents
    	for(int doc=1;doc<=10;doc++){
			System.out.println("^^ Printing Document #"+doc+" - Printer1");
		}
    	
    	// Job4
    	System.out.println("==Application Finished==");
    }
}
