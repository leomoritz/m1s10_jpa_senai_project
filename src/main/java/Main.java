public class Main {

    public static void main(String[] args) {

        ProdutoDao produtoDao = new ProdutoDao();
        Produto produto = new Produto("Bíblia King James",
                "Bíblia de couro preta letras ulta grandes", 97.90);

        if(produtoDao.create(produto).isPresent()){
            System.out.println("Produto " + produto.getNome() + " cadastrado com sucesso!");
        } else {
            System.out.println("Não foi possível cadastrar o produto " + produto.getNome());
        }

    }
}
