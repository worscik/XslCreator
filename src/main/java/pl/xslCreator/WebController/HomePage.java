package pl.xslCreator.WebController;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.xslCreator.CreateXsl.CreateXslService;
import pl.xslCreator.FieldsDto.XslDto;
import pl.xslCreator.PreapreFile.PrepareXsl;
import pl.xslCreator.XslResponse.CreateXslResponse;
import pl.xslCreator.XslResponse.ResponseCode;

@RestController
@Validated
public class HomePage {

    PrepareXsl prepareXsl;


    public HomePage(PrepareXsl prepareXsl) {
        this.prepareXsl = prepareXsl;
    }

    @PostMapping("/create")
    public CreateXslResponse createXslFile(@Valid @RequestBody XslDto xslDto){
        CreateXslResponse response = new CreateXslResponse();
        String xslFile = prepareXsl.preapreFile(xslDto.getFieldsDto(),xslDto.getMappingDto(), response);
        if(response.isSucces()){
            return new CreateXslResponse(response.getResponseCode(), xslFile, response.isSucces());
        }
        return new CreateXslResponse(ResponseCode.ERROR.getDesc(),false,response.getErrMessage());
    }




}
