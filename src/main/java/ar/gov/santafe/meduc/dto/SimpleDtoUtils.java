package ar.gov.santafe.meduc.dto;

import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author enorrmann
 */
public class SimpleDtoUtils {

    public static void replaceForString(SimpleDto simpleDto, String field) {
        String value = simpleDto.getString(field);
        if (value != null) {
            String stringValue = value.replaceAll("\\[", "").replaceAll("\\]", "").replaceAll(" ", "");
            simpleDto.add(field, stringValue);
        }
    }

    public static void replaceForArray(SimpleDto simpleDto, String field) {
        String value = simpleDto.getString(field);
        if (value != null) {
            String[] arrayValue = StringUtils.split(value.replaceAll(" ", ""), ",");
            simpleDto.add(field, arrayValue);
        }
    }
}
