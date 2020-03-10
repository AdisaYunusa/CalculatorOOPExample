
package calpack;


public class CalMain {


    public static void main(String[] args) {
        
        Calculator cal = new Calculator();
        cal.input1 = 20;
        cal.input2 = 30;
        
        
        double ans;
        ans = cal.addition(60, 23);
        System.out.println(ans);
        
        ans = cal.subtraction(60, 23);
        System.out.println(ans);
    }
    
}
