package pl.xslCreator.FieldsDto;

import jakarta.validation.constraints.NotBlank;
import org.springframework.stereotype.Repository;

@Repository
public class MappingDto {

    @NotBlank(message = "Mapping can not be empty")
    private String mapping;

    public String getMapping() {
        return mapping;
    }

    public void setMapping(String mapping) {
        this.mapping = mapping;
    }
}
