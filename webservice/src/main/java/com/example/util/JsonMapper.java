package com.example.util;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.StringUtils;
public class JsonMapper {
    private ObjectMapper jacksonObjectMapper = new ObjectMapper();
    public <T> T readJson(String str, Class<T> valueType) {
        T response = null;
        if (StringUtils.isNotBlank(str)) {
            try {
                response = jacksonObjectMapper.readValue(str, valueType);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return response;
    }
}
