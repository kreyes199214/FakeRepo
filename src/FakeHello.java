
public class FakeHello {
	
	  private String name;
	
	  public void setName(String n){
	    //set passed parameter as name
	    name = n;
	  }
	  public String getName(){
	    //return the set name
	    return name;
	  }
	  //main method will be called first when program is executed
	  public static void main(String args[]){
	    
	    FakeHello javaClassExample = new FakeHello();
	    //set name member of this object
	    javaClassExample.setName("Visitor");
	    // print the name
	    System.out.println("Hello Fake " + javaClassExample.getName());      
	  }
	}
	 