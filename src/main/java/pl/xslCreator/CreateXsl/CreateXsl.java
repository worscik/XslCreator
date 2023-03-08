package pl.xslCreator.CreateXsl;

import pl.xslCreator.FieldsDto.FieldsDto;

public interface CreateXsl {

    String createStandardXsl(FieldsDto fieldsDto, boolean isMappingCorrect);

    String createCustomXsl(FieldsDto fieldsDto,boolean isMappingCorrect, boolean isCutLineCustom, boolean isMatchLineCustom);


}
