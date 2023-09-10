import java.io.*;
import java.util.*;


public class prefixExpressionCalculator {
     static Boolean Operand(char c){        
        
        if(c>=48 && c<=57)               

            return true;               
        else
            return false;            

    }
    static double Prefix(String expression){
        
        Stack<Double> Stack = new Stack<>();   
        
        for(int j=expression.length()-1;j>=0;j--){   
            
            if(Operand(expression.charAt(j))) 
                
                Stack.push((double)(expression.charAt(j)-48));   
            else{
                if(expression.charAt(j)==' '){     

                    continue;         

                }

                else{               

                    double o1 = Stack.peek();

                    Stack.pop();

                    double o2 = Stack.peek();

                    Stack.pop();

                    switch(expression.charAt(j)){          

                        case '+':                  

                            Stack.push(o1 + o2);        

                            break;

                        case '-':                  

                            Stack.push(o1 - o2);    

                            break;

                        case '*':                  

                            Stack.push(o1 * o2);   

                            break;

                        case '/':                   

                            Stack.push(o1 / o2);    

                            break;

                        case '%':                   

                            Stack.push(o1%o2);       

                            break;
                    }

                }

            }

        }

        return Stack.peek();       
    }

    
    public static void main(String[] args) {
           Scanner key= new Scanner(System.in);         

        String expression;                                 
        double b;            
        System.out.println("Enter an expression in prefix form (operator comes first) ");
        expression = key.nextLine();                             
        b = (Prefix(expression));   
        System.out.println(b); 
    }   
    } 
