package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class VideoShared extends AbstractEvent {

    private string videoId;
    private string videoAccess;

    public VideoShared(Video aggregate) {
        super(aggregate);
    }

    public VideoShared() {
        super();
    }
}
