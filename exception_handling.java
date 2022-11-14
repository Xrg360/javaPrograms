/**
 * Innerexception_handling
 */
import java.util.*;;
 class myexp extends Exception {
    String msg;
        myexp(String str){
            msg = str;
        }
        public String toString(){
           return("exception is " + msg);
        }
    
}
public class exception_handling {
    public static void main(String[] args) {
    }{try {
        throw new myexp("no way");
    } catch (myexp e) {
        System.out.println(e);
    }}
}
