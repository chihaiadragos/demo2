package homework.task7;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NamedPairs {
    private String name;
    Map<String, String> pairs;
}