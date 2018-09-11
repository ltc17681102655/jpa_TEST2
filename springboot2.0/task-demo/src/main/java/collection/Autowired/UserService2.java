package collection.Autowired;

import org.springframework.stereotype.Service;

@Service
public class UserService2 implements UserService{

    @Override
    public void sys() {
        System.out.println("UserService2");
    }
}
