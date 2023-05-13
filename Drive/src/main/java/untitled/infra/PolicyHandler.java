package untitled.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import untitled.config.kafka.KafkaProcessor;
import untitled.domain.*;

@Service
@Transactional
public class PolicyHandler {

    @Autowired
    FileRepository fileRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='FileShared'"
    )
    public void wheneverFileShared_FileAccessPolicy(
        @Payload FileShared fileShared
    ) {
        FileShared event = fileShared;
        System.out.println(
            "\n\n##### listener FileAccessPolicy : " + fileShared + "\n\n"
        );

        // Sample Logic //
        File.fileAccessPolicy(event);
    }
}
