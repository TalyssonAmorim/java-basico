package edu.talysson.segundasemana;

public class MyClass {
    
    public double somar(int num1, int num2){
        return num1 + num2;
    }
    public void imprimir(String texto){

    };
    public double dividir(int dividendo, int divisor) throws Exception{
        if(divisor == 0){
            throw new Exception("Divisor não pode ser zero");//tratando excessão
        }
        return dividendo / divisor;
    }
    private void metodoPrivado (){};
    
}
