package pl.xslCreator.FieldsDto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;

public class XslDto {

    @JsonProperty("Fields")
    @Valid
    private FieldsDto fieldsDto;
    @JsonProperty("Mapping")
    @Valid
    private MappingDto mappingDto;

    public FieldsDto getFieldsDto() {
        return fieldsDto;
    }

    public MappingDto getMappingDto() {
        return mappingDto;
    }
}
