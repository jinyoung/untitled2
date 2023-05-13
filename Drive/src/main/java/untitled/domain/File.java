package untitled.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import untitled.DriveApplication;
import untitled.domain.FileCreated;
import untitled.domain.FileShared;

@Entity
@Table(name = "File_table")
@Data
public class File {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String fileId;

    private String fileName;

    private String fileType;

    private Integer fileSize;

    private String filePath;

    private String fileOwner;

    private String fileAccess;

    @PostPersist
    public void onPostPersist() {
        FileCreated fileCreated = new FileCreated(this);
        fileCreated.publishAfterCommit();

        FileShared fileShared = new FileShared(this);
        fileShared.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static FileRepository repository() {
        FileRepository fileRepository = DriveApplication.applicationContext.getBean(
            FileRepository.class
        );
        return fileRepository;
    }

    public void deleteFile(DeleteFileCommand deleteFileCommand) {
        FileDeleted fileDeleted = new FileDeleted(this);
        fileDeleted.publishAfterCommit();
    }

    public static void fileAccessPolicy(FileShared fileShared) {
        /** Example 1:  new item 
        File file = new File();
        repository().save(file);

        */

        /** Example 2:  finding and process
        
        repository().findById(fileShared.get???()).ifPresent(file->{
            
            file // do something
            repository().save(file);


         });
        */

    }
}
