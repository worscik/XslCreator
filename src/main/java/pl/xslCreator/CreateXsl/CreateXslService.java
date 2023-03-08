package pl.xslCreator.CreateXsl;

import org.springframework.stereotype.Service;
import pl.xslCreator.FieldsDto.FieldsDto;

@Service("CreateFile")
public class CreateXslService implements CreateXsl{

    @Override
    public String createStandardXsl(FieldsDto fieldsDto, boolean isMappingCorrect) {
        return "WORKING STANDARD";
    }

    @Override
    public String createCustomXsl(FieldsDto fieldsDto, boolean isMappingCorrect, boolean isCutLineCustom, boolean isMatchLineCustom) {
        return null;
    }
}
