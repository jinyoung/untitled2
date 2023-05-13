package untitled.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class CreateUserCommand {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private string userName;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private string userEmail;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private string userPassword;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private string userRole;
}
