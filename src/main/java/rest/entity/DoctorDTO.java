package rest.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DoctorDTO {
    Long id;
    String name;
    String surname;
    List<DoctorsPatientlistDTO> ownPatient = new ArrayList<>();
}
