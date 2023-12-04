package org.trabalhos;

import java.io.IOException;
import java.sql.SQLException;
import org.trabalhos.application.config.HttpConfig;
import org.trabalhos.application.controller.UserHandler;
import org.trabalhos.infraestructure.repository.UserRepository;

import static org.trabalhos.infraestructure.config.OracleConfig.getConnection;

public class Main {
    public static void main(String[] args) throws IOException, SQLException {
        HttpConfig server = new HttpConfig(8080);

        UserRepository userRepository = new UserRepository(getConnection());
        UserHandler userHandler = new UserHandler(userRepository);

        server.registerRoutes("/users", userHandler);

        server.start();
    }
}