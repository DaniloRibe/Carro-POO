
public class Carro {
    double tanque;
    double tanqueMax = 10.0;
    int pessoas;
    double km;
    
    public void estado(){
        System.out.println("O carro está com o tanque com "+tanque+" litros, "+ pessoas+" pessoas, e "+km+" km rodados");
    }
    
    public void embarcar(){
        if(pessoas<2){
            pessoas++;
            System.out.println("pessoa embarcada");
        }else{
            System.out.println("número máximo de pessoas");
        }
    }
    
    public void desembarcar(){
        if(pessoas<=0){
            System.out.println("o carro já está vazio");
        }else{
            pessoas--;
            System.out.println("pessoa desembarcada");
        }
    }
    
    public void abastecer(int litros){
        if(litros<=tanqueMax && tanque < 10.0){
            tanque+=litros;
            if(tanque>10) tanque = 10;
            System.out.println("você abasteceu "+litros+" litros");
        }else{
            tanque+=litros;
            if (tanque>10) tanque = 10;
            System.out.println("o tanque já está cheio");
        }
    }
    
    public void andar(double km){
        if(pessoas>0){
            if(km<= (10*tanque)){
                this.km+=km;
                this.tanque-=(km/10);
                System.out.println("Boa viagem!");
            }else{
                System.out.println("Combustível insuficiente");
            }
        }else if(tanque==0.0 && pessoas==0){
            System.out.println("Não há pessoas nem combustível no veículo");
        }else{
            System.out.println("Não há pessoas no veículo");
        }
    }
    
}
