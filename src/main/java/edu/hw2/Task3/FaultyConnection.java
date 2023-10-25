package edu.hw2.Task3;

import edu.hw2.Task3.interfaces.Connection;
import edu.hw2.Task3.interfaces.ConnectionException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Random;

public class FaultyConnection implements Connection {
    Logger logger = LogManager.getLogger();
    Random random = new Random();

    @Override
    public void execute(String command) throws ConnectionException {
        logger.info("Fault - Executed command: " + command);
        if (random.nextBoolean()) {
            throw  new ConnectionException();
        }
    }

    @Override
    public void close() throws Exception {
        logger.info("Connection closed");
    }
}
