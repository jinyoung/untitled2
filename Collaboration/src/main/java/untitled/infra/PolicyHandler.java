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
    DocumentRepository documentRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='DocumentShared'"
    )
    public void wheneverDocumentShared_DocumentAccessPolicy(
        @Payload DocumentShared documentShared
    ) {
        DocumentShared event = documentShared;
        System.out.println(
            "\n\n##### listener DocumentAccessPolicy : " +
            documentShared +
            "\n\n"
        );

        // Sample Logic //
        Document.documentAccessPolicy(event);
    }
}
