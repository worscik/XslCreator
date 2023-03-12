    package pl.xslCreator.CreateXsl;

    import org.springframework.stereotype.Service;
    import pl.xslCreator.FieldsDto.FieldsDto;
    import pl.xslCreator.FieldsDto.MappingDto;
    import pl.xslCreator.HeadersService.Headers;
    import pl.xslCreator.HeadersService.HeadersService;
    import pl.xslCreator.XslResponse.CreateXslResponse;
    import pl.xslCreator.XslTemplate.TemplateService;

    @Service("CreateFile")
    public class CreateXslService implements CreateXsl{

        TemplateService templateService;

        public CreateXslService(TemplateService templateService) {
            this.templateService = templateService;
        }

        @Override
        public String createStandardXsl(FieldsDto fieldsDto, boolean isMappingCorrect, String headers, String lineToCut ,CreateXslResponse response) {
            String xslFile =  templateService.buildStandardFile(fieldsDto,headers,lineToCut);
            response.setResponseCode("200");
            response.setSucces(true);
            return xslFile;
        }

        @Override
        public String createCustomXsl(FieldsDto fieldsDto, boolean isMappingCorrect, boolean isCutLineCustom, boolean isMatchLineCustom) {
            return null;
        }
    }
