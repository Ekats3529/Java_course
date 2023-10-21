package edu.hw2.Task3;

import edu.hw2.Task3.interfaces.Connection;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class StableConnection implements Connection {
    Logger LOGGER = LogManager.getLogger();

    @Override
    public void execute(String command) {
        LOGGER.info("Stable - Executed command: " + command);
    }

    @Override
    public void close() throws Exception {

    }
}
