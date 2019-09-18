package repositorio;

import modelo.Arquivo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IArquivoRepository extends PagingAndSortingRepository<Arquivo, Long> {

	Arquivo findFetchById(Long idArquivo);
	
	Page<Arquivo> findFetchByTiposDeArquivo(Long tipoArquivo, Pageable pageRequest);

	Page<Arquivo> findFetchByTiposDeArquivoInitialContaininigIgnoreCase(String initilas, Pageable pageRequest);
	
	Page<Arquivo> findFetchByImagemDeDocumento(byte[] imagemDeDocumento, Pageable pageRequest);

}
