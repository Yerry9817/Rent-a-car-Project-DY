package Proyecto1;



public abstract class Person {

   
    protected String DNI;
    protected String name;
    protected String lastName;
    

    

    public Person( String DNI, String name, String lastName) {
        
        this.DNI = DNI;
        this.name = name;
        this.lastName = lastName;
 
    }

    public Person() {
    }
   


    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



    

}
