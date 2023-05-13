package untitled.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class CreateDocumentCommand {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private string documentName;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private string documentType;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private string documentOwner;
}
