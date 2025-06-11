package dto;

import lombok.*;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class RegistrationBodyDto {
    private String username;
    private String password;
    private String firstName;
    private String lastName;
}
