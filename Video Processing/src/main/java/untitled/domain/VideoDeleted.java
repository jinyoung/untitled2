package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class VideoDeleted extends AbstractEvent {

    private string videoId;

    public VideoDeleted(Video aggregate) {
        super(aggregate);
    }

    public VideoDeleted() {
        super();
    }
}
