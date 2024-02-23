package official.my_map.service.UserService;

import lombok.RequiredArgsConstructor;
import official.my_map.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserQueryServiceImpl implements UserQueryService {

    private final UserRepository userRepository;

}
