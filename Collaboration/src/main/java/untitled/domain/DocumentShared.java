package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class DocumentShared extends AbstractEvent {

    private string documentId;
    private string documentAccess;

    public DocumentShared(Document aggregate) {
        super(aggregate);
    }

    public DocumentShared() {
        super();
    }
}
