public class TesteProdutoImportado {

    public static void main(String[] args) {
        //Criação e instância do objeto Produto Importado
        ProdutoImportado produtoImportado = new ProdutoImportado();

        //Construção do objeto
        produtoImportado.setDescricao("Café");
        produtoImportado.setPreco(500.0);
        produtoImportado.setTaxa(20.0);
        //produtoImportado.origem = "Colômbia"; obsoleto
        //produtoImportado.aliquota = 60.0;
        produtoImportado.setOrigem("Colômbia");
        produtoImportado.setAliquota(60.0);

        //Imprimindo o produto importado
        System.out.println("\n\t\t\t -- Produto Importado --\n");
        produtoImportado.imprimirProdutoImportado();

        //Criação e instância de outro produto importado
        ProdutoImportado outroProdutoImportado = new ProdutoImportado("Sabão", 30.0, 20.0, "Jalapão", 100.0);

        //Imprimindo outro produto importado
        System.out.println("\n\t\t\t -- Outro Produto Importado --\n");
        outroProdutoImportado.imprimirProdutoImportado();


    }
    
}
