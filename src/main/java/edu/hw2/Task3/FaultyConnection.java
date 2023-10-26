package edu.hw2.Task3;

import edu.hw2.Task3.interfaces.Connection;
import edu.hw2.Task3.interfaces.ConnectionException;
import java.util.Random;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FaultyConnection implements Connection {
    Logger logger = LogManager.getLogger();
    Random random = new Random();

    @Override
    public void execute(String command) throws ConnectionException {
        logger.info("Fault - Executed command: " + command);
        if (random.nextBoolean()) {
            throw new ConnectionException("Fault execution");
        }
    }

    @Override
    public void close() throws Exception {
        logger.info("Connection closed");
    }
}
