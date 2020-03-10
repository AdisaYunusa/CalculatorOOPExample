
package calpack;


class Calculator {
    
    double input1, input2,answer;
    
    
    double addition(double x, double y)
    {
        input1 = x;
        input2 = y;
        answer = input1 + input2;
        return answer;
    }
        
    void addition()
    {
        answer = input1 + input2;
        System.out.println(answer);
    }
        
    double subtraction(double x, double y)
    {
        input1 = x;
        input2 = y;
        answer = input1 - input2;
        return answer;
    }
}
    
    
//    void addition()
//    {
//        answer = input1 + input2;
//        System.out.println(answer);
//    }
//    
//        void subtraction()
//    {
//        answer = input1 - input2;
//        System.out.println(answer);
//    }

