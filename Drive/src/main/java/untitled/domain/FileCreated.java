package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class FileCreated extends AbstractEvent {

    private string fileId;
    private string fileName;
    private string fileType;
    private int fileSize;
    private string filePath;
    private string fileOwner;

    public FileCreated(File aggregate) {
        super(aggregate);
    }

    public FileCreated() {
        super();
    }
}
