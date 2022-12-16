package dev.owlaaz.mockapi.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DataV1 {
    private String id;
    private String title;
    private String firstname;
    private String lastname;
    private String group;
}
