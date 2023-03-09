package pl.xslCreator.PreapreFile;

import org.springframework.stereotype.Service;
import pl.xslCreator.CreateXsl.CreateXsl;
import pl.xslCreator.FieldsDto.FieldsDto;
import pl.xslCreator.FieldsDto.MappingDto;
import pl.xslCreator.HeadersService.Headers;
import pl.xslCreator.MappingController.MappingController;
import pl.xslCreator.MappingController.MappingService;
import pl.xslCreator.XslResponse.CreateXslResponse;

@Service("PrepareFile")
public class PrepareXslService implements PrepareXsl{

    MappingController mappingController;
    Headers headers;
    CreateXsl createXsl;

    public PrepareXslService(MappingController mappingController, Headers headers, CreateXsl createXsl) {
        this.mappingController = mappingController;
        this.headers = headers;
        this.createXsl = createXsl;
    }

    @Override
    public String preapreFile(FieldsDto xslFileDto, MappingDto mappingDto, CreateXslResponse response) {
        boolean isMappingCorrect = mappingController.checkMapping(mappingDto);
        if(!isMappingCorrect){
            response.setErrMessage("Mapping is not correct");
            return response.getErrMessage();
        }
        String headersToSet = headers.addHeaders(mappingDto.getMapping());
        return createXsl.createStandardXsl(xslFileDto,true, headersToSet ,response);
    }

    private boolean isCustomXsl(){
        return true;
    }
}
