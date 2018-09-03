import java.util.Scanner;
public class Principal {
    public static Scanner t = new Scanner(System.in);
    public static void main(String args[]){
        
        String help = "estado: mostra o estado do carro help\n"+
                      "embarcar: embarca 1 pessoa \n"+
                      "desembarcar: desembarca 1 pessoa \n"+
                      "abastecer: abastece com a quantidade de litros de quiser \n"+
                      "andar: faz o veiculo andar com certa quantidade de km \n"+
                      "sair: sai do programa";
        
        Carro c = new Carro(); 
        System.out.println("Olá viajante!");
        
        while(true){
            System.out.print("Digite um comando(help para mostrar os comandos): ");
            String comando = t.nextLine();
            if (comando.equals("sair")){
                System.out.println("Até a próxima!");
                break;
            }
            
            switch(comando){
                case "help":
                    System.out.println(help);
                    break;
                case "estado":
                    c.estado();
                    break;
                case"embarcar":
                    c.embarcar();
                    break;
                case"desembarcar":
                    c.desembarcar();
                    break;
                case"abastecer":
                    System.out.print("digite a quantidade de litros: ");
                    int l = t.nextInt();
                    c.abastecer(l);
                    break;
                case"andar":
                    System.out.print("digite a distancia da viagem: ");
                    double km = t.nextDouble();
                    c.andar(km);
                    break;
                default:
                    System.out.println("comando inválido");
               
            }
       }       
    }    
}
