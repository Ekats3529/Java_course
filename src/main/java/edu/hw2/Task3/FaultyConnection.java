package edu.hw2.Task3;

import edu.hw2.Task3.interfaces.Connection;
import edu.hw2.Task3.interfaces.ConnectionException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FaultyConnection implements Connection {
    Logger logger = LogManager.getLogger();

    @Override
    public void execute(String command) throws ConnectionException {
        logger.info("Fault - Executed command: " + command);
    }

    @Override
    public void close() throws Exception {

    }
}
