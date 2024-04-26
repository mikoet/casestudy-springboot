package some.casestudy.repository;

import some.casestudy.domain.Standard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StandardRepository extends JpaRepository<Standard, Integer> {
}
