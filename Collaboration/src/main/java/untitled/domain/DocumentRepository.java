package untitled.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import untitled.domain.*;

@RepositoryRestResource(collectionResourceRel = "documents", path = "documents")
public interface DocumentRepository
    extends PagingAndSortingRepository<Document, string> {}
