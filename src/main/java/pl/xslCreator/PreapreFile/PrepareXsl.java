package pl.xslCreator.PreapreFile;

import pl.xslCreator.FieldsDto.FieldsDto;
import pl.xslCreator.FieldsDto.MappingDto;
import pl.xslCreator.MappingController.MappingService;
import pl.xslCreator.XslResponse.CreateXslResponse;

public interface PrepareXsl {

    String preapreFile(FieldsDto xslFileDto, MappingDto mappingDto, CreateXslResponse response);

}
