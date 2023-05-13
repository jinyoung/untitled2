package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class DocumentCreated extends AbstractEvent {

    private string documentId;
    private string documentName;
    private string documentType;
    private string documentOwner;

    public DocumentCreated(Document aggregate) {
        super(aggregate);
    }

    public DocumentCreated() {
        super();
    }
}
