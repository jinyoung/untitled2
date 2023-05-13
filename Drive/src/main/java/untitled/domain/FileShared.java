package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class FileShared extends AbstractEvent {

    private string fileId;
    private string fileAccess;

    public FileShared(File aggregate) {
        super(aggregate);
    }

    public FileShared() {
        super();
    }
}
