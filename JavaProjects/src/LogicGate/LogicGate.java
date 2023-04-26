// Arrhat Maharjan - 3091663 - 14/10/2022

package LogicGate;

public class LogicGate {
    //attribute
    private boolean state;
    //constructor
    public LogicGate(boolean state){
        this.state=state;
    }
    //not method
    public void not(){
        if (!this.state){  //this.state= !this.state;
            this.state=true;
        }else{
            state=false;
        }
    }
    //state method
    public boolean state(){
        return this.state;
    }
    //set method
    public void set(){
        this.state=true; //set state to true
    }
    //negate method
    public void negate(){
        this.state=false; //set state to false
    }
}
