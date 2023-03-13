package pl.xslCreator.XslTemplate;

import org.springframework.stereotype.Service;
import pl.xslCreator.FieldsDto.FieldsDto;

@Service("StandardTemplate")
public class StandardXslTemplate extends LineBuilder implements TemplateService{

    @Override
    public String buildStandardFile(FieldsDto fieldsDto, String headers, String lineToCut) {
        StringBuilder xslFile = new StringBuilder();
//
//        //TODO HEADERS
        xslFile.append(headers);
        xslFile.append(VARIABLE);
        xslFile.append(lineToCut);

//        xslFile.append(xmlDto.getMatchLineService().standerdMatchFields(xmlDto.getMappingController().getMapping()) + NEWLINE ); // MATCH
        xslFile.append("<!-- ustawienie zmiennych -->" + NEWLINE);

        xslFile.append("<!--EXTERNAL_ID-->" + NEWLINE);
        xslFile.append("<xsl:choose>" + NEWLINE);
        xslFile.append("<xsl:when test=\"string-length(" + fieldsDto.getId() + ")\">" + " " + " " + NEWLINE);
        xslFile.append("<xsl:value-of select=\"normalize-space(" + fieldsDto.getId() + ")\"/>" + NEWLINE);
        xslFile.append(STRINGPATH + NEWLINE);

        xslFile.append("<!--NAME-->" + NEWLINE);
        xslFile.append(CHOOSE + NEWLINE);
        xslFile.append("<xsl:when test=\"string-length(" + fieldsDto.getName() + ")\">" + NEWLINE);
        xslFile.append("<xsl:value-of select=\"substring(normalize-space(" + fieldsDto.getName() + "),0,100)\"/>" + NEWLINE);
        xslFile.append(STRINGPATH + NEWLINE);

        xslFile.append("<!--NEW_PRODUCT-->" + NEWLINE);
        xslFile.append(CHOOSE + NEWLINE);
        xslFile.append("<xsl:when test=\""+ fieldsDto.getNewProductValue() +"='" + fieldsDto.getNewProductKey() +"'"+ "\">" + NEWLINE);
        xslFile.append(NUMERICPATH + NEWLINE) ;

        xslFile.append("<!--AVAILABLE-->" + NEWLINE);
        xslFile.append(CHOOSE + NEWLINE);
        xslFile.append("<xsl:when test=\""+ fieldsDto.getAvailableKey() +"='" + fieldsDto.getAvailableValue() +"'"+ "\">" + NEWLINE);
        xslFile.append(NUMERICPATH + NEWLINE) ;

        xslFile.append("<!--BESTSELLER-->" + NEWLINE);
        xslFile.append(CHOOSE + NEWLINE);
        xslFile.append("<xsl:when test=\""+ fieldsDto.getBestsellerKey() +"='" + fieldsDto.getBestsellerValue() +"'"+ "\">" + NEWLINE);
        xslFile.append(NUMERICPATH + NEWLINE);

        xslFile.append("<!--BRAND-->" + NEWLINE);
        xslFile.append(CHOOSE + NEWLINE);
        xslFile.append("<xsl:when test=\"string-length(" + fieldsDto.getBrand() + ")\">" + NEWLINE);
        xslFile.append("<xsl:value-of select=\"substring(normalize-space(" + fieldsDto.getBrand() + "),0,512)\"/>" + NEWLINE);
        xslFile.append(STRINGPATH + NEWLINE);

        xslFile.append(" <!--CATEGORIES-->" + NEWLINE);
        xslFile.append(CHOOSE + NEWLINE);
        xslFile.append("<xsl:when test=\"string-length(" + fieldsDto.getCategories() + ")\">" + NEWLINE);
        xslFile.append("<xsl:value-of select=\"substring(normalize-space(" + fieldsDto.getCategories() + "),0,512)\"/>" + NEWLINE);
        xslFile.append(STRINGPATH + NEWLINE);

        xslFile.append("<!--CATEGORY_MAIN-->" + NEWLINE);
        xslFile.append(CHOOSE + NEWLINE);
        xslFile.append("<xsl:when test=\"string-length(" + fieldsDto.getCategoryMain() + ")\">" + NEWLINE);
        xslFile.append("<xsl:value-of select=\"substring(normalize-space(" + fieldsDto.getCategoryMain() + "),0,200)\"/>" + NEWLINE);
        xslFile.append(STRINGPATH + NEWLINE);

        xslFile.append("<!--DESCRIPTION-->" + NEWLINE);
        xslFile.append(CHOOSE + NEWLINE);
        xslFile.append("<xsl:when test=\"string-length(" + fieldsDto.getDescription() + ")\">" + NEWLINE); // DESCRIPTION
        xslFile.append("<xsl:value-of select=\"substring(normalize-space(" + fieldsDto.getDescription() + "),0,1024)\"/>" + NEWLINE); // DESCRIPTION
        xslFile.append(STRINGPATH + NEWLINE);

        xslFile.append("<!--DETAIL_1-->" + NEWLINE);
        xslFile.append(CHOOSE + NEWLINE);
        xslFile.append("<xsl:when test=\"string-length(" + fieldsDto.getDetail1() + ")\">" + NEWLINE); // DETAIL1
        xslFile.append("<xsl:value-of select=\"substring(normalize-space(" +fieldsDto.getDetail1() + "),0,512)\"/>" + NEWLINE); // DETAIL1
        xslFile.append(STRINGPATH + NEWLINE);

        xslFile.append("<!--DETAIL_2-->" + NEWLINE);
        xslFile.append(CHOOSE + NEWLINE);
        xslFile.append("<xsl:when test=\"string-length(" + fieldsDto.getDetail2() + ")\">" + NEWLINE); // DETAIL2
        xslFile.append("<xsl:value-of select=\"substring(normalize-space(" + fieldsDto.getDetail2() + "),0,512)\"/>" + NEWLINE); // DETAIL2
        xslFile.append(STRINGPATH + NEWLINE);

        xslFile.append("<!--DETAIL_3-->" + NEWLINE);
        xslFile.append(CHOOSE + NEWLINE);
        xslFile.append("<xsl:when test=\"string-length(" + fieldsDto.getDetail3() + ")\">" + NEWLINE); // DETAIL3
        xslFile.append("<xsl:value-of select=\"substring(normalize-space(" + fieldsDto.getDetail3() + "),0,512)\"/>" + NEWLINE); // DETAIL3
        xslFile.append(STRINGPATH + NEWLINE);

        xslFile.append("<!--DETAIL_4-->" + NEWLINE);
        xslFile.append(CHOOSE + NEWLINE);
        xslFile.append("<xsl:when test=\"string-length(" + fieldsDto.getDetail4() + ")\">" + NEWLINE); // DETAIL4
        xslFile.append("<xsl:value-of select=\"substring(normalize-space(" + fieldsDto.getDetail4() + "),0,512)\"/>" + NEWLINE); // DETAIL4
        xslFile.append(STRINGPATH + NEWLINE);

        xslFile.append("<!--DETAIL_5-->" + NEWLINE);
        xslFile.append(CHOOSE + NEWLINE);
        xslFile.append("<xsl:when test=\"string-length(" + fieldsDto.getDetail5() + ")\">" + NEWLINE); // DETAIL5
        xslFile.append("<xsl:value-of select=\"substring(normalize-space(" + fieldsDto.getDetail5() + "),0,512)\"/>" + NEWLINE); // DETAIL5
        xslFile.append(STRINGPATH + NEWLINE);

        xslFile.append("<!--MANUFACTURER-->" + NEWLINE);
        xslFile.append(CHOOSE + NEWLINE);
        xslFile.append("<xsl:when test=\"string-length(" + fieldsDto.getManufacturer() + ")\">" + NEWLINE); // MANUFACTURER
        xslFile.append("<xsl:value-of select=\"substring(normalize-space(" + fieldsDto.getManufacturer() + "),0,100)\"/>" + NEWLINE); // MANUFACTURER
        xslFile.append(STRINGPATH + NEWLINE);

        xslFile.append("<!--PRICE-->" + NEWLINE);
        xslFile.append(CHOOSE + NEWLINE);
        xslFile.append("<xsl:when test=\"string-length("+  fieldsDto.getPrice() +")\">" + NEWLINE);
        xslFile.append("<xsl:value-of select=\"normalize-space(translate(" + fieldsDto.getPrice() + ",'" + fieldsDto.getCurrency() +"', ''))\"/>" + NEWLINE);
        xslFile.append(STRINGPATH + NEWLINE);

        xslFile.append("<!--PRICE_PROMO-->" + NEWLINE);
        xslFile.append(CHOOSE + NEWLINE);
        xslFile.append("<xsl:when test=\"string-length("+ fieldsDto.getPricePromo()  +")\">" + NEWLINE);
        xslFile.append("<xsl:value-of select=\"normalize-space(translate(" + fieldsDto.getPricePromo() + ",'" + fieldsDto.getCurrency() +"', ''))\"/>" + NEWLINE);
        xslFile.append(STRINGPATH + NEWLINE);

        xslFile.append("<!--QUANTITY-->" + NEWLINE);
        xslFile.append(CHOOSE + NEWLINE);
        xslFile.append("<xsl:when test=\"string-length(" + fieldsDto.getQuantity() + ")\">" + NEWLINE);
        xslFile.append("<xsl:value-of select=\"normalize-space(" + fieldsDto.getQuantity() + ")\"/>" + NEWLINE);
        xslFile.append(STRINGPATH + NEWLINE);

        xslFile.append("<!--URL_PRODUCT-->" + NEWLINE);
        xslFile.append(CHOOSE + NEWLINE);
        xslFile.append("<xsl:when test=\"string-length(" + fieldsDto.getUrlProduct() + ")\">" + NEWLINE);
        xslFile.append("<xsl:value-of select=\"substring(normalize-space(" + fieldsDto.getUrlProduct() + "),0,512)\"/>" + NEWLINE);
        xslFile.append(STRINGPATH + NEWLINE);

        xslFile.append("<!--URL_IMG-->" + NEWLINE);
        xslFile.append(CHOOSE + NEWLINE);
        xslFile.append("<xsl:when test=\"string-length(" + fieldsDto.getUrlImg() + ")\">" + NEWLINE); // URL_IMG
        xslFile.append("<xsl:value-of select=\"substring(normalize-space(" + fieldsDto.getUrlImg() + "),0,512)\"/>" + NEWLINE); // URL_IMG
        xslFile.append(STRINGPATH + NEWLINE);

        xslFile.append("<!--GENDER-->" + NEWLINE);
        xslFile.append(CHOOSE + NEWLINE);
        xslFile.append("<xsl:when test=\""+ fieldsDto.getGenderValue() +"='" + fieldsDto.getGenderKey() +"'"+ "\">" + NEWLINE);
        xslFile.append(NUMERICPATH + NEWLINE) ;

        xslFile.append("<!--URL_CATEGORY-->" + NEWLINE);
        xslFile.append(CHOOSE + NEWLINE);
        xslFile.append("<xsl:when test=\"string-length(" + fieldsDto.getUrlCategory() + ")\">" + NEWLINE); // URL_CATEGORY
        xslFile.append("<xsl:value-of select=\"normalize-space(" + fieldsDto.getUrlCategory() + ")\"/>" + NEWLINE); // URL_CATEGORY
        xslFile.append(STRINGPATH + NEWLINE);

        xslFile.append("<!--URL_CATEGORY_MARK-->" + NEWLINE);
        xslFile.append(CHOOSE + NEWLINE);
        xslFile.append("<xsl:when test=\"string-length(" + fieldsDto.getUrlCategoryMark() + ")\">" + NEWLINE); // URL_CATEGORY_MARK
        xslFile.append("<xsl:value-of select=\"substring(normalize-space(" + fieldsDto.getUrlCategoryMark() + "),0,512)\"/>" + NEWLINE); // URL_CATEGORY_MARK
        xslFile.append(STRINGPATH + NEWLINE);

        xslFile.append("<!--POPULARITY-->" + NEWLINE);
        xslFile.append(CHOOSE + NEWLINE);
        xslFile.append("<xsl:when test=\"string-length(" + fieldsDto.getPopularity() + ")\">" + NEWLINE); // POPULARITY
        xslFile.append("<xsl:value-of select=\"normalize-space(" + fieldsDto.getPopularity() + ")\"/>" + NEWLINE); // POPULARITY
        xslFile.append(STRINGPATH + NEWLINE);

        xslFile.append("<!--SEASON-->" + NEWLINE);
        xslFile.append(CHOOSE + NEWLINE);
        xslFile.append("<xsl:when test=\"string-length(" + fieldsDto.getSeason() + ")\">" + NEWLINE); // SEASON
        xslFile.append("<xsl:value-of select=\"substring(normalize-space(" + fieldsDto.getSeason() + "),0,40)\"/>" + NEWLINE); // SEASON
        xslFile.append(STRINGPATH + NEWLINE);

        xslFile.append("<!--COLOR-->" + NEWLINE);
        xslFile.append(CHOOSE + NEWLINE);
        xslFile.append("<xsl:when test=\"string-length(" + fieldsDto.getColor() + ")\">" + NEWLINE); // COLOR
        xslFile.append("<xsl:value-of select=\"substring(normalize-space(" + fieldsDto.getColor() + "),0,40)\"/>" + NEWLINE); // COLOR
        xslFile.append(STRINGPATH + NEWLINE);

        xslFile.append("<!--ADDITIONAL_IMAGE-->" + NEWLINE);
        xslFile.append(CHOOSE + NEWLINE);
        xslFile.append("<xsl:when test=\"string-length(" + fieldsDto.getAddidtionalImage() + ")\">" + NEWLINE); // ADDITIONAL_IMAGE
        xslFile.append("<xsl:value-of select=\"substring(normalize-space(" + fieldsDto.getAddidtionalImage() + "),0,128)\"/>" + NEWLINE); // ADDITIONAL_IMAGE


        xslFile.append(STRINGPATH + NEWLINE);

        xslFile.append(LASTLINE);

        System.out.println(xslFile);

        return xslFile.toString();
    }

    @Override
    public String buildCustomFile() {
        return null;
    }
}
