class Test { 
   
    static int factorial(int n) 
    { 
        int res = 1, i; 
        for (i = 2; i <= n; i++) 
            res *= i; 
        return res; 
    } 
  
    public static void main(String[] args) 
    { 
        int num = 10; 
        System.out.println("Factorial of " + num + " is "
                           + factorial(10)); 
    } 
}