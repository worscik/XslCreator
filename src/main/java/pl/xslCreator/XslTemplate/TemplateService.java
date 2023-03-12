package pl.xslCreator.XslTemplate;

import pl.xslCreator.FieldsDto.FieldsDto;
import pl.xslCreator.FieldsDto.MappingDto;
import pl.xslCreator.HeadersService.HeadersService;

public interface TemplateService {

    String buildStandardFile(FieldsDto fieldsDto, String headers,String lineToCut);

    //TODO CUSTOM
    String buildCustomFile();

}
