package ns.keshav.utill;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import ns.keshav.domain.Employee;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author nSense
 */

public class CustomSetDeserializer extends StdDeserializer<Set<Employee>> {

    public CustomSetDeserializer() {
        this(null);
    }

    public CustomSetDeserializer(Class<?> vc) {
        super(vc);
    }

    @Override
    public Set<Employee> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        return new HashSet<Employee>();
    }
}
