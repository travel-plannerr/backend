package official.my_map.service.UserService;

import lombok.RequiredArgsConstructor;
import official.my_map.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserCommandServiceImpl implements UserCommandService {

    private final UserRepository userRepository;
}
