package untitled.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class ShareVideoCommand {

    private string videoId;
    private string videoAccess;
}
