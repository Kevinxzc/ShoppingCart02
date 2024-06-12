public class ShoppingCart02 {
    public static void main(String[] args) {
        String custName = "Alex ";
        String itemDesc = "camisa";
        String message = custName+"quer comprar um "+itemDesc;
        
        
        
        double doublepreço, doubleimposto; 
        doublepreço = 15.00;     //Valor da camisa 
        doubleimposto = 10.78;  //Valor do imposto da camisa 
                
                
        int intqntd;
        intqntd = 1;           //Quantidade de camisa 
        
        
        System.out.println(message);
        
        String totalPrice = "O custo total com imposto vai ser: $" + ((doublepreço+doubleimposto) * intqntd);
        System.out.println(totalPrice);
        
        //Total com o imposto ja calculado 
    }    
}
