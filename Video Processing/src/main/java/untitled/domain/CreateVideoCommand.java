package untitled.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class CreateVideoCommand {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private string videoName;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private string videoType;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private int videoSize;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private string videoPath;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private string videoOwner;
}
