package Proyecto1;

import java.util.List;

public class SellingAgent extends Person {

    private String agentCode;
    private int salesQuantity;

    public SellingAgent(String agentCode, int salesQuantity, String DNI, String name, String lastName) {
        super(DNI, name, lastName);
        this.agentCode = agentCode;
        this.salesQuantity = salesQuantity;
    }

    

    public SellingAgent() {
    }

    

    public void insertAgent(List<SellingAgent> Agents){
        setAgentCode("AG-782");
        setDNI("2051-A");
        setName("Jerry");
        setLastName("Rodriguez");
        Agents.add(new SellingAgent(getAgentCode(), getSalesQuantity(), getDNI(), getName(), getLastName()));
        setAgentCode("AG-523");
        setDNI("1301-A");
        setName("Esteban");
        setLastName("Mayorga");
        Agents.add(new SellingAgent(getAgentCode(), getSalesQuantity(), getDNI(), getName(), getLastName()));
        setAgentCode("AG-123");
        setDNI("091-A");
        setName("Daniel");
        setLastName("Obando");
        Agents.add(new SellingAgent(getAgentCode(), getSalesQuantity(), getDNI(), getName(), getLastName()));
        
    }
    

    public String getAgentCode() {
        return agentCode;
    }

    public void setAgentCode(String agentCode) {
        this.agentCode = agentCode;
    }

    public int getSalesQuantity() {
        return salesQuantity;
    }

    public void setSalesQuantity(int salesQuantity) {
        this.salesQuantity = salesQuantity;
    }

   
    
    
    public void agregarAgentes(String codigoAgente, String cantidadVentas){
        
    }
    
    public void lookAgends(List<SellingAgent> agents){
        for(int i =0; i<agents.size(); i++){
            System.out.println("Agend Code: "+agents.get(i).getAgentCode());
            System.out.println("DNI: "+agents.get(i).getDNI());
            System.out.println("Name: "+agents.get(i).getName());
            System.out.println("Last Name: "+agents.get(i).getLastName());
            
        }
    }

}



