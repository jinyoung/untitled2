package untitled.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import untitled.CollaborationApplication;
import untitled.domain.DocumentCreated;
import untitled.domain.DocumentDeleted;
import untitled.domain.DocumentShared;

@Entity
@Table(name = "Document_table")
@Data
public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private string documentId;

    private string documentName;

    private string documentType;

    private string documentOwner;

    private string documentAccess;

    @PostPersist
    public void onPostPersist() {
        DocumentCreated documentCreated = new DocumentCreated(this);
        documentCreated.publishAfterCommit();

        DocumentDeleted documentDeleted = new DocumentDeleted(this);
        documentDeleted.publishAfterCommit();

        DocumentShared documentShared = new DocumentShared(this);
        documentShared.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static DocumentRepository repository() {
        DocumentRepository documentRepository = CollaborationApplication.applicationContext.getBean(
            DocumentRepository.class
        );
        return documentRepository;
    }

    public static void documentAccessPolicy(DocumentShared documentShared) {
        /** Example 1:  new item 
        Document document = new Document();
        repository().save(document);

        */

        /** Example 2:  finding and process
        
        repository().findById(documentShared.get???()).ifPresent(document->{
            
            document // do something
            repository().save(document);


         });
        */

    }
}
