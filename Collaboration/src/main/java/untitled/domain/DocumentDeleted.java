package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class DocumentDeleted extends AbstractEvent {

    private string documentId;

    public DocumentDeleted(Document aggregate) {
        super(aggregate);
    }

    public DocumentDeleted() {
        super();
    }
}
