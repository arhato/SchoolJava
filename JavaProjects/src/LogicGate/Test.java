// Arrhat Maharjan - 3091663 - 14/10/2022

package LogicGate;

public class Test {
    public static void main(String[] args){

        LogicGate logic1=new LogicGate(true); //new instance with true/on state

        //printing state of the logic gate
        if (!logic1.state()){
            System.out.println("The gate is off");
        }else{
            System.out.println("The gate in on");
        }

        //checking not() method
        logic1.not();
        if (!logic1.state()){
            System.out.println("After not the gate is off");
        }else{
            System.out.println("After not the gate in on");
        }

        //checking set() method
        logic1.set();
        if (!logic1.state()){
            System.out.println("After set the gate is off");
        }else{
            System.out.println("After set the gate in on");
        }

        //checking negate() method
        logic1.negate();
        if (!logic1.state()){
            System.out.println("After negate the gate is off");
        }else{
            System.out.println("After negate the gate in on");
        }
    }
}
