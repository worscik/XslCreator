package pl.xslCreator.PreapreFile;

import org.springframework.stereotype.Service;
import pl.xslCreator.CreateXsl.CreateXsl;
import pl.xslCreator.FieldsDto.FieldsDto;
import pl.xslCreator.FieldsDto.MappingDto;
import pl.xslCreator.MappingController.MappingController;
import pl.xslCreator.MappingController.MappingService;

@Service("PrepareFile")
public class PrepareXslService implements PrepareXsl{

    MappingController mappingController;
    CreateXsl createXsl;

    public PrepareXslService(MappingController mappingController, CreateXsl createXsl) {
        this.mappingController = mappingController;
        this.createXsl = createXsl;
    }

    @Override
    public String preapreFile(FieldsDto xslFileDto, MappingDto mappingDto) {
        boolean isMappingCorrect = mappingController.checkMapping(mappingDto);
        if(!isMappingCorrect){
            return "Mapping is not correct";
        }


        return createXsl.createStandardXsl(xslFileDto, true);
    }

    private boolean isCustomXsl(){
        return true;
    }
}
