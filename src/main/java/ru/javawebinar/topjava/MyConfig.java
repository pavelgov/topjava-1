package ru.javawebinar.topjava;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.javawebinar.topjava.repository.UserMealRepository;
import ru.javawebinar.topjava.repository.UserRepository;
import ru.javawebinar.topjava.repository.mock.InMemoryMealRepositoryImpl;
import ru.javawebinar.topjava.repository.mock.InMemoryUserRepositoryImpl;
import ru.javawebinar.topjava.service.MealServiceImpl;
import ru.javawebinar.topjava.service.UserService;
import ru.javawebinar.topjava.service.UserServiceImpl;
import ru.javawebinar.topjava.web.user.AdminRestController;

@Configuration
/*@ComponentScan("ru.javawebinar.**.service")*/
public class MyConfig {


    @Bean
    public AdminRestController getAdminRestController() {
        return new AdminRestController();
    }

    @Bean
    public InMemoryMealRepositoryImpl getInMemoryMealRepositoryImpl() {
        return new InMemoryMealRepositoryImpl();
    }

    @Bean
    public InMemoryUserRepositoryImpl getInMemoryUserRepositoryImpl() {
        return new InMemoryUserRepositoryImpl();
    }

    @Bean
    public MealServiceImpl getMealServiceImpl() {
        return new MealServiceImpl();
    }

    @Bean
    public UserServiceImpl getUserService(UserRepository userRepository) {
        return new UserServiceImpl(userRepository);
    }


}
