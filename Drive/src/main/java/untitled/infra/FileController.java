package untitled.infra;

import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import untitled.domain.*;

@RestController
// @RequestMapping(value="/files")
@Transactional
public class FileController {

    @Autowired
    FileRepository fileRepository;

    @RequestMapping(
        value = "files/{id}//files/{file_id}",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public File deleteFile(
        @PathVariable(value = "id") String id,
        @RequestBody DeleteFileCommand deleteFileCommand,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /file/deleteFile  called #####");
        Optional<File> optionalFile = fileRepository.findById(id);

        optionalFile.orElseThrow(() -> new Exception("No Entity Found"));
        File file = optionalFile.get();
        file.deleteFile(deleteFileCommand);

        fileRepository.save(file);
        return file;
    }
}
