package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class UserCreated extends AbstractEvent {

    private string userId;
    private string userName;
    private string userEmail;
    private string userPassword;
    private string userRole;

    public UserCreated(User aggregate) {
        super(aggregate);
    }

    public UserCreated() {
        super();
    }
}
