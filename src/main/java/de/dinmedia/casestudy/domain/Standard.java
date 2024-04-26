package de.dinmedia.casestudy.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "standards")
@Data
@NoArgsConstructor
public class Standard {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(length = 250, nullable = false)
	private String title;

	@Column(name = "dok_nr", length = 250, nullable = false)
	private String documentNo;

	@Column(name = "issue_date", nullable = false)
	private LocalDate issueDate;

	@Column(name = "working_grem", length = 250)
	private String workingGremium;

	@Column(name = "working_grem_id", length = 250)
	private String workingGremiumId;
}
