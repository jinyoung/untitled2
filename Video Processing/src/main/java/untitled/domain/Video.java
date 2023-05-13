package untitled.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import untitled.VideoProcessingApplication;
import untitled.domain.VideoCreated;
import untitled.domain.VideoDeleted;
import untitled.domain.VideoShared;

@Entity
@Table(name = "Video_table")
@Data
public class Video {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private string videoId;

    private string videoName;

    private string videoType;

    private int videoSize;

    private string videoPath;

    private string videoOwner;

    private string videoAccess;

    @PostPersist
    public void onPostPersist() {
        VideoCreated videoCreated = new VideoCreated(this);
        videoCreated.publishAfterCommit();

        VideoDeleted videoDeleted = new VideoDeleted(this);
        videoDeleted.publishAfterCommit();

        VideoShared videoShared = new VideoShared(this);
        videoShared.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static VideoRepository repository() {
        VideoRepository videoRepository = VideoProcessingApplication.applicationContext.getBean(
            VideoRepository.class
        );
        return videoRepository;
    }

    public static void videoAccessPolicy(VideoShared videoShared) {
        /** Example 1:  new item 
        Video video = new Video();
        repository().save(video);

        */

        /** Example 2:  finding and process
        
        repository().findById(videoShared.get???()).ifPresent(video->{
            
            video // do something
            repository().save(video);


         });
        */

    }
}
