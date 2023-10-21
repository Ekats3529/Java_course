package edu.hw2.Task3;

import edu.hw2.Task3.interfaces.Connection;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class StableConnection implements Connection {
    Logger logger = LogManager.getLogger();

    @Override
    public void execute(String command) {
        logger.info("Stable - Executed command: " + command);
    }

    @Override
    public void close() throws Exception {

    }
}
