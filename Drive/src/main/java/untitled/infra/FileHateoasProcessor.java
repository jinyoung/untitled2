package untitled.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import untitled.domain.*;

@Component
public class FileHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<File>> {

    @Override
    public EntityModel<File> process(EntityModel<File> model) {
        model.add(
            Link
                .of(
                    model.getRequiredLink("self").getHref() +
                    "//files/{file_id}"
                )
                .withRel("/files/{file_id}")
        );

        return model;
    }
}
