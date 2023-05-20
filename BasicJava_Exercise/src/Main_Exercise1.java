
public class Main_Exercise1 {
    public static void main(String[] args) {
        
        float vFloat = salarioBase;
        float vFloat = valorComissao;
        float vFloat = totalVendas;
        float vFloat = totalComissao;  
        float vFloat = totalSalario;        
        int vInt = carrosVendidos;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o salario base do vendedor:");
        float salarioBase= sc.nextFloat();
        
        System.out.println("Digite o valor da comissão:");
        float valorComissao = sc.nextFloat();
        
        System.out.println("Digite o total de vendas:");
        float totalVendas = sc.nextFloat();
        
        System.out.println("Digite o total de carros vendidos:");
        int carrosVendidos= sc.nextInt();
        
        totalComissao = carrosVendidos*valorComissao;
        totalComissao = totalComissao+(totalVendas*5/100);
        
        totalSalario = totalComissao+salarioBase;
        
        System.out.println("totalSalário: "+totalSalario);
  
    }
    
}
