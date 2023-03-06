package pl.xslCreator.WebController;

import jakarta.validation.Valid;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.xslCreator.FieldsDto.FieldsDto;
import pl.xslCreator.FieldsDto.MappingDto;
import pl.xslCreator.MappingController.MappingService;
import pl.xslCreator.PreapreFile.PrepareXsl;

@RestController
@Validated
public class HomePage {

    PrepareXsl prepareXsl;

    public HomePage(PrepareXsl prepareXsl) {
        this.prepareXsl = prepareXsl;
    }

    @PostMapping("/create")
    public String createXslFile(@Valid @RequestBody FieldsDto fieldsDto){
        MappingDto mappingDto = new MappingDto();
        mappingDto.setMapping("rrs/channel/item");
        return prepareXsl.preapreFile(fieldsDto, mappingDto);
    }




}
