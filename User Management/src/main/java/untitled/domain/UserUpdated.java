package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class UserUpdated extends AbstractEvent {

    private string userId;
    private string userName;
    private string userEmail;
    private string userPassword;
    private string userRole;

    public UserUpdated(User aggregate) {
        super(aggregate);
    }

    public UserUpdated() {
        super();
    }
}
