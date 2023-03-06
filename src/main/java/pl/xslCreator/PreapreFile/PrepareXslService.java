package pl.xslCreator.PreapreFile;

import org.springframework.stereotype.Service;
import pl.xslCreator.FieldsDto.FieldsDto;
import pl.xslCreator.FieldsDto.MappingDto;
import pl.xslCreator.MappingController.MappingController;
import pl.xslCreator.MappingController.MappingService;

@Service("PrepareFile")
public class PrepareXslService implements PrepareXsl{

    MappingController mappingController;

    public PrepareXslService(MappingController mappingController) {
        this.mappingController = mappingController;
    }

    @Override
    public String preapreFile(FieldsDto xslFileDto, MappingDto mappingDto) {
        boolean isCorrectMapping = mappingController.checkMapping(mappingDto);
        return null;
    }
}
