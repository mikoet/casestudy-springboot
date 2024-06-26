package some.casestudy.service;

import some.casestudy.domain.Standard;
import some.casestudy.repository.StandardRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StandardService {
	private final StandardRepository standardRepository;

	public StandardService(
		final StandardRepository standardRepository
	) {
		this.standardRepository = standardRepository;
	}

	public List<Standard> findAllOrderByIssueDateDesc() {
		return this.standardRepository.findAll(
			Sort.by(Sort.Direction.DESC, "issueDate"));
	}
}
