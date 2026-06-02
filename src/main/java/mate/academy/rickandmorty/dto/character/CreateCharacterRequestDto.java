package mate.academy.rickandmorty.dto.character;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CreateCharacterRequestDto {
    @JsonProperty("id")
    private int externalId;
    private String name;
    private String status;
    private String gender;
}
