import javax.persistence.EntityManager;
import java.util.Optional;

public class ProdutoDao {

    private EntityManager entityManager;

    public ProdutoDao() {
        this.entityManager = UtilJPA.getEntityManager();
    }

    public Optional<Produto> create(Produto produto){
        entityManager.getTransaction().begin();
        entityManager.persist(produto);
        entityManager.getTransaction().commit();
        entityManager.close();
        return Optional.of(produto);
    }

}
