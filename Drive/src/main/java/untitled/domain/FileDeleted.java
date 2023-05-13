package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class FileDeleted extends AbstractEvent {

    private string fileId;

    public FileDeleted(File aggregate) {
        super(aggregate);
    }

    public FileDeleted() {
        super();
    }
}
