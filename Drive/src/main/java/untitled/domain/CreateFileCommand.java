package untitled.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class CreateFileCommand {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private string fileName;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private string fileType;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private int fileSize;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private string filePath;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private string fileOwner;
}
