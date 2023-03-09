package pl.xslCreator.CreateXsl;

import org.springframework.stereotype.Service;
import pl.xslCreator.FieldsDto.FieldsDto;
import pl.xslCreator.XslResponse.CreateXslResponse;

@Service("CreateFile")
public class CreateXslService implements CreateXsl{

    @Override
    public String createStandardXsl(FieldsDto fieldsDto, boolean isMappingCorrect, CreateXslResponse response) {
        response.setResponseCode("200");
        response.setSucces(true);
        return "WORKING STANDARD";
    }

    @Override
    public String createCustomXsl(FieldsDto fieldsDto, boolean isMappingCorrect, boolean isCutLineCustom, boolean isMatchLineCustom, CreateXslResponse response) {
        return null;
    }
}
