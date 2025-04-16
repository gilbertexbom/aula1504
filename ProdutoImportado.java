public class ProdutoImportado extends Produto{
    //Atributos
    private String origem;
    private double aliquota;

    public void imprimirProdutoImportado(){
        super.imprimirProduto();
        System.out.println("Origem: " + origem);
        System.out.printf("Aliquota %.2f%%\n", aliquota);
    }

    @Override
    public double calcularPrecoVenda() {
        // TODO Auto-generated method stub
        if(super.getPreco() > 250){
            return super.calcularPrecoVenda() + (super.getPreco()*(this.aliquota/100));
        } else {
            return super.calcularPrecoVenda();
        }
    }

    public String getOrigem(){
        return this.origem;
    }

    public void setOrigem(String origem){
        this.origem = origem;
    }

    public double getAliquota(){
        return this.aliquota;
    }

    public void setAliquota(double aliquota){
        this.aliquota = aliquota;
    }

    ProdutoImportado(String origem, double aliquota){
        this.setOrigem(origem);
        this.setAliquota(aliquota); 
    }

    ProdutoImportado(){
    }

    ProdutoImportado(String descricao, double preco, double taxa, String origem, double aliquota){
        super.setDescricao(descricao);
        super.setPreco(preco);
        super.setTaxa(taxa);
        this.setOrigem(origem);
        this.setAliquota(aliquota);        
    }

}
