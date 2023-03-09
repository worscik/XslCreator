package pl.xslCreator.PreapreFile;

import org.springframework.stereotype.Service;
import pl.xslCreator.CreateXsl.CreateXsl;
import pl.xslCreator.FieldsDto.FieldsDto;
import pl.xslCreator.FieldsDto.MappingDto;
import pl.xslCreator.MappingController.MappingController;
import pl.xslCreator.MappingController.MappingService;
import pl.xslCreator.XslResponse.CreateXslResponse;

@Service("PrepareFile")
public class PrepareXslService implements PrepareXsl{

    MappingController mappingController;
    CreateXsl createXsl;

    public PrepareXslService(MappingController mappingController, CreateXsl createXsl) {
        this.mappingController = mappingController;
        this.createXsl = createXsl;
    }

    @Override
    public String preapreFile(FieldsDto xslFileDto, MappingDto mappingDto, CreateXslResponse response) {
        boolean isMappingCorrect = mappingController.checkMapping(mappingDto);
        if(!isMappingCorrect){
            response.setErrMessage("Mapping is not correct");
            return response.getErrMessage();
        }
        return createXsl.createStandardXsl(xslFileDto, true, response);
    }

    private boolean isCustomXsl(){
        return true;
    }
}
