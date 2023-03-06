package pl.xslCreator.MappingController;

import jakarta.validation.constraints.NotBlank;
import org.springframework.stereotype.Service;
import pl.xslCreator.FieldsDto.MappingDto;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Service("MappingService")
public class MappingService implements MappingController{

    private MappingDto mappingDto;


    @Override
    public boolean checkMapping(MappingDto mappingDto) {
       switch (mappingDto.getMapping()){
           case "rss/channel/item", "root/item", "products/product" -> {
               return true;
           }
       }
        return false;
    }
}
