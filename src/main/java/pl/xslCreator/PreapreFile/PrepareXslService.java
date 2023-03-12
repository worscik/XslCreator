package pl.xslCreator.PreapreFile;

import org.springframework.stereotype.Service;
import pl.xslCreator.CreateXsl.CreateXsl;
import pl.xslCreator.FieldsDto.FieldsDto;
import pl.xslCreator.FieldsDto.MappingDto;
import pl.xslCreator.HeadersService.Headers;
import pl.xslCreator.MappingController.MappingController;
import pl.xslCreator.MatchLineService.CutLine;
import pl.xslCreator.XslResponse.CreateXslResponse;

@Service("PrepareFile")
public class PrepareXslService implements PrepareXsl{

    MappingController mappingController;
    Headers headers;
    CreateXsl createXsl;

    CutLine cutLine;

    public PrepareXslService(MappingController mappingController, Headers headers, CreateXsl createXsl, CutLine cutLine) {
        this.mappingController = mappingController;
        this.headers = headers;
        this.createXsl = createXsl;
        this.cutLine = cutLine;
    }

    @Override
    public String preapreFile(FieldsDto xslFileDto, MappingDto mappingDto, CreateXslResponse response) {
        boolean isMappingCorrect = mappingController.checkMapping(mappingDto);

        if(!isMappingCorrect){
            response.setErrMessage("Mapping is not correct");
            return response.getErrMessage();
        }

        String headersToSet = headers.addHeaders(mappingDto.getMapping());
        String lineToCut = cutLine.setLineToCut(mappingDto.getMapping(), false);


        return createXsl.createStandardXsl(xslFileDto,
                            true,
                                            headersToSet,
                                            lineToCut,
                                            response);
    }

    private boolean isCustomXsl(){
        return true;
    }
}
