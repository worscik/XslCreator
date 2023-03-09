package pl.xslCreator.CreateXsl;

import pl.xslCreator.FieldsDto.FieldsDto;
import pl.xslCreator.XslResponse.CreateXslResponse;

public interface CreateXsl {

    String createStandardXsl(FieldsDto fieldsDto, boolean isMappingCorrect, CreateXslResponse response);

    String createCustomXsl(FieldsDto fieldsDto,boolean isMappingCorrect, boolean isCutLineCustom, boolean isMatchLineCustom, CreateXslResponse response);


}
