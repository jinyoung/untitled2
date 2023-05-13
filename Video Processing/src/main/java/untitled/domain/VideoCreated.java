package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class VideoCreated extends AbstractEvent {

    private string videoId;
    private string videoName;
    private string videoType;
    private int videoSize;
    private string videoPath;
    private string videoOwner;

    public VideoCreated(Video aggregate) {
        super(aggregate);
    }

    public VideoCreated() {
        super();
    }
}
