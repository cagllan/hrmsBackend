package hrms.hrmsBackend.entities.dtos;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobAdvertisementWithActiveDto {
		private int id;
		private String corporationName;
		private String jobpositionName;
		private int numberOfOpenPosition;
		private LocalDate releaseDate;
		private LocalDate applicationDeadline;
		private boolean isActive;
}
