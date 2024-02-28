package official.my_map.repository;

import java.util.List;
import official.my_map.domain.Marker;
import official.my_map.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarkerRepository extends JpaRepository<Marker, Long> {

    List<Marker> findAllByUser(User user);

}
