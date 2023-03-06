package pl.xslCreator.PreapreFile;

import pl.xslCreator.FieldsDto.FieldsDto;
import pl.xslCreator.FieldsDto.MappingDto;
import pl.xslCreator.MappingController.MappingService;

public interface PrepareXsl {

    String preapreFile(FieldsDto xslFileDto, MappingDto mappingDto);

}
