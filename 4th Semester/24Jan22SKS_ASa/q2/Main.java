
public class Main {
    public static void main(String [] args){
        System.out.println("The length of args is = "+args.length);
        System.out.println("The parameters are:-");
        for(int i=0; i<args.length; i++){
            System.out.println(i + "th" + "entry = " + args[i]);
        }
    }
}